package tn.enis.exercice2;

public class Loup {
    private Orientation orientation = Orientation.Nord;

    public Orientation getPosition() {
       return  orientation;
    }

    public void tounrner() {
        switch (orientation){
            case Nord -> orientation = Orientation.Est;
            case Est -> orientation = Orientation.Sud;
            case Sud -> orientation = Orientation.Ouest;
            case Ouest -> orientation = Orientation.Nord;
        }
    }
}
