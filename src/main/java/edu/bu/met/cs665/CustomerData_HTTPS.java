package edu.bu.met.cs665;


/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: CustomerData_HTTPS.java
 * Description: This is the newer interface that is preferred over CustomerData_USB
 *
 */
public interface CustomerData_HTTPS {
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
    void getCustomer_HTTPS(int customerID);
}
