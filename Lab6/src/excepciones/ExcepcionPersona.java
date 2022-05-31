package excepciones;

import java.util.Arrays;

import interfaces.Const;

public class ExcepcionPersona extends Exception {
	private static final long serialVersionUID = 1L;
	private Integer codigo;
	
	public ExcepcionPersona(Integer codigo) {
		super();
		this.codigo = codigo;
	}
	
	public ExcepcionPersona(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		switch(codigo) {
		case 1:
			return "Los documentos validos son : " + Arrays.toString(Const.tipoDoc);
		default:
			return super.getMessage();
		}
	}
}
