package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class InterpretDrawingFile {
    public static void main(String[] args) throws FileNotFoundException {
       
        JFileChooser chooser = new JFileChooser("resources");
        chooser.showOpenDialog(null);
        File file = new File(chooser.getSelectedFile().getPath()); // Replace with actual file path

        // Set up scanner to read the file
        Scanner in = new Scanner(file);

        // Read shape type
        String shapeType = in.next();

        // Read color values
        int red = in.nextInt();
        int green = in.nextInt();
        int blue = in.nextInt();

        // Set color in StdDraw
        StdDraw.setPenColor(red, green, blue);

        // Check if the shape is filled
        boolean isFilled = in.nextBoolean();

        // Read parameters based on the shape type
        if (shapeType.equals("rectangle")) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            double halfWidth = in.nextDouble();
            double halfHeight = in.nextDouble();

            // Draw the rectangle
            if (isFilled) {
                StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
            } else {
                StdDraw.rectangle(x, y, halfWidth, halfHeight);
            }
        }
        // Add cases for other shapes like ellipses and triangles
        in.close();
    }
}
