package model;

public class Prova extends Avaliacao{
	
	private double tempoDuracao;
	private int quantidadeDeQuestoes;
	private boolean consultaAutorizada;

	public Prova(String nome, double nota, double tempo, int qtdQuestoes, boolean consulta) {
		super(nome, nota);
		tempoDuracao = tempo;
		quantidadeDeQuestoes = qtdQuestoes;
		consultaAutorizada = consulta;
	}
	
	public String getInfo() {
		return "Prova [tempoDuracao=" + tempoDuracao + ", quantidadeDeQuestoes=" + quantidadeDeQuestoes
				+ ", consultaAutorizada=" + consultaAutorizada + "]";
	}
	
	

}
