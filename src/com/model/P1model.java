package com.model;

public class P1model {
	private int  NMAX=7;
	private int numeroS;
	private int TMAX;
	private String messagio;
	
	
	public P1model(int nMAX, int numeroS, int tMAX, String messagio) {
		super();
		NMAX = nMAX;
		this.numeroS = numeroS;
		TMAX = tMAX;
		this.messagio = messagio;
	}


	public String getMessagio() {
		return messagio;
	}


	public void setMessagio(String messagio) {
		this.messagio = messagio;
	}


	public P1model(int nMAX, int numeroS, int tMAX) {
		super();
		NMAX = nMAX;
		this.numeroS = numeroS;
		TMAX = tMAX;
	}


	public int getNMAX() {
		return NMAX;
	}


	public void setNMAX(int nMAX) {
		NMAX = nMAX;
	}


	public int getNumeroS() {
		return numeroS;
	}


	public void setNumeroS(int numeroS) {
		if (numeroS ==0) {
			
		}
		
		this.numeroS = numeroS;
	}


	public int getTMAX() {
		return TMAX;
	}


	public void setTMAX(int tMAX) {
		TMAX = tMAX;
	}
	
	
	

}
