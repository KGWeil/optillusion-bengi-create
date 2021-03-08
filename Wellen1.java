
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{       
    int s = 50;
    int d = s/4;
    int a = 2;
    @Override
    public void settings()
    {
        size(425,225);
    }    
    /**
    * Zeichnet ein Quadrat der optischen Illusion
    * @param    x    x-Koordinate
    * @param    y    y-Koordinate
    * @param    farbe    Füllfarbe des Quadrats
    * @param    links     Falls links true ist: Kreise links; falls links false ist: Kreise rechts
    */

    @Override
    public void setup()
    {
        zeichneQuadrat( 10, 10, 255, true );
        
        alleQuadrate();
        linien();
          
        
    }
        int farbwechsel (int farbe) {
       if (farbe == 255) { 
         farbe = 0;
        } else {  
         farbe = 255;
        }
       return farbe;
    }
    
    public void zeichneQuadrat(int x, int y, int farbe, boolean links)
    {
      
       fill(farbe);
      rect(x,y,s,s);
      
      fill(farbwechsel(farbe));  
        
      ellipseMode(CORNERS);
      noStroke();
      
      if (links == true) {
            ellipse(x+a, y+a, x+d+a, y+d+a);  
            ellipse(x+a, y + 3*d-a, x+d+a, y+s-a); 
      } else {
            ellipse(x + 3*d-a, y+a, x+s-a, y+d+a);  
            ellipse(x + 3*d-a, y + 3*d-a, x+ s-a, y+s-a);  
      }
    }
    
        public void alleQuadrate() {
        noStroke();
        int aktuelleFarbe = 255; 
        boolean pos_aktuell = true; 
        for (int j=0; j<=3; j++) {
            for (int i=0; i<=7; i++) {
                zeichneQuadrat(d + i*s, d + j*s, aktuelleFarbe, pos_aktuell);
                aktuelleFarbe = farbwechsel( aktuelleFarbe );
            } 
            aktuelleFarbe = farbwechsel( aktuelleFarbe );
            
            if (pos_aktuell == true) {
                pos_aktuell = false;
            } else {
                pos_aktuell = true;
            }
        }
    }
        public void linien()
    {
        stroke(8, 250, 78);  // Linienfarbe hellgrün
        strokeWeight(a);
        for (int i=0; i<=2; i++) {
            line(d-a, d + s + s*i, d + a + 8*s, d + s + s*i);
        }
    }


   
    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
