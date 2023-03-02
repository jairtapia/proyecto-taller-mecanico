/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author jairm
 */

import org.json.JSONObject;
public class Cliente extends usuario{
    
    public Cliente() {
        
    }

    public Cliente(JSONObject obj) {
        super(obj);
    }
    
}
