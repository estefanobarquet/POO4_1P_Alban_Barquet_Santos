
import java.sql.Date;

public class Partido {
    private String codigo;
    private String local;
    private String visitante;  
    private Date fecha;
    private String estadio;
    private String ciudad;
    private int capacidad;
    private int stockGeneral;
    private int stockPreferencial;
    private int stockVIP;
    private String Fase;


public Partido(String codigo, String local, String visitante, 
    Date fecha, String estadio, String ciudad, int capacidad, 
    int stockGeneral, int stockPreferencial, int stockVIP, String fase) {
    
    this.codigo = codigo;
    this.local = local;
    this.visitante = visitante;
    this.fecha = fecha;
    this.estadio = estadio;
    this.ciudad = ciudad;
    this.capacidad = capacidad;
    this.stockGeneral = stockGeneral;
    this.stockPreferencial = stockPreferencial;
    this.stockVIP = stockVIP;
    this.Fase = fase;

}

public String getCodigo() {return codigo;}
public void setCodigo(String codigo) {this.codigo = codigo;}
   
public String getLocal() {return local;}
public void setLocal(String local) {this.local = local;}

public String getVisitante() {return visitante;}
public void setVisitante(String visitante) {this.visitante = visitante;}

public Date getFecha() {return fecha;}
public void setFecha(Date fecha) {this.fecha = fecha;}

public String getEstadio() {return estadio;}
public void setEstadio(String estadio) {this.estadio = estadio;}

public String getCiudad() {return ciudad;}
public void setCiudad(String ciudad) {this.ciudad = ciudad;}

public int getCapacidad() {return capacidad;}
public void setCapacidad(int capacidad) {this.capacidad = capacidad;}

public int getStockGeneral() {return stockGeneral;}
public void setStockGeneral(int stockGeneral) {this.stockGeneral = stockGeneral;}

public int getStockPreferencial() {return stockPreferencial;}
public void setStockPreferencial(int stockPreferencial) {this.stockPreferencial = stockPreferencial;}

public int getStockVIP() {return stockVIP;}
public void setStockVIP(int stockVIP) {this.stockVIP = stockVIP;}

public String getFase() {return Fase;}
public void setFase(String fase) {this.Fase = fase;}
    
}
