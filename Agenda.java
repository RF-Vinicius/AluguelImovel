package AluguelImovel;

import java.lang.reflect.Array;

public class Agenda {
	
	private String nome;
	private int numero;
	private Array contato;

	public Agenda(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
