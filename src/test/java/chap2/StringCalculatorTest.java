package chap2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = null;

    @Before
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void test01() {
        // given
        String param = " ";

        // when
        int anwer = stringCalculator.add(param);

        // then
        assertEquals(anwer, 0);
    }

    @Test
    public void test02() {
        // given
        String param = "1,2";

        // when
        int answer = stringCalculator.add(param);

        // then
        assertEquals(answer, 3);
    }

    @Test
    public void test03() {
        // given
        String param = "1,2,3";

        // when
        int answer = stringCalculator.add(param);

        // then
        assertEquals(answer, 6);
    }

    @Test
    public void test04() {
        // given
        String param = "1,2:3";

        // when
        int answer = stringCalculator.add(param);

        // then
        assertEquals(answer, 6);
    }

    @Test
    public void test05() {
        // given
        String param = "//;\n1;2;3";

        // when
        int anwer = stringCalculator.add(param);

        // then
        assertEquals(anwer, 6);
    }

    @Test(expected = RuntimeException.class)
    public void test06() {
        // given
        String param = "-1,-3";

        // when
        int answer = stringCalculator.add(param);

        // then
        assertEquals(answer, 6);
    }
}
