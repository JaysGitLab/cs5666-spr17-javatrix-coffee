/**
* @Date:   2017-02-16T09:46:52-05:00
* @Last modified time: 2017-02-19T11:27:54-05:00
*/



package coffee;
public class Matrix{
    private double[][] j4k;
    private int row;
    private int column;

    public Matrix(double[][] A){
        j4k = A;
        row= j4k.length;
        column = j4k[0].length;
        for (int i = 0; i < j4k[0].length;i++) {
            if (row != j4k[i].length) {
                throw new IllegalArgumentException("All rows must have the same length");}
        }

    }

    public Matrix (double[][] A, int m, int n) {
        //A = new double[m][n];
        j4k=A;
        row=m;
        column=n;

    }

    public Matrix (double[] vals, int m) {
        if (vals.length % m != 0){
            throw new IllegalArgumentException("length of array must be divisbile by second variable");}
        int n = vals.length / m;
        int k =0;
        double[][] A = new double[m][n];
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++)
                A[m][n] = vals[k];
                k++;
        }
        row=m;
        column=n;
    }

    public Matrix(int m, int n){
        double[][] A = new double[m][n];
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++)
                A[m][n] = 0;
        }
        row=m;
        column=n;
    }

    public Matrix (int m, int n, double s){
        double[][] A = new double[m][n];
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++)
                A[m][n] = s;
        }
        row=m;
        column=n;
    }

    public double[][] getArrayCopy(){
        return j4k;
    }
    public int getRowDimension() {
        return row;
    }
    public int getColumnDimension() {
        return column;
    }
    public double[] getColumnPackedCopy(){
        int n = getColumnDimension();
        int m = getRowDimension();
        double[] temp = new double [n*m];

        int index = 0;
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; i ++) {
                temp[index] = j4k[j][i];
                index++;
            }
        }
        return temp;
    }
    public double[] getRownPackedCopy(){
        int n = getColumnDimension();
        int m = getRowDimension();
        double[] temp = new double [n*m];

        int index = 0;
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++) {
                temp[index] = j4k[i][j];
                index++;
            }
        }
        return temp;
    }
    public double get(int i, int j){
        if (i > getRowDimension() || j > getColumnDimension()){
            throw new IndexOutOfBoundsException("Index is out of Bounds");}
        return j4k[i][j];
    }

    public void print(int w, int d){
        String p = w + "." + d;
        for(int i = 0; i < getRowDimension(); i ++){
            for(int j = 0; j < getColumnDimension(); j ++) {
                System.out.format("p%d" , j4k[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix identity(int m, int n){
        double temp[][] = new double[m][n];
        for(int i = 0; i < getRowDimension(); i ++){
            for(int j = 0; j < getColumnDimension(); j ++) {
                if(i==j) {
                    temp[i][j] = 1;
                }
                else {
                    temp[i][j] = 0;
                }
            }
        }
        Matrix mat = new Matrix(temp,m,n);
        return mat;
    }
    public double sum(){
        double sum=0;
        for (int i=0 ; i<column; i++){
            for (int j = 0 ; j< row;j++){
                sum+=j4k[i][j];
            }
        }
        return sum;
    }

}
