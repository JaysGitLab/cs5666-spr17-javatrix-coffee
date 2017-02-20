
/**
 * @Date:   2017-02-16T09:46:52-05:00
 * @Last modified time: 2017-02-19T13:29:31-05:00
 */

public class Matrix {
    private double[][] j4k;

    public Matrix(double[][] a) {
        int numCols = a.length;
        for (int i = 0; i < numCols; i++) {
            if (numCols != a[i].length) {
                throw new IllegalArgumentException("All rows must have the same length");
            }
        }
        j4k = a;
    }

    public Matrix(double[][] a, int m, int n) {
        //A = new double[m][n];
        j4k = new double[m][n];
        j4k = a;
    }

    public Matrix(double[] vals, int m) {
        if (vals.length % m != 0) {
            throw new IllegalArgumentException("length of array must be divisbile by second variable");
        }
        int n = vals.length / m;
        int k = 0;
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {
                a[i][j] = vals[k];
                k++;
            }
        }

        j4k = a;
    }

    public Matrix(int m, int n) {
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }
        j4k = a;
    }

    public Matrix(int m, int n, double s) {
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s;
            }
        }
        j4k = a;
    }

    public double[][] getArrayCopy() {
        double[][]a = new double[getRowDimension()][getColumnDimension()]; 
        for (int i = 0; i < getRowDimension(); i++) {
            for (int j = 0; i < getColumnDimension(); j++) {
                a[i][j] = j4k[i][j];
            }
        }
        return a;
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
        for (int i = 0; i < getRowDimension(); i++) {
            for (int j = 0; j < getColumnDimension(); j++) {
                if (i == j) {
                    temp[i][j] = 1;
                } 
                else {
                    temp[i][j] = 0;
                }
            }
        }
        Matrix mat = new Matrix(temp, m, n);
        return mat;
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i <  getRowDimension(); i++) {
            for (int j = 0; j < getColumnDimension(); j++) {
                sum += j4k[i][j];
            }
        }
        return sum;
    }

    public double[][] getArray() {
        return j4k;
    }

    public Matrix constructWithCopy(double[][] a) {
        int m = a.length;
        int n = a[0].length;
        Matrix b = new Matrix(m, n);
        double[][] c = b.getArray();
        for (int i = 0; i < getColumnDimension(); i++) {
            if (a[i].length != a[0].length) {
                throw new IllegalArgumentException("All rows must have the same length");
            }

            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j];
            }
        }
        return b;
    }

    public Matrix copy() {
        Matrix a = new Matrix(getRowDimension(), getColumnDimension());
        double[][] b = a.getArray();
        for (int i = 0; i < getRowDimension(); i++) {
            for (int j = 0; j < getColumnDimension(); j++) { 
                b[i][j] = j4k[i][j];
            }
        }
        return this;
    }
    public Matrix clone() {
        return this;
    }

    public Matrix transpose() {
        Matrix a = new Matrix(getRowDimension(), getColumnDimension());
        double b[][] = a.getArray();
        for (int i = 0; i < getRowDimension(); i++) {
            for (int j = 0; j < getColumnDimension(); j++) {
                b[i][j] = j4k[i][j];
            }
        }
        return a;
    }
}
