/*
 * package com.example.treeexamples;
 * 
 * class Node{
 * 
 * 
 * int data ; Node left , right;
 * 
 * public Node(int item) { super(); this.data = item;
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * public class BinarySearchTree {
 * 
 * Node root;
 * 
 * void insert(int key) {
 * 
 * root = insertRec(root , key); }
 * 
 * 
 * Node insertRec(Node root , int key) { if (root == null) return new Node(key);
 * if(key<root.data) root.left = insertRec(root.left , key); else root.right =
 * insertRec(root.right ,key); return root;
 * 
 * 
 * }
 * 
 * void inorder()
 * 
 * { inorderRec(root); }
 * 
 * void inorderRec(Node root) { if (root != null) {
 * 
 * inorderRec(root.left); System.out.println(root.data + " ");
 * inorderRec(root.right); }
 * 
 * }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * BinarySearchTree bst = new BinarySearchTree();
 * 
 * bst.insert(50); bst.insert(30); bst.insert(70); bst.insert(20);
 * bst.insert(40); bst.insert(60); bst.insert(80);
 * 
 * bst.inorder(); }
 * 
 * }
 */