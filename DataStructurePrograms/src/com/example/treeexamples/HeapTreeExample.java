package com.example.treeexamples;

import java.util.PriorityQueue;

// A Heap is a  complete Binary Tree where
// Max-Heap --- Parent node is >=child nodes
//Min-Heap --- Parent Node is <= child nodes

//Always balanced
// it is useful in the case of insertion and deletion
//CPU - Scheduling -- works on priority basis 
public class HeapTreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(15);
		minHeap.add(30);
		
		System.out.println("Smallest element : " + minHeap.poll());

	}

}
