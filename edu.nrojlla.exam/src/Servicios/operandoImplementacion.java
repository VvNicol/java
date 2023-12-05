/**
 * 
 */
package Servicios;

/**
 * Logica de los metodos
 * @author csi23-nrojlla
 * 051223
 */
public class operandoImplementacion implements IoperandoInterfaz {

	ImenuInterfaz mi = new menuImplementacion();
	int resultadoDia;	
	@Override
	public int GuardarDato() 
	{
		System.out.println("Añadir venta");
		int datoDia= 0;
		int datoIngreso = mi.IngresarNumero();
		resultadoDia = datoDia+datoIngreso;
		return resultadoDia;
	}
	
	@Override
		public int AñadirVenta() {
		System.out.println("Agregar a cuenta");		
		int datoActual= resultadoDia;
		int datoARestar = mi.IngresarNumero();
		int resultadoDia = datoActual+datoARestar;
		return resultadoDia;
	}
	
		@Override
	public int AgregarGasto() {
			System.out.println("restar de cuenta");
			int datoActual= resultadoDia;
			int datoARestar = mi.IngresarNumero();
			int resultadoDia = datoActual-datoARestar;
			if(resultadoDia == 0) {
				System.out.println("Hemos llegado a cero");
				
			}else if(resultadoDia <-1) {
				System.out.println("Debes dinero");
			}		
			return resultadoDia;
	}

	
	@Override
	public void Resultado() {
			
		if(resultadoDia==0) {
			System.out.println("Vamos mal");
			
			System.out.println("Su fondo es: " + resultadoDia);
		}else if(resultadoDia <-1) {
			System.out.println("Vamos muy mal");
			System.out.println(resultadoDia);
		}
		
	}


}
