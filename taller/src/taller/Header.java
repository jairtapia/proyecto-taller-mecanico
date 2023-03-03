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
    
    private JSONArray clientesId;
    private JSONArray usersId;
    private JSONArray vehiculosid;
    private JSONObject obj;
    
    /*si falla cambia esta direccion*/
     private String url =  "C:\\Users\\jairm\\Desktop\\proyecto_universidad\\taller\\src\\HEADER.json";


    public Header() {

        this.users = 0;
        this.cont = 0;
        
        this.usersId = new JSONArray();
    }
    public Header(Header h) {

        this.users = h.users;
    }
    public Header(int a)
    {
        this.users = a;
    }
    public int getUsers() {
        return users;
    }
    public void setUsers(int users) {
        this.users = users;
    }
    public void setMoreUsers() {

        this.users ++;
    }
    public void setId(int i) {
        
        obj = new JSONObject();
        
        obj.put("UsuarioId " + String.valueOf(i), i);
        
        this.usersId.put(obj);
        
    }
    
    public void toDisk(){
        try {
            
            if (usersId.isEmpty() || clientesId.isEmpty()) {
            
            fromDisk();
        }
            
            FileWriter file = new FileWriter(url, false);
            
            obj = new JSONObject();
                
            obj.put("LastId", this.users);
            
            obj.put("Usuarios", usersId);
            
            obj.put("Clientes", clientesId);
            
            obj.put("vehiculos", vehiculosid);
         
            file.write(obj.toString(2));
                
            file.close();
           
        }catch(IOException ex) {
    
        }

    }
    
    public void deleatId(int id) throws IOException {
        
        if (usersId.isEmpty()) {
            
            fromDisk();
        }
        
        int i = 0;
        
        for (Object objeto : usersId)  {
            
            JSONObject jsonObject = (JSONObject) objeto;
            
            if(id == jsonObject.getInt("UsuarioId " + String.valueOf(i + 1))) {
                
                usersId.remove(i);
                
                break;
            }
            
            i ++;
        }
        
        toDisk();
        
    }
    
    public void deleatIdClientes(int id) throws IOException {
        
        if (clientesId.isEmpty()) {
            
            fromDisk();
        }
        
        int i = 0;
        
        for (Object objeto : clientesId)  {
            
            JSONObject jsonObject = (JSONObject) objeto;
            
            if(id == jsonObject.getInt("UsuarioId " + String.valueOf(i + 1))) {
                
                clientesId.remove(i);
                
                break;
            }
            
            i ++;
        }
        
        toDisk();
        
    }
    
    public void deleatIdVehiculos(int id) throws IOException{
        if(vehiculosid.isEmpty()){
            fromDisk();
        }
        int i = 0;
        for (Object objeto : vehiculosid)  {
            JSONObject jsonObject = (JSONObject) objeto;
            if(id == jsonObject.getInt("vehiculoid" + String.valueOf(i + 1))) {
                vehiculosid.remove(i);
                break;
            }   
            i ++;
        }
        toDisk();
    }
    
    public JSONArray getUsersId() {
    
        return this.usersId;
    }
    
    public void fromDisk() throws IOException {

        String myJson = new String(Files.readAllBytes(Paths.get(url)), StandardCharsets.UTF_8);

        JSONObject jsonObject = new JSONObject(myJson);

        this.users = jsonObject.getInt("LastId");
        
        this.usersId = jsonObject.getJSONArray("Usuarios");
        
        this.clientesId = jsonObject.getJSONArray("Clientes");
        
        this.vehiculosid = jsonObject.getJSONArray("vehiculos");
        
        this.cont ++;
    }
    
    
    public void setClienteId(int c) {

           obj = new JSONObject();

           obj.put("ClienteId " + String.valueOf(c), c);

           this.clientesId.put(obj);

       }
    public void setVehiculoid(int v){
        obj = new JSONObject();
        
        obj.put("vehiculoid" + String.valueOf(v), v);
        
        this.vehiculosid.put(obj);
    }

}