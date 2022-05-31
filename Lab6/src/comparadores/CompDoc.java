package comparadores;

import java.util.Comparator;

import entidades.Persona;

public class CompDoc implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		int tipo = persona1.getDocumento().getTipo().toString().compareTo(persona2.getDocumento().getTipo().toString());
		if(tipo == 0)
			return persona1.getDocumento().getNumero() - persona2.getDocumento().getNumero();
		return tipo;
	}

}
