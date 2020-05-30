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
public class LinuxFile implements FileInterface{
    private String file;
    @Override
    public void openFile(String file) {
        System.out.println("Opening file " + file);
        this.file=file;
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file "+ this.file);
    }
    
}
