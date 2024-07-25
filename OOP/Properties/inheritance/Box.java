package OOP.Properties.inheritance;

public class Box {
    double h;
    private double l;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

//    Cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the Box class");
    }
}
