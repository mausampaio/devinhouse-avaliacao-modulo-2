package br.com.devinhouse.projeto04.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devinhouse.projeto04.entity.Processo;
import br.com.devinhouse.projeto04.repository.ProcessoRepository;

@Service
public class ProcessoService {

	@Autowired
	private ProcessoRepository repository;

	public List<Processo> findAll(String chaveProcesso) {
		List<Processo> processos = new ArrayList<Processo>();
		Iterable<Processo> result = repository.findAll();
		
		result.forEach(processos::add);
		
		if (chaveProcesso != null) {
			List<Processo> processosFiltrados = new ArrayList<Processo>();
			
			for (Processo processo : processos) {
				if (chaveProcesso.equals(processo.getChaveProcesso())) {
					processosFiltrados.add(processo);
					
					return processosFiltrados;
				}
			}			
		}
		
		return processos;
	}

	public Processo find(Long id) {
		Optional<Processo> result = repository.findById(id);
		
		return result.orElseThrow();
	}
	
	public Processo create(Processo processo) {
		return repository.save(processo);
	}
	
	public void update(Long id, Processo body) {
		Optional<Processo> result = repository.findById(id);
		
		Processo processo = result.orElseThrow();
		
		Integer CdAssunto = body.getCdAssunto() == null ? processo.getCdAssunto() : body.getCdAssunto();
		Integer CdInteressado = body.getCdInteressado() == null ? processo.getCdInteressado() : body.getCdInteressado();
		Integer NuProcesso = body.getNuProcesso() == null ? processo.getNuProcesso() : body.getNuProcesso();
		String ChaveProcesso = body.getChaveProcesso() == null ? processo.getChaveProcesso() : body.getChaveProcesso();
		String Descricao = body.getDescricao() == null ? processo.getDescricao() : body.getDescricao();
		String DescricaoAssunto = body.getDescricaoAssunto() == null ? processo.getDescricaoAssunto() : body.getDescricaoAssunto();
		String NmInteressado = body.getNmInteressado() == null ? processo.getNmInteressado() : body.getNmInteressado();
		String NuAnoProcesso = body.getNuAnoProcesso() == null ? processo.getNuAnoProcesso() : body.getNuAnoProcesso();
		String SgOrgaoProcesso = body.getSgOrgaoProcesso() == null ? processo.getSgOrgaoProcesso() : body.getSgOrgaoProcesso();
		
		processo.setCdAssunto(CdAssunto);
		processo.setCdInteressado(CdInteressado);
		processo.setChaveProcesso(ChaveProcesso);
		processo.setDescricao(Descricao);
		processo.setDescricaoAssunto(DescricaoAssunto);
		processo.setNmInteressado(NmInteressado);
		processo.setNuAnoProcesso(NuAnoProcesso);
		processo.setNuProcesso(NuProcesso);
		processo.setSgOrgaoProcesso(SgOrgaoProcesso);
		
		repository.save(processo);
	}
	
	public void delete(Long id) {
		Optional<Processo> result = repository.findById(id);
		
		Processo processo = result.orElseThrow();
		
		repository.delete(processo);
	}

}