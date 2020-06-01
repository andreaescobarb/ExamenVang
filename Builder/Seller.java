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
public class Seller {
    public void wrapGift(Builder gift){
        gift.addBag("bolsa de regalo azul");
        gift.addRibbon(true);
        gift.addCard("tarjeta de regalo con dedicatoria");
        gift.addBox("caja de regalo");
        gift.addPaper("papel de regalo navy blue");
    }
}
