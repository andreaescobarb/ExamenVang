/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author andre
 */
public class FileAdapter extends LinuxFile{
    WindowsFile archivo;
    
    @Override
    public void openFile(String file) {
        archivo = new WindowsFile(file);
        System.out.println("Opening file " + file.substring(0, file.indexOf(".")) + ".tar" );
        
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file " + archivo.getFile().substring(0, archivo.getFile().indexOf(".")) + ".tar");
    }
}
