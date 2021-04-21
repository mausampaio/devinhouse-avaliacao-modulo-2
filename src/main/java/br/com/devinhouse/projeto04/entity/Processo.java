package br.com.devinhouse.projeto04.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import br.com.devinhouse.projeto04.dto.ProcessoDTO;

@Entity(name = "processos")
@Table(
    name="PROCESSOS", 
    uniqueConstraints=
        @UniqueConstraint(columnNames={"chaveProcesso", "nuProcesso"})
)
public class Processo implements Serializable {
	
	private static final long serialVersionUID = 3446200032394564533L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String chaveProcesso;
	private String sgOrgaoProcesso;
	private Integer nuProcesso;
	private String nuAnoProcesso;
	private Integer cdAssunto;
	private String descricaoAssunto;
	private String descricao;
	private Integer cdInteressado;
	private String nmInteressado;
	
	public Processo() {
	}
	
	public Processo(Long id, String chaveProcesso, String sgOrgaoProcesso, Integer nuProcesso, String nuAnoProcesso,
			Integer cdAssunto, String descricaoAssunto, String descricao, Integer cdInteressado, String nmInteressado) {
		super();
		this.id = id;
		this.chaveProcesso = chaveProcesso;
		this.sgOrgaoProcesso = sgOrgaoProcesso;
		this.nuProcesso = nuProcesso;
		this.nuAnoProcesso = nuAnoProcesso;
		this.cdAssunto = cdAssunto;
		this.descricaoAssunto = descricaoAssunto;
		this.descricao = descricao;
		this.cdInteressado = cdInteressado;
		this.nmInteressado = nmInteressado;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChaveProcesso() {
		return chaveProcesso;
	}
	public void setChaveProcesso(String chaveProcesso) {
		this.chaveProcesso = chaveProcesso;
	}
	public String getSgOrgaoProcesso() {
		return sgOrgaoProcesso;
	}
	public void setSgOrgaoProcesso(String sgOrgaoProcesso) {
		this.sgOrgaoProcesso = sgOrgaoProcesso;
	}
	public Integer getNuProcesso() {
		return nuProcesso;
	}
	public void setNuProcesso(Integer nuProcesso) {
		this.nuProcesso = nuProcesso;
	}
	public String getNuAnoProcesso() {
		return nuAnoProcesso;
	}
	public void setNuAnoProcesso(String nuAnoProcesso) {
		this.nuAnoProcesso = nuAnoProcesso;
	}
	public Integer getCdAssunto() {
		return cdAssunto;
	}
	public void setCdAssunto(Integer cdAssunto) {
		this.cdAssunto = cdAssunto;
	}
	public String getDescricaoAssunto() {
		return descricaoAssunto;
	}
	public void setDescricaoAssunto(final String descricaoAssunto) {
		this.descricaoAssunto = descricaoAssunto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}
	public Integer getCdInteressado() {
		return cdInteressado;
	}
	public void setCdInteressado(Integer cdInteressado) {
		this.cdInteressado = cdInteressado;
	}
	public String getNmInteressado() {
		return nmInteressado;
	}
	public void setNmInteressado(String nmInteressado) {
		this.nmInteressado = nmInteressado;
	}
	
	public Processo converteProcessoDTO(ProcessoDTO processo) {
		Processo result = new Processo(processo.getId(), processo.getChaveProcesso(), processo.getChaveProcesso(), processo.getNuProcesso(), processo.getChaveProcesso(),
			processo.getCdAssunto(), processo.getDescricaoAssunto(), processo.getDescricao(), processo.getCdInteressado(), processo.getNmInteressado());
		
		return result;
	}
	
	
}
