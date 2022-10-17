package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//Yellow: 252, 227, 3
		//blue: 3, 194, 252
		//purple: 97,6,201
		//red: 201,6,26
		//Green: 7, 217, 28
		//Hot pink: 250, 5, 176
		
		double[] triangleX = {0.5, 0.5-(.25/Math.sqrt(2)), 0.5+(.25/Math.sqrt(2))};
		double[] triangleY = {0.75, 0.5-(.25/Math.sqrt(2)), 0.5-(.25/Math.sqrt(2))};
		
		StdDraw.setPenColor(252, 227, 3);
		StdDraw.filledRectangle(0.5, 0.125, 0.5, 0.125);
		StdDraw.setPenColor(3, 194, 252);
		StdDraw.filledRectangle(0.5, 0.375, 0.5, 0.125);
		StdDraw.setPenColor(97, 6, 201);
		StdDraw.filledRectangle(0.5, 0.625, 0.5, 0.125);
		StdDraw.setPenColor(201,6,26);
		StdDraw.filledRectangle(0.5, 0.875, 0.5, 0.125);
		StdDraw.setPenColor(7, 217, 28);
		StdDraw.filledEllipse(0.5, 0.5, 0.25, 0.25);
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.ellipse(0.5, 0.5, 0.25, 0.25);
		StdDraw.setPenColor(250, 5, 176);
		StdDraw.filledPolygon(triangleX, triangleY);
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.polygon(triangleX, triangleY);
	}
}