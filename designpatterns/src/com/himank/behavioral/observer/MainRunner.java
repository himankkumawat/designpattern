package com.himank.behavioral.observer;

public class MainRunner {

    public static void main(String[] args) {
        IStockObservable iphoneObservable = new IphoneObservable();

        INotificationAlertObserver observer1 = new EmailObserver("abc1@gmail.com", iphoneObservable);
        INotificationAlertObserver observer2 = new EmailObserver("abc2@gmail.com", iphoneObservable);
        INotificationAlertObserver observer3 = new SmsObserver("987654321", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(100);

        IStockObservable pixelObservable = new PixelObservable();

        INotificationAlertObserver pixelObserver1 = new EmailObserver("xyz1@gmail.com", pixelObservable);
        INotificationAlertObserver pixelObserver2 = new EmailObserver("xyz1@gmail.com", pixelObservable);
        INotificationAlertObserver pixelObserver3 = new SmsObserver("123456789", pixelObservable);

        pixelObservable.add(pixelObserver1);
        pixelObservable.add(pixelObserver2);
        pixelObservable.add(pixelObserver3);

        pixelObservable.setStockCount(20);
    }
}
