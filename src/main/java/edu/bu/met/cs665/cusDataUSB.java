package edu.bu.met.cs665;

public class cusDataUSB implements CustomerData_USB {
    @Override
    public String printCustomer(int customerID) {
        System.out.println("USB method printing " + customerID);
        return ("USB method printing " + customerID);
    }

    @Override
    public void getCustomer_USB(int customerID) {
        customerID = customerID;
    }
}
