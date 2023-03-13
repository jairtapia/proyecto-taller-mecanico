package taller;

import org.json.JSONObject;

public class Reparacion {
   
    private vehiculo myVehiculo;
    private Pieza mypieza;
    private int cantidad;
    private int reparacionesId;
    private String falla;
    private String fechaEntrada;
    private String fechaSalida;

    public Reparacion() {
       this.myVehiculo = new vehiculo();
       this.mypieza = new Pieza();
       this.cantidad = 0;
       this.reparacionesId = 0;
       this.falla = "Desconocido";
       this.fechaEntrada = "Desconocido";
       this.fechaSalida = "Desconocido";
    }

    public int getReparacionesId() {
        return reparacionesId;
    }

    public void setReparacionesId(int reparacionesId) {
        this.reparacionesId = reparacionesId;
    }
    
    public JSONObject getJson() {
        
        JSONObject obj = new JSONObject();
        
        obj.put("id", this.reparacionesId);
        
        obj.put("Vehiculo", this.myVehiculo.getJson());
        
        obj.put("Pieza", this.mypieza.getJson());
        
        obj.put("Falla", this.falla);
        
        obj.put("FechaEntrada", this.fechaEntrada);
        
        obj.put("FechaSalida", this.fechaSalida);
        
        obj.put("Cantidad", this.cantidad);
        
        return obj;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public vehiculo getMyVehiculo() {
        return myVehiculo;
    }

    public void setMyVehiculo(vehiculo myVehiculo) {
        this.myVehiculo = myVehiculo;
    }

    public Pieza getMypieza() {
        return mypieza;
    }

    public void setMypieza(Pieza mypieza) {
        this.mypieza = mypieza;
    }
    public String getFalla() {
        return falla;
    }
    public void setFalla(String falla) {
        this.falla = falla;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
    
}
