package controller;

import java.util.Random;

import javax.swing.JTextField;

public class GiragiraThread extends Thread {
	private Random Numero = new Random();
	private int N;
	private JTextField N1;	
	
	public GiragiraThread(JTextField N1) {
		this.N1 = N1;		
	}

	public void run() {
		Sorteio();
	}

	public void Sorteio() {      
		for (int i = 0; i <= 150; i++) {        
			N = Numero.nextInt(7) + 1;        
			N1.setText(String.valueOf(N));   
			try {                 
				Thread.sleep(32);     
			} catch (Exception e) {   
				e.printStackTrace();   
			} 
		}     
	}
}