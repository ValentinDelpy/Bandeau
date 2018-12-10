/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
//cceci est une vérif
import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    private final Bandeau monBandeau = new Bandeau();
    private final Rainbow monRainbow = new Rainbow(monBandeau);
    private final Aleatoire monAleatoire = new Aleatoire(monBandeau);
    private final PamPamPam monPamPam = new PamPamPam(monBandeau);
    private final MotColore monMot = new MotColore(monBandeau);
    
    public static void main(String[] args) {
        Scenario scenario = new Scenario(monBandeau);
        scenario.envoyerLaSauce();
    }
    
    public void scenario() {
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
    
    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
       
        monBandeau.setMessage("Hello");
                monRainbow.effectuer();
                monAleatoire.effectuer();
                monPamPam.effectuer();
		monBandeau.sleep(1000);
		monBandeau.setMessage("On va changer de police");
		monBandeau.sleep(1000);
		monBandeau.setMessage("Monospaced 15 Bold");
		monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
		monBandeau.sleep(1000);
		monBandeau.setMessage("SansSerif 15");
		monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
		monBandeau.sleep(1000);
		monBandeau.setMessage("On va zoomer");
		monBandeau.sleep(1000);
		monBandeau.setMessage("Zoom........");
		for (int i = 5; i < 60 ; i+=5) {
			monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			monBandeau.sleep(100);
		}
		monBandeau.sleep(1000);

		monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
		monBandeau.setMessage("On va tourner");
		monBandeau.sleep(1000);
		monBandeau.setMessage("On tourne...");
		for (int i = 0; i <= 50; i++) {
			monBandeau.setRotation(2*Math.PI*i / 50);
			monBandeau.sleep(100);
		}

		monBandeau.setMessage("On va changer de couleur de fond");
		monBandeau.sleep(1000);
		monBandeau.setBackground(Color.DARK_GRAY);
		monBandeau.setMessage("On va changer de couleur");
		monBandeau.sleep(1000);
		monBandeau.setForeground(Color.YELLOW);
		monBandeau.sleep(1000);
		monBandeau.setFont(font);
		monBandeau.setForeground(fore);
		monBandeau.setBackground(back);
		monBandeau.setMessage("Termine");
		System.exit(0);
                
   }
}
