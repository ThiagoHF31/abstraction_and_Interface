/**
 * A classe Professor implementa algumas interfaces e ao mesmo
 * tempo serve de classe base para todo tipo de professor. Se por 
 * um lado todo professor corrige prova do mesmo jeito, a rotina para 
 * fazer essa prova muda bastante entre os professores de universidade
 * e de ensino básico, por isso este método fica como privado.
 *
 */
public abstract class Professor implements FuncionárioAssalariado, Estudante {
	private String nome;
	private int nTurmas;
	private double salário;
	
	public Professor(String nome, int nTurmas, double salário) {
		this.nome = nome;
		this.nTurmas = nTurmas;
		this.salário = salário;
	}
	
	/**
	 * Este método fica por conta das classes filhas,
	 * onde cada tipo de professor determina quantas
	 * quantas provas e de quantas questões devem ser
	 * feitas.
	 */
	public abstract Prova[] elaborarProvas();
	
	/**
	 * Neste método, apenas para demonstração emulamos
	 * uma rotina de correção de prova, onde é verificado 
	 * se no vetor de respostas está escrito "R1", "R2", etc
	 * para a questão 1, 2, etc. Para cada questão valer o
	 * mesmo peso, divide-se o total (10) pela quantidade
	 * de questões.
	 */
	public double corrigirProva(Prova prova) {
		String[] respostas = prova.getRespostas();
		double nota = 0;
		
		for (int i = 0; i < respostas.length; i++) {
			if ( respostas[i].contentEquals("R" + (i + 1)) )
				nota += 10/respostas.length;
		}
		prova.setNota(nota);
		
		return prova.getNota();
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
	 * @return o nTurmas
	 */
	public int getnTurmas() {
		return nTurmas;
	}
	/**
	 * @param nTurmas o nTurmas a ser configurado
	 */
	public void setnTurmas(int nTurmas) {
		this.nTurmas = nTurmas;
	}
	/**
	 * @return o salário
	 */
	public double getSalário() {
		return salário;
	}
	/**
	 * @param salário o salário a ser configurado
	 */
	private void setSalário(double salário) {
		this.salário = salário;
	} 

	@Override
	public void estudar() {
		System.out.println("Professor também estuda!");
	}

	@Override
	public void receberSalário(int nTurmas) {
		this.setSalário(salário + (nTurmas * salário * 0.05));
	}
}
