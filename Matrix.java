
public class Matrix{
    private double[][] j4k;
    public Matrix(double[][] A)
    {
        j4k = A;
    }

    public Matrix(double[][] A, int m, int n){
        A = new double[m][n];
    }

    public Matrix(double[] vals, int m){
        if (vals.length % m != 0){return;}

        int n = vals.length / m;
        int k =0;
        double[][] A = new double[m][n];
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; i ++);
            A[m][n] = vals[k];
            k++;
        }
    }

    public Matrix(int m, int n){
        double[][] A = new double[m][n];
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; i ++)
                A[m][n] = 0;
        }

    }

    public Matrix(int m, int n, double s){
        double[][] A = new double[m][n];
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; i ++)
                A[m][n] = s;
        }
    }
}

