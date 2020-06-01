/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author andre
 */
public class Cliente implements Observer{
    private String name;
    public Cliente(String name){
        this.name = name;
    }
    @Override
    public void update(Subject subject) {
        System.out.println( name + " nuevos productos disponibles! " + ((tiendaOnline)(subject)).getItems().toString());
    }
}
