package ventanas;

import java.awt.Dimension;
import javax.swing.*;

public class Ventana01 extends JFrame{
    
    // Constructor de la clase
    public Ventana01() {
        
        // Establecer el ancho y largo de la ventana
        this.setSize(1024, 768);
        
        // Habilitar la opción de finalizar app al cerrar ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Establecer el tamaño minimo de la ventana
        setMinimumSize(new Dimension(420, 280));
        
        // Posicionar ventana al cargarla
        setLocation(200, 400); // posX, posY
        
        // Establecer
        
    }
    
}
