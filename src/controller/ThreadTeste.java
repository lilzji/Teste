package controller;

import model.Tempos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import view.Main;

public class ThreadTeste extends Thread{
	private int id;
	private int tempoTotal;
	private Tempos tempo = new Tempos();
	
	public ThreadTeste(int id) {
		this.id = id;
	}

	public void run() {
		voltas();
		enviarDados();
		System.out.println("["+id+"]- chegou - ");
		
	}
	
	public int myId(){
		return id;
	}
	
	private void voltas() {
		for(int i= 0; i < 3; i++) {
				tempoTotal += (int)(Math.random()*20);
		}
	}
	
	private void enviarDados() {
		tempo.setId(id);
		tempo.setTempoTotal(tempoTotal);
		Main.controller.setTempo(tempo);
	}
}
