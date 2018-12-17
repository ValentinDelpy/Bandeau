/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author vdelpy
 */
public class PamPamPam extends Animation{
private Bandeau b;
private String msg;
private int repet;


    public PamPamPam(Bandeau ban, String message, int repetitions){
        super(ban);
        this.msg = message;
        this.repet = repetitions;
        b.setBackground(Color.WHITE);

    }
    //Inclinaison du texte puis rotation a 90° dans un sens puis dans l'autre tout en faisant augmenter la police de ce texte
    @Override
    public void effectuer(){
        b.setMessage(msg);
        int valeur = 5; 
        for(int i=0;i<repet;i++){
            if(i%2==0){
                b.setRotation(Math.PI/4);
                b.sleep(200);
                b.setFont(new Font("Dialog", Font.BOLD, valeur+5*i));
            }
            else{
                b.setRotation(-Math.PI/4);
                b.sleep(200);
                b.setFont(new Font("Dialog", Font.BOLD, valeur+5*i));    
            }
        }
        b.setRotation(0);
        b.sleep(1000);
    }
}
