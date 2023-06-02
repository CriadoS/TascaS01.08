package Nivell3_ex1;

public class Alumne {
	
	private String nom; 
	private int edat;
	private String curs;
	private float nota;
	
	public Alumne(String nom, int edat, String curs, float nota) {
		
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getCurs() {
		return curs;
	}

	public void setCurs(String curs) {
		this.curs = curs;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return " L'alumne és diu" + this.nom + "té una edat de:" + this.edat + ", està al curs, " + this.curs 
				+ ", i té una  nota de " + this.nota;
	}
	
	

}
