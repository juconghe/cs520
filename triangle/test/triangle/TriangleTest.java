package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

    @Test //Jucong test for INVALID
    public void test_invalid() {
      Triangle t = new Triangle();
      Type actual = Triangle.classify(-1,2,3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_2() {
      Type actual = Triangle.classify(1,2,4);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID
    public void test_invalid_3() {
      Type actual = Triangle.classify(2,-1,3);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test  //Jucong test for INVALID
    public void test_invalid_4() {
      Type actual = Triangle.classify(2,3,-1);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_5() {
      Type actual = Triangle.classify(1,5,4);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_6() {
      Type actual = Triangle.classify(5,1,4);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_7() {
      Type actual = Triangle.classify(2,100,2);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_8() {
      Type actual = Triangle.classify(100,2,2);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for EQUILATERAL
    public void test_equilateral() {
      Type actual = Triangle.classify(1,1,1);
      Type expected = EQUILATERAL;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for SCALENE
    public void test_scalene() {
      Type actual = Triangle.classify(2,3,4);
      Type expected = SCALENE;
      assertEquals(actual,expected);
    }

    @Test // Jucong test for ISOSCELES
    public void test_isosceles_1() {
      Type actual = Triangle.classify(1,2,2);
      Type expected = ISOSCELES;
      assertEquals(actual,expected);
    }

    @Test // Jucong test for ISOSCELES
    public void test_isosceles_2() {
      Type actual = Triangle.classify(2,1,2);
      Type expected = ISOSCELES;
      assertEquals(actual,expected);
    }

    @Test // Jucong test for ISOSCELES
    public void test_isosceles_3() {
      Type actual = Triangle.classify(2,2,1);
      Type expected = ISOSCELES;
      assertEquals(actual,expected);
    }

    @Test // Jucong test for ISOSCELES
    public void test_isosceles_4() {
      Type actual = Triangle.classify(2,2,100);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

}
