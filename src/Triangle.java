
public class Triangle implements Forme {
    private double base;
    private double hauteur;
    private double hypotenuse;
    public Triangle( double base , double hauteur, double hypotenuse){
        this.base=base;
        this.hauteur=hauteur;
        this.hypotenuse=hypotenuse;
    }
    public double getBase(){
        return base;
    }
    public double getHauteur(){
        return hauteur;
    }
    public double getHypotenuse(){
        return hypotenuse;
    }
    public double surface(double base, double hauteur){
        return (base*hauteur)/2;
    }
    public double perimetre(){
        return base+hypotenuse+hauteur;
    }

    @Override
    public double surface() {
        return (base*hauteur)/2;
    }

    public String toString(){
        return "le base est " + base + " la hauteur est " + hauteur + " le hyotenuse est" + hypotenuse + " la surface est "
                + surface() + "le perimetre est" + perimetre();
    }
    public Object clone(){
        return null;
    }

}
