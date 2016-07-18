package com.andrew.tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private String identifier;
    private T data;
    private Node<T> parent;
    private List<Node<T>> children;

    public Node(String identifier, T data) {
        this.identifier = identifier;
        this.data = data;
        children = new ArrayList<Node<T>>();
    }

    public Node(String identifier) {
        this(identifier, null);
    }

    public void addData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public List<Node<T>> getChildren() {
        if (this.children == null) {
            return new ArrayList<Node<T>>();
        }

        return this.children;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void addChild(Node<T> child) {
        if (children == null) {
            children = new ArrayList<Node<T>>();
        }

        children.add(child);
    }


}
