package structure;

import domain.*;
import exceptions.FormatoInvalidoDeFecha;

public class Main {

	public static void main(String[] args) {
		String fecha = "12/5/144";

		try{
			ParseadorDeFecha.parsearFecha(fecha);
		}
		catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
	}

}
