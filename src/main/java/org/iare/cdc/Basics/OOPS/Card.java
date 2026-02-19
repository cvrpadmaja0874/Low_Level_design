package org.iare.cdc.Basics.OOPS;

abstract public class Card implements PaymentMethod{
    private String cardNo;
    private String userName;

    public Card(String cardNo, String userName){
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getCardNo(){
        return this.cardNo;
    }

    public String getUserName(){
        return this.userName;
    }

}
