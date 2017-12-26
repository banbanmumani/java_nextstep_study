package chap2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    private Calc calc = null;

    @Before
    public void setup() {
        calc = new Calc();
    }

    @Test
    public void test01() {
        // given
        String param = " ";

        // when
        int anwer = calc.run(param);

        // then
        assertEquals(anwer, 0);
    }

    @Test
    public void test02() {
        // given
        String param = "1,2";

        // when
        int answer = calc.run(param);

        // then
        assertEquals(answer, 3);
    }

    @Test
    public void test03() {
        // given
        String param = "1,2,3";

        // when
        int answer = calc.run(param);

        // then
        assertEquals(answer, 6);
    }

    @Test
    public void test04() {
        // given
        String param = "1,2:3";

        // when
        int answer = calc.run(param);

        // then
        assertEquals(answer, 6);
    }

    @Test
    public void test05() {
        // given
        String param = "//;\n1;2;3";

        // when
        int anwer = calc.run(param);

        // then
        assertEquals(anwer, 6);
    }

    @Test(expected = RuntimeException.class)
    public void test06() {
        // given
        String param = "-1,-3";

        // when
        int answer = calc.run(param);

        // then
        assertEquals(answer, 6);
    }
}
