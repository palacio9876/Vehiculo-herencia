public class Aereo extends Vehiculo{

    private String nombreAereo;
    private int numeroChasis;

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }


    public String getNombreAereo() {
        return nombreAereo;
    }

    public void setNombreAereo(String nombreAereo) {
        this.nombreAereo = nombreAereo;
    }



    public String volar() {
        return "Metodo volar en clase Aereo";
    }

}
