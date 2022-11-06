package com.himank.creational;

import java.io.Serializable;

public class AirTicketSingleton implements Cloneable, Serializable {

    private static final long serialVersionUID = 1234L;
    private static boolean flag = false;

    private static AirTicketSingleton INSTANCE;

    private AirTicketSingleton() {
        if(flag)                                                            // soln for reflection API
            throw new IllegalArgumentException("Object already created.");
        flag = true;
        System.out.println("Zero param constructor.");
    }

    public static AirTicketSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (AirTicketSingleton.class) {                       //  soln for multi threading.
                if (INSTANCE == null)
                    INSTANCE = new AirTicketSingleton();
            }
        }
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {               //  soln for cloning
        throw new CloneNotSupportedException("Clone not supported for this class.");
    }

    public Object readResolve() {                                           // soln for serialization
        throw new IllegalArgumentException("Deserialization not supported.");
    }
}
