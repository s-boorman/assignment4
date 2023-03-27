package edu.bu.met.cs665;

public class CustomerData_Adapter implements CustomerData_USB {

    private CustomerData_USB cusDataUSB;

    public CustomerData_Adapter(CustomerData_USB cusDataUSB) {
        this.cusDataUSB = cusDataUSB;
    }

    @Override
    public void printCustomer(int customerID) {

    }

    @Override
    public void getCustomer_USB(int customerID) {

    }
}
