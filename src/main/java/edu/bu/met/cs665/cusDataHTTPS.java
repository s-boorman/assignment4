package edu.bu.met.cs665;

public class cusDataHTTPS implements CustomerData_HTTPS{
    @Override
    public String printCustomer(int customerID) {
        System.out.println("HTTPS method of printing " + customerID);
        return "HTTPS method of printing " + customerID;
    }

    @Override
    public void getCustomer_HTTPS(int customerID) {
        customerID = customerID;
    }
}
