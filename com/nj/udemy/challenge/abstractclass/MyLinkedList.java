package com.nj.udemy.challenge.abstractclass;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    public boolean addItem(ListItem newitem) {
        if (root == null) {
            System.out.println("List is empty");
            this.root = newitem;
            return true;
        }

        ListItem currItem = this.root;
        while (currItem.rightLink != null) {
            int comparision = currItem.compareTo(newitem);
            if (comparision < 0) {
                //newItem is greater, move right
                if (currItem.next() != null) {
                    currItem = currItem.next();
                } else {
                    //there is no next , so insert at teh end of list
                    currItem.setNext(newitem).setPrevious(currItem);
                    return true;
                }
            } else if (comparision > 0) {
                //new item is less , inset before
                if (currItem.previous() != null) {
                    currItem.previous().setNext(newitem).setPrevious(currItem.previous());
                    newitem.setNext(currItem).setPrevious(newitem);


                } else {
                    //the node witha previous is teh root
                    newitem.setNext(this.root).setPrevious(newitem);
                    this.root = newitem;
                }

            } else {
                //equal
                System.out.println((newitem.getValue() + " is already present , not added. "));
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item == null) {
            System.out.println("The list if empty");
        }else {
            System.out.println("");
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparision = currentItem.compareTo(item);
            if (comparision == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparision < 0) {
                currentItem = currentItem.next();
            } else { // comparision > 0
                // we are at an item greater than the one to be deleted so the item is not in the list
                return false;
            }
        }
        //We have reached the end of the list without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
