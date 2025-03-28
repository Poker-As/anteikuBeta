package DAO;

import interfaces.crud;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import clasesDeObjetos.empleado;

public class empleadoDAO implements crud<empleado>{

    private static final String QUERY_INSERT = "INSERT INTO empleado (cedula_empleado, fecha_ingreso, tipo_contrato, turno_trabajo) VALUES (?,?,?,?)";
    private static final String QUERY_SELECT_ALL = "SELECT e.cedula_empleado, e.fecha_ingreso, e.tipo_contrato, e.turno_trabajo, "
            + " u.nombre_usuario, "
            + "u.apellido_usuario, u.correo_usuario, u.contrasenia, u.telefono_usuario, u.rol_usuario, u.fecha_nacimiento, "
            + "u.genero "
            + "FROM empleado e "
            + "JOIN usuario u ON e.cedula_empleado = u.cedula_usuario";
    private static final String QUERY_SELECT_ONE = "SELECT e.cedula_empleado, e.fecha_ingreso, e.tipo_contrato, e.turno_trabajo, "
            + " u.nombre_usuario, "
            + "u.apellido_usuario, u.correo_usuario, u.contrasenia, u.telefono_usuario, u.rol_usuario, u.fecha_nacimiento, "
            + "u.genero "
            + "FROM empleado e "
            + "JOIN usuario u ON e.cedula_empleado = u.cedula_usuario "
            + "WHERE e.cedula_empleado = ?";
    private static final String QUERY_UPDATE = "UPDATE empleado "
            + "SET e.fecha_ingreso = ?, e.tipo_contrato = ?, e.turno_trabajo = ?"
            + "u.cedula_usuario = ?, set u.nombre_usuario = ?, u.apellido_usuario, "
            + "u.correo_usuario = ?, u.contrasenia = ?, u.telefono_usuario = ?, u.fecha_nacimiento = ?, "
            + "u.genero = ? "
            + "FROM empleado e"
            + "JOIN usuario u ON e.cedula_empleado = ";
    private static final String QUERY_DELETE = "DELETE FROM empleado WHERE cedula_empleado = ?";
    
    @Override
    public List<empleado> listar() {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ALL);
                ResultSet rs = pst.executeQuery()){
        
            List<empleado> listaEmpleado = new ArrayList<>();
            
            while(rs.next()){
                listaEmpleado.add(map(rs));
            }
            return listaEmpleado;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }

    }

    @Override
    public boolean crear(empleado e) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_INSERT)){
        
            pst.setLong(1, e.getCedulaUsuario());
            pst.setDate(2, (Date) e.getFechaIngreso());
            pst.setString(3, e.getTipoContrato());
            pst.setString(4, e.getTurnoTrabajo());
            
            return pst.executeUpdate() > 0;
            
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return false;
        }

    }

    @Override
    public boolean buscar(long id) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ONE)){
        
            pst.setLong(1, id);
            ResultSet rs = pst.executeQuery();
            
            return rs.next();
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }

    }

    @Override
    public empleado obtener(long id) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ONE)){
        
            pst.setLong(1, id);
            try(ResultSet rs = pst.executeQuery()){
                if(rs.next()){
                    return map(rs);
                }
            }
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean modificar(empleado obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(long id) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_DELETE)){
        
            pst.setLong(1, id);
            return pst.executeUpdate() > 0;
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
        
    }

    @Override
    public empleado map(ResultSet rs) throws SQLException {

        return new empleado() {{
        
            setCedulaUsuario(rs.getLong("cedula_empleado"));
            setNombreUsuario(rs.getString("nombre_usuario"));
            setApellidoUsuario(rs.getString("apellido_usuario"));
            setCorreoUsuario(rs.getString("correo_usuario"));
            setCotraseniaUsuario(rs.getString("contrasenia"));
            setTelefonoUsuario(rs.getString("telefono_usuario"));
            setRolUsuario(rs.getString("rol_usuario"));
            setFechaNacimiento(rs.getDate("fecha_nacimiento"));
            setGenero(rs.getString("genero"));
            setFechaIngreso(rs.getDate("fecha_ingreso"));
            setTipoContrato(rs.getString("tipo_contrato"));
            setTurnoTrabajo(rs.getString("turno_trabajo"));
            
        }};
        
    }
    
}
