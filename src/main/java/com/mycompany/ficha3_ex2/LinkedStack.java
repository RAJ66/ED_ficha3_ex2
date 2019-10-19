/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha3_ex2;

/**
 *
 * @author vitor
 */
public class LinkedStack<T> implements StackADT<T> {

    private int count;
    private LinearNode<T> head;

    public LinkedStack() {
        this.count = 0;
        this.head = null;
    }

    @Override
    public void push(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);
        if (this.count == 0) {
            this.head = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;

        }
        this.count++;
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if (this.count == 0) {
            throw new EmptyCollectionException("nao tem");
        } else {
            LinearNode<T> current = this.head;
            this.head = this.head.getNext();
            current.setNext(null);
            return current.getElement();
        }
    }

    @Override
    public T peek() throws EmptyCollectionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nHead: ");
        str.append(this.head.getElement());
        str.append(" Tamanho:");
        str.append(this.count);
        str.append("\n");

        LinearNode<T> current = this.head;
        while (current != null) {
            str.append(current.getElement());
            str.append("//");
            current = current.getNext();
        }

        return str.toString();
    }

}
