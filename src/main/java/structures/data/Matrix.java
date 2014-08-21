package structures.data;

public class Matrix {
	private final int M;
	private final int N;
	private final double [][] data;
	
	public Matrix(int N) {
		this.M = N;
		this.N = N;
		data = new double [N][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++)
				this.data[i][j] = i + j;
		}
		
	}
	
	public Matrix(int M, int N) {
		this.M = M;
		this.N = N;
		data = new double [M][N];
	}
	
	public Matrix(double[][] data) {
		this.M = data.length;
		this.N = data[0].length;
		this.data = new double[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++)
				this.data[i][j] = data[i][j];
		}
	}
	
	public int getWidth() {
		return M;
	}

	public int getHeight() {
		return N;
	}
	
	public boolean setElement(int rowIndex, int columnIndex, double value) {
		if(rowIndex < this.getWidth() && columnIndex < this.getHeight()) {
			data[rowIndex][columnIndex] = value;
			return true;
		} else {
			return false;
		}
	}
	
	public double getElement(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	public void show() {
		for (int i = 0; i < this.getWidth(); i++) {
			for (int j = 0; j < this.getHeight(); j++) 
                System.out.printf("%.0f ", data[i][j]);
            System.out.println();
        }
		System.out.println();
    }
	
	/*
	 * 1 2 3      7 4 1
	 * 4 5 6 ==>  8 5 2
	 * 7 8 9      9 6 3
	 * logic: j becomes i, i = (m - 1) - i
	 */
	public Matrix rotate90Degree() {
		Matrix rotatedMatrix = new Matrix(this.getHeight(), this.getWidth());
		for(int i = 0; i < this.getWidth(); i++) {
			for(int j = 0; j < this.getHeight(); j++) {
				rotatedMatrix.setElement(j, (this.getWidth() -1) - i, data[i][j]);
			}
		}
		this.show();
		rotatedMatrix.show();
		return rotatedMatrix;
	}
	
	public boolean equals(Matrix passedMatrix) {
		if(passedMatrix.getWidth() != this.getWidth() || passedMatrix.getHeight() != this.getHeight())
			return false;
		for (int i = 0; i < this.getWidth(); i++) {
			for (int j = 0; j < this.getHeight(); j++) {
				if(passedMatrix.getElement(i, j) != this.data[i][j])
					return false;
			}
		}
		return true;
	}

	
}
