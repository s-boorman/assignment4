package edu.bu.met.cs665;
/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: cusDataUSB.java
 * Description: This is the legacy interface concrete instantiation
 *
 */
public class cusDataUSB implements CustomerData_USB {
    /**
     * concrete method of printing customerID
     * @param customerID
     * @return
     */
    @Override
    public String printCustomer(int customerID) {
        System.out.println("USB method printing " + customerID);
        return ("USB method printing " + customerID);
    }
    /**
     * concrete method of getting customerID
     * @param customerID
     * @return
     */
    @Override
    public void getCustomer_USB(int customerID) {
        customerID = customerID;
    }
}
