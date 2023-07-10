/**
 * Esta implementação da classe Professor tem com particularidade
 * sua versão do método elaborarProvas, onde são feitas menos provas
 * com menos questões. Usamos Questões meramente ilustrativas aqui
 * para não complexificar demais o problema (P1Q2, P1Q2, etc)
 */
public class ProfessorUniversitário extends Professor {

	public ProfessorUniversitário(String nome, int nTurmas, double salário) {
		super(nome, nTurmas, salário);
	}

	@Override
	public Prova[] elaborarProvas() {
		Prova[] provas = new Prova[3];
		
		provas[0] = new Prova(new String[]{ "P1Q1", "P1Q2" });
		provas[1] = new Prova(new String[]{ "P2Q1", "P2Q2" });
		provas[2] = new Prova(new String[]{ "P3Q1", "P3Q2" });
		
		return provas;
	}

}
