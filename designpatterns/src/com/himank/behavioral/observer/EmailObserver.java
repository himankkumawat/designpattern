package com.himank.behavioral.observer;

public class EmailObserver implements INotificationAlertObserver {

    private String email;

    private IStockObservable observable;

    public EmailObserver(String email, IStockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sending email on emailId: " + this.email + " for observable: " + observable.getClass().getSimpleName() + " New stock : " + observable.getStockCount());
    }
}
