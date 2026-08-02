package clearminds.cuentas;

public class Cuenta {

	private String id;
	private String tipo;
	private double saldo;

	// Constructor de ID: recibe el id y asigna el tipo "A" automáticamente
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}

	// Constructor Completo: recibe id, tipo y saldo
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	// Solo get, no set: el id no se puede cambiar una vez creada la cuenta
	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void imprimir() {
		System.out.println("           CUENTA");
		System.out.println("************************");
		System.out.println("Número de Cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: USD " + saldo);
		System.out.println("************************");
	}

	public void imprimirConMiEstilo() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("💳 Cuenta N° " + id + " (Tipo " + tipo + ")");
		System.out.println("💰 Saldo disponible: $" + saldo + " USD");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}