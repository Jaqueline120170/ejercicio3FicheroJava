package dtos;

public class ClientesDto {

	String nombreCliente="aaaaa";
	String primerApellido="aaaaa";
	String segundoApellido ="aaaaa";
	String nombreCompleto="aaaaa";
	String emailCliente ="aaaaa";
	int telefono=11111;
	
	
	
	public ClientesDto(String nombreCompleto, String emailCliente, int telefono) {
		super();
		this.nombreCompleto = nombreCompleto;
		String[] arrayNombreCliente = nombreCompleto.split(" ");
		this.nombreCliente = arrayNombreCliente[0];
		this.primerApellido = arrayNombreCliente[1];
		this.segundoApellido = arrayNombreCliente[2];
		this.emailCliente = emailCliente;
		this.telefono = telefono;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "ClientesDto [nombreCompleto=" + nombreCompleto + ", emailCliente=" + emailCliente + ", telefono="
				+ telefono + "]";
	}
	
	
	
	
	
}
