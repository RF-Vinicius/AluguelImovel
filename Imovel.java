package AluguelImovel;

import java.util.ArrayList;

public class Imovel {
	
	private int iptu;
	private String tipo;
	private String utilizacao;
	private Endereco endereco;
	private Agenda agenda;
	

	public Imovel(
			int iptu, 
			String rua, 
			int numero, 
			int cep, 
			String estado, 
			String cidade, 
			String tipo, 
			String utilizacao, 
			ArrayList<String> dataDisponivel, 
			ArrayList<String> dataBloqueado, 
			ArrayList<String> dataAlugado
			) {
		
		this.setIptu(iptu);
		this.endereco = new Endereco(rua, numero, estado, cidade, cep);
		this.tipo = tipo;
		this.utilizacao = utilizacao;
		this.agenda = new Agenda(dataDisponivel, dataBloqueado, dataAlugado);
	}

	public Imovel(int iptu, String rua, int numero, int cep, String tipo, String utilizacao, ArrayList<String> dataDisponivel, ArrayList<String> dataBloqueado) {
		
		this(iptu, rua, numero, cep, "BA", "Salvador", tipo, utilizacao, dataDisponivel, dataBloqueado, new ArrayList<String>());
	}
	
	public Imovel(int iptu, String rua, int numero, int cep, String tipo, String utilizacao, ArrayList<String> dataDisponivel) {
			
		this(iptu, rua, numero, cep, "BA", "Salvador", tipo, utilizacao, dataDisponivel, new ArrayList<String>(), new ArrayList<String>());
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getUtilizacao() {
		return this.utilizacao;
	}
	
	
	public void setTipo(String novoTipo) {
		this.tipo = novoTipo;
	}
	
	public void setUtilizacao(String novoUtilizacao) {
		this.utilizacao = novoUtilizacao;
	}
	
	public int getIptu() {
		return iptu;
	}

	public void setIptu(int iptu) {
		this.iptu = iptu;
	}
	
	public void setEndereco(String rua, int numero, int cep, String estado, String cidade) {
		this.endereco = new Endereco(rua, numero, estado, cidade, cep);
	}
	
	public void setEndereco(String rua, int numero, int cep) {
		this.endereco = new Endereco(rua, numero, cep);
	}
	
	public Agenda getAgenda() {
		return this.agenda;
	}
	
	public boolean isDisponivel(String date) {
		
		for(String dateDisponiveis: agenda.getDisponivel()) {
			if(dateDisponiveis.equals(date)) {
				return true;
			}
		}
		return false;
	}
	
	
}
