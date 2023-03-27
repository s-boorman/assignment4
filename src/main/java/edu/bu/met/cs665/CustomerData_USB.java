package edu.bu.met.cs665;
/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: CustomerData_USB.java
 * Description: This is the older interface that is to re-implemented with the adapter
 *
 */
public interface CustomerData_USB {
    /**
     * abstract method of printing customerID
     * @param customerID
     * @return
     */
    String printCustomer(int customerID);
    /**
     * abstract method of getting customerID
     * @param customerID
     * @return
     */
    void getCustomer_USB(int customerID);
}
