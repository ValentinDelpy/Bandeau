/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author vdelpy
 */
//Classe mére
public abstract class Animation {
private Bandeau b;

    public Animation(Bandeau band){
        this.b = band;
}
    public abstract void effectuer();
}
