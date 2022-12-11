package com.himank.behavioral.observer;

public class SmsObserver implements INotificationAlertObserver {

    private String phoneNumber;

    private IStockObservable observable;

    public SmsObserver(String phoneNumber, IStockObservable observable) {
        this.phoneNumber = phoneNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sending sms to phoneNumber: " + this.phoneNumber + " for observable: " + observable.getClass().getSimpleName() + " New stock : " + observable.getStockCount());
    }
}
