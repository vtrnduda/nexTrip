/*Viagem(id,data, destino, veiculo, motorista)*/

package modelo;

public class Viagem {
	
	private int id;
	private String data;
	private String destino;
	private String veiculo;
	private String motorista;
	
	public Viagem () {}
	
	public Viagem (int id, String data, String destino, String veiculo, String motorista) {
		this.id = id;
		this.data = data;
		this.destino = destino;
		this.veiculo = veiculo;
		this.motorista = motorista;
	}	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	
	public String getMotorista() {
		return motorista;
	}
	
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	@Override
	public String toString() {
		return "Viagem [id=" + id + ", data=" + data + ", destino=" + destino + ", veiculo=" + veiculo + ", motorista="
				+ motorista + "]";
	}
	
	
}
