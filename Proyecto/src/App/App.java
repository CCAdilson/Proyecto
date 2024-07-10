package App;
import Controlador.Controlador;
import Modelo.LectorDatos;
import Vista.VistaResiduos;
public class App {
    public static void main(String[] args) {
        
        LectorDatos lectorDatos = new LectorDatos();
        VistaResiduos vista = new VistaResiduos();
        Controlador controlador = new Controlador(lectorDatos, vista);
        
        controlador.iniciar();
        
    }
}