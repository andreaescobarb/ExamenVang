/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author andre
 */
public class CiscoFactory {
    public CiscoDevice device(CiscodeviceType model){
        if(model.equals(CiscodeviceType.Routers)){
            return new Router();
         
        }else if (model.equals(CiscodeviceType.Switches)){
            return new Switch();
        }
        return new CiscoDevice(model);
    }
}
