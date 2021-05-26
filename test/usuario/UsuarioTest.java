/*Crear usando TDD, la clase Usuario, que contenga una password como atributo,
y para poder asignarle la password al usuario, hay que determinar si la password
es fuerte.

Condiciones para que una password sea fuerte:
	
	1. Tenga mas de 8 caracteres de longitud
	2. Tenga al menos 1 caracter en may�scula
	3. Tenga al menos 1 caracter en minuscula*/

package usuario;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
	

	@Test
	public void testQueCreaUnUsuario() {
		//preparaci�n (dado / given)		
			String password = "asd123";
			String nombre = "Nombrerto Apellidez";
		//ejecuci�n (cuando / when)
			Usuario user = whenCreoUnUsuario(nombre, password);
		//validaci�n - constataci�n (entonces / then)
			assertNotNull(user);	
		
	}
	
	@Test
	public void testQueVerificaQueElPasswordTenga8CaracteresOMas() {
		//preparaci�n
			String password = "asdasd123";
			String nombre = "Nombrerto Apellidez";	
		//ejecuci�n
			Usuario user = whenCreoUnUsuario(nombre, password);
		//validaci�n - constataci�n (entonces / then)
			thenVerificoQueTenga8OM�sCaracteres(user);		
	}
	
	@Test
	public void testQueVerificaQueExista1MayusculaOMas() {
		//preparaci�n
			String password = "asdasD123";
			String nombre = "Nombrerto Apellidez";	
		//ejecuci�n
			Usuario user = whenCreoUnUsuario(nombre, password);
		//validaci�n - constataci�n (entonces / then)
			thenVerificoTengaAlMenosUnaMayus(user);		
	}
	
	@Test
	public void testQueVerificaQueExista1MinusculaOMas() {
		//preparaci�n
			String password = "asdasD123";
			String nombre = "Nombrerto Apellidez";	
		//ejecuci�n
			Usuario user = whenCreoUnUsuario(nombre, password);
		//validaci�n - constataci�n (entonces / then)
			thenVerificoTengaAlMenosUnaMinus(user);	
	}
	
	@Test
	public void testQueVerificaTodasLasCondicionesDeLaPassword() {
		//preparaci�n
		String password = "asdasD123";
		String nombre = "Nombrerto Apellidez";	
	//ejecuci�n
		Usuario user = whenCreoUnUsuario(nombre, password);
	//validaci�n - constataci�n (entonces / then)
		assertNotNull(user);	
		thenVerificoQueTenga8OM�sCaracteres(user);
		thenVerificoTengaAlMenosUnaMayus(user);	
		thenVerificoTengaAlMenosUnaMinus(user);	
	}

	

	private Usuario whenCreoUnUsuario(String nombre, String password) {
		return new Usuario(nombre, password);				
	}	

	
	private void thenVerificoQueTenga8OM�sCaracteres(Usuario user) {
		Assert.assertTrue(user.verificarQueTenga8CaracteresOMas());		
	}
	
	private void thenVerificoTengaAlMenosUnaMayus(Usuario user) {
		
		
	}
	
	private void thenVerificoTengaAlMenosUnaMinus(Usuario user) {
		Assert.assertTrue(user.verificarQueTengaAlMenosUnaMinus());
		
	}

}
