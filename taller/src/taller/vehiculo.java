package taller;
import org.json.JSONObject;
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
        this.IDvehiculo = obj.getInt("id");
        this.clienteID = obj.getInt("Cliente Id");
        this.Marca = obj.optString("Marca");
        this.Modelo = obj.getString("Modelo");
        this.Matricula = obj.getString("Matricula");
        this.fecha = obj.getString("Fecha");
    }
    
    public void setVehiculo(JSONObject obj){
        this.IDvehiculo = obj.getInt("id");
        this.clienteID = obj.getInt("cliente Id");
        this.Marca = obj.optString("Marca");
        this.Modelo = obj.getString("Modelo");
        this.Matricula = obj.getString("Matricula");
        this.fecha = obj.getString("Fecha");
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
        obj.put("id",this.getIDvehiculo());
        obj.put("Cliente Id", this.clienteID);
        obj.put("Marca", this.getMarca());
        obj.put("Modelo", this.getModelo());
        obj.put("Matricula", this.getMatricula());
        obj.put("Fecha", this.getFecha());
        return obj;
    }             
    
}
