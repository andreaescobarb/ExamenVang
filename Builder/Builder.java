/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author andre
 */
public interface Builder {

    public abstract void addRibbon(boolean ribbon);

    public abstract void addBox(String box);

    public abstract void addBag(String paperbag);

    public abstract void addPaper(String paper);
    
    public abstract void addCard(String card);

    public abstract Regalo getReglo();
}
