/**
 * 
 */

/**
 * @author luise *
 */


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		int result = num1 + num2;
		mi_primer_objeto operaciones = new mi_primer_objeto();
		
		// TODO Auto-generated method stub
		System.out.println("Hola Alicia");
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + result);
		System.out.println("La suma de " + operaciones.a + " y " + operaciones.b + " es: " + operaciones.suma());
		System.out.println("La multiplicacion de " + operaciones.a + " y " + operaciones.b + " es: " + operaciones.multiplica());
		System.out.println("La division de " + operaciones.a + " y " + operaciones.b + " es: " + operaciones.divide());
		System.out.println(operaciones.a + " es mayor que " + operaciones.b + " ? >>> " + operaciones.mayor());

		
		// Agrego un comentario
	}

}
