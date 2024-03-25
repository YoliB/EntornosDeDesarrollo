package practica1;
import java.util.Scanner;
/**
 * La clase `notas` representa un sistema para calcular la nota final de un estudiante
 * basado en tres unidades formativas y sus acumulados.
 *
 * @author Yolanda Bernárdez
 * @version 1.0
 * @since 25/03/2024
*/

public class notas {
	//declaramos la variables que nos hacen falta
	
	double unidadFormativa1, unidadFormativa2, unidadFormativa3;
	double acu1, acu2, acu3, def;
	//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	///vamos ca crear un metodo para ingresar 
	/**
	 * Nota de la primera unidad formativa.
	 * @param uf1 La nota de la primera unidad formativa.
	 * @param uf2 La nota de la segunda unidad formativa.
	 * @param uf3 La nota de la tercera unidad formativa.
	 */
	
	/**
     * Ingresa las notas del estudiante por teclado.
     *
     * Pide al usuario que introduzca las notas de las tres unidades formativas.
     */
	public void IngresaNotas() {
		//cuando ejecutamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		unidadFormativa1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		
		unidadFormativa2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		unidadFormativa3= entrada.nextDouble();
	}
	
	// metodo para comprobar bien entroduccion de notas
	
	/**
     * Comprueba si las notas introducidas son inferiores a 10).
     *
     * Muestra un mensaje de error si alguna nota no es válida.
     */
	
	public void comprobacion(){
		
		if (unidadFormativa1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (unidadFormativa2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (unidadFormativa3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}	
	}
	// metodo para calcular nota
	
	/**
     * Calcula los acumulados y la nota definitiva del estudiante.
     */
	public void Calculonotas() {
		acu1= unidadFormativa1*0.35;
		acu2 = unidadFormativa2 * 0.35;
		acu3 = unidadFormativa3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	}
	
	/**
	 * Muestra las notas introducidas, los acumulados y la nota definitiva.
	 *  Un mensaje indicando la nota definitiva.
	 */
	
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + unidadFormativa1);
		System.out.println(" nota2 = " + unidadFormativa2);
		System.out.println(" nota3 = " + unidadFormativa3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

	/**
	 * Determina si el estudiante aprobó o suspendió.
	 *  `true` si el estudiante aprobó, `false` si no.
	 */
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
			
	/**
	 * Método principal que instancia un objeto de la clase `notas` y realiza los cálculos
	 * necesarios.
	 *
	 * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
	 */
		
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobacion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}
}
