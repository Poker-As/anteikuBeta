package clasesDeObjetos;

import java.sql.Date;

public class cliente extends usuario{

    public cliente() {
    }

    public cliente(long cedulaUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario, String cotraseniaUsuario, String telefonoUsuario, String rolUsuario, Date fechaNacimiento, String genero) {
        super(cedulaUsuario, nombreUsuario, apellidoUsuario, correoUsuario, cotraseniaUsuario, telefonoUsuario, rolUsuario, fechaNacimiento, genero);
    }
    
}
