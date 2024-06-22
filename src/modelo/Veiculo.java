/* Veiculo(placa, modelo, lista de viagem)*/

package modelo;

import java.util.ArrayList;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private ArrayList<Viagem> viagens = new ArrayList<>();
	
	public Veiculo () {}
	
	public Veiculo(String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//adicionar viagem
	public void cadastrar(Viagem viagem) {
		viagens.add(viagem);
	}
	
	public void remover(Viagem viagem) {
		viagens.remove(viagem);
	}
	
	@Override
	public String toString() {
		String result = "Veiculo placa=" + placa + ",  modelo=" + modelo  ;
		
		for (Viagem v : viagens) 
			result+= "viagem: " + v;
		
		return result;
	}
	
	

}
