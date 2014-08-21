package structures.data;

/*
 * Problem: Given an image represent by NxN matrix, where each pixel in the image is 
 * 4 bytes, write a method to rotate image by 90 degrees. Do this In Place.
 */
public class MatrixRotation {
	double[][] originalData = { { 1.0, 2.0, 3.0},
								{ 4.0, 5.0, 6.0},
								{ 7.0, 8.0, 9.0}};
	Matrix matrix = new Matrix(originalData);
	
	double [][] rotatedData = { { 7.0, 4.0, 1.0},
								{ 8.0, 5.0, 2.0},
								{ 9.0, 6.0, 3.0}};
	Matrix rotatedMatrix = matrix.rotate90Degree();
	
}
