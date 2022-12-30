import java.util.ArrayList;

public class Shape {

    ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int n = points.size() - 1;

        for(int i = 0; i < n; i++) {
            perimeter += points.get(i).distance(points.get(i+1));
        }

        perimeter += points.get(n).distance(points.get(0));

        return perimeter;
    }

    public double getLongestSide() {
        int n = points.size() - 1;
        double longestside = points.get(n).distance(points.get(0));

        for(int i = 0; i < n; i++) {
            double side = points.get(i).distance(points.get(i+1));

            if (longestside < side) {
                longestside = side;
            }
        }

        return longestside;
    }

    public double getAvgLength() {
        return calculatePerimeter() / points.size();
    }
}
