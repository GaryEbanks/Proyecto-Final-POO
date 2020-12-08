package clases;


/**
 * @author PC
 * @version 1.0
 * @created 06-dic.-2020 15:08:26
 */
public class Semestre {

	private int estado;
	private String nombreSemestre;

	public Semestre(){

	}

    public Semestre(int estado, String nombreSemestre) {
        this.estado = estado;
        this.nombreSemestre = nombreSemestre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombreSemestre() {
        return nombreSemestre;
    }

    public void setNombreSemestre(String nombreSemestre) {
        this.nombreSemestre = nombreSemestre;
    }
        
        

        

}