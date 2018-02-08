/*
 * Esta ventana serivirá para hacer validaciones dentro del sistema principal
 * buscando evitar de una forma más detallada los errores.
 */
package pkg15460644p01;
//Librerias necesarias para que corra de forma correcta esta clase
import java.awt.event.KeyEvent;

/**
 * @author Mario Josue del Toro Morales
 */
public class Validaciones {
    Character x; //Declaración de una variable tipo caracter para el uso general
    
    //Método para validar que solo se ingresen números en el campo de Potencia
    public void potencia(KeyEvent evt){
        x = evt.getKeyChar();
        
        if (!Character.isDigit(x)) { //Revisión si no es digito, se elimina la tecla pulsada
            evt.consume(); //acción que elimina la tecla pulsada
        }
    }
}
