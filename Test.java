package coffee;
import static org.junit.Assert.*;
import org.junit.Test;

public class Test {

    public static void main(String[] args) {
        ConstructorTest1();
      //  ConstructorTest2();
      //  ConstructorTest3();
    }
    
    public static void ConstructorTest1(){
        double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
        Matrix A = new Matrix(vals);
        assertEquals(45, A.sum(A));
    }
/*
    public static void ConstructorTest2(){
        double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
        Matrix A = new Matrix(vals);
        Matrix x = Matrix.random(3,1);
        Matrix b = A.times(x);
        b.print(9,4);
    }

    public static void ConstructorTest3(){
        double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
        Matrix A = new Matrix(vals);
        Matrix x = Matrix.random(3,1);
        Matrix b = A.times(x);
        A.print(9,4);
        System.out.println("x");
        x.print(9,4);
        System.out.println("=");
        b.print(9,4);
    }

*/
}

