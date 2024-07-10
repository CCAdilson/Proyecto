package Modelo;
public class Residuo {
    
    private String region;
    private String departamento;
    private String provincia;
    private String distrito;
    private String periodo; //int año?
    private double toneladas;

    @Override
    public String toString(){
        return "Region: "+region+""
                + "\nDepartamento: "+departamento+""
                + "\nProvincia: "+provincia+""
                + "\nDistrito: "+distrito+""
                + "\nPeriodo: "+periodo+""
                + "\nToneladas: "+toneladas;
    }
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }
    
}
