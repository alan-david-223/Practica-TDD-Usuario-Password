/*Crear usando TDD, la clase Usuario, que contenga una password como atributo,
y para poder asignarle la password al usuario, hay que determinar si la password
es fuerte.

Condiciones para que una password sea fuerte:
	
	1. Tenga mas de 8 caracteres de longitud
	2. Tenga al menos 1 caracter en mayúscula
	3. Tenga al menos 1 caracter en minuscula*/

package usuario;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioTest {
	
	private Usuario user1234;

	@Test
	public void testQueCreaUnUsuario() {
		//preparación (dado / given)
		String password = "asd123";
		Usuario user = whenCreoUnUsuario();
		//ejecución (cuando / when)
		
		//validación - constatación (entonces / then)
		thenVerificarQueTengaPassword();
		
		
	}

	private Usuario whenCreoUnUsuario(String nombre, String password) {
		return user1234 = new Usuario(nombre, password);
				
	}
	
	private void thenVerificarQueTengaPassword() {
		// TODO Auto-generated method stub
		
	}

}
