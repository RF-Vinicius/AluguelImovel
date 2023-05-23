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
	
	public static void main(String[] args) {
		Imovel imovel01 = new Imovel(454522554, "Rua Adelmário Pinheiro", 2305, 4190000, "BA", "Salvador", "Apartamento", "Aluguel");
		Imovel imovel02 = new Imovel(454522554, "Maracás", 23, 4190000, "BA", "Salvador", "Apartamento", "Aluguel");
		Imovel imovel03 = new Imovel(454522554, "Joaquim Floriano", 305, 4190000, "BA", "Salvador", "Casa", "Aluguel");
		ArrayList<Imovel> imoveisV = new ArrayList<Imovel>();
		imoveisV.add(imovel01);
		imoveisV.add(imovel02);
		imoveisV.add(imovel03);
		
		Proprietario vinicius = new Proprietario("Vinicius Reis", 44542, 45454, "Mario moreira", 778, 45345, "PE", "Itagoiania", imoveisV);
		
		System.out.println(vinicius.listImvovelPorTipo("Apartamento"));
		for (Imovel imovel: vinicius.listImvovelPorTipo("Apartamento")) {
			System.out.println(imovel.getTipo());
		}
	}

	

}
