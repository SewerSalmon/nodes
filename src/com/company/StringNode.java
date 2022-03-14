package com.company;

public class StringNode{
    private String value;
    private StringNode next;
    public StringNode(String value){
        this.value = value;
        next = null;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public void setNext(StringNode next) {
        this.next = next;
    }

    public StringNode getNext(){
        return next;
    }

    public void Display(){
        System.out.println(value);
    }
}
