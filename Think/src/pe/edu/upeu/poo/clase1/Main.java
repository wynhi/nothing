package pe.edu.upeu.poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		Persona winnie = new Persona();
		winnie.nombre = "winnie lilian";
		winnie.apaPaterno = "choque";
		winnie.apaMaterno = "hito";
		winnie.celular = "957402088";
		winnie.direccion = "jr: moquegua #838";
		winnie.DNI = 72456141;
		winnie.email = "choquewinnie@gmail.com";
		winnie.estadocivil = "soltero";
		winnie.altura = 1.75;
		winnie.religion = "catolica";
		winnie.sexo = "femenino";
		winnie.vive = true;
		winnie.tipodesangre = "O+";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			winnie.Fechanacimiento = sdf.parse("02/04/1998");

		} catch (ParseException e) {
			e.printStackTrace();

		}

		System.out.println(winnie);

	}

}
