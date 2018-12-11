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
    private static Bandeau monBandeau = new Bandeau();
    
    public static void main(String[] args) {
        Scenario scenario = new Scenario(monBandeau);
        MotColore monMot = new MotColore(monBandeau,"Ce mot change de couleur",5);
        PamPamPam papam = new PamPamPam(monBandeau,"Pam pam pam",10);
        Aleatoire aleat = new Aleatoire(monBandeau,"Michel Sardou et Bernard Minet");
        Rainbow arc = new Rainbow(monBandeau);
        scenario.ajouterEffet(monMot, 1);
        scenario.ajouterEffet(papam,2);
        scenario.ajouterEffet(aleat,10);
        scenario.ajouterEffet(arc,1);
        scenario.envoyerLaSauce();
    }
    

    
    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
       
        monBandeau.setMessage("Hello");
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
