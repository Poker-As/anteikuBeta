package clasesDeObjetos;

import java.util.List;

public class ingrediente {
 
    private long idIngrediente;
    private List<Long> idNutriente;
    private String nombreIngrediente;
    private double cantidadIngrediente;
    private String descripcion;

    public ingrediente() {
    }

    public ingrediente(long idIngrediente, List<Long> idNutriente, String nombreIngrediente, double cantidadIngrediente, String descripcion) {
        this.idIngrediente = idIngrediente;
        this.idNutriente = idNutriente;
        this.nombreIngrediente = nombreIngrediente;
        this.cantidadIngrediente = cantidadIngrediente;
        this.descripcion = descripcion;
    }

    public long getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(long idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public List<Long> getIdNutriente() {
        return idNutriente;
    }

    public void setIdNutriente(List<Long> idNutriente) {
        this.idNutriente = idNutriente;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public double getCantidadIngrediente() {
        return cantidadIngrediente;
    }

    public void setCantidadIngrediente(double cantidadIngrediente) {
        this.cantidadIngrediente = cantidadIngrediente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
