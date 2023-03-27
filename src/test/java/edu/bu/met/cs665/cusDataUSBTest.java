package edu.bu.met.cs665;

import junit.framework.TestCase;

public class cusDataUSBTest extends TestCase {

    public void testPrintCustomer() {
        cusDataUSB test = new cusDataUSB();
        assertEquals("USB method printing 12345", test.printCustomer(12345));
    }

    public void testGetCustomer_USB() {
    }
}