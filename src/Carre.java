/**
 * Created by Fatmi on 02/12/2016.
 */
public class Carre extends Rectangle {
    private double l;
    public Carre(double l) {
        super(l,l);
    }

    public double surface() {
        return getl() * getl();
    }

    public double perimetre() {
        return getl() * 4;
    }

    public String toString() {
        return "le cote est" + getl() + " la surface est " + surface() + "le perimetre est " + perimetre();
    }

}
