package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		if (shapeType.equals("rectangle"))
		{
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if (isFilled)
			{
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else
			{
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		else if (shapeType.equals("ellipse"))
		{
			double sMa = in.nextDouble();
			double sma = in.nextDouble();
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if (isFilled)
			{
				StdDraw.filledEllipse(x, y, sMa, sma);
			}
			else
			{
				StdDraw.ellipse(x, y, sMa, sma);
			}
		}
		else
		{
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			
			double[] xArray = { x, x2, x3 };
			double[] yArray = { y, y2, y3 };
			
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if (isFilled)
			{
				StdDraw.filledPolygon(xArray, yArray);
			}
			else
			{
				StdDraw.polygon(xArray, yArray);
			}
		}
		
		
	}
}
