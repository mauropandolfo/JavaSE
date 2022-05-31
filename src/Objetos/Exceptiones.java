package Objetos;

public class Exceptiones extends Exception {
	
	private int codigo;

	public Exceptiones(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	@Override
	public String getMessage() {
		switch(codigo) {
		case 1:
			return "La cantidad de digitos no corresponde a un dni";
		case 2:
			return "Los numeros negativos no corresponden a un numero valido";
		default:
			return "Nose vo fijate";
		}
	}
	
}
