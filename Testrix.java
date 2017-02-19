package coffee;
import static org.junit.Assert.*;
import org.junit.Test;

public class Testrix {


    @Test
        /* Matrix(row, column) */ 
        public void ConstructorTest1(){
            Matrix A = new Matrix(3, 3);
            assertEquals(0, A.sum(), 0);
            System.out.println("Constructor Test1: passed");
        }

    @Test
        /* Matrix(row, column, value) */
        public static void ConstructorTest2(){
            Matrix A = new Matrix(3, 3, 3);
            assertEquals(27, A.sum(), 0);
            System.out.println("Constructor Test2: passed"); 
        }

    @Test
        /* Matrix(double[][])*/
        public void ConstructorTest3(){
            double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
            Matrix A = new Matrix(vals);
            assertEquals(45, A.sum(), 0);
            System.out.println("Constructor Test3: passed");
        }

    @Test
        /* Matrix(double[][], int m, int n) TODO: */
        public void ConstructorTest4(){
            double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
            Matrix A = new Matrix(vals, 3, 4);
            assertEquals(45, A.sum(), 0);
            System.out.println("Constructor Test4: passed");
        }

    @Test
        /* Matrix(double[], rows) */
        public void Constructor5(){
            double[] vals = {1.,2.,3.,4.,5.,6.,7.,8.,10.,11.,12.,13.};
            Matrix A= new Matrix (vals, 4);
            assertEquals(91, A.sum(), 0);
            System.out.println("Constructor Test5: passed");
        }

    @Test
        public void TestConstructWithCopy(){
            double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};

            Matrix A = new Matrix(vals);
            Matrix B = A.constructWithCopy(vals);
            assertEquals(A.sum(), B.sum(),0);
            System.out.println("ConstructWithCopy: Passed");
        }
    @Test
        public void TestCopy(){
            Matrix A = new Matrix(3 ,3 ,3);
            Matrix B = A.copy();
            A = new Matrix(3, 3, 4);
            assertEquals(A.sum(), B.sum(), 0);
            System.out.println("CopyTest: Passed"); 
        }
    @Test
        public void TestClone(){//TODO
            Matrix A = new Matrix(3 ,3 ,3);
            Matrix B = A.clone();
            A = new Matrix(3, 3, 4);
            assertEquals(A.sum(), B.sum(), 0);
            System.out.println("CopyClone: Passed");
        }
    @Test
        public void TestGetArray(){
            double[][] vals = {{3.,3.,3},{3.,3.,3.},{3.,3.,3.}};
            Matrix A = new Matrix(3,3,3);
            double [][] ans = A.getArray();
            for(int i = 0; i < vals.length; i++){
                for(int j = 0; j < vals.length; j++){
                    assertEquals(vals[i][j], ans[i][j], 0);
                }
            }
            System.out.println("GetArray: Passed"); 

        }
    @Test
        public void TestGetArray(){//TODO: get array Copy()
            double[][] vals = {{3.,3.,3},{3.,3.,3.},{3.,3.,3.}};
            Matrix A = new Matrix(3,3,3);
            double [][] ans = A.getArray();
            for(int i = 0; i < vals.length; i++){
                for(int j = 0; j < vals.length; j++){
                    assertEquals(vals[i][j], ans[i][j], 0);
                }
            }
            System.out.println("GetArray: Passed");

        }


    /*
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

