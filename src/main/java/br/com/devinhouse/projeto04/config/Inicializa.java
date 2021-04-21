package br.com.devinhouse.projeto04.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.devinhouse.projeto04.entity.Processo;
import br.com.devinhouse.projeto04.repository.ProcessoRepository;

@Configuration
public class Inicializa implements CommandLineRunner {
	@Autowired
  private ProcessoRepository repository;
  
  @Override
  public void run(String... args) throws Exception {
      
		int qtdProcessos = 40;
		
		for (int i = 0; i < qtdProcessos; i++) {
	    Processo processo = new Processo();
	    processo.setCdAssunto(i + 1);
	    processo.setCdInteressado(i + 1);
	    processo.setDescricao("Processo " + (i + 1) + " de testes DEV In House ");
	    processo.setDescricaoAssunto("Assunto " + (i + 1) + " de testes DEV In House ");
	    processo.setNmInteressado("Jão Antonio | " + i);
	    processo.setNuAnoProcesso(i <= 20 ? "2020" : "2021");
	    processo.setNuProcesso(i + 1);
	    processo.setSgOrgaoProcesso("SOFT");
	    processo.setChaveProcesso(processo.getSgOrgaoProcesso() + " " + processo.getNuProcesso() + "/" + processo.getNuAnoProcesso());
	    repository.save(processo);
		}    
  }
}
