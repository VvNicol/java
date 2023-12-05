/**
 * 
 */
package Controlador;

import Servicios.ImenuInterfaz;
import Servicios.IoperandoInterfaz;
import Servicios.menuImplementacion;
import Servicios.operandoImplementacion;

/**
 * Aplicación principal
 * @author csi23-nrojlla
 * 051223
 */
public class Inicio 
	{

	/**Logica de la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {

		ImenuInterfaz mi = new menuImplementacion();
		IoperandoInterfaz io = new operandoImplementacion();
		
		int resultado;
		int gasto;
		int venta;
		
		int opcionSeleccionada;
		boolean esCerrado = false;
		do {
			opcionSeleccionada = mi.MostrarMenuPrincipal();
			switch(opcionSeleccionada) 
			{
			case 0:
				esCerrado=true;
				System.out.println("La aplicacion se ha cerrado.");
				break;
			case 1:
				venta = io.AñadirVenta();
				continue;
			case 2:
				gasto = io.AgregarGasto();
				break;
			case 3:
				
				io.Resultado();
				
				break;
			default:
				System.out.println("La opcion seleccionada no existe.");
				System.out.println("Porfavor escoga una existente.");
				break;
			
			}
			
		}while(!esCerrado);
		
	}

}
