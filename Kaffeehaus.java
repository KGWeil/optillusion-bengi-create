
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{ 
    int s = 40;
    int[] abstaende = {10, 20, 30, 20, 10, 20, 30, 20, 10};
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
        
    }        

    public void parallelen()
    {
        for (int i = 0; i<10; i++){
            stroke(20);
            line(0, 6+i*s, 640,6+i*s);

        } 
        
    }    

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        parallelen();
        zeichneQuadrate();
    }
    
    public void zeichneQuadrate()
    {
      fill(0);
      for ( int j = 0; j <= 8; j++){
          for(int i = 0; i<=7; i++){
        rect(abstaende[j]+2*s*i, 6+j*s, s, s);  
          
      }  
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
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
