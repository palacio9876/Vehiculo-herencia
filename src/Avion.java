public class Avion extends Aereo{

    private String nombreAvion;
    private int numeroMotores;

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }




    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public String bajarTrenDeAterrizaje() {
        return "Metodo bajarTrenDeAterrizaje en clase Avion";
    }

}
