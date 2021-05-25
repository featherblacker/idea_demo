/*
 * Copyright (c) 2021
 * @Author: Qiguang Chu
 * @Email: chuqiguang@sina.com
 * @LastModified:2021-05-25T21:23
 */

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, "Add");
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn1When2Minus1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(2, 1, "Minus");
        int expectResult = 1;
        Assert.assertEquals(expectResult, actualResult);
    }
}

