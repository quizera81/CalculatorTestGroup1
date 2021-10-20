/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class Calculator1Test {

    Calculator calc = new Calculator();

    public Calculator1Test() {
    }

    @Test
    public void testSum() {

        int sum = calc.sum(2, 4);
        assertEquals(sum, 6);

    }

    @Test
    public void testdiff() {

        int difference = calc.difference(6, 1);
        assertEquals(difference, 5);

    }

    @Test
    public void testprod() {

        int product = calc.product(5, 6);
        assertEquals(product, 30);

    }

    @Test
    public void testquot() {

        int quotient = calc.quotient(60, 2);
        assertEquals(quotient, 30);
    }

}
