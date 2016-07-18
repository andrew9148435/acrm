package com.andrew.tree;

import java.util.HashMap;
import java.util.List;

public class Tree<T> {
    private Node<T> root;
    private HashMap<String, Node<T>> nodes;

    public Tree(T rootData) {
        nodes = new HashMap<>();
        root = new Node<T>("root", rootData);
        root.setParent(null);
        nodes.put("root", root);
    }

    public Tree() {
        this(null);
    }

    public Node<T> addNode(String parent, String identifier) {
        Node<T> node = new Node<T>(identifier);
        return addNode(parent, node);
    }

    public Node addNode(String parent, Node<T> node) {
        //add exception if parent not exist
        //rework this method
        node.setParent(nodes.get(parent));
        nodes.put(node.getIdentifier(), node);

        if (parent != null) {
            nodes.get(parent).addChild(node);
        }

        return node;
    }

    private void walk(Node<T> element, List<Node<T>> list) {
        list.add(element);
        for (Node<T> data : element.getChildren()) {
            walk(data, list);
        }
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public Node<T> getNode(String identifier) {
        return nodes.get(identifier);
    }
}
