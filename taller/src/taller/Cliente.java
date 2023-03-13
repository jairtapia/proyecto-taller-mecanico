package taller;

import org.json.JSONObject;

public class Cliente {

    private String name;
    private String lastName;
    private String lastMotherName;
    private int usuarioId;
    private int clienteId;

    public Cliente() {
        this.name = "Desconocido";
        this.lastName = "Desconocido";
        this.lastMotherName = "Desconocido";
        this.usuarioId = 0;
        this.clienteId = 0;
    }
     public Cliente(JSONObject o) {
        this.name = o.getString("Name");
        this.lastName = o.getString("LastName");
        this.lastMotherName = o.getString("LastMotherName");
        this.usuarioId = o.getInt("Usuario ID");
        this.clienteId = o.getInt("Cliente ID");
    }
    
    
    public JSONObject getJson() {
       
           JSONObject obj = new JSONObject();
           
           obj.put("Cliente ID", this.clienteId);
           
           obj.put("Usuario ID", this.usuarioId);

           obj.put("Name", this.name);
           
           obj.put("LastName", this.lastName);
           
           obj.put("LastMotherName", this.lastMotherName);
           
         
        return obj;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastMotherName() {
        return lastMotherName;
    }

    public void setLastMotherName(String lastMotherName) {
        this.lastMotherName = lastMotherName;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public void setClient(JSONObject o) {
        
        this.clienteId = o.getInt("Cliente ID");
        
        this.usuarioId = o.getInt("Usuario ID");
        
        this.name = o.getString("Name");
        
        this.lastName = o.getString("LastName");
        
        this.lastMotherName = o.getString("LastMotherName");
        
        
        
    }
    
}