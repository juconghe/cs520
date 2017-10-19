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

    @Test
    public void testInvalid() {
      Type actual = Triangle.classify(0, 0, 0);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test
    public void testInvalid2() {
      Type actual = Triangle.classify(1, 0, 0);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test
    public void testInvalid3() {
      Type actual = Triangle.classify(1, 1, 0);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test
    public void test4() {
      Type actual = Triangle.classify(3, 3, 4);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void test5() {
      Type actual = Triangle.classify(3, 4, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void test6() {
      Type actual = Triangle.classify(4, 3, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void test7() {
      Type actual = Triangle.classify(3, 1, 6);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test
    public void test8() {
      Type actual = Triangle.classify(3, 6, 1);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test
    public void test9() {
      Type actual = Triangle.classify(6, 1, 3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test
    public void test10() {
      Type actual = Triangle.classify(3, 5, 6);
      Type expected = SCALENE;
      assertEquals(actual, expected);
    }

    @Test
    public void test11() {
      Type actual = Triangle.classify(3, 6, 5);
      Type expected = SCALENE;
      assertEquals(actual, expected);
    }

    @Test
    public void test12() {
      Type actual = Triangle.classify(6, 3, 5);
      Type expected = SCALENE;
      assertEquals(actual, expected);
    }

    @Test
    public void test13() {
      Type actual = Triangle.classify(3, 3, 5);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void test14() {
      Type actual = Triangle.classify(3, 3, 10);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void test15() {
      Type actual = Triangle.classify(3, 1, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void test16() {
      Type actual = Triangle.classify(3, 7, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void test17() {
      Type actual = Triangle.classify(7, 3, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void test18() {
      Type actual = Triangle.classify(1, 3, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test
    public void testDefaultConstructor() {
      Triangle t = new Triangle();
    }
}
