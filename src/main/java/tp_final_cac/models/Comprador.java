package tp_final_cac.models;

public class Comprador {
    int id;
    String nombre, apellido, email, categoria;

    public Comprador(int id, String nombre, String apellido, String email, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.categoria = categoria;
    }

    public Comprador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int nuevoId) {
        this.id = nuevoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String nuevaCategoria) {
        this.categoria = nuevaCategoria;
    }
}
