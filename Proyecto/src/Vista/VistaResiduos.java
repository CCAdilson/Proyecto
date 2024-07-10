package Vista;
public class VistaResiduos {
    private StringBuilder sb = new StringBuilder();
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
        /*String reporte = "";
        reporte += """
                         Reporte Anual: Generación de Residuos Sólidos (2014 - 2021)
                         -----------------------------------------------------------
                         %6S%S 
                         """;*/
        long suma = 0; //FALTA SUMAR
        sb.append("Reporte Anual: Generacion de Residuos Solidos (2014 - 2021)");
        sb.append("\n-----------------------------------------------------------");
        sb.append("\nAño   RESIDUOS SoLIDOS (TONELADAS)");
        sb.append("\n-----------------------------------------------------------");
        sb.append("\n2014   12,345,678");
        sb.append("\n2015   13,456,789");
        sb.append("\n2016   14,567,890");
        sb.append("\n2017   15,678,901");
        sb.append("\n2018   16,789,012");
        sb.append("\n2019   17,890,123");
        sb.append("\n2020   18,901,234");
        sb.append("\n2021   19,012,345");
        sb.append("\n-----------------------------------------------------------");
        sb.append("\n------------------");
        System.out.println(sb);
    }
    
    public void reporte2(){
        
    }
    
    public void reporte3(){
        
    }
    
    public void reporte4(){
        
    }
    
}
