package br.unitins.eventos.model;

public interface Crud {
	public void inserir();
	public void limpar();
	public void alterar();
	public void deletar();
	public void editar(Eventos evento);
	}
