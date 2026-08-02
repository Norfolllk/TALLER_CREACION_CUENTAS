package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {

		// 1. Creación de instancias con diferentes constructores
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");

		// 2. Visualización inicial
		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		// --- Reto Adicional ---

		// Modificamos saldos y tipos para verificar el encapsulamiento
		System.out.println("\n-------- Después de Modificar --------");
		cuenta1.setSaldo(1200);
		cuenta1.setTipo("B");
		cuenta1.imprimir();

		cuenta2.setSaldo(50);
		cuenta2.imprimir();

		// Tres cuentas adicionales explorando los constructores sobrecargados
		System.out.println("\n-------- Cuentas Adicionales --------");

		Cuenta cuenta4 = new Cuenta("10001");
		cuenta4.imprimir();

		Cuenta cuenta5 = new Cuenta("10002", "B", 1500.50);
		cuenta5.imprimir();

		Cuenta cuenta6 = new Cuenta("10003");
		cuenta6.setTipo("C");
		cuenta6.setSaldo(320.75);
		cuenta6.imprimir();

		// Probando el método con estilo personalizado
		System.out.println("\n-------- Estilo Personalizado --------");
		cuenta1.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();

	}

}
