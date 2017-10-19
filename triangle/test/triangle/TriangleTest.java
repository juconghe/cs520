package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

    @Test
    public void test1() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test //Jucong test for INVALID
    public void test_invalid() {
      Triangle t = new Triangle();
      Type actual = Triangle.classify(-1,2,3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //Jucong test for EQUILATERAL
    public void test_equilateral() {
      Type actual = Triangle.classify(1,1,1);
      Type expected = EQUILATERAL;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_2() {
      Type actual = Triangle.classify(1,2,4);
      Type expected = INVALID;
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
