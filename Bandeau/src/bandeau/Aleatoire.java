/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vdelpy
 */
public class Aleatoire extends Animation{
private Bandeau b;
private String msg;

    public Aleatoire(Bandeau ban, String message){
        super(ban);
        this.msg = message;
        b.setBackground(Color.WHITE);
    }
    
@Override
//Cette fonction découpe le mot de façon aléatoire et affiche seulement la partie séléctionnée.
    public void effectuer(){
        b.setFont(new Font("Dialog", Font.BOLD, 15));
        b.setMessage(msg);
        Random rand = new Random();
        b.setMessage(b.getMessage().substring(rand.nextInt(b.getMessage().length()+1)));
        b.sleep(500);
    }
}
