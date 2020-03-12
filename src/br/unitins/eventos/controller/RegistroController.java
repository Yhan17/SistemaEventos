package br.unitins.eventos.controller;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;


import br.unitins.eventos.model.Crud;
import br.unitins.eventos.model.Eventos;
import br.unitins.eventos.util.Util;

@Named("registroController")
@ViewScoped
public class RegistroController implements Serializable, Crud {

	private static final long serialVersionUID = -6599960630225913931L;

	private Eventos evento;
	private List<Eventos> eventos;


	@Override
	public void inserir() {
		if(getEvento().getNomeEvento().isBlank() || getEvento().getEndereco().isBlank() || getEvento().getData().isBlank() || getEvento().getHora().isBlank()) {
			Util.mensagemErro("Preencha as informações que faltam");
		}else {
		getEvento().setId(proximoId());
		getEvento().adicionarHora();
		eventos.add(getEvento());
		limpar();
		}
	}

	@Override
	public void limpar() {
		evento = null;
	}

	@Override
	public void alterar() {
		int index = eventos.indexOf(getEvento());
		eventos.set(index, getEvento());
		limpar();
	}

	@Override
	public void deletar() {
		eventos.remove(getEvento());
		limpar();
	}

	@Override
	public void editar(Eventos evento) {
		setEvento(evento.getClone());

	}
	private int proximoId() {
		int resultado = 0;
		for (Eventos usuario : eventos) {
			if(usuario.getId() > resultado)
				resultado = usuario.getId();
		}

		return ++resultado;
	}

	public Eventos getEvento() {
		if (evento == null)
			evento = new Eventos();

		return evento;
	}

	public void setEvento(Eventos evento) {
		this.evento = evento;
	}

	public List<Eventos> getEventos() {
		if (eventos == null) {
			eventos = new ArrayList<Eventos>();
		}
		return eventos;
	}

	public void setEventos(List<Eventos> eventos) {
		this.eventos = eventos;
	}


}
