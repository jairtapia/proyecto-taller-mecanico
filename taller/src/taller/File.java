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

    JSONArray jsonArray;

    public File() {
       
        url = "C:\\Users\\jairm\\Desktop\\taller\\src\\_AUX.json";
        write = null;
        jsonArray = new JSONArray();
    }
    public File(String n) {

        this.url = "";

        url = "C:\\Users\\jairm\\Desktop\\taller\\src\\" + n +".json";

        //read = null;

        write = null;

      
        myList = new ArrayList<usuario>();
    }

    public usuario searchInFile(usuario u) throws FileNotFoundException, IOException {
        
            if(jsonArray.isEmpty()) {
            readToList();
        }
            for (int i = 0; i < jsonArray.length(); i++) {
                
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                
                if(u.getId() == jsonObj.getInt("ID")) {
                    
                    u.setUser(jsonObj);
                    
                    return u;
                }
            }
        return null;
    }
    public void saveData(usuario u){
        
         
           JSONObject obj = new JSONObject();
           
           obj.put("ID", u.getId());
           
           obj.put("Name", u.getNombre());
           
           obj.put("LastName", u.getApellidop());
           
           obj.put("FirstName", u.getApellidom());
           
           obj.put("PhoneNumber", u.getTelefono());
           
           obj.put("UserName", u.getUsermane());
           
           obj.put("Address", u.getAddress());
           
           obj.put("PassWord", u.getPasword());
           
           obj.put("Perfil", u.getPerfil());
           
           
           jsonArray.put(obj);
           
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
    public void deletData(usuario u) throws IOException{
           
        if(jsonArray.isEmpty()) {
            
            readToList();
        }
        
        JSONObject jsonAux;
        
        for(int i = 0; i < jsonArray.length(); i++) {
            
            jsonAux = jsonArray.getJSONObject(i);
            
            if(u.getId() == jsonAux.getInt("ID")) {
                
                jsonArray.remove(i);
                
                break;
            }
        }
        writeToDisk();
    }
    public void editData(usuario u) throws IOException {
        
        if(jsonArray.isEmpty()) {
            
            readToList();
        }
        for (int i = 0; i < jsonArray.length(); i++) {
                
                JSONObject obj = jsonArray.getJSONObject(i);
                
                if(u.getId() == obj.getInt("ID")) {
                    
                    obj.put("ID", u.getId());
                    obj.put("Name", u.getNombre());
                    obj.put("LastName", u.getApellidop());
                    obj.put("FirstName", u.getApellidom());
                    obj.put("PhoneNumber", u.getTelefono());
                    obj.put("UserName", u.getUsermane());
                    obj.put("Address", u.getAddress());
                    obj.put("PassWord", u.getPasword());
                    obj.put("Perfil", u.getPerfil()); 
                    
                    break;
                }
            }
        writeToDisk();
    }
    public boolean isValid(usuario u) throws IOException{
        
        if(jsonArray.isEmpty()) {
            
            readToList();
        }
        for (int i = 0; i < jsonArray.length(); i++) {
                
                JSONObject obj = jsonArray.getJSONObject(i);
                
                if((u.getUsermane().equals(obj.getString("UserName"))) && (u.getPasword().equals(obj.getString("PassWord")))) {
                  
                    return true;
                }
            }
        
        return false;
    }



}
