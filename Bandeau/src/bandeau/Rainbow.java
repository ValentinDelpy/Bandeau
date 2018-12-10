/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author vdelpy
 */
public class Rainbow extends Animation{
private Bandeau b;

     public Rainbow(Bandeau ban){
         this.b = ban;
     }
     
     @Override
     public void effectuer(){
         for(int i=0;i<101;i+=10){
             Color c;
             if(i<6){
             b.setBackground( c = new Color(200-i,0+i,0));
             b.sleep(200);
             }
             else{
                 b.setBackground(c = new Color(150,50+i,0+i));
                 b.sleep(200);
             }
         } 
     }
}
