package OOP.Properties.inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l,w,h);
        this.weight = weight;
    }
}
