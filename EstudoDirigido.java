package model;

public class EstudoDirigido extends Avaliacao{

	private String tema;
	private int numeroDePaginas;


	public EstudoDirigido(String nome, double nota, String tema, int numeroDePaginas) {
		super(nome, nota);
		this.tema = tema;
		this.numeroDePaginas = numeroDePaginas;
	}


	@Override
	public String getInfo() {
		return "EstudoDirigido [tema=" + tema + ", numeroDePaginas=" + numeroDePaginas + "]";
	}
	

}
