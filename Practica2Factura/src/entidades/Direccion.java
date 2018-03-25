package entidades;

public class Direccion {
	private String calle;
	private String num;
	private String cp;
	private String poblacion;
	private String provincia;
	private String pais;
	
	public Direccion(String calle, String num, String cp, String poblacion,String provincia, String pais) {
		this.calle = calle;
		this.num = num;
		this.cp = cp;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public String getNum() {
		return num;
	}

	public String getCp() {
		return cp;
	}

	public String getPoblacion() {
		return poblacion;
	}


	public String getProvincia() {
		return provincia;
	}

	public String getPais() {
		return pais;
	}


}
