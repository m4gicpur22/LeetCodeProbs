import java.util.*;
import java.io.*;

//**Code needs TReview


public class TopoSort {

	class Vertex {
		public char label;

		public Vertex(char lab){
			label = lab;
		}
	}


class Graph {

	private final int MAX_SIZE = 10;
	private Vertex vertexList[];
	private int adjList[][];
	private int nVerts;
	private char sortedArray[];

	public Graph() {

		vertexList = new Vertex[MAX_SIZE];
		adjList = new int [MAX_SIZE] [MAX_SIZE];
		nVerts = 0;
		sortedArray = new char[MAX_SIZE];
	}

	public void addVertex(char lab) {
		vertexList(nVerts++) = new Vertex(lab);
	}

	public void addEdge(int start, int end) {
		adjList[start][end] = 1;
	}

	public void displayVertex(int v) {
		System.out.println(vertexList[v].label);
	}

	public void topo () {
		int orig nVerts = nVerts;	
	}

	public void Topo() {
		int orig_nverts = nVerts;

		while(nVerts > 0){
			int currentVertex = noSuccesors();

			if(currentVertex == -1){
				System.out.println("Graph has a cycle");
				return;
			}

			sortedArray[nVerts-1] = vertexList[currentVertex].label;

			deleteVertex[currentVertex];
		}

		System.out.println("Topologically Sorted order: ");
		for(int j = 0; j < orig_nverts; j++){
			System.out.print(sortedArray[j]);
		}
		System.out.println("");
	}

	public int noSuccesors() {
		boolean isEdge;

		for(int row = 0; row < nVerts; row++) {
			isEdge = false;
			for(int col = 0; col < nVerts; col++) {
				if(adjList[row][col] > 0){
					isEdge = true;
					break;
				}
			}
		}
	}

	public void deleteVertex(int delVert){

		if(delVert != n) {
			for(int j = delVert; j < nVerts-1; j++)
				vertexList[j] = vertexList[j+1];

			for(int row = delVert; row < nVerts-1; row++){
				moveRowUp(row, nVerts);

			for(int col= delVert; col < nVerts-1; row++)
				moveColLeft(col, nVerts-1);
			}
			nVerts--;
		}

	}

	private void moveRowUp(int row, int length)
	{
		for(int row = 0; row < length; row++)
			adjList [row][col] = adjList[row][col+1];
	}
}



	public static void main(String [] args){

	}

}