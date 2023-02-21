package org.iesalandalus.programacion.alquilervehiculos.vista;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private static final String PATRON_FECHA = "dd/MM/yyyy";
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern(PATRON_FECHA);

	private Consola() {

	}

	public static final void mostrarCabecera(String mensaje) {

		System.out.printf("%s", mensaje);
		System.out.printf("%s", mensaje.length());
	}

	public static final void mostrarMenu() {
		System.out.printf("Bienvenido al menu de alquiler de vehiculos: ");
		for (int i = 0; i < Opcion.values().length; i++) {
			System.out.printf("%s");
		}
	}

	private static final String leerCadena(String mensaje) {
		System.out.printf("%s", mensaje);
		System.out.printf("Introduzca una cadena: ");
		String cadena;
		cadena = Entrada.cadena();
		return cadena;

	}

	private static final Integer leerEntero(String mensaje) {
		System.out.printf("%s", mensaje);
		System.out.printf("Introduzca un entero: ");
		Integer entero;
		entero = Entrada.entero();
		return entero;

	}

	private static final LocalDate leerFecha(String mensaje) {
		System.out.printf("%s", mensaje);
		System.out.printf("Introduzca una fecha: ");
		LocalDate fecha = null;

		return fecha;
	}

	public static final Opcion elegirOpcion() {
		Consola.leerEntero(null);
		return null;

	}

	public static final Cliente leerCliente() {

		System.out.printf("%s", Consola.leerCadena(null));
		return null;
	}

	public static final Cliente leerClienteDni() {
		System.out.printf("%s", Consola.leerCadena(null));
		return null;
	}

	public static final String leerNombre() {
		System.out.printf("%s", Consola.leerCadena(null));
		return null;
	}

	public static final String leerTelefono() {
		System.out.printf("%s", Consola.leerEntero(null));
		return null;
	}

	public static final Turismo leerTurismo() {
		System.out.printf("%s", Consola.leerCadena(null));
		return null;
	}

	public static final Turismo leerTursimoMatricula() {
		System.out.printf("%s", Consola.leerCadena(null));
		return null;
	}

	public static final Alquiler leerAlquiler() {
		System.out.printf("%s", Consola.leerCadena(null));
		return null;
	}

	public static final LocalDate leerFechaDevolucion() {
		System.out.printf("%s", Consola.leerFecha(null));
		return null;
	}

}
