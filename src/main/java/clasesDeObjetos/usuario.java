package clasesDeObjetos;

import java.sql.Date;

public class usuario {
   
    private long cedulaUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String correoUsuario;
    private String cotraseniaUsuario;
    private String telefonoUsuario;
    private String rolUsuario;
    private Date fechaNacimiento;
    private String genero;

    public usuario() {
    }

    public usuario(long cedulaUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario, String cotraseniaUsuario, String telefonoUsuario, String rolUsuario, Date fechaNacimiento, String genero) {
        this.cedulaUsuario = cedulaUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correoUsuario = correoUsuario;
        this.cotraseniaUsuario = cotraseniaUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.rolUsuario = rolUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public long getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(long cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getCotraseniaUsuario() {
        return cotraseniaUsuario;
    }

    public void setCotraseniaUsuario(String cotraseniaUsuario) {
        this.cotraseniaUsuario = cotraseniaUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   

}
