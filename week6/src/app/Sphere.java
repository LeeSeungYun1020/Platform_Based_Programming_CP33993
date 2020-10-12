package app;

import lib.Shape2D;
import lib.Shape3D;
import lib.ValuePI;

public class Sphere implements Shape2D, Shape3D, ValuePI, Comparable {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return PI * radius * radius;
    }

    @Override
    public double findVolume() {
        return PI * Math.pow(radius, 3) * 4 / 3;
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(radius, ((Sphere) o).radius);
    }
}
