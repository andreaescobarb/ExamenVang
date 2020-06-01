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
public class TiendaRegalos implements Builder{
    private Regalo wrappedGift = new Regalo();

    @Override
    public void addRibbon(boolean ribbon) {
        this.wrappedGift.ribbon = ribbon;
    }

    @Override
    public void addBox(String box) {
        this.wrappedGift.box = box;
    }

    @Override
    public void addBag(String paperbag) {
        this.wrappedGift.paperbag = paperbag;
    }

    @Override
    public void addPaper(String paper) {
        this.wrappedGift.paper = paper;
    }

    @Override
    public void addCard(String card) {
        this.wrappedGift.card = card;
    }

    @Override
    public Regalo getReglo() {
        return this.wrappedGift;
    }
    
}
