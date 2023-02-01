package com.nj.udemy.challenge.abstractclass;

public interface NodeList {

    abstract ListItem getRoot();
    abstract boolean addItem(ListItem item);
    abstract boolean removeItem(ListItem item);
    abstract void traverse(ListItem root);
}
