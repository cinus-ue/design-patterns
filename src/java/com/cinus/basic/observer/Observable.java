package com.cinus.basic.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Generic observer inspired by Java Generics and Collection by {@literal Naftalin & Wadler}
 *
 * @param <S> Subject
 * @param <O> Observer
 * @param <A> Argument type
 */
public abstract class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    protected List<O> observers;

    public Observable() {
        this.observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer) {
        this.observers.add(observer);
    }

    public void removeObserver(O observer) {
        this.observers.remove(observer);
    }

    /**
     * Notify observers
     */
    @SuppressWarnings("unchecked")
    public void notifyObservers(A argument) {
        for (O observer : observers) {
            observer.notify((S) this, argument);
        }
    }
}
