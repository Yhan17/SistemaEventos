package br.unitins.eventos.model;

import java.time.LocalDateTime;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Eventos extends Entity<Eventos> {

	private String nomeEvento;
	private String endereco;
	private String Data;
	private String hora;
	private Integer capacidadeMaxima;
	private Double valorToral = 0.0;
	private String horarioAdicao;
	// Daqui pra baixo é so pra adicionar a adição local msm
	private ZoneId zona = ZoneId.systemDefault();
	private LocalDateTime data = LocalDateTime.now(zona);
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private String formato = data.format(formatter);

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(Integer capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public Double getValorToral() {
		return valorToral;
	}

	public void setValorToral(Double valorToral) {
		this.valorToral = valorToral;
	}

	public String getHorarioAdicao() {
		return horarioAdicao;
	}

	public void setHorarioAdicao(String horarioAdicao) {
		this.horarioAdicao = horarioAdicao;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public void adicionarHora() {
		setHorarioAdicao(formato);
	}

}
