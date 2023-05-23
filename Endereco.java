package AluguelImovel;

public class Endereco {
	public enum estadoBrasil {
	    AC,
	    AL,
	    AP,
	    AM,
	    BA,
	    CE,
	    DF,
	    ES,
	    GO,
	    MA,
	    MT,
	    MS,
	    MG,
	    PA,
	    PB,
	    PR,
	    PE,
	    PI,
	    RJ,
	    RN,
	    RS,
	    RO,
	    RR,
	    SC,
	    SP,
	    SE,
	    TO
	};
	
	private String rua;
	private int numero;
	private String cidade;
	private int cep;
	private estadoBrasil estado;
	
	public Endereco(String rua, int numero, String siglaEstado, String cidade, int cep) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.cep = cep;
		this.setEstado(siglaEstado);
	}
	
	public Endereco(String rua, int numero, int cep) {
		this(rua, numero, "BA", "Salvador", cep);
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public estadoBrasil getEstado() {
		return estado;
	}

	public void setEstado(String siglaEstado) {
		try {
            estadoBrasil estado = estadoBrasil.valueOf(siglaEstado);
            this.estado = estado;
        } catch (IllegalArgumentException e) {
            System.out.println("A sigla " + siglaEstado + " não faz parte de um estado brasileiro");
        }
	}
	public static void main(String[] args) {
		Endereco teste = new Endereco("Teste Rua", 336, "XX", "Jaguaquara", 45345000);
		System.out.print(teste.getEstado());
	}
	
}	


