package logica;

import javax.swing.JOptionPane;

public class ValidarCorreo {
    
    public boolean validarCorreo(String correo){    
        
        String regex = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
      "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        
        if(correo.matches(regex)){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un correo valido");
            return false;
        }
        
    }
    
}
