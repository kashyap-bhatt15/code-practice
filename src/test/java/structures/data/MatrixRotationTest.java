package structures.data;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MatrixRotationTest {
	
		@Test
		public void rotateMatrix90degreesTest() {
			double[][] originalData = { { 1.0, 2.0, 3.0},
										{ 4.0, 5.0, 6.0},
										{ 7.0, 8.0, 9.0}};
			Matrix matrix = new Matrix(originalData);
			Matrix rotatedMatrix = matrix.rotate90Degree();
			double [][] rotatedData = { { 7.0, 4.0, 1.0},
										{ 8.0, 5.0, 2.0},
										{ 9.0, 6.0, 3.0}};
			Matrix expectedMatrix = new Matrix(rotatedData);
			assertTrue("Matrix not rotated correctly", rotatedMatrix.equals(expectedMatrix));
		}
		
		
		@Test
		public void rotateMatrix90DegreeInPlaceTest() {
			double[][] originalData = { { 1.0, 2.0, 3.0},
										{ 4.0, 5.0, 6.0},
										{ 7.0, 8.0, 9.0}};
			Matrix matrix = new Matrix(originalData);
			Matrix rotatedMatrix = matrix.rotate90DegreeInPlace();
			double [][] rotatedData = { { 7.0, 4.0, 1.0},
										{ 8.0, 5.0, 2.0},
										{ 9.0, 6.0, 3.0}};
			Matrix expectedMatrix = new Matrix(rotatedData);
			assertTrue("Matrix not rotated correctly", rotatedMatrix.equals(expectedMatrix));
		}
		
}
