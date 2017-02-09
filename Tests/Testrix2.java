//Solve a linear System
import javatrix;

public class Testrix2.java {
    public static void main(String[] args) {
        double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
        Matrix A = new Matrix(vals);
        Matrix x = Matrix.random(3,1);
        Matrix b = A.times(x);
        b.print(9,4);
    }
}
