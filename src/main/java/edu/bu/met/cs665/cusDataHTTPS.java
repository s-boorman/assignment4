package edu.bu.met.cs665;

/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: cusDataHTTPS.java
 * Description: This is the newer interface concrete instantiation
 *
 */

public class cusDataHTTPS implements CustomerData_HTTPS{
    /**
     * concrete method of printing customerID
     * @param customerID
     * @return
     */
    @Override
    public String printCustomer(int customerID) {
        System.out.println("HTTPS method of printing " + customerID);
        return "HTTPS method of printing " + customerID;
    }
    /**
     * concrete method of getting customerID
     * @param customerID
     * @return
     */
    @Override
    public void getCustomer_HTTPS(int customerID) {
        customerID = customerID;
    }
}
