package lesson06.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.slf4j.LoggerFactory;

public class Test01 extends BaseTest {

    private static Page01 gCalc;
    private final String q = "калькулятор";

    @BeforeAll
    public static void beforeAll() {
        gCalc = new Page01(driver);
        log = LoggerFactory.getLogger(Page01.class);
    }

    @BeforeEach
    public void beforeTest() {
        gCalc.gLink();
    }

    @Test
    public void test() {
        gCalc.gReq(q);
        gCalc.onePlusThree();
        assertEquals("4", gCalc.getRes());
        log.info("1+3=4");

        gCalc.gReq(q);
        gCalc.sixMultipleNine();
        assertEquals("54", gCalc.getRes());
        log.info("6*9=54");

        gCalc.gReq(q);
        gCalc.eightDivFour();
        assertEquals("2", gCalc.getRes());
        log.info("8/4=2");

        gCalc.gReq(q);
        gCalc.eightMinusTwo();
        assertEquals("6", gCalc.getRes());
        log.info("8-4=6");
    }
}