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
public class CiscoDevice {
    CiscodeviceType model;
    
    CiscoDevice(){
        
    }
    
    public CiscoDevice(CiscodeviceType model) {
        this.model = model;
    }

    public CiscodeviceType getDevice() {
        return model;
    }

    public void setDevice(CiscodeviceType model) {
        this.model = model;
    }
}
