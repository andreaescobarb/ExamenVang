/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author andre
 */
public class noMoroso implements Estado{

    @Override
    public void Transaccion(ClienteBancario cliente) {
        cliente.Depositar();
        cliente.Retirar();
        cliente.sacarPrestamo();
    }
    
}
