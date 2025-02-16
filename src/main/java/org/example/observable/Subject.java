package org.example.observable;

import org.example.observer.Observer;

public interface Subject {
    void notifyObservers();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
