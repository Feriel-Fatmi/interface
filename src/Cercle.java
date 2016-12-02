/**
 * Created by Fatmi on 02/12/2016.
 */
public class Cercle implements Forme {
    private double rayon;
    public Cercle( double rayon){
        this.rayon=rayon;
    }
    public double getRayon(){
        return rayon ;
    }
    public double surface(){
        return Math.PI*rayon*rayon;
    }
    public double perimetre(){
        return 2*Math.PI*rayon;
    }
    public String toString(){
        return "le rayon est" + rayon +"la surface est" + surface() + "le perimetre est" + perimetre();
    }
    public Object clone(){
        return null;
    }

}
