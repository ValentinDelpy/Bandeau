/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author vdelpy
 */
public class MotColore extends Animation{
private Bandeau b;

    public MotColore(Bandeau ban){
        this.b = ban;
        b.setBackground(Color.WHITE);
    }    
    
    public void effectuer(){
        Color c;
        Random rand = new Random();
        boolean truet = true;
        while(truet == true){
            b.setBackground(c = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            b.sleep(200);
            b.setForeground(c = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
        }
    }
}
