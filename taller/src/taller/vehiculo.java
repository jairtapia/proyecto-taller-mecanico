
package taller;

import org.json.JSONObject;

/**
 *
 * @author jairm
 */
public class vehiculo {
    private int IDvehiculo;
    private int clienteID;
    private String Matricula;
    private String Marca;
    private String Modelo;
    private String fecha;

    
    public vehiculo(){
        this.IDvehiculo = 0;
        this.clienteID = 0;
        this.Marca = "";
        this.Modelo = "";
        this.Matricula = "";
        this.fecha = "";
    }
    
    public vehiculo(JSONObject obj){
        this.IDvehiculo = obj.getInt("ID");
        this.clienteID = obj.getInt("cliente ID");
        this.Marca = obj.optString("MARCA");
        this.Modelo = obj.getString("MODELO");
        this.Matricula = obj.getString("MATRICULA");
        this.fecha = obj.getString("FECHA");
    }
    
    public void setVehiculo(JSONObject obj){
        this.IDvehiculo = obj.getInt("IDVH");
        this.clienteID = obj.getInt("cliente ID");
        this.Marca = obj.optString("MARCA");
        this.Modelo = obj.getString("MODELO");
        this.Matricula = obj.getString("MATRICULA");
        this.fecha = obj.getString("FECHA");
    }
    
    public int getIDvehiculo() {
        return IDvehiculo;
    }

    public void setIDvehiculo(int IDvehiculo) {
        this.IDvehiculo = IDvehiculo;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public JSONObject getJson() {
        JSONObject obj = new JSONObject();
        obj.put("IDVH",this.getIDvehiculo());
        obj.put("cliente ID", this.clienteID);
        obj.put("MARCA", this.getMarca());
        obj.put("MODELO", this.getModelo());
        obj.put("MATRICULA", this.getMatricula());
        obj.put("FECHA", this.getFecha());
        return obj;
    }             
    
}
