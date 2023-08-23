/**
 * 
 */
package ejercicioGatoPkg;

/**
 * 
 */
public class EjercicioGato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gato miGato=new Gato();
		miGato.setNombre("gato");
		
		miGato.maullar();
		miGato.dormir( 2  );
		miGato.correr("laguna");
		miGato.comer("pescado");
		
		System.out.println("el nombre de mi gato es " + miGato.getNombre());

	}

}
