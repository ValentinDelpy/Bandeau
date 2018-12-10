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
private final Rainbow monRainbow = new Rainbow(monBandeau);
private final Aleatoire monAleatoire = new Aleatoire(monBandeau);
private final PamPamPam monPamPam = new PamPamPam(monBandeau);
private final MotColore monMot = new MotColore(monBandeau);
protected ArrayList<Animation> mesAnimations = new ArrayList<>();

    public Scenario(Bandeau b){
        this.monBandeau = b;
    }
    
    public void envoyerLaSauce(){
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
       
        monBandeau.setMessage("Ceci est une présentation");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Ne vous inquiétez pas, ça va bien se passer");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setMessage("Houston, nous avons un problème");
        monBandeau.sleep(1000);
        monAleatoire.effectuer();
        monBandeau.sleep(1000);
        monBandeau.setMessage("Capitaine, je me sens pas bien...");
        monBandeau.sleep(1000);
        monRainbow.effectuer();
                
                monPamPam.effectuer();
                monMot.effectuer();     
    }
}
