/*Crear usando TDD, la clase Usuario, que contenga una password como atributo,
y para poder asignarle la password al usuario, hay que determinar si la password
es fuerte.

Condiciones para que una password sea fuerte:
	
	1. Tenga mas de 8 caracteres de longitud
	2. Tenga al menos 1 caracter en mayúscula
	3. Tenga al menos 1 caracter en minuscula*/

package usuario;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
	
	private Usuario user;

	@Test
	public void testQueCreaUnUsuario() {
		//preparación (dado / given)
		String password = "asd123";
		String nombre = "Nombrerto Apellidez";
		//ejecución (cuando / when)
		Usuario user = whenCreoUnUsuario(nombre, password);
		//validación - constatación (entonces / then)
		thenVerificarQueTengaPassword();
		
		
	}
	
	@Test
	public void testQueVerificaQueElPasswordTenga8Caracteres() {
		//preparación
		String password = "asd123";
		String nombre = "Nombrerto Apellidez";	
		//ejecución
		Usuario user = whenCreoUnUsuario(nombre, password);
		//validación - constatación (entonces / then)
		thenVerificoQueTenga8OMásCaracteres();
		
	}

	private Usuario whenCreoUnUsuario(String nombre, String password) {
		return user = new Usuario(nombre, password);
				
	}
	
	private void thenVerificarQueTengaPassword() {
		Assert.assertNotNull(user.getPassword());
		
	}
	
	private void thenVerificoQueTenga8OMásCaracteres() {
		// TODO Auto-generated method stub
		
	}

}
