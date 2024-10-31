// Programa en Java que genera 3 casillas de texto con formato y 3 etiquetas
package ejemplo03;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class EtiquetasCasillas extends JFrame{
    
     JFrame frame = new JFrame();
     JLabel l1 = new JLabel();
     JLabel l2 = new JLabel();
     JLabel l3 = new JLabel();
     
     JTextField txt1 = new JTextField();
     JTextField txt2 = new JTextField();
     JTextField txt3 = new JTextField();
     JTextField txt4 = new JTextField();
     
     JPanel panel = new JPanel();
     
     public EtiquetasCasillas() {
        
         // Atributos de ventanas
         frame.setSize(480, 280);
         frame.setLocationRelativeTo(null);
         frame.setTitle("Etiquetas y Casillas");
         frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
         frame.setVisible(true);
         
         // Establecer el texto de las 3 etiquetas
         l1.setText("Etiquetas Nro.01");
         l2.setText("Etiquetas Nro.02");
         l3.setText("Etiquetas Nro.03");
         
         // Posicionar y dimensionar las etiquetas
         l1.setBounds(50, 10, 100, 25);
         l2.setBounds(50, 40, 100, 25);
         l3.setBounds(50, 70, 100, 25);
         
         l1.setOpaque(true);
         l2.setOpaque(true);
         l3.setOpaque(true);
         
         l1.setBackground(Color.PINK);
         l2.setBackground(Color.PINK);
         l3.setBackground(Color.PINK);
         
         // Establecer el texto vacio de las etiquetas
         txt1.setText("");
         txt2.setText("");
         txt3.setText("");
         
         // Establecer tipo de fuente de la casilla 4
         txt4.setFont(new Font(" Comic Sans MS" , Font.ITALIC, 30));
         
         // Posicionar y dimensionar las casillas de texto
         txt1.setBounds(200, 10, 200, 25);
         txt2.setBounds(200, 40, 200, 25);
         txt3.setBounds(200, 70, 200, 25);
         txt4.setBounds(50, 110, 350, 100);
         
         // Establecer opacidad de las casillas de texto
         txt1.setForeground(Color.BLUE);
         txt2.setForeground(Color.RED);
         txt3.setForeground(Color.BLACK);
         txt4.setForeground(Color.DARK_GRAY);
         
         // Establecemos el color del fondo de las etiquetas
         txt1.setBackground(Color.YELLOW);
         txt2.setBackground(Color.GREEN);
         txt3.setBackground(Color.WHITE);
         txt4.setBackground(Color.LIGHT_GRAY);
         
         panel.setBackground(Color.CYAN);
         panel.setBounds(50, 50, 50, 25);
         
         panel.setLayout(null);
         panel.add(l1);
         panel.add(l2);
         panel.add(l3);
         panel.add(txt1);
         panel.add(txt2);
         panel.add(txt3);
         panel.add(txt4);
         frame.getContentPane().add(panel);
     }
     
}
