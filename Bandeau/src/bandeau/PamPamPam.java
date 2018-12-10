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

    public PamPamPam(Bandeau ban){
        this.b = ban;
        b.setBackground(Color.WHITE);

    }
    
    @Override
    public void effectuer(){
        b.setMessage("PAM PAM PAM");
        int valeur = 5; 
        for(int i=0;i<7;i++){
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
    }
}
