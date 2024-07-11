package Vista;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class VistaResiduos {

    public void mostrarMenu(){
        String menu = """
                      1.Reporte Anual a Nivel Nacional de Residuos Solidos
                      2.Informe de Residuos Solidos segun Jurisdiccion
                      3.Detalles de Desechos Materiales por Zonas dado un Rango de Años
                      4.Analisis Anual de Restos Solidos por Poblador
                      """;
        
        System.out.println(menu);
    }
    
    public void reporte1(){
        FileReader archivo;
        BufferedReader lector;
        
        try{
            archivo = new FileReader("C:\\Users\\USER\\Desktop\\reporte1.txt");
            lector = new BufferedReader(archivo);
            String cadena;
            while((cadena = lector.readLine()) != null){
                System.out.println(cadena);
            }
        }catch(FileNotFoundException e){
            System.out.println("El archivo no se encontro: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
    
    public void reporte2(){
        FileReader archivo;
        BufferedReader lector;
        
        try{
            archivo = new FileReader("C:\\Users\\USER\\Desktop\\reporte2.txt");
            lector = new BufferedReader(archivo);
            String cadena;
            while((cadena = lector.readLine()) != null){
                System.out.println(cadena);
            }
        }catch(FileNotFoundException e){
            System.out.println("El archivo no se encontro: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
    
    public void reporte3(){
        
    }
    
    public void reporte4(){
        
    }
    
}
