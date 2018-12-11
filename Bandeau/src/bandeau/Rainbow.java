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
         b.setMessage("Salut à tous");
         Color c;
         for(int i=0;i<255;i++){
             b.setBackground( c = new Color(255-i,i,0));
         }
         for(int j=0;j<255;j++){
                 b.setBackground(c = new Color(0,255-j,j));
         }
         for(int k=0;k<255;k++){
                 b.setBackground(c = new Color(k,0,255-k));
         } 
     }
}
