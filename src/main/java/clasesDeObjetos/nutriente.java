package clasesDeObjetos;

public class nutriente {
   
    private long idNutriente;
    private String nombreNutiente;
    private double porcion;
    private double porcentajeDiario;

    public nutriente() {
    }

    public nutriente(long idNutriente, String nombreNutiente, double porcion, double porcentajeDiario) {
        this.idNutriente = idNutriente;
        this.nombreNutiente = nombreNutiente;
        this.porcion = porcion;
        this.porcentajeDiario = porcentajeDiario;
    }

    public long getIdNutriente() {
        return idNutriente;
    }

    public void setIdNutriente(long idNutriente) {
        this.idNutriente = idNutriente;
    }

    public String getNombreNutiente() {
        return nombreNutiente;
    }

    public void setNombreNutiente(String nombreNutiente) {
        this.nombreNutiente = nombreNutiente;
    }

    public double getPorcion() {
        return porcion;
    }

    public void setPorcion(double porcion) {
        this.porcion = porcion;
    }

    public double getPorcentajeDiario() {
        return porcentajeDiario;
    }

    public void setPorcentajeDiario(double porcentajeDiario) {
        this.porcentajeDiario = porcentajeDiario;
    }
    
    
    
}
