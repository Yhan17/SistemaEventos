package br.unitins.eventos.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@RequestScoped
@Named("indexController")
public class IndexController implements Serializable{

	private static final long serialVersionUID = 8830256567017040262L;

		public String trocarPagina() {
			return "index.xhtml";
		}

		
}
