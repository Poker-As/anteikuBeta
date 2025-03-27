package clasesDeObjetos;

import java.util.List;

public class producto {
  
    private long id;
    private long idCategoria;
    private List<Long> idComponente;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private double existencia;

    public producto() {
    }

    public producto(long id, long idCategoria, List<Long> idComponente, String nombreProducto, String descripcion, double precio, double existencia) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.idComponente = idComponente;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public List<Long> getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(List<Long> idComponente) {
        this.idComponente = idComponente;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }
    
    
    
}
