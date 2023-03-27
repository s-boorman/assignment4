package edu.bu.met.cs665;

public class CustomerData_Adapter implements CustomerData_USB {

    private CustomerData_HTTPS updatedWay;

    public CustomerData_Adapter(CustomerData_HTTPS updatedWay) {

        this.updatedWay = updatedWay;
    }

    @Override
    public String printCustomer(int customerID) {
        return updatedWay.printCustomer(customerID);
    }

    @Override
    public void getCustomer_USB(int customerID) {
        updatedWay.getCustomer_HTTPS(customerID);
    }
}
