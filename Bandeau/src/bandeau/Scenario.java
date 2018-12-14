/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

/**
 *
 * @author vdelpy
 */
public class Scenario {
    
private Bandeau monBandeau;
protected ArrayList<Animation> mesAnimations = new ArrayList<>();
protected ArrayList<Integer> mesOccurences = new ArrayList<>();
        
    public Scenario(Bandeau b){
        this.monBandeau = b;
    }
    //on ajoute un effet avec son nombre d'itération
    public void ajouterEffet(Animation a, int occ){
        mesAnimations.add(a);
        mesOccurences.add(occ);
    }
    //lance le bandeau
    public void envoyerLaSauce(){
        for(Animation a : mesAnimations){
            for(int i=0;i<mesOccurences.get(mesAnimations.indexOf(a));i++){
                 a.effectuer();
            }
        }
    }
}
