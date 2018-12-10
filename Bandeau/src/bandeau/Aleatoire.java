/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vdelpy
 */
public class Aleatoire extends Animation{
private Bandeau b;

    public Aleatoire(Bandeau ban){
        this.b = ban;
        b.setBackground(Color.WHITE);
    }
    
@Override
    public void effectuer(){
        b.setMessage("Ce message va être coupé");
        Random rand = new Random();
        b.setMessage(b.getMessage().substring(rand.nextInt(b.getMessage().length()+1)));
        b.sleep(500);
    }
}
