/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arnoni.massimo
 */
public class Focaccia <T> {
    
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private T contenuto;
    private String cosa = "Focaccia";

    public Focaccia(T t)
    {
        // inizializza le variabili d'istanza
        contenuto = t;
    }

    public T getContenuto()
    {
        return contenuto;
    }
    
}
