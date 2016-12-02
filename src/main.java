
public class main {
    public static void main(String[] args) {
        Forme[] tableau = new Forme[4];
        tableau[0] = new Rectangle(2, 4);
        tableau[1] = new Cercle(5);
        tableau[2] = new Triangle(3.2, 4, 5);
        tableau[3] = new Carre(5);
        for (int i = 0; i < 4; i++) {
            System.out.println(tableau[i]);
        }
    }
}