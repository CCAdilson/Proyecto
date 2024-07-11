package Controlador;
import Modelo.LectorDatos;
import Vista.VistaResiduos;
public class Controlador {
    
    private LectorDatos lectorDatos;
    private VistaResiduos vista;

    public Controlador(LectorDatos lectorDatos, VistaResiduos vista) {
        this.lectorDatos = lectorDatos;
        this.vista = vista;
    }
    
    
    
    public void iniciar(){
        
        int opcion;
        
        do{
            
            vista.mostrarMenu();
            opcion = lectorDatos.leerEntero("Selecciona una opcion: ");
            
            switch(opcion){
                case 1 ->{
                    vista.reporte1();
                }
                case 2 ->{
                    vista.reporte2();
                }
                case 3 ->{
                    vista.reporte3();
                }
                case 4 ->{
                    vista.reporte4();
                }
                case 5 ->{
                    System.out.println("Programa terminado.");
                    break;
                }
                default ->{
                    System.out.println("Opcion no valida. Intenta de nuevo.");
                }
            }
            
        }while(opcion != 5);
        
        lectorDatos.cerrar();
        
    }
    
    
}
