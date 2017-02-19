/**
* @Date:   2017-02-16T09:46:52-05:00
* @Last modified time: 2017-02-19T11:27:57-05:00
*/



import Javatrix.*;

public class Testtrix {

    public static void main(String[] args) {
        ConstructorTest1();
        ConstructorTest2();
        ConstructorTest3();
    }

    public void ConstructorTest1(){
        double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
        Matrix A = new Matrix(vals);
    }

    public void ConstructorTest2(){
        double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
        Matrix A = new Matrix(vals);
        Matrix x = Matrix.random(3,1);
        Matrix b = A.times(x);
        b.print(9,4);
    }

    public void ConstructorTest3(){
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


}
