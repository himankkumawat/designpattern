package com.himank.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PixelObservable implements IStockObservable {

    private List<INotificationAlertObserver> observers = new ArrayList<>();

    private int currentStock = 0;

    @Override
    public void add(INotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(INotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (INotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(currentStock == 0) {
            currentStock += newStockAdded;
            notifySubscribers();
            return;
        }
        currentStock += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return currentStock;
    }
}
