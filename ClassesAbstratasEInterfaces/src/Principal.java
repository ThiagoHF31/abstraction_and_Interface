/**
 * Neste exercício queremos demontrar em particular três coisas:
 * 1 - A implementação de métodos abstratos de uma classe abstrata (Professor)
 * 2 - A implementação de interfaces por diferentes classes (Estudante e FuncionárioAssalariado)
 * 3 - O uso do polimorfimo mesmo para interfaces.
 */
public class Principal {

	public static void main(String[] args) {
		
		// Note aqui que não será possível declarar um Professor sem dizer de que tipo de professor é:
		// Professor lucas = new Professor("Lucas", 3, 4000); --> Não compila!
		ProfessorUniversitário maria = new ProfessorUniversitário("Maria", 2, 3000);
		ProfessorDaEducaçãoBásica josé = new ProfessorDaEducaçãoBásica("José", 3, 2000);
		Aluno joão = new Aluno("João", 12345);
		
		// Note neste vetor que objetos de classes completamente diferentes (alunos, professores)
		// estão sendo colocados em um mesmo vetor, simplesmente por implementarem a mesma interface
		Estudante[] pessoasQueEstudam = new Estudante[3];
		pessoasQueEstudam[0] = maria;
		pessoasQueEstudam[1] = josé;
		pessoasQueEstudam[2] = joão;
		
		for (Estudante estudante: pessoasQueEstudam) 
			estudante.estudar(); // Método implementado de diferentes formas nas respectivas classes
		
		// Demonstração da rotina de elaboração e correção de provas
		Prova[] provasDaFaculdade = maria.elaborarProvas();
		
		joão.fazerProva(provasDaFaculdade[0]);
		maria.corrigirProva(provasDaFaculdade[0]);
	
		System.out.println("João tirou "+ provasDaFaculdade[0].getNota() + " na prova.");

	}
}
