package br.com.devinhouse.projeto04.dto;

import java.io.Serializable;

import br.com.devinhouse.projeto04.entity.Processo;

public class ProcessoDTO implements Serializable {

	private static final long serialVersionUID = 7887343820631112092L;

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
	
	public ProcessoDTO() {
	}

  public ProcessoDTO(Long id, String chaveProcesso, String sgOrgaoProcesso, Integer nuProcesso, String nuAnoProcesso,
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
  
  public ProcessoDTO(Processo processo) {
  	this.id = processo.getId();
		this.chaveProcesso = processo.getChaveProcesso();
		this.sgOrgaoProcesso = processo.getSgOrgaoProcesso();
		this.nuProcesso = processo.getNuProcesso();
		this.nuAnoProcesso = processo.getNuAnoProcesso();
		this.cdAssunto = processo.getCdAssunto();
		this.descricaoAssunto = processo.getDescricaoAssunto();
		this.descricao = processo.getDescricao();
		this.cdInteressado = processo.getCdInteressado();
		this.nmInteressado = processo.getNmInteressado();
  }

	public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id =  id;
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

	public void setDescricaoAssunto(String descricaoAssunto) {
		this.descricaoAssunto = descricaoAssunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
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

	public String getChaveProcesso() {
		return chaveProcesso;
	}

	public void setChaveProcesso(String chaveProcesso) {
		this.chaveProcesso = chaveProcesso;
	}

}