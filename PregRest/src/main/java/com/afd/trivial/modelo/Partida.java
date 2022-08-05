package com.afd.trivial.modelo;

import java.util.ArrayList;
import java.util.List;

public class Partida {

	private int idPartida;
	private String nombreSala;
	private List<Pregunta> listaPreguntas;
	private List<Jugador> listaJugadores;
	private int maxJugadores;
	private boolean finalizada;
	
	public Partida(int idPartida, String nombreSala, List<Pregunta> listaPreguntas, List<Jugador> listaJugadores,
			int maxJugadores, boolean finalizada) {
		this.idPartida = idPartida;
		this.nombreSala = nombreSala;
		this.listaPreguntas = listaPreguntas;
		this.listaJugadores = listaJugadores;
		this.maxJugadores = maxJugadores;
		this.finalizada = finalizada;
	}
	
	public Partida(int idPartida, String nombreSala, int maxJugadores, boolean finalizada) {
		this.idPartida = idPartida;
		this.nombreSala = nombreSala;
		this.listaPreguntas = new ArrayList<Pregunta>();
		this.listaJugadores = new ArrayList<Jugador>();
		this.maxJugadores = maxJugadores;
		this.finalizada = finalizada;
	}

	public int getIdPartida() {
		return idPartida;
	}

	public void setIdPartida(int idPartida) {
		this.idPartida = idPartida;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public List<Pregunta> getListaPreguntas() {
		return listaPreguntas;
	}

	public void setListaPreguntas(List<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public int getMaxJugadores() {
		return maxJugadores;
	}

	public void setMaxJugadores(int maxJugadores) {
		this.maxJugadores = maxJugadores;
	}

	public boolean isFinalizada() {
		return finalizada;
	}

	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	
}