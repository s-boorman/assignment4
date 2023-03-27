package edu.bu.met.cs665;

import junit.framework.TestCase;

public class CustomerData_AdapterTest extends TestCase {

    public void testPrintCustomer() {
        cusDataHTTPS testVar = new cusDataHTTPS();
        CustomerData_Adapter test = new CustomerData_Adapter(testVar);
        assertEquals("HTTPS method of printing 12345", test.printCustomer(12345));
    }
}