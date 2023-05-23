package AluguelImovel;

import java.util.ArrayList;

public class Proprietario {
	
	private String nome;
	private int cpf;
	private int identidade;
	private Endereco endereco;
	private ArrayList<Imovel> imoveis;

	public Proprietario(String nome, int cpf, int identidade, String rua, int numero, int cep, String estado, String cidade, ArrayList<Imovel> imovel) {
		this.nome = nome;
		this.cpf = cpf;
		this.identidade = identidade;
		this.endereco = new Endereco(rua, numero, estado, cidade, cep);
		this.setImoveis(imovel);
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getCpf(){
		return this.cpf;
	}
	
	public int getIdentidade(){
		return this.identidade;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
		
	}
	
	public ArrayList<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(ArrayList<Imovel> imoveis) {
		this.imoveis = imoveis;
	}
	
	public void setEndereco(String rua, int numero, int cep, String estado, String cidade) {
		this.endereco = new Endereco(rua, numero, estado, cidade, cep);
	}
	
	public void setEndereco(String rua, int numero, int cep) {
		this.endereco = new Endereco(rua, numero, cep);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

	public void changeEndereco(String rua, int numero, int cep, String estado, String cidade) {
		this.endereco = new Endereco(rua, numero, estado, cidade, cep);
	}
	
	public void changeEndereco(String rua, int numero, int cep) {
		this.endereco = new Endereco(rua, numero, cep);
	}
	
	public ArrayList<Imovel> listImvovelPorTipo(String tipo){
		ArrayList<Imovel> listImovel = new ArrayList<Imovel>();
		
		for (Imovel imovel: this.imoveis) {
			if (imovel.getTipo() == tipo){
				listImovel.add(imovel);
			}
		}
		
		return listImovel;
	}
	
	public boolean alugarImovel(int iptu, String date) {
		for(Imovel imovel: imoveis) {
			if(imovel.getIptu() == iptu) {
				if(imovel.isDisponivel(date)) {
					imovel.getAgenda().setAlugado(date);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean bloquearImovel(int iptu, String date) {
		for(Imovel imovel: imoveis) {
			if(imovel.getIptu() == iptu) {
				if(imovel.isDisponivel(date)) {
					imovel.getAgenda().setBloqueado(date);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean disponibilizarImovel(int iptu, String date) {
		for(Imovel imovel: imoveis) {
			if(imovel.getIptu() == iptu) {
				imovel.getAgenda().setDisponivel(date);
				return true;
			}
		}
		return false;
	}
	
	public boolean alugarUmImovel(Imovel imovel, String date) {
		if(imovel.isDisponivel(date)) {
			imovel.getAgenda().setAlugado(date);
		}
		return false;
	}

}
