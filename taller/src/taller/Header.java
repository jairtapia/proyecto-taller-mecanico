package taller;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;

public class Header {
    
    private int users;
    private String url = "C:\\Users\\jairm\\Desktop\\taller\\src\\HEADER.json";



    public Header() {

        this.users = 0;
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
    public void toDisk(){
        try {
            
            FileWriter file = new FileWriter(url, false);
            
            JSONObject obj = new JSONObject();
                
            obj.put("LastId", this.users);
                
            file.write(obj.toString(2));
                
            file.close();
           
        }catch(IOException ex) {
    
        }

    }
    public void fromDisk() throws IOException {

        String myJson = new String(Files.readAllBytes(Paths.get(url)), StandardCharsets.UTF_8);

        JSONObject jsonObject = new JSONObject(myJson);

        this.users = jsonObject.getInt("LastId");
    }


    




}