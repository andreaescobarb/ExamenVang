/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class tiendaOnline implements Subject{
    private ArrayList<String> newItems = new ArrayList();
    private ArrayList<Observer> clients = new ArrayList<Observer>();
    
    public void addItem(String n){
        newItems.add(n);
        this.notifyAllObservers();
    }
    
    public ArrayList<String> getItems(){
        return this.newItems;
    }

    @Override
    public void registerObserver(Observer o) {
        clients.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        clients.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).update(this);
        } 
    }
}
