package taller;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;

import org.json.JSONException;
import org.json.JSONObject;

public class Header {
    
    private int cont;
    private int users;
    private int clients;
    private int vehicles;
    private int piezas;
    private int reparacion;

    
    private JSONArray clientesId;
    private JSONArray usersNames;
    private JSONArray vehiculosid;
    private JSONArray piezasId;
    private JSONArray reparacionesId;

    private JSONObject obj;
    
    /*si falla cambia esta direccion*/
     private String url =  "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\HEADER.json";


    public Header() {

        this.users = 0;
        this.cont = 0;
        
        this.usersNames = new JSONArray();
    }
    
    public Header(Header h) {

        this.users = h.users;
    }
    
    public Header(int a){
        this.users = a;
    }
    
    public int getUsers() {
        return users;
    }
    
    public void setUsersId(int users) {
        this.users = users;
    }

    public int getClients() {
        return clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }
    
    public void setPiezas(int p) {
        
        this.piezas = p;
    }
    
    public int getPiezas() {
        
        return this.piezas;
    }
    
    public int getVehicles() {
        return vehicles;
    }

    public void setVehicles(int vehicles) {
        this.vehicles = vehicles;
    }
    
    public void setMoreUsers() {

        this.users ++;
    }
    
    public void setNombre(String name, int id) {
        
        obj = new JSONObject();
        
        obj.put("Name", name);
        
        obj.put("id", id);
        
        this.usersNames.put(obj);
        
    }
    
    public void toDisk(){
        try {
          
            FileWriter file = new FileWriter(url, false);
            
            obj = new JSONObject();
                
            obj.put("LastUserId", this.users);
            
            obj.put("LastClientId", this.clients);
            
            obj.put("LastVehicleId",this.vehicles);
            
            obj.put("LastPiezaId", this.piezas);
            
            obj.put("LastReparacionId", this.reparacion);
            
            obj.put("Piezas", piezasId);
            
            obj.put("Usuarios", usersNames);
            
            obj.put("Clientes", clientesId);
            
            obj.put("vehiculos", vehiculosid);
            
            obj.put("Reparaciones", reparacionesId);
         
            file.write(obj.toString(2));
                
            file.close();
           
        }catch(IOException ex) {
    
        }

    }
    
    public void deleatUserName(int id) throws IOException {
        
        if (usersNames.isEmpty()) {
            
            String myJson = new String(Files.readAllBytes(Paths.get(url)), StandardCharsets.UTF_8);

            JSONObject jsonObject = new JSONObject(myJson);
            
            clientesId = jsonObject.getJSONArray("Clientes");
            
            usersNames = jsonObject.getJSONArray("Usuarios");
            
            vehiculosid = jsonObject.getJSONArray("vehiculos");
            
        }
        
        int i = 0;
        
        for (Object objeto : usersNames)  {
            
            JSONObject jsonObject = (JSONObject) objeto;
            
            if(id == jsonObject.getInt("id")) {
                
                usersNames.remove(i);
                
                break;
            }
            
            i ++;
        }
        
        toDisk();
    }
    
    public void deleatIdClientes(int id) throws IOException {
        
        if (clientesId.isEmpty()) {
            
            String myJson = new String(Files.readAllBytes(Paths.get(url)), StandardCharsets.UTF_8);

            JSONObject jsonObject = new JSONObject(myJson);
            
            clientesId = jsonObject.getJSONArray("Clientes");
            
            usersNames = jsonObject.getJSONArray("Usuarios");
            
            vehiculosid = jsonObject.getJSONArray("vehiculos");
        }
        
        int i = 0;
        
        for (Object objeto : clientesId)  {
            
            JSONObject jsonObject = (JSONObject) objeto;
            
            if(id == jsonObject.getInt("id")) {
                
                clientesId.remove(i);
                
                break;
            }
            
            i ++;
        }
        
        toDisk();
        
    }
    
    public void deleatIdVehiculos(int id) throws IOException{
        if(vehiculosid.isEmpty()){
            String myJson = new String(Files.readAllBytes(Paths.get(url)), StandardCharsets.UTF_8);

            JSONObject jsonObject = new JSONObject(myJson);
            
            clientesId = jsonObject.getJSONArray("Clientes");
            
            usersNames = jsonObject.getJSONArray("Usuarios");
            
            vehiculosid = jsonObject.getJSONArray("vehiculos");
        }
        
        int i = 0;
        
        for (Object objeto : vehiculosid)  {
        
            JSONObject jsonObject = (JSONObject) objeto;
            
            if(id == jsonObject.getInt("id")) {
            
                vehiculosid.remove(i);
                
                break;
            }   
            i ++;
        }
        toDisk();
    }
    
    public void deleatIdPieza(int id) throws IOException{
        if(piezasId.isEmpty()){
            String myJson = new String(Files.readAllBytes(Paths.get(url)), StandardCharsets.UTF_8);

            JSONObject jsonObject = new JSONObject(myJson);
        
            piezasId = jsonObject.getJSONArray("Piezas");
        }
        
        int i = 0;
        
        for (Object objeto : piezasId)  {
        
            JSONObject jsonObject = (JSONObject) objeto;
            
            if(id == jsonObject.getInt("id")) {
            
                vehiculosid.remove(i);
                
                break;
            }   
            i ++;
        }
        toDisk();
    }
       public void deleatIdReparacion(int id) throws IOException{
        if(reparacionesId.isEmpty()){
            String myJson = new String(Files.readAllBytes(Paths.get(url)), StandardCharsets.UTF_8);

            JSONObject jsonObject = new JSONObject(myJson);
        
            reparacionesId = jsonObject.getJSONArray("Reparaciones");
        }
        
        int i = 0;
        
        for (Object objeto : reparacionesId)  {
        
            JSONObject jsonObject = (JSONObject) objeto;
            
            if(id == jsonObject.getInt("id")) {
            
                reparacionesId.remove(i);
                
                break;
            }   
            
            i ++;
        }
        toDisk();
    }
    public JSONArray getUsersName() {
    
        return this.usersNames;
    }

    public JSONArray getClientesId() {
        return clientesId;
    }

    public JSONArray getVehiculosid() {
        return vehiculosid;
    }
    
    public JSONArray getPiezasId() {
        
        return piezasId;
    }
    
    public void fromDisk() throws IOException {
        String myJson = new String(Files.readAllBytes(Paths.get(url)), StandardCharsets.UTF_8);

        JSONObject jsonObject = new JSONObject(myJson);

        this.users = jsonObject.getInt("LastUserId");
        
        this.clients = jsonObject.getInt("LastClientId");
        
        this.piezas = jsonObject.getInt("LastPiezaId");
        
        this.piezasId = jsonObject.getJSONArray("Piezas");
        
        this.vehicles = jsonObject.getInt("LastVehicleId");

        this.usersNames = jsonObject.getJSONArray("Usuarios");
        
        this.clientesId = jsonObject.getJSONArray("Clientes");
        
        this.vehiculosid = jsonObject.getJSONArray("vehiculos");
        
        this.reparacion = jsonObject.getInt("LastReparacionId");
        
        this.reparacionesId = jsonObject.getJSONArray("Reparaciones");

        this.cont ++;
    }
    
    public void setPizasId(String matricula, int p) {

           obj = new JSONObject();

           obj.put("Name", matricula);
           
           obj.put("id", p);
           
           this.piezasId.put(obj);

       }
    
    public void setClienteId(String name, int c) {

           obj = new JSONObject();

           obj.put("Name", name);
           
           obj.put("id", c);

           this.clientesId.put(obj);

       }
    
    public void setVehiculoid(String v, int i){
        
        obj = new JSONObject();
        
        obj.put("Matricula", v);
        
        obj.put("id", i);
        
        this.vehiculosid.put(obj);
    }
    
    public int findIdData(JSONArray items, String name) throws IOException {
        
        fromDisk();
        
        int id = 0;
        
        for(int i = 0; items.length() >= 0; i ++) {
            
            JSONObject obj = items.getJSONObject(i);
            
            if(obj.getString("Name").equals(name)) {
                
                id = obj.getInt("id");
                
                break;
            }
            
        }
        
        return id;
    }
    
    public int findIdVehiculo(JSONArray items, String name) throws IOException {
        
        fromDisk();
        
        int id = 0;
        
        for(int i = 0; items.length() >= 0; i ++) {
            
            JSONObject obj = items.getJSONObject(i);
            
            if(obj.getString("Matricula").equals(name)) {
                
                id = obj.getInt("id");
                
                break;
            }
            
        }
        
        return id;
    }
    
    public void setReparacion(int r) {
        
        this.reparacion = r;
    }
    
    public void setReparacionId(String matricula, String namePieza, int id){
        
        obj = new JSONObject();
        
        obj.put("Matricula", matricula);
        
        obj.put("NamePieza", namePieza);
        
        obj.put("id", id);
        
        this.reparacionesId.put(obj);
    }
    
    public int getReparacion() {
        
        return this.reparacion;
    }
    
    public JSONArray getReparacionId() {
        
        return this.reparacionesId;
    }
    
}