package Controlador;
import Modelo.Residuo;
import Vista.VistaResiduos;
public class ControladorResiduos {
    
    private Residuo modelo;
    private VistaResiduos vista;

    public ControladorResiduos(Residuo modelo, VistaResiduos vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    
}
