package clasesDeObjetos;

public class categoria {
    
    private int IdCategoria;
    private String NombreCategotia;
    private String DescripcionCategoria;

    public categoria() {
    }

    public categoria(int IdCategoria, String NombreCategotia, String DescripcionCategoria) {
        this.IdCategoria = IdCategoria;
        this.NombreCategotia = NombreCategotia;
        this.DescripcionCategoria = DescripcionCategoria;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getNombreCategotia() {
        return NombreCategotia;
    }

    public void setNombreCategotia(String NombreCategotia) {
        this.NombreCategotia = NombreCategotia;
    }

    public String getDescripcionCategoria() {
        return DescripcionCategoria;
    }

    public void setDescripcionCategoria(String DescripcionCategoria) {
        this.DescripcionCategoria = DescripcionCategoria;
    }

    
    
}
