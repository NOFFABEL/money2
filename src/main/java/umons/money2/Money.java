/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umons.money2;

/**
 *
 * @author NOFFABEL
 */
public class Money {
    private int amount;
    private String currency;
    
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public int amount() {
    
        return this.amount;
    }
    
    public String currency(){
    
        return this.currency;
    }
    
    public Money add(Money m) throws Exception{
        
        if(this.currency().equals(m.currency())) {
            return new Money(this.amount()+m.amount(), this.currency());
        }
        throw new Exception("Not Same currency");
    }
    
    public Money add(int namount, String currency) throws Exception{
        
        return this.add(new Money(namount, currency));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
