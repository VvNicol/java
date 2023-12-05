/**
 * 
 */
package Servicios;

import java.util.Scanner;

/**
 * Implementacion y logica de los metodos de la interfaz
 * @author csi23-nrojlla
 * 051223
 */
public class menuImplementacion implements ImenuInterfaz 
{
	Scanner sc = new Scanner(System.in);
	@Override
	public int MostrarMenuPrincipal() {
		
		int OpcionAElegir;
		
		System.out.println(".......................");
		System.out.println("Gestiona tu cuenta dia a dia");
		System.out.println("0.Cerrar ");
		System.out.println("1.Añadir venta ");
		System.out.println("2.Añadir gasto ");
		System.out.println("3.Mostrar total ");
		System.out.println(".......................");
		
		OpcionAElegir = sc.nextInt();
		
		return OpcionAElegir;
	}
	
	
	@Override
	public int IngresarNumero() {
		System.out.println("Ingrese un numero (entero)");
		int ingresarNumero = sc.nextInt();
		return ingresarNumero;
	}

}
