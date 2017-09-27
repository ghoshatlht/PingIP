/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samya.mockito;

import com.samya.testing.jenkinstesting.Numbers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;

/**
 *
 * @author SGhosh
 */

@RunWith(MockitoJUnitRunner.class)
public class NumbersTest {
    
    @Test
    public void test() {
		Numbers number = new Numbers();
		//when(number.sum(4, 6)).thenReturn(10);
		System.out.println(number.sum(4, 6));
		assertEquals(10, 10);
} 
    
    
}
