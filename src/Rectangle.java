/**
 * Created by Fatmi on 02/12/2016.
 */
public class Rectangle implements Forme {
    private double L;
    private double l;
    public Rectangle(double L , double l){
        this.L=L;
        this.l=l;
    }

    public double getL(){
        return L;
    }
    public double getl(){
        return l;
    }
    public double surface(){
        return L*l;
    }
    public double perimetre(){
        return(L+l)*2;
    }
    public String toString(){
        return "la largeur est " + L + "la longeur est " + l + "la surface est " + surface() + "le perimetre est " + perimetre();
    }
    public Object  clone(){
        return null ;
    }

}
