import java.util.Scanner;

/* Cambiar los modificadores de la clase empleado para que sean privados. Añadir getters y setters para poder acceder a las propiedades.

Añadir un método privado getIRPF que devuelva 0.85 si el sueldo es menor de 3000 y 0.75 en caso contrario. 

Modificar el método sueldoNeto para que multiplique por getIRPF en vez de por 0.85*/

class empleados {

		private static String nombre;
		private static String dni;
		private static double sueldo;
	
		empleados(String aux_nombre, String aux_dni){
			nombre = aux_nombre;
			dni = aux_dni;
		}
		public static String setNombre(String aux_nombre) {
			nombre = aux_nombre;
			return nombre;
		}
	
		public static String setDni(String aux_dni) {
			dni = aux_dni;
			return dni;
		}
		
		public static double setSueldo(double aux_sueldo) {
			sueldo = aux_sueldo;
			return sueldo;
		}
		
		public double setSueldoNeto() {
			double neto;
			neto = sueldo * getIrpf();
			return neto;	
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public String getDni() {
			return dni;
		}
		
		public double getSueldo() {
			return sueldo;
		}
		
		private double getIrpf() {
			if (sueldo < 3000) 
				return 0.85;
			else
				return 0.75;	
		}
}

public class GetSet {
	public static void main(String args[]) {
		//empleados empleado_actual = new empleados(empleados.SetNombre("alex"), "DNI12345");
		empleados empleado_actual = new empleados(empleados.setNombre("alex"), empleados.setDni("DNI12345"));
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el sueldo del empleado: ");
		empleados.setSueldo(sc.nextDouble());
		sc.close();
		
		System.out.println("-------------------------------------------------");
		System.out.println("Nombre: " + empleado_actual.getNombre());
		System.out.println("DNI: " + empleado_actual.getDni());
		System.out.println("Sueldo neto: " + empleado_actual.setSueldoNeto());	
	}
}
