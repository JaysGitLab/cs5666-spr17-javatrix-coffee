import static org.junit.Assert.*;
import org.junit.Test;

/**
@author desantisbm, coleej, wardj
@version alpha 
 */
public class Tests {

    
    /**
      *
      * Matrix(row, column) 
      * */ 
    @Test
    public void constructorTest1() {
        Matrix a = new Matrix(3, 3);
        assertEquals(0, a.sum(), 0);
        System.out.println("Constructor Test1: passed");
    }

    @Test
    /**
     * * Matrix(row, column, value) 
     * */
    public  void constructorTest2() {
        Matrix a = new Matrix(3, 3, 3);
        assertEquals(27, a.sum(), 0);
        System.out.println("Constructor Test2: passed"); 
    }

    @Test
    /**
     * Matrix(double[][])
     * */
    public void constructorTest3() {
        double[][] vals = {{1., 2., 3}, {4., 5., 6.}, {7., 8., 10.}};
        Matrix a = new Matrix(vals);
        assertEquals(46, a.sum(), 0);
        System.out.println("Constructor Test3: passed");
    }

    @Test
    /**
     * Matrix(double[][], int m, int n) TODO: 
     * */
    public void constructorTest4() {
        double[][] vals = {{1., 2., 3}, {4., 5., 6.}, {7., 8., 10.}};
        Matrix a = new Matrix(vals, 3, 4);
        assertEquals(46, a.sum(), 0);
        System.out.println("Constructor Test4: passed");
    }

    @Test
    /**
     * * Matrix(double[], rows) 
     * */
    public void constructorTest5() {
        double[] vals = {1., 2., 3., 4., 5., 6., 7., 8., 9., 10., 11., 12.};
        Matrix a = new Matrix(vals, 4);
        assertEquals(78, a.sum(), 0);
        System.out.println("Constructor Test5: passed");
    }

    @Test
    /**TestConstructWithCopy 
     * */
    public void testConstructWithCopy() {
        double[][] vals = {{1., 2., 3}, {4., 5., 6.}, {7., 8., 10.}};

        Matrix a = new Matrix(vals);
        Matrix b = a.constructWithCopy(vals);
        assertEquals(a.sum(), b.sum(), 0);
        System.out.println("ConstructWithCopy: Passed");
    }

    @Test
    /**TestCopy
     * */
    public void testCopy() {
        Matrix a = new Matrix(3, 3, 3);
        Matrix b = a.copy();
        assertEquals(a.sum(), b.sum(), 0);
        System.out.println("CopyTest: Passed"); 
    }

    @Test
    /**TestClone
     * */
    public void testClone() {
        Matrix a = new Matrix(3, 3, 3);
        Matrix b = a.clone();
        assertEquals(a, b);
        System.out.println("CopyClone: Passed");
    }

    @Test
    /**TestGetArray
     * */
    public void testGetArray() {
        double[][] vals = {{3., 3., 3}, {3., 3., 3.}, {3., 3., 3.}};
        Matrix a = new Matrix(3, 3, 3);
        double[][] ans = a.getArray();
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals.length; j++) {
                assertEquals(vals[i][j], ans[i][j], 0);
            }
        }
        System.out.println("GetArray: Passed"); 

    }

    @Test
    /**TestGetArrayCopy
     * */
    public void testGetArrayCopy() {
        double[][] vals = {{3., 3., 3}, {3., 3., 3.}, {3., 3., 3.}};
        Matrix a = new Matrix(vals);
        double[][] ans = a.getArray();
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals.length; j++) {
                assertEquals(vals[i][j], ans[i][j], 0);
            }
        }
	System.out.println("GetArray: Passed");
    }
	
    @Test
    public void getRowDimTest(){
        double[][] values = {{1.0,2.0}, {3.0,4.0}, {5.0, 6.0}};
        Matrix A = new Matrix(values);
        assert A.getRowDimension() == 3 : "row dimensions incorrect";
    }

    @Test
    public void getColDimTest(){
        double[][] values = {{1.0,2.0}, {3.0,4.0}, {5.0, 6.0}};
        Matrix A = new Matrix(values);
        assert A.getColumnDimension() == 2 : "col dimensions incorrect";
    }
		
    @Test
    public void getTest(){
        double[][] testVals = {{1.0,2.0}, {3.0, 4.0}};
	    Matrix check = new Matrix(testVals);
    	assert check.get(1, 0) == 3.0 : "get functioning improperly";
	    System.out.println("get: Passed");
    }
        
}
