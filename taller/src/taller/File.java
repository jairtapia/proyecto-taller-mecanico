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
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
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
    private JSONArray piezasJsonArray;
    private JSONArray reparacionesJSONArray;

    public File() {
       /*si falla cambia esta direccion*/
        url  = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_USUARIO.json";
        write = null;
        jsonArray = new JSONArray();
        clienteJsonArray = new JSONArray();
        vehiculoJsonArray = new JSONArray();
    }
    
    public File(String n) {

        this.url = "";
        /*si falla cambia esta direccion*/
        url = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\" + n +".json";

        //read = null;

        write = null;

        jsonArray = new JSONArray();
        clienteJsonArray = new JSONArray();
        vehiculoJsonArray = new JSONArray();
        piezasJsonArray = new JSONArray();
        reparacionesJSONArray = new JSONArray();
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
    
    public JSONObject searchClientInFile(JSONObject u) throws FileNotFoundException, IOException {
        
            if(clienteJsonArray.isEmpty()) {
            readToListForClientes();
            }
            for (int i = 0; i < clienteJsonArray.length(); i++) {
                
                JSONObject obj = clienteJsonArray.getJSONObject(i);
                
                if(u.getInt("Cliente ID") == obj.getInt("Cliente ID"))  {
                    
                    u.put("Usuario ID", obj.getInt("Usuario ID"));

                    u.put("Name", obj.getString("Name"));

                    u.put("LastName", obj.getString("LastName"));

                    u.put("LastMotherName", obj.getString("LastMotherName"));
                              
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
            if(v.getInt("id") == jsonObj.getInt("id")){
                v.put("Matricula", jsonObj.getString("Matricula"));
                v.put("Marca", jsonObj.getString("Marca"));
                v.put("Fecha", jsonObj.getString("Fecha"));
                v.put("Modelo", jsonObj.getString("Modelo"));
                v.put("Cliente Id",jsonObj.getInt("Cliente Id"));
                return v;
            }
        }
        return null;
    }
    
    public JSONObject searchPiezaInFile(JSONObject p) throws FileNotFoundException, IOException {
        
            if(piezasJsonArray.isEmpty()) {
            readToListForPiezas();
            }
            for (int i = 0; i < piezasJsonArray.length(); i++) {
                
                JSONObject obj = piezasJsonArray.getJSONObject(i);
                
                if(p.getInt("PiezaId") == obj.getInt("PiezaId"))  {
                    
                    p.put("Name", obj.getString("Name"));
                    
                    p.put("Type", obj.getString("Type"));
                    
                    p.put("ToCar", obj.getString("ToCar"));
                    
                    p.put("Cant", obj.getInt("Cant"));
                          
                    return p;
                }
            }
            
        return null;
    }
   
    public JSONObject searchReparacionesInFile(JSONObject r) throws FileNotFoundException, IOException {
        
            if(reparacionesJSONArray.isEmpty()) {
            
                    readToListForReparaciones();
            }
            for (int i = 0; i < reparacionesJSONArray.length(); i++) {
                
                JSONObject obj = reparacionesJSONArray.getJSONObject(i);
                    
                    if(r.getInt("id") == obj.getInt("id")) {
                        
                        return obj;
                }
            }
            
        return null;
    }
    
    public void saveData(JSONObject u)throws IOException{
        if(jsonArray.isEmpty()){
            readToList();
        }
           jsonArray.put(u);
           
    }
    
    public void saveCliente(JSONObject c)throws IOException{
        if(clienteJsonArray.isEmpty()){
            readToListForClientes();
        }
        clienteJsonArray.put(c);
    }
    
    public void saveVehiculo(JSONObject v)throws IOException{
        if(vehiculoJsonArray.isEmpty()){
            readToListForVehiculos();
        }
        vehiculoJsonArray.put(v);
    }
    
    public void savePieza(JSONObject p) throws IOException{
        
         if(piezasJsonArray.isEmpty()) {
            
            readToList();
        }
        
        piezasJsonArray.put(p);
    }
    
    public void saveReparacion(JSONObject p) throws IOException{
        
         if(reparacionesJSONArray.isEmpty()) {
            
            readToListForReparaciones();
        }
        
        reparacionesJSONArray.put(p);
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
        String falseUrl = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_CLIENTES.json";
        
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
        String falseUrl = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_VEHICULOS.json";
        
        try {
            
            write = new FileWriter(falseUrl, false); 
        
            write.write(vehiculoJsonArray.toString(2));
            
            write.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
    public void writeToDiskPiezas(){
        /*si falla cambia esta direccion*/
        String falseUrl = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_PIEZAS.json";
        
        try {
            
            write = new FileWriter(falseUrl, false); 
        
            write.write(piezasJsonArray.toString(2));
            
            write.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
    public void writeToDiskReparaciones(){
        /*si falla cambia esta direccion*/
        String falseUrl = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_REPARACIONES.json";
        
        try {
            
            write = new FileWriter(falseUrl, false); 
        
            write.write(reparacionesJSONArray.toString(2));
            
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
        String falseUrl = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_CLIENTES.json";
        
        
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
        String falseUrl = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_VEHICULOS.json";
        
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
    
    private void readToListForPiezas() throws FileNotFoundException, IOException{
        /*si falla cambia esta direccion*/
        String falseUrl = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_PIEZAS.json";
        
        
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

            piezasJsonArray = new JSONArray(stringBuilder.toString());
            
        }catch (IOException | JSONException e) {
            e.printStackTrace();
            return;
        }
    }
    
    private void readToListForReparaciones() throws FileNotFoundException, IOException{
        /*si falla cambia esta direccion*/
        String falseUrl = "C:\\Users\\Luis_\\OneDrive\\Escritorio\\MASTER\\NewVersion\\proyecto-taller-mecanico\\taller\\src\\AUX_REPARACIONES.json";
        
        
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

            reparacionesJSONArray = new JSONArray(stringBuilder.toString());
            
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
    
    public JSONObject deletCliente(JSONObject u) throws IOException{
           
        if(clienteJsonArray.isEmpty()) {
            
            readToListForClientes();
        }
        
        JSONObject jsonAux;
        
        Cliente aux = null;
        
        for(int i = 0; i < clienteJsonArray.length(); i++) {
            
            jsonAux = clienteJsonArray.getJSONObject(i);
            
            if(u.getInt("Cliente ID") == jsonAux.getInt("Cliente ID")) {
                
                aux = new Cliente(jsonAux);
                
                clienteJsonArray.remove(i);
            }
        }
        
        writeToDiskClientes();
        
        return aux.getJson();
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
    
    public void deletPieza(JSONObject u) throws IOException{
           
        if(piezasJsonArray.isEmpty()) {
            
            readToListForPiezas();
        }
        
        JSONObject jsonAux;
        
        for(int i = 0; i < piezasJsonArray.length(); i++) {
            
            jsonAux = piezasJsonArray.getJSONObject(i);
            
            if(u.getInt("PiezaId") == jsonAux.getInt("PiezaId")) {
                
                piezasJsonArray.remove(i);
                
                break;
            }
        }
        
        writeToDiskPiezas();
    }
    
    public void deletReparaciones(JSONObject u) throws IOException{
           
        if(reparacionesJSONArray.isEmpty()) {
            
            readToListForReparaciones();
        }
        
        JSONObject jsonAux;
        
        for(int i = 0; i < reparacionesJSONArray.length(); i++) {
            
            jsonAux = reparacionesJSONArray.getJSONObject(i);
            
            if(u.getInt("id") == jsonAux.getInt("id")) {
                
                reparacionesJSONArray.remove(i);
                
                break;
            }
        }
        
        writeToDiskPiezas();
    }
    
    public void editDataV(JSONObject v)throws IOException{
        if(vehiculoJsonArray.isEmpty()) {
            readToListForVehiculos();
        }
        for (int i = 0; i < vehiculoJsonArray.length(); i++){
            
            JSONObject Obj = vehiculoJsonArray.getJSONObject(i);
            
            if(v.getInt("id") == Obj.getInt("id")){
            
                Obj.put("Cliente Id",v.getInt("Cliente Id"));
                
                Obj.put("Matricula",v.get("Matricula"));
                
                Obj.put("Modelo",v.get("Modelo"));
                
                Obj.put("Marca",v.get("Marca"));
                
                Obj.put("Fecha",v.get("Fecha"));
                
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
    
    public void editClient(JSONObject c) throws IOException {
        
        if(clienteJsonArray.isEmpty()) {
            
            readToListForClientes();
        }
        for (int i = 0; i < clienteJsonArray.length(); i++) {
                
                JSONObject obj = clienteJsonArray.getJSONObject(i);
                
                if(c.getInt("Cliente ID") == obj.getInt("Cliente ID")) {
                       
                    obj.put("Usuario ID", c.getInt("Usuario ID"));

                    obj.put("Name", c.getString("Name"));

                    obj.put("LastName", c.getString("LastName"));

                    obj.put("LastMotherName", c.getString("LastMotherName"));

                    break;
                }
            }
        writeToDiskClientes();
    }
    
    public void editPieza(JSONObject p) throws IOException {
        
        if(piezasJsonArray.isEmpty()) {
            
            readToListForPiezas();
        }
        for (int i = 0; i < piezasJsonArray.length(); i++) {
                
                JSONObject obj = piezasJsonArray.getJSONObject(i);
                
                if(p.getInt("PiezaId") == obj.getInt("PiezaId")) {
                       
                    obj.put("Name", p.getString("Name"));

                    obj.put("Type", p.getString("Type"));

                    obj.put("ToCar", p.getString("ToCar"));

                    obj.put("Cant", p.getInt("Cant"));
                 
                    break;
                }
            }
        
        writeToDiskPiezas();
    }
    
    public void editReparaciones(JSONObject p) throws IOException {
        
        if(reparacionesJSONArray.isEmpty()) {
            
            readToListForReparaciones();
        }
        for (int i = 0; i < reparacionesJSONArray.length(); i++) {
                
                JSONObject obj = reparacionesJSONArray.getJSONObject(i);
                
                if(p.getInt("id") == obj.getInt("id")) {
                       
                    obj.put("Vehiculo", p.getJSONObject("Vehiculo"));

                    obj.put("Pieza", p.getJSONObject("Pieza"));

                    obj.put("Falla", p.getString("Falla"));

                    obj.put("FechaEntrada", p.getString("FechaEntrada"));

                    obj.put("FechaSalida", p.getString("FechaSalida"));

                    obj.put("Cantidad", p.getInt("Cantidad"));
                 
                    break;
                }
            }
        
        writeToDiskReparaciones();
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
    
    public JSONObject searchUserByusername(JSONObject u) throws FileNotFoundException, IOException{
        if(jsonArray.isEmpty()) {
            readToList();
        }
            for (int i = 0; i < jsonArray.length(); i++) {
                
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                
                if((u.getString("UserName").equals(jsonObj.getString("UserName")))&&(u.getString("PassWord").equals(jsonObj.getString("PassWord")))){
                    
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
}
