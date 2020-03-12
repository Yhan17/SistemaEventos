package br.unitins.eventos.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.eventos.util.Util;
@Named
@RequestScoped
public class LoginController implements Serializable {

	private static final long serialVersionUID = -7768294253667533449L;
	private String login;
	private String senha;
	public String validar() {
		if(login.equals("login") && senha.equals("senha"))
			return "registroEventos.xhtml?faces-redirect=true";
		Util.mensagemErro("Login ou Senha Incorretos");
		return " ";
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
