package model;

public abstract class Avaliacao {
	private String nome;
	private double nota;
	
	public Avaliacao (String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	
	public String getNome() {
		return nome;
	}
	
	public abstract String getInfo();


	
}
