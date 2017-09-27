/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samya.junit;

import com.samya.testing.jenkinstesting.Numbers;
import org.junit.Test;
import junit.framework.TestCase;

/**
 *
 * @author SGhosh
 */
public class NumbersTest extends TestCase {
    
    @Test
	public void testSum(){
		assertEquals(10, new Numbers().sum(6, 4));
}
    
}
