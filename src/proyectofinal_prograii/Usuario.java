package proyectofinal_prograii;

/**
 *
 * @author Rui
 */
public class Usuario {
    private String nombre, sexo;
    private int numCuenta, edad;

    public Usuario() {
    }

    public Usuario(String nombre, String sexo, int numCuenta, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", sexo=" + sexo + ", numCuenta=" + numCuenta + ", edad=" + edad + '}';
    }
    
}
