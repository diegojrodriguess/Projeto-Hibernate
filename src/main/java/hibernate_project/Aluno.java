package hibernate_project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aluno")
public class Aluno {

	@Id
	private int matricula;
	private String nome;
	private int idade;
	private char genero;

	public Aluno() {
	}

	public Aluno(int matricula, String nome, int idade, char genero) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Matricula: " + matricula + " Nome : " + nome + " Idade : " + idade + " Genero : " + genero;
	}
}
