package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class Flag {
    public static void main(String[] args) {
        // Set up the canvas size (optional)
        StdDraw.setCanvasSize(800, 600);

        // Fill the background with red
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.35);  // Red background

        // Set color to yellow for the stars
        StdDraw.setPenColor(Color.YELLOW);

        // Draw the large star (use a helper function to draw stars)
        drawStar(0.15, 0.75, 0.08, 0);  // Large star at (0.15, 0.75) with radius 0.08

        // Draw the four smaller stars (adjusting to a lower position)
        drawStar(0.25, 0.8, 0.03, -30);  // Small star 1
        drawStar(0.28, 0.73, 0.03, 0);   // Small star 2
        drawStar(0.28, 0.65, 0.03, 30);  // Small star 3
        drawStar(0.25, 0.6, 0.03, 60);   // Small star 4
     

        // Draw the blue triangle
        StdDraw.setPenColor(Color.BLUE);
        double[] x = {0.55, 0.65, 0.75};  // X coordinates for the triangle
        double[] y = {0.3, 0.2, 0.3};  // Y coordinates for the triangle
        StdDraw.filledPolygon(x, y);  // Filled blue triangle
    }

    // Helper function to draw a star
    public static void drawStar(double x, double y, double radius, double angle) {
        double[] xs = new double[10];
        double[] ys = new double[10];

        for (int i = 0; i < 10; i++) {
            double r = (i % 2 == 0) ? radius : radius / 2.5;
            double theta = Math.toRadians(i * 36 + angle);  // 36 degrees between points
            xs[i] = x + r * Math.cos(theta);
            ys[i] = y + r * Math.sin(theta);
        }

        StdDraw.filledPolygon(xs, ys);
    }
}
