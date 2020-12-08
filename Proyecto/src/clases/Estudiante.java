package clases;


/**
 * @author PC
 * @version 1.0
 * @created 06-dic.-2020 15:08:26
 */
public class Estudiante {

	private String apellidos;
	private String carnet;
	private String carrera;
	private String contrasena;
	private String email;
	private int estado;
	private String nombre;

	public Estudiante(){

	}

    public Estudiante(String apellidos, String carnet, String carrera, String contrasena, String email, int estado, String nombre) {
        this.apellidos = apellidos;
        this.carnet = carnet;
        this.carrera = carrera;
        this.contrasena = contrasena;
        this.email = email;
        this.estado = estado;
        this.nombre = nombre;
    }
        
        


	public int eliminarDatos(){
		return 0;
	}

	public int ingresarDatos(){
		return 0;
	}

	public int modificarDatos(){
		return 0;
	}

	public String mostrarDatos(){
		return "Datos del Estudiante \n"
                + "Nombre: " + this.getNombre() + "\n"
                + "Apellidos: " + this.getApellidos() + "\n"
                + "Carnet: " + this.getCarnet() + "\n"
                + "Carrera: " + this.getCarrera() + "\n"
                + "Correo electronico: "+ this.getEmail() ;
	}

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
}