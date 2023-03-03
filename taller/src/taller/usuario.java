
package taller;

import org.json.JSONObject;

public class usuario {
    
    private int id;
    private String Nombre;
    private String Apellidop;
    private String Apellidom;
    private String telefono;
    private String usermane;
    private String Address;
    private String Pasword;
    private String perfil;

    public usuario() {
        this.id = 0;
        this.Nombre = "DESCONOCIDO";
        this.Apellidop = "DESCONOCIDO";
        this.Apellidom = "DESCONOCIDO";
        this.telefono = "DESCONOCIDO";
        this.usermane = "DESCONOCIDO";
        this.Address = "DESCONOCIDO";
        this.Pasword = "***********";
        this.perfil = "DESCONOCIDO";
    }
    
    
    public usuario(JSONObject obj){
        
        this.id = obj.getInt("ID");
        this.Nombre = obj.getString("Name");
        this.Apellidop = obj.getString("LastName");
        this.Apellidom = obj.getString("FirstName");
        this.telefono = obj.getString("PhoneNumber");
        this.usermane = obj.getString("UserName");
        this.Address = obj.getString("Address");
        this.Pasword = obj.getString("PassWord");
        this.perfil = obj.getString("Perfil"); 
        
    }
    public void setUser(JSONObject obj) {
        
        this.id = obj.getInt("ID");
        this.Nombre = obj.getString("Name");
        this.Apellidop = obj.getString("LastName");
        this.Apellidom = obj.getString("FirstName");
        this.telefono = obj.getString("PhoneNumber");
        this.usermane = obj.getString("UserName");
        this.Address = obj.getString("Address");
        this.Pasword = obj.getString("PassWord");
        this.perfil = obj.getString("Perfil"); 
        
    
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidop() {
        return Apellidop;
    }

    public void setApellidop(String Apellidop) {
        this.Apellidop = Apellidop;
    }

    public String getApellidom() {
        return Apellidom;
    }

    public void setApellidom(String Apellidom) {
        this.Apellidom = Apellidom;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsermane() {
        return usermane;
    }

    public void setUsermane(String usermane) {
        this.usermane = usermane;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPasword() {
        return Pasword;
    }

    public void setPasword(String Pasword) {
        this.Pasword = Pasword;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }   
    
    public JSONObject getJson() {
        
        //Retorna una Representacion en formato Json
        
           JSONObject obj = new JSONObject();
           
           obj.put("ID", this.getId());
           
           obj.put("Name", this.getNombre());
           
           obj.put("LastName", this.getApellidop());
           
           obj.put("FirstName", this.getApellidom());
           
           obj.put("PhoneNumber", this.getTelefono());
           
           obj.put("UserName", this.getUsermane());
           
           obj.put("Address", this.getAddress());
           
           obj.put("PassWord", this.getPasword());
           
           obj.put("Perfil", this.getPerfil());
           
        return obj;
    }
}