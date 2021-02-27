package com.mamba.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
     private Calculator calculator = new Calculator();

     @Test
     public void testSum() {
          System.out.println("check test if test :)");
          assertEquals(5, calculator.sum(2, 3));
          System.out.println("checked by AOL");
     }
}