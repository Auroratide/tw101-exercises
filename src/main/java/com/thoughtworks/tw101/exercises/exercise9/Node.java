package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
    //  The left nodes precede the parent; the right nodes are preceded by the parent
        if(nameOfNewNode.compareTo(name) <= 0) {
            if(hasLeft())
                this.left.add(nameOfNewNode);
            else
                this.left = new Node(nameOfNewNode);
        }
        else {
            if(hasRight())
                this.right.add(nameOfNewNode);
            else
                this.right = new Node(nameOfNewNode);
        }
    }

    public List<String> names() {
    //  Inorder traversal
        List<String> names = new ArrayList<String>();
        if(hasLeft())
            names.addAll(this.left.names());
        names.add(name);
        if(hasRight())
            names.addAll(this.right.names());
        return names;
    }

    private boolean hasLeft() {
        return this.left != null;
    }

    private boolean hasRight() {
        return this.right != null;
    }
}
