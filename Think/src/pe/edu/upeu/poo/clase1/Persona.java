package pe.edu.upeu.poo.clase1;

import java.util.Date;

public class Persona {
	
	String nombre;
	String apaPaterno;
	String apaMaterno;
	Double altura;
	Integer DNI;
	String celular;
	Date Fechanacimiento;
	String email;
	String direccion;
	String religion;
	String sexo;
	String estadocivil;
	Boolean vive;
	String tipodesangre;
	
	public int getedad(){
		
		
		return 0;
	
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apaPaterno=" + apaPaterno + ", apaMaterno=" + apaMaterno + ", altura="
				+ altura + ", DNI=" + DNI + ", celular=" + celular + ", Fechanacimiento=" + Fechanacimiento + ", email="
				+ email + ", direccion=" + direccion + ", religion=" + religion + ", sexo=" + sexo + ", estadocivil="
				+ estadocivil + ", vive=" + vive + ", tipodesangre=" + tipodesangre + "]";
	}
	
	

}
