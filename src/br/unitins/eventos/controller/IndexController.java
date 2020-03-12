package br.unitins.eventos.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@Named
@RequestScoped
public class IndexController implements Serializable{

	private static final long serialVersionUID = 8830256567017040262L;
	private String nome="Yhan nunes";
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
