package clases;


/**
 * @author PC
 * @version 1.0
 * @created 06-dic.-2020 15:08:26
 */
public class Materia {

	private String codigo;
	private int creditos;
	private int estado;
	private int horasAutoEst;
	private String nombre;
	private Semestre m_Semestre;

	public Materia(){

	}

    public Materia(String codigo, int creditos, int estado, int horasAutoEst, String nombre, Semestre m_Semestre) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.estado = estado;
        this.horasAutoEst = horasAutoEst;
        this.nombre = nombre;
        this.m_Semestre = m_Semestre;
    }
        
        

	public int eliminarMateria(){
		return 0;
	}

	public int ingresarMateria(){
		return 0;
	}

	public int modificarMateria(){
		return 0;
	}

    public Semestre getM_Semestre() {
        return m_Semestre;
    }

    public void setM_Semestre(Semestre m_Semestre) {
        this.m_Semestre = m_Semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getHorasAutoEst() {
        return horasAutoEst;
    }

    public void setHorasAutoEst(int horasAutoEst) {
        this.horasAutoEst = horasAutoEst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}