import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;


    public Artefacto(String nombre, int poder, String tipo) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return  Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, poder, tipo);
    }
}
