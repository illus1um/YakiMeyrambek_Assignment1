import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Illus1ve\\IdeaProjects\\Assignment1\\src\\file1.txt");
        Scanner sc = new Scanner(file);

        Shape shape = new Shape();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] coordinates = line.split(", ");
            shape.addPoint(new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])));
        }

        ArrayList<Point> points = shape.getPoints();
        System.out.print("Points: ");

        for(int i = 0; i < points.size(); i++) {
            System.out.print("[" + points.get(i).getX() + ", " + points.get(i).getY() + "] ");
        }

        System.out.println("\nPerimeter of Shape: " + shape.calculatePerimeter());

        System.out.println("Longest side of Shape: " + shape.getLongestSide());

        System.out.println("Average length of all sides: " + shape.getAvgLength());

    }
}
