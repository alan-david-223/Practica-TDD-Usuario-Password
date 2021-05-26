/*Crear usando TDD, la clase Usuario, que contenga una password como atributo,
y para poder asignarle la password al usuario, hay que determinar si la password
es fuerte.

Condiciones para que una password sea fuerte:
	
	1. Tenga mas de 8 caracteres de longitud
	2. Tenga al menos 1 caracter en mayúscula
	3. Tenga al menos 1 caracter en minuscula*/

package usuario;

public class Usuario {
	String nombre;
	String password;

	public Usuario(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public boolean verificarQueTenga8CaracteresOMas() {					
		return this.password.length()>=8;
	}

	public boolean verificarQueTengaAlMenosUnaMayus() {
		for (int i = 0; i <= this.password.length(); i++) {
			if ((Character.isUpperCase(this.password.charAt(i)))) {
				return Boolean.TRUE;
			}			
		}
		return Boolean.FALSE;
	}

	public boolean verificarQueTengaAlMenosUnaMinus() {
		for (int i = 0; i <= this.password.length(); i++) {
			if ((Character.isLowerCase(this.password.charAt(i)))) {
				return Boolean.TRUE;
			}			
		}
		return Boolean.FALSE;
	}

}//