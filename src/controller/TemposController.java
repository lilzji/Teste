package controller;

import java.io.IOException;
import model.Tempos;

public class TemposController extends Thread {

	private int qtd;
	private int size;
	private int index;
	private Tempos[] vetor_player;
	
	public TemposController(int qtd) {
		super();
		this.size = qtd;
		this.qtd = qtd;
		this.index = 0;
		this.vetor_player = new Tempos[qtd];
	}
	
	public void run(){
		
		int position = 1;
		
		while(qtd > 0){
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		int reduce = 1;
		for(int y = 0 ; y < size; y++){
			for(int x = 0 ; x < size-reduce; x++){
				if(vetor_player[x].getTempoTotal() > vetor_player[x+1].getTempoTotal()){
					Tempos temp = vetor_player[x];
					vetor_player[x] = vetor_player[x+1];
					vetor_player[x+1] = temp;
				}
			}
			reduce++;
		}
		
		for(Tempos player : vetor_player){
			System.out.println("Player-"+player.getId()+" Terminou em "+position+" lugar com " + player.getTempoTotal()+"ms");
			position++;
		}
		
	}
	
	public void setTempo(Tempos tempo){
		vetor_player[index] = tempo;
		index++;
		qtd--;
	}


}
