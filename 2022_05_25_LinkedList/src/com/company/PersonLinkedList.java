package com.company;

import org.jetbrains.annotations.NotNull;

public class PersonLinkedList {
    int size = 0;
    Node first = null;
    Node end = null;


    public void add(Person p) {
        if (first == null) {
            Node newNode = new Node(p, null, null);
            first = newNode;
            end = newNode;

        } else {
            Node newNode = new Node(p, end, null);
            end.next = newNode;
            end = newNode;
        }
        size++;

    }

    public int size() {
        return size;
        //геттер для size
    }

    public void print() {

        Node current = first;
        while (current != null) {
            System.out.println(current.person);
            current = current.next;
        }

    }

    public Person get(int index) {
        int count = 0;
        Node current = first;
        while (count < index) {
            current = current.next;
            count++;
        }
        return current.person;
    }

    public void remove(int index) {
        int count = 0;
        Node current = first;

        if (index == 0) {
            first = current.next;
            current.next.prev = null;
        } else {
            while (count < index) {
                current = current.next;
                count++;
            }
            if (index == size - 1) {
                end = current.prev;
                current.prev.next = null;
            } else {
                current.next.prev=current.prev;
                current.prev.next=current.next;

            }
        }
    }

    public void addInIndex(Person p, int index) {
        if (first == null) {
            Node newNode = new Node(p, null, null);
            first = newNode;
            end = newNode;

        } else {
            if (index == 0) {
                Node newNode = new Node(p, null, first);
                first.prev = newNode;
                first = newNode;
            } else {

                if (index == size - 1) {
                    Node newNode = new Node(p, end, null);
                    end.next = newNode;
                    end = newNode;
                } else {
                    int count = 0;
                    Node current = first;
                    while (count < index) {
                        current = current.next;
                        count++;
                    }
                    Node currentPrevious = current.prev;
                    Node newNode = new Node(p, current.prev, current);
                    current.prev = newNode;
                    currentPrevious.next = newNode;
                }
            }

        }
        size++;
    }

    public PersonLinkedList nameShorterThan4List(@NotNull PersonLinkedList myList) {

        // Система добавила @NotNull, что это такое?

        PersonLinkedList newList = new PersonLinkedList();

        int count = 0;
        Node current = myList.first;
        while (count < myList.size) {
            if (current.person.getName().length() < 4) {
                newList.add(current.person);
            }
            current = current.next;
            count++;
        }

        return newList;
    }


    class Node {
        Person person;
        Node prev;
        Node next;

        public Node(Person person, Node prev, Node next) {
            this.person = person;
            this.prev = prev;
            this.next = next;
        }
    }


}
