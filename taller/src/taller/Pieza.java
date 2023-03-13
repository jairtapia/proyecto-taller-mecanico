
package taller;
import org.json.JSONObject;

public class Pieza {
    
    private String name;
    private String type;
    private String toCar;
    private int cant;
    private int piezaId;
    
    Pieza() {
        this.name = "Desconocido";
        this.type = "Desconocido";
        this.toCar = "Desconocido";
        this.cant = 0;
        this.piezaId = 0;
        
    }
    
    Pieza(JSONObject p) {
        this.name = p.getString("Name");
        this.type = p.getString("Type");
        this.toCar = p.getString("ToCar");
        this.cant = p.getInt("Cant");
        this.piezaId = p.getInt("PiezaId");
        
    }
    
    public JSONObject getJson() {
        
        JSONObject myObj = new JSONObject();
        
        myObj.put("Name", this.name);
        
        myObj.put("Type", this.type);
        
        myObj.put("ToCar", this.toCar);
        
        myObj.put("Cant", this.cant);
        
        myObj.put("PiezaId", this.piezaId);
        
        return myObj;
        
    }
    
    public void setJson(JSONObject p){
        
        this.name = p.getString("Name");
        this.type = p.getString("Type");;
        this.toCar = p.getString("ToCar");;
        this.cant = p.getInt("Cant");
        this.piezaId = p.getInt("PiezaId");
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToCar() {
        return toCar;
    }

    public void setToCar(String toCar) {
        this.toCar = toCar;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getPiezaId() {
        return piezaId;
    }

    public void setPiezaId(int piezaId) {
        this.piezaId = piezaId;
    }
    
    
    
    
}
