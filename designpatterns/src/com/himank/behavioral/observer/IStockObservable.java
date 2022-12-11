package com.himank.behavioral.observer;

public interface IStockObservable {

    void add(INotificationAlertObserver observer);

    void remove(INotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();
}
