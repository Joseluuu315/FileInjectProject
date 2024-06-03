import java.io.Serializable;

public class Coches implements Serializable {
    private String matricula, marca, modelo;
    private int ageMatricula;

    public Coches(String matricula, String marca, String modelo, int ageMatricula) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ageMatricula = ageMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAgeMatricula() {
        return ageMatricula;
    }

    public void setAgeMatricula(int ageMatricula) {
        this.ageMatricula = ageMatricula;
    }
}
