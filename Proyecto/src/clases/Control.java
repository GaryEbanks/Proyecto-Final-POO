package clases;

import java.util.Date;


/**
 * @author PC
 * @version 1.0
 * @created 06-dic.-2020 15:08:27
 */
public class Control {

	private int estado;
	private Date FechaAutoEst;
	private int HorasEstudiadas;
	private Materia m_Materia;
	private Estudiante m_Estudiante;

	public Control(){

	}

    public Control(int estado, Date FechaAutoEst, int HorasEstudiadas, Materia m_Materia, Estudiante m_Estudiante) {
        this.estado = estado;
        this.FechaAutoEst = FechaAutoEst;
        this.HorasEstudiadas = HorasEstudiadas;
        this.m_Materia = m_Materia;
        this.m_Estudiante = m_Estudiante;
    }
        
        

  
        
        


	   public double calcularHorasAutoEstudio(Materia a) {
        double cuotaSem;

        cuotaSem = (a.getHorasAutoEst() / 16);

        return cuotaSem;
    }


	public double sumarHorasAutoEstudioT(Materia c, int horas){
            int horasTotales = c.getHorasAutoEst();
            int horasRestantes = horasTotales - horas;
            
		return horasRestantes;
	}


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFechaAutoEst() {
        return FechaAutoEst;
    }

    public void setFechaAutoEst(Date FechaAutoEst) {
        this.FechaAutoEst = FechaAutoEst;
    }

    public int getHorasEstudiadas() {
        return HorasEstudiadas;
    }

    public void setHorasEstudiadas(int HorasEstudiadas) {
        this.HorasEstudiadas = HorasEstudiadas;
    }

    public Materia getM_Materia() {
        return m_Materia;
    }

    public void setM_Materia(Materia m_Materia) {
        this.m_Materia = m_Materia;
    }

    public Estudiante getM_Estudiante() {
        return m_Estudiante;
    }

    public void setM_Estudiante(Estudiante m_Estudiante) {
        this.m_Estudiante = m_Estudiante;
    }

    

}