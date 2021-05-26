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
	

	@Test
	public void testQueCreaUnUsuario() {
		//preparación (dado / given)		
			String password = "asd123";
			String nombre = "Nombrerto Apellidez";
		//ejecución (cuando / when)
			Usuario user = whenCreoUnUsuario(nombre, password);
		//validación - constatación (entonces / then)
			assertNotNull(user);	
		
	}
	
	@Test
	public void testQueVerificaQueElPasswordTenga8CaracteresOMas() {
		//preparación
			String password = "asdasd123";
			String nombre = "Nombrerto Apellidez";	
		//ejecución
			Usuario user = whenCreoUnUsuario(nombre, password);
		//validación - constatación (entonces / then)
			thenVerificoQueTenga8OMásCaracteres(user);		
	}
	
	@Test
	public void testQueVerificaQueExista1MayusculaOMas() {
		//preparación
			String password = "asdasD123";
			String nombre = "Nombrerto Apellidez";	
		//ejecución
			Usuario user = whenCreoUnUsuario(nombre, password);
		//validación - constatación (entonces / then)
			thenVerificoTengaAlMenosUnaMayus(user);		
	}
	
	@Test
	public void testQueVerificaQueExista1MinusculaOMas() {
		//preparación
			String password = "asdasD123";
			String nombre = "Nombrerto Apellidez";	
		//ejecución
			Usuario user = whenCreoUnUsuario(nombre, password);
		//validación - constatación (entonces / then)
			thenVerificoTengaAlMenosUnaMinus(user);	
	}
	
	@Test
	public void testQueVerificaTodasLasCondicionesDeLaPassword() {
		//preparación
		String password = "asdasD123";
		String nombre = "Nombrerto Apellidez";	
	//ejecución
		Usuario user = whenCreoUnUsuario(nombre, password);
	//validación - constatación (entonces / then)
		assertNotNull(user);	
		thenVerificoQueTenga8OMásCaracteres(user);
		thenVerificoTengaAlMenosUnaMayus(user);	
		thenVerificoTengaAlMenosUnaMinus(user);	
	}

	

	private Usuario whenCreoUnUsuario(String nombre, String password) {
		return new Usuario(nombre, password);				
	}	

	
	private void thenVerificoQueTenga8OMásCaracteres(Usuario user) {
		Assert.assertTrue(user.verificarQueTenga8CaracteresOMas());		
	}
	
	private void thenVerificoTengaAlMenosUnaMayus(Usuario user) {
		
		
	}
	
	private void thenVerificoTengaAlMenosUnaMinus(Usuario user) {
		Assert.assertTrue(user.verificarQueTengaAlMenosUnaMinus());
		
	}

}
