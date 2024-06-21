/*Motorista: cnh, nome, lista de viagem */

package modelo;

import java.util.ArrayList;

public class Motorista {
	private String nome;
	private String cnh;
	private ArrayList<Viagem> viagens = new ArrayList<>();
	
	public Motorista(String nome, String cnh) {
		this.nome = nome;
		this.cnh = cnh;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnh() {
		return cnh;
	}
	
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	public ArrayList<Viagem> getViagens() {
		return viagens;
	}
	
	/*cadastrar viagem*/
	public void cadastrar(Viagem viagem) {
		viagens.add(viagem);
	}
	
	/*remover viagem*/
	public void remover(Viagem viagem) {
		viagens.remove(viagem);
	}
	
	
	
	
	
	
	
	
	
	

}
