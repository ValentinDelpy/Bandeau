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
private String msg;
protected int duree;
    public MotColore(Bandeau ban, String s, int duree){
        super(ban);
        this.msg = s;
        this.duree = duree;
    }    
    //Change la couleur, de manière aléatoire, du fond et du texte.
    public void effectuer(){
        Color c;
        b.setMessage(msg);
        Random rand = new Random();
        for(int i=0;i<duree;i++){
            b.setBackground(c = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            b.setForeground(c = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            b.sleep(1000);
        }
    }
    //setter de durée
    public void changerDuree(int d){
        this.duree = d;
    }
}
