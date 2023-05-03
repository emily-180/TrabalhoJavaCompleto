/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicajava;

/**
 *
 * @author 49401027854
 */
public class Cliente {
     private String nomeCliente;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
