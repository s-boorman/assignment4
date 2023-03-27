package edu.bu.met.cs665;

/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: CustomerData_Adapter.java
 * Description: This is where the adapter magic happens by taking two similar but different interfaces and allowing
 * the client to utilize the functionality of both in one interface
 */
public class CustomerData_Adapter implements CustomerData_USB {

    private CustomerData_HTTPS updatedWay;

    public CustomerData_Adapter(CustomerData_HTTPS updatedWay) {

        this.updatedWay = updatedWay;
    }

    /**
     * adapting old method with new method
     * @param customerID
     * @return the CustomerData_HTTPS method of print customerID
     */
    @Override
    public String printCustomer(int customerID) {
        return updatedWay.printCustomer(customerID);
    }

    /**
     * adapts the old method of getCustomer_USB with the functionality of the newer method
     * @param customerID
     */
    @Override
    public void getCustomer_USB(int customerID) {
        updatedWay.getCustomer_HTTPS(customerID);
    }
}
