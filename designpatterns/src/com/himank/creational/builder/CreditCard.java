package com.himank.creational.builder;

public class CreditCard {

    private String customerName;

    private String cardNumber;

    private int expMonth;

    private int expYear;

    private int cvv;

    private String issuerCompany;

    private String issuerBank;

    public CreditCard(CreditCardBuilder builder) {
        this.customerName = builder.customerName;
        this.cardNumber = builder.cardNumber;
        this.expMonth = builder.expMonth;
        this.expYear = builder.expYear;
        this.cvv = builder.cvv;
        this.issuerCompany = builder.issuerCompany;
        this.issuerBank = builder.issuerBank;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getExpMonth() {
        return this.expMonth;
    }

    public int getExpYear() {
        return this.expYear;
    }

    public int getCvv() {
        return this.cvv;
    }

    public String getIssuerCompany() {
        return this.issuerCompany;
    }

    public String getIssuerBank() {
        return this.issuerBank;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "customerName='" + customerName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expMonth=" + expMonth +
                ", expYear=" + expYear +
                ", cvv=" + cvv +
                ", issuerCompany='" + issuerCompany + '\'' +
                ", issuerBank='" + issuerBank + '\'' +
                '}';
    }

    public static class CreditCardBuilder {

        private String customerName;

        private String cardNumber;

        private int expMonth;

        private int expYear;

        private int cvv;

        private String issuerCompany;

        private String issuerBank;

        public CreditCard build() {
            return new CreditCard(this);
        }

        public CreditCardBuilder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CreditCardBuilder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public CreditCardBuilder setExpMonth(int expMonth) {
            this.expMonth = expMonth;
            return this;
        }

        public CreditCardBuilder setExpYear(int expYear) {
            this.expYear = expYear;
            return this;
        }

        public CreditCardBuilder setCvv(int cvv) {
            this.cvv = cvv;
            return this;
        }

        public CreditCardBuilder setIssuerCompany(String issuerCompany) {
            this.issuerCompany = issuerCompany;
            return this;
        }

        public CreditCardBuilder setIssuerBank(String issuerBank) {
            this.issuerBank = issuerBank;
            return this;
        }
    }
}
