package cg.ice.hockey.util;

import java.util.ArrayList;

public class Circle {
    public ArrayList<Point> points = new ArrayList();
    
    public void addPoint(int x, int y) {
        this.points.add(new Point(x, y));
    }
}
