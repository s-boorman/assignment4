package edu.bu.met.cs665;

import junit.framework.TestCase;

public class cusDataHTTPSTest extends TestCase {

    public void testPrintCustomer() {
        cusDataHTTPS test = new cusDataHTTPS();
        assertEquals("HTTPS method of printing 12345", test.printCustomer(12345));
    }
}