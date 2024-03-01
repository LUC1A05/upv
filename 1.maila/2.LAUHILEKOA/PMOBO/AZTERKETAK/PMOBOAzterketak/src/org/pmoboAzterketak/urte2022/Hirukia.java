package org.pmoboAzterketak.urte2022;

public class Hirukia {
	private float oinarria;
	private float altuera;
	
	public Hirukia(float pOinarria, float pAltuera) {
		this.oinarria = pOinarria;
		this.altuera = pAltuera;
	}
	public float getAzalera() {
		float azalera;
		azalera = this.altuera*this.oinarria*0.5f;
		return azalera;
	}
}
