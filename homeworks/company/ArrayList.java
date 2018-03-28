package com.company;

public class ArrayList<T> {

    private Object[] elementdata;
    private int elementsCount = 0;

    public ArrayList(int length) {
        this.elementdata = new Object[length];
    }

    public ArrayList() {
        this.elementdata = new Object[10];
    }

    public int getLength() {
        return elementsCount;

    }

    public boolean isEmpty() {
        return this.elementsCount == 0;
    }

    public boolean contains(Object o) {
        return true;
    }

    public void addElement(T element) {
        elementdata[elementsCount] = element;
        elementsCount++;
    }

    public void remove(int n) {
        for (int i = n; i < elementdata.length - 1; i++) {
            elementdata[i] = elementdata[i + 1];
        }
        elementsCount--;

    }

    public T getElementdata(int i) {
        return (T) elementdata[i];
    }

    public void copyArray() {
        Object[] second = new Object[elementdata.length + 5];
        for (int i = 0; i < elementdata.length; i++) {
            second[i] = elementdata[i];
        }
        elementdata = second;
    }
}
