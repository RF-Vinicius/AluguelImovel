package AluguelImovel;

public class Imovel {
	
	private int iptu;
	private String tipo;
	private String utilizacao;
	private Endereco endereco;
	

	public Imovel(int iptu, String rua, int numero, int cep, String estado, String cidade, String tipo, String utilizacao) {
		
		this.setIptu(iptu);
		this.endereco = new Endereco(rua, numero, estado, cidade, cep);
		this.tipo = tipo;
		this.utilizacao = utilizacao;
	}

	public Imovel(int iptu, String rua, int numero, int cep, String tipo, String utilizacao) {
		
		this(iptu, rua, numero, cep, "BA", "Salvador", tipo, utilizacao);
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
	
}
