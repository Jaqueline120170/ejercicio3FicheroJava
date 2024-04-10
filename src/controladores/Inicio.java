package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClientesDto;

public class Inicio {

	static Scanner sc = new Scanner(System.in);
	static String rutaArchivo = "C:\\Users\\Usuario\\eclipse-workspace\\ejercicio3FicheroJava\\" + "ficheros3" + ".csv";
	public static void main(String[] args) {
		
		List<ClientesDto> listaClientes = new ArrayList<ClientesDto>();
		añadirCliente(listaClientes);

	}
	public static void añadirCliente(List<ClientesDto> listaClientes) {
		
		
		try (FileWriter escritor = new FileWriter(rutaArchivo,true))
		{
			
			PrintWriter printWriter = new PrintWriter(escritor);
			System.out.println("Introduzca su nombre separado por espacios");
			String nombre = sc.next();
			System.out.println("Introduzca su email");
			String email = sc.next();
			System.out.println("Introduzca su telefono");
			int telefono = sc.nextInt();
			sc.nextLine();

			ClientesDto cliente = new ClientesDto(nombre, email, telefono);
			listaClientes.add(cliente);

			for (ClientesDto cliente1 : listaClientes) {
				printWriter.println(cliente1.toString() + "\n");
			}
			printWriter.close();

			System.out.println("Se han escrito los datos en el archivo exitosamente.");
		} catch (IOException e) {
			System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
	}

}
