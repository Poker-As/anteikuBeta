package clasesDeObjetos;

import java.sql.Date;

public class administrador extends usuario{

    public administrador() {
    }

    public administrador(long cedulaUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario, String cotraseniaUsuario, String telefonoUsuario, String rolUsuario, Date fechaNacimiento, String genero) {
        super(cedulaUsuario, nombreUsuario, apellidoUsuario, correoUsuario, cotraseniaUsuario, telefonoUsuario, rolUsuario, fechaNacimiento, genero);
    }
    
}
