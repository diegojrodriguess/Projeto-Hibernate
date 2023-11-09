package hibernate_project;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

import javax.persistence.EntityManager;

public class Teste {
		
	public static void main (String[] args) {
		AlunoDAO alunoDAO = new AlunoDAO();
		Aluno aluno01 = new Aluno(233,"Diego",20,'M');
		
		alunoDAO.createAluno(aluno01);
		
		Aluno aluno = alunoDAO.findById(233);
		System.out.println(aluno);
		
		aluno01.setNome("Diogo");
		alunoDAO.updateAluno(aluno01);
		System.out.println(aluno01);
		
		alunoDAO.deleteAluno(233);
	}

}
