package clasesDeObjetos;

import java.util.Date;

public class empleado extends usuario{
   
    private Date fechaIngreso;
    private String tipoContrato;
    private String turnoTrabajo;

    public empleado() {
    }

    public empleado(Date fechaIngreso, String tipoContrato, String turnoTrabajo, long cedulaUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario, String cotraseniaUsuario, String telefonoUsuario, String rolUsuario, java.sql.Date fechaNacimiento, String genero) {
        super(cedulaUsuario, nombreUsuario, apellidoUsuario, correoUsuario, cotraseniaUsuario, telefonoUsuario, rolUsuario, fechaNacimiento, genero);
        this.fechaIngreso = fechaIngreso;
        this.tipoContrato = tipoContrato;
        this.turnoTrabajo = turnoTrabajo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getTurnoTrabajo() {
        return turnoTrabajo;
    }

    public void setTurnoTrabajo(String turnoTrabajo) {
        this.turnoTrabajo = turnoTrabajo;
    }

}
