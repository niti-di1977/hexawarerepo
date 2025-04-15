package com.example.graphexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph {

	private Map<Integer , List<Integer>> adjList;
	
	public DirectedGraph()
	{
		adjList = new HashMap<>();
		
	}
	
	
	public void addEdge(int source , int destination)
	{
		
		adjList.putIfAbsent(source, new ArrayList<>());
		adjList.get(source).add(destination);
	}
	
	public void printGraph() {
		
		
		for (int node : adjList.keySet())
		{
			System.out.println("Node  -- " + adjList.get(node) );
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DirectedGraph dg = new DirectedGraph();
		dg.addEdge(1, 2);
		dg.addEdge(2, 3);
		dg.addEdge(1, 4);
		dg.addEdge(3, 5);
		
		dg.printGraph();
		
	}

}
