package AluguelImovel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Agenda {
	
	private ArrayList <String> disponivel;
	private ArrayList <String> bloqueado;
	private ArrayList <String> alugado;


	public Agenda(ArrayList <String> disponivel, ArrayList <String> bloqueado, ArrayList <String> alugado) {
		this.disponivel = disponivel;
		this.bloqueado = bloqueado;
		this.bloqueado = alugado;
	}
	
	public Agenda(ArrayList <String> disponivel, ArrayList <String> bloqueado) {
		this(disponivel, bloqueado, new ArrayList<String>());
	}
	
	public Agenda(ArrayList <String> disponivel) {
		this(disponivel, new ArrayList<String>(), new ArrayList<String>());
	}
	
	
	public boolean removeDisponivel(String date) {
		for(String dataDisponivel: disponivel) {
			if (dataDisponivel.equals(date)) {
				this.disponivel.remove(date);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAlugado(String date) {
		for(String dataAlugado: alugado) {
			if (dataAlugado.equals(date)) {
				this.alugado.remove(date);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeBloqueado(String date) {
		for(String dataBloqueado: bloqueado) {
			if (dataBloqueado.equals(date)) {
				this.bloqueado.remove(date);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<String> getDisponivel(){
		return this.disponivel;
	}
	
	public boolean setDisponivel(String date) {
		this.removeAlugado(date);
		this.removeBloqueado(date);
		for(String dateDisponivel: disponivel) {
			if(dateDisponivel.equals(date)) {
				return false;
			}
		}
		this.disponivel.add(date);
		return true;
	}
	
	
	public ArrayList<String> getAlugado(){
		return this.alugado;
	}
	
	public boolean setAlugado(String date) {
		this.removeDisponivel(date);
		this.removeBloqueado(date);
		for(String dateAlugado: alugado) {
			if(dateAlugado.equals(date)) {
				return false;
			}
		}
		this.alugado.add(date);
		return true;
	}
	
	public ArrayList<String> getBloqueado(){
		return this.bloqueado;
	}
	
	public boolean setBloqueado(String date) {
		this.removeDisponivel(date);
		this.removeAlugado(date);
		for(String dateBloqueado: bloqueado) {
			if(dateBloqueado.equals(date)) {
				return false;
			}
		}
		this.bloqueado.add(date);
		return true;
	}
	
	
}
