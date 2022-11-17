package com.himank.creational.builder;

public class BuilderRunner {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard.CreditCardBuilder()
                .setCardNumber("123456789012")
                .setCustomerName("Himank")
                .setExpMonth(11)
                .setExpYear(2023)
                .setCvv(123)
                .setIssuerBank("RBI")
                .setIssuerCompany("VISA")
                .build();

        System.out.println(creditCard);
    }
}
