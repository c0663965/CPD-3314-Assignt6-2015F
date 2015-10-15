/* 
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */ 

package cpd3314.assign5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314Assign5Test {

    public CPD3314Assign5Test() {
    }

    /**
     * Test of calculateRetail method, of class CPD3314Assign5.
     */
    @Test
    public void testCalculateRetailCase1() {
        double wholesale = 5.00;
        double markup = 100;
        double expected = 10.00;
        double result = CPD3314Assign5.calculateRetail(wholesale, markup);
        assertEquals("Testing if calculateRetail(wholesale, markup) produces accurate result.",
                result, expected, 0.0001);
    }

    /**
     * Test of calculateRetail method, of class CPD3314Assign5.
     */
    @Test
    public void testCalculateRetailCase2() {
        double wholesale = 5.00;
        double markup = 50;
        double expected = 7.50;
        double result = CPD3314Assign5.calculateRetail(wholesale, markup);
        assertEquals("Testing if calculateRetail(wholesale, markup) produces accurate result.",
                result, expected, 0.0001);
    }

    /**
     * Test of celsius method, of class CPD3314Assign5.
     */
    @Test
    public void testCelsius() {
        double fahrenheit = 32;
        double expected = 0.00;
        double result = CPD3314Assign5.celsius(fahrenheit);
        assertEquals("Testing if celsius(32) produces accurate result of zero.",
                result, expected, 0.0001);
    }

    /**
     * Test of celsius method, of class CPD3314Assign5.
     */
    @Test
    public void testCelsiusBoiling() {
        double fahrenheit = 212;
        double expected = 100.00;
        double result = CPD3314Assign5.celsius(fahrenheit);
        assertEquals("Testing if celsius(212) produces accurate result of 100.",
                result, expected, 0.0001);
    }
    
    /**
     * Test of distance method, of class CPD3314Assign5.
     */
    @Test
    public void testDistance() {
        double time = 5.00;
        double speed = 60.0;
        double expected = 300.00;
        double result = CPD3314Assign5.distance(time, speed);
        assertEquals("Testing if distance(5, 60) produces accurate result of 300.",
                result, expected, 0.0001);
    }
    
    /**
     * Test of distance method, of class CPD3314Assign5.
     */
    @Test
    public void testDistanceZero() {
        double time = 5.00;
        double speed = 0.0;
        double expected = 0.00;
        double result = CPD3314Assign5.distance(time, speed);
        assertEquals("Testing if distance(5, 0) produces accurate result of zero.",
                result, expected, 0.0001);
    }

    /**
     * Test of isPrime method, of class CPD3314Assign5.
     */
    @Test
    public void testIsPrimeCase1() {
        int input = 7;
        boolean expected = true;
        boolean result = CPD3314Assign5.isPrime(input);
        assertEquals("Testing if isPrime(7) produces accurate result of true.",
                result, expected);
    }

    /**
     * Test of isPrime method, of class CPD3314Assign5.
     */
    @Test
    public void testIsPrimeCase2() {
        int input = 6;
        boolean expected = false;
        boolean result = CPD3314Assign5.isPrime(input);
        assertEquals("Testing if isPrime(6) produces accurate result of false.",
                result, expected);
    }
    
    /**
     * Test of isEven method, of class CPD3314Assign5.
     */
    @Test
    public void testIsEvenCase1() {
        int input = 6;
        boolean expected = true;
        boolean result = CPD3314Assign5.isEven(input);
        assertEquals("Testing if isEven(6) produces accurate result of true.",
                result, expected);
    }

    /**
     * Test of isEven method, of class CPD3314Assign5.
     */
    @Test
    public void testIsEvenCase2() {
        int input = 7;
        boolean expected = false;
        boolean result = CPD3314Assign5.isEven(input);
        assertEquals("Testing if isEven(7) produces accurate result of false.",
                result, expected);
    }
}
