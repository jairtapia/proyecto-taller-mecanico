/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import org.json.JSONObject;
public class Cliente extends usuario{
    private String name;
    private String lastName;
    private String lastMotherName;
    private int usiarioId;
    private int clienteId;
    
    public Cliente() {
        this.name = "Desconocido";
        this.lastName = "Desconocido";
        this.lastMotherName = "Desconocido";
        this.usiarioId = 0;
        this.clienteId = 0;
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

    public int getUsiarioId() {
        return usiarioId;
    }

    public void setUsiarioId(int usiarioId) {
        this.usiarioId = usiarioId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public void setClient(JSONObject o){
        this.clienteId = o.getInt("cliente ID");
        this.usiarioId = o.getInt("usuario ID");
        this.name = o.getString("Name");
        this.lastName = o.getString("LastName");
        this.lastMotherName = o.getString("LastMotherName");
    }

    public JSONObject getJson() {
        JSONObject obj = new JSONObject();
        obj.put("cliente ID", this.clienteId);
        obj.put("usuario ID",this.usiarioId);
        obj.put("Name",this.name);
        obj.put("LastName",this.lastName);
        obj.put("LastName",this.lastMotherName);
        return obj;
    }
    
}
