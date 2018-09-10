package br.com.db1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Lembrete {
	
	@Column(nullable = false, length = 10)
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;

	@Column(nullable = false, length = 50)
	private String descricao;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
