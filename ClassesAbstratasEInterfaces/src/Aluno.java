/**
 * A classe aluno implementa os métodos que todo Estudante
 * deve implementar, além do método fazerProva, com uma
 * lógica de demonstração.
 *
 */
public class Aluno implements Estudante {
	private String nome;
	private int nMatrícula;
	
	public Aluno(String nome, int nMatrícula) {
		this.nome = nome;
		this.nMatrícula = nMatrícula;
	}
	
	/**
	 * Nesta função demonstrativa, definimos toda resposta
	 * da prova como "R1", "R2", etc, assim o aluno sempre
	 * tirará 10.
	 */
	public void fazerProva(Prova prova) {
		String[] respostas = new String[prova.getQuestões().length];
		for (int i = 0; i < respostas.length; i++)
			respostas[i] = "R" + (i + 1);
		
		prova.setRespostas(respostas);
	}
	
	/**
	 * @return o nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome o nome a ser configurado
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return o nMatrícula
	 */
	public int getnMatrícula() {
		return nMatrícula;
	}
	/**
	 * @param nMatrícula o nMatrícula a ser configurado
	 */
	public void setnMatrícula(int nMatrícula) {
		this.nMatrícula = nMatrícula;
	}

	@Override
	public void estudar() {
		System.out.println("Oh vida, quanto estudo!");
	}

}
