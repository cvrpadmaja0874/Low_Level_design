package org.iare.cdc.Basics.OOPS;

public class Client {
    public static void main(String args[]){
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("CVRPDebitCard", new DebitCard("1234","CVRPDebitCard"));
        ps.addPaymentMethod("CVRP-UPI", new UPI("CVRP@upi"));
        //ps.addPaymentMethod("CVRP-Wallet", new Wallet());
        ps.makePayment("CVRP-UPI");
        ps.makePayment("CVRPDebitCard");
        //ps.makePayment("CVRP-Wallet");
        ps.addPaymentMethod("CVRPCreditCard", new CreditCard("7869", "CVRP_CreditCard"));
        ps.makePayment("CVRPCreditCard");
    }
}
















