package logica;

import java.awt.event.KeyEvent;

public class ValidarCamposDeTexto {
    
    public void validarSoloLetras(KeyEvent evt){
    
        char c = evt.getKeyChar();        
        
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE)evt.consume();
    
    }
    
    public void validarSoloNumeros(KeyEvent evt){
    
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE)evt.consume();
    
    }
    
    
    
}
