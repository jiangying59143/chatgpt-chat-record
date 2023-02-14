package design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update();
}

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update() {
        observerState = "Observer is updated";
        System.out.println(observerState);
    }
}

class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.registerObserver(observer);
        subject.setSubjectState("New State");
    }
}
