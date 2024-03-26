package model;

import java.io.*;
public class Tempos {
	private int id;
	private int tempoTotal;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
	public int getTempoTotal() {
		return this.tempoTotal;
	}
	
	public String toString() {
		return tempoTotal + " " + id;
	}
	
	public static Tempos[] carregar() throws IOException {
        Arquivo arquivo = new Arquivo("data\\tempos.csv");
        String[] valores;
        String[] linhas = arquivo.linhas();
        Tempos[] tempos = new Tempos[linhas.length];

        for(int i = 0; i < linhas.length; i++) {
            valores = linhas[i].split(";");
            tempos[i] = new Tempos();
            tempos[i].setTempoTotal( Integer.parseInt(valores[0]));
            tempos[i].setId(Integer.parseInt( valores[1] ));
            System.out.println(tempos[i]);
        }
        return tempos;
    }
}
