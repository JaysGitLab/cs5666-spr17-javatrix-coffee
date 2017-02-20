
/**
 * @Date:   2017-02-16T09:46:52-05:00
 * @Last modified time: 2017-02-19T13:29:31-05:00
 */

public class Matrix {
    private double[][] j4k;

    public Matrix(double[][] A) {
        int numCols = getColumnDimension();
        for (int i = 0; i < numCols; i++) {
            if (numCols != A[i].length) {
                throw new IllegalArgumentException("All rows must have the same length");
            }
        }
        j4k = A;


    }

    public Matrix(double[][] A, int m, int n) {
        A = new double[m][n];
        j4k = A;
    }

    public Matrix(double[] vals, int m) {
        if (vals.length % m != 0) {
            throw new IllegalArgumentException("length of array must be divisbile by second variable");
        }
        int n = vals.length / m;
        int k = 0;
        double[][] A = new double[m][n];
        for(int i = 0; i < m-1; i ++){  
            for (int j = 0; j < n-1; j++) {
                A[i][j] = vals[k];
                k++;
            }
        }

        j4k = A;
    }

    public Matrix(int m, int n) {
        double[][]A = new double[m][n];
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n-1; j++)
                A[i][j] = 0;
        }
        j4k=A;
    }

    public Matrix(int m, int n, double s) {
        double[][] A = new double[m][n];
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n-1; j++)
                A[m][n] = s;
        }
        j4k=A;
    }

    public double[][] getArrayCopy() {
        double[][]A = new double[getRowDimension()][getColumnDimension()];
        for(int i = 0;i<getRowDimension();i++){
            for(int j=0;i<getColumnDimension();j++) {
                A[i][j]=j4k[i][j];
            }
        }
        return A;
    }

    public int getRowDimension() {
        return j4k.length;
    }

    public int getColumnDimension() {
        return j4k[0].length;
    }

    public double[] getColumnPackedCopy() {
        int n = getColumnDimension();
        int m = getRowDimension();
        double[] temp = new double[n * m];

        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; i++) {
                temp[index] = j4k[j][i];
                index++;
            }
        }
        return temp;
    }

    public double[] getRownPackedCopy() {
        int n = getColumnDimension();
        int m = getRowDimension();
        double[] temp = new double[n * m];

        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[index] = j4k[i][j];
                index++;
            }
        }
        return temp;
    }

    public double get(int i, int j) {
        if (i > getRowDimension() || j > getColumnDimension()) {
            throw new IndexOutOfBoundsException("Index is out of Bounds");
        }
        return j4k[i][j];
    }

    public void print(int w, int d) {
        String p = w + "." + d;
        for (int i = 0; i < getRowDimension() - 1; i++) {
            for (int j = 0; j < getColumnDimension() - 1; j++) {
                System.out.format("%d", j4k[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix identity(int m, int n) {
        double temp[][] = new double[m][n];
        for (int i = 0; i < getRowDimension()-1; i++) {
            for (int j = 0; j < getColumnDimension()-1; j++) {
                if (i == j) {
                    temp[i][j] = 1;
                } else {
                    temp[i][j] = 0;
                }
            }
        }
        Matrix mat = new Matrix(temp, m, n);
        return mat;
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < getColumnDimension()-1; i++) {
            for (int j = 0; j < getRowDimension()-1; j++) {
                sum += j4k[i][j];
            }
        }
        return sum;
    }

    public double[][] getArray() {
        return j4k;
    }

    public Matrix constructWithCopy(double[][] A) {
        int m = A.length;
        int n = A[0].length;
        Matrix B = new Matrix(m, n);
        double[][] C = B.getArray();
        for (int i = 0; i < getColumnDimension()-1; i++) {
            if (A[i].length != A[0].length) {
                throw new IllegalArgumentException("All rows must have the same length");
            }

            for (int j =0 ; j<A[0].length;j++){
                C[i][j] = A[i][j];

            }
        }
        return B;
    }

    public Matrix copy () {
        Matrix A = new Matrix(getRowDimension(),getColumnDimension());
        double[][] B = A.getArray();
        for(int i = 0; i<getRowDimension()-1;i++){
            for(int j = 0;j<getColumnDimension()-1;j++){
                B[i][j]=j4k[i][j];
            }
        }
        return A;
    }

    public Matrix transpose(){
        Matrix A = new Matrix(getRowDimension(),getColumnDimension());
        double B[][]= A.getArray();
        for(int i=0;i<getRowDimension()-1;i++){
            for (int j=0;j<getColumnDimension()-1;j++){
                B[i][j]=j4k[i][j];
            }
        }
        return A;
    }

}
