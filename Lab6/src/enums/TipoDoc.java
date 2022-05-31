package enums;

public enum TipoDoc {
	DNI("Documento Nacional de Identidad"),
	PAS("Pasaporte"),
	LE("Libreta de Enrolamiento"),
	CI("Cedula de Identidad");
	
	private String descripcion;
	private TipoDoc(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}
