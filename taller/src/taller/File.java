package taller;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;




public class File {
    
    private String url;
    //private DataOutputStream write;
    
    private FileWriter write;
    
    private ArrayList<usuario> myList;
    
    private JSONArray jsonArray;
    private JSONArray clienteJsonArray;
    private JSONArray vehiculoJsonArray;


    public File() {
       /*si falla cambia esta direccion*/
        url  = "C:\\Users\\jairm\\Desktop\\fdgdfg\\proyecto-taller-mecanico\\taller\\src\\AUX_USUARIO";
        write = null;
        jsonArray = new JSONArray();
        clienteJsonArray = new JSONArray();
        vehiculoJsonArray = new JSONArray();
    }
    public File(String n) {

        this.url = "";
        /*si falla cambia esta direccion*/
        url = "C:\\Users\\jairm\\Desktop\\fdgdfg\\proyecto-taller-mecanico\\taller\\src\\" + n +".json";

        //read = null;

        write = null;

        jsonArray = new JSONArray();
        clienteJsonArray = new JSONArray();
        vehiculoJsonArray = new JSONArray();
    }

    public JSONObject searchInFile(JSONObject u) throws FileNotFoundException, IOException {
        
            if(jsonArray.isEmpty()) {
            readToList();
        }
            for (int i = 0; i < jsonArray.length(); i++) {
                
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                
                if(u.getInt("ID") == jsonObj.getInt("ID"))  {
                    
                    u.put("ID", jsonObj.getInt("ID"));
           
                    u.put("Name", jsonObj.getString("Name"));

                    u.put("LastName", jsonObj.getString("LastName"));

                    u.put("FirstName", jsonObj.getString("FirstName"));

                    u.put("PhoneNumber", jsonObj.getString("PhoneNumber"));

                    u.put("UserName", jsonObj.getString("UserName"));

                    u.put("Address", jsonObj.getString("Address"));

                    u.put("PassWord", jsonObj.getString("PassWord"));

                    u.put("Perfil", jsonObj.getString("Perfil"));
                    
                    return u;
                }
            }
        return null;
    }
    
    public JSONObject SearchVehiculo(JSONObject v)throws FileNotFoundException, IOException{
        if(vehiculoJsonArray.isEmpty()) {
            readToListForVehiculos();
        }
        for(int i = 0; i < vehiculoJsonArray.length();i++){
            JSONObject jsonObj = vehiculoJsonArray.getJSONObject(i);
            if(v.getInt("IDVH") == jsonObj.getInt("IDVH")){
                v.put("MATRICULA", jsonObj.getString("MATRICULA"));
                v.put("MARCA", jsonObj.getString("MARCA"));
                v.put("FECHA", jsonObj.getString("FECHA"));
                v.put("MODELO", jsonObj.getString("MODELO"));
                v.put("IDVH",jsonObj.getInt("IDVH"));
                return v;
            }
        }
        return null;
    }
    
    public void saveData(JSONObject u){
        
           jsonArray.put(u);
           
    }
    
    public void saveCliente(JSONObject c){
        
        clienteJsonArray.put(c);
    }
    
    public void saveVehiculo(JSONObject v){
        vehiculoJsonArray.put(v);
    }
    
    public void writeToDisk(){
        
        try {
            
            write = new FileWriter(url, false); 
        
            write.write(jsonArray.toString(2));
            
            write.close();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
    public void writeToDiskClientes(){
        /*si falla cambia esta direccion*/
        String falseUrl = "C:\\Users\\jairm\\Desktop\\fdgdfg\\proyecto-taller-mecanico\\taller\\src\\AUX_CLIENTES.json";
        
        try {
            
            write = new FileWriter(falseUrl, false); 
        
            write.write(clienteJsonArray.toString(2));
            
            write.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
    public void writeToDiskVheiculos(){
        /*si falla cambia esta direccion*/
        String falseUrl = "C:\\Users\\jairm\\Desktop\\fdgdfg\\proyecto-taller-mecanico\\taller\\src\\AUX_VEHICULOS.json";
        
        try {
            
            write = new FileWriter(falseUrl, false); 
        
            write.write(vehiculoJsonArray.toString(2));
            
            write.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
    private void readToList() throws FileNotFoundException, IOException{
        
        try{
            FileReader fileReader = new FileReader(url);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder(); 

            String line;
            
            while ((line = bufferedReader.readLine()) != null) {

                stringBuilder.append(line);

            }
            bufferedReader.close();

            fileReader.close();

            jsonArray = new JSONArray(stringBuilder.toString());
            
        }catch (IOException | JSONException e) {
            e.printStackTrace();
            return;
        }
    }
    
    private void readToListForClientes() throws FileNotFoundException, IOException{
        /*si falla cambia esta direccion*/
        String falseUrl = "C:\\Users\\jairm\\Desktop\\fdgdfg\\proyecto-taller-mecanico\\taller\\src\\AUX_CLIENTES.json";
        
        
        try{
            FileReader fileReader = new FileReader(falseUrl);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder(); 

            String line;
            
            while ((line = bufferedReader.readLine()) != null) {

                stringBuilder.append(line);

            }
            bufferedReader.close();

            fileReader.close();

            clienteJsonArray = new JSONArray(stringBuilder.toString());
            
        }catch (IOException | JSONException e) {
            e.printStackTrace();
            return;
        }
    }
    private void readToListForVehiculos()throws FileNotFoundException, IOException{
        String falseUrl = "C:\\Users\\jairm\\Desktop\\fdgdfg\\proyecto-taller-mecanico\\taller\\src\\AUX_VEHICULOS.json";
        
        try{
            FileReader fileReader = new FileReader(falseUrl);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder(); 

            String line;
            
            while ((line = bufferedReader.readLine()) != null) {

                stringBuilder.append(line);

            }
            bufferedReader.close();

            fileReader.close();

            vehiculoJsonArray = new JSONArray(stringBuilder.toString());
            
        }catch (IOException | JSONException e) {
            e.printStackTrace();
            return;
        }
        
    }
    
    public void deletData(JSONObject u) throws IOException{
           
        if(jsonArray.isEmpty()) {
            
            readToList();
        }
        
        JSONObject jsonAux;
        
        for(int i = 0; i < jsonArray.length(); i++) {
            
            jsonAux = jsonArray.getJSONObject(i);
            
            if(u.getInt("ID") == jsonAux.getInt("ID")) {
                
                jsonArray.remove(i);
                
                break;
            }
        }
        writeToDisk();
    }
    
    public void deletCliente(JSONObject u) throws IOException{
           
        if(clienteJsonArray.isEmpty()) {
            
            readToListForClientes();
        }
        
        JSONObject jsonAux;
        
        for(int i = 0; i < clienteJsonArray.length(); i++) {
            
            jsonAux = clienteJsonArray.getJSONObject(i);
            
            if(u.getInt("ID") == jsonAux.getInt("ID")) {
                
                clienteJsonArray.remove(i);
                
                break;
            }
        }
        
        writeToDiskClientes();
    }
    
    public void deletevehiculo(JSONObject u)throws IOException{
        if(vehiculoJsonArray.isEmpty()){
            readToListForVehiculos();
        }
        JSONObject jsonAux;
        
        for(int i = 0; i < vehiculoJsonArray.length(); i++) {
            
            jsonAux = vehiculoJsonArray.getJSONObject(i);
            
            if(u.getInt("IDVH") == jsonAux.getInt("IDVH")) {
                
                vehiculoJsonArray.remove(i);
                
                break;
            }
        }
        writeToDiskVheiculos();
    }
    public void editDataV(JSONObject v)throws IOException{
        if(vehiculoJsonArray.isEmpty()) {
            readToListForVehiculos();
        }
        for (int i = 1; i < vehiculoJsonArray.length(); i++){
            JSONObject Obj = vehiculoJsonArray.getJSONObject(i);
            if(v.getInt("IDVH") == Obj.getInt("IDVH")){
                Obj.put("IDVH",v.getInt("IDVH"));
                Obj.put("MATRICULA",v.get("MATRICULA"));
                Obj.put("MODELO",v.get("MODELO"));
                Obj.put("MARCA",v.get("MARCA"));
                Obj.put("FECHA",v.get("FECHA"));
                break;
            }
        }
        writeToDiskVheiculos();
    }
    
    public void editData(JSONObject u) throws IOException {
        
        if(jsonArray.isEmpty()) {
            
            readToList();
        }
        for (int i = 0; i < jsonArray.length(); i++) {
                
                JSONObject obj = jsonArray.getJSONObject(i);
                
                if(u.getInt("ID") == obj.getInt("ID")) {
                    
                    obj.put("ID", u.getInt("ID"));
           
                    obj.put("Name", u.getString("Name"));

                    obj.put("LastName", u.getString("LastName"));

                    obj.put("FirstName", u.getString("FirstName"));

                    obj.put("PhoneNumber", u.getString("PhoneNumber"));

                    obj.put("UserName", u.getString("UserName"));

                    obj.put("Address", u.getString("Address"));

                    obj.put("PassWord", u.getString("PassWord"));

                    obj.put("Perfil", u.getString("Perfil"));
                    
                    break;
                }
            }
        writeToDisk();
    }
    
    public boolean isValid(JSONObject u) throws IOException{
        
        if(jsonArray.isEmpty()) {
            
            readToList();
        }
        for (int i = 0; i < jsonArray.length(); i++) {
                
                JSONObject obj = jsonArray.getJSONObject(i);
                
                if((u.getString("UserName").equals(obj.getString("UserName"))) && (u.getString("PassWord").equals(obj.getString("PassWord")))) {
                  
                    return true;
                }
            }
        
        return false;
    }
}
