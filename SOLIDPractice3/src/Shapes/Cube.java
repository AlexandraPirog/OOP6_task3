package Shapes;

public class Cube implements VolumedShape {
    private int edge;
    private double volume;
    public Cube(int edge, double volume) {
        this.edge = edge;
        this.volume = volume;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
