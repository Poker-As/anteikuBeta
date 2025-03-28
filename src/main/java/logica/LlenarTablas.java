package logica;

import DAO.clienteDAO;
import DAO.empleadoDAO;
import clasesDeObjetos.cliente;
import clasesDeObjetos.empleado;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LlenarTablas {
    
    empleadoDAO eDao = new empleadoDAO();
    
    public void llenarTablaEmpleado(JTable tabla){
    
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        
        List<empleado> listaEmpleado = eDao.listar();
        
        for(empleado e : listaEmpleado){
            model.addRow(new Object[]{
                e.getCedulaUsuario(),
                e.getNombreUsuario(),
                e.getApellidoUsuario(),
                e.getCorreoUsuario(),
                e.getCotraseniaUsuario(),
                e.getTelefonoUsuario(),
                e.getFechaNacimiento(),
                e.getGenero(),
                e.getFechaIngreso(),
                e.getTipoContrato(),
                e.getTurnoTrabajo()
            });
        }
        
    }
    
    public void llenarTablaCliente(JTable tabla){
    
       clienteDAO cDao = new clienteDAO();
        
       DefaultTableModel model = (DefaultTableModel) tabla.getModel();
       model.setRowCount(0);
        
       List<cliente> listaClientes = cDao.listar();
       
       for(cliente c : listaClientes){
           model.addRow(new Object[]{
               c.getCedulaUsuario(),
               c.getNombreUsuario(),
               c.getApellidoUsuario(),
               c.getCorreoUsuario()
           });
       }
        
    }
    
}
