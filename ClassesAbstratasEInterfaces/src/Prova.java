/**
 * A classe Prova é usada por diferentes classes no programa.
 */
public class Prova {
	private String[] questões;
	private String[] respostas;
	private double nota = 0;
	
	/**
	 * O construtor de Prova só precisa das questões, 
	 * já que a nota é pré-definida como zero e as
	 * respostas começam como um vetor vazio. Aproveitamos
	 * que aqui sabemos do tamanho do vetor de questões 
	 * para poder usar deste tamanho e instanciar o vetor 
	 * de Strings vazias nas respostas.
	 */
	public Prova(String[] questões) {
		this.questões = questões;
		this.respostas = new String[questões.length];
	}
	
	/**
	 * @return o questões
	 */
	public String[] getQuestões() {
		return questões;
	}
	/**
	 * @param respostas o respostas a ser configurado
	 */
	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}
	/**
	 * @return o respostas
	 */
	public String[] getRespostas() {
		return respostas;
	}
	/**
	 * @param questões o questões a ser configurado
	 */
	public void setQuestões(String[] questões) {
		this.questões = questões;
	}
	/**
	 * @return o nota
	 */
	public double getNota() {
		return nota;
	}
	/**
	 * @param nota o nota a ser configurado
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}
