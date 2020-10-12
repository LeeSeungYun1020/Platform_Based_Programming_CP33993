package app;

import lib.Shape2D;
import lib.Shape3D;

public class Box implements Shape2D, Shape3D, Comparable {
    private final double length;
    private final double width;
    private final double height;

    public Box(double length, double width, double height) throws HeightException {
        if (height <= 0)
            throw new HeightException("높이는 0이하가 될 수 없습니다.");
        this.length = length;
        this.width = width;
        this.height = height;
    }


    @Override
    public double findArea() {
        return width * length;
    }

    @Override
    public double findVolume() {
        return width * length * height;
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(findVolume(), ((Box) o).findVolume());
    }
}
