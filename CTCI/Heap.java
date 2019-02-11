import java.util.*;
import java.io.*;


/***Needs Review**/
public class minHeap {

	private int capacity = 10;
	private int size = 0;

	int [] items = new int[capacity];

	private int getLeftChildIndex(int parentIndex){
		
		return 2 * parentIndex + 1;
	}

	private int getRightChildIndex(int parentIndex){
		
		return 2 * parentIndex + 1;
	}

	private int getParentIndex(int parentIndex){
		
		return(childIndex - 1)/2;
	}

	private boolean hasLeftChild(int index){

		return getLeftChildIndex(index) < size;
	}

	public hasRightChild(int index){
		return getRightChildIndex(index) < size;
	}

	public hasParent(int index){
		return getParentIndex(index) >= 0;
	}

	private leftChild(int index){
		return items[getLeftChildIndex(index)];
	}

	private rightChild(int index){
		return items[getRightChildIndex(index)];
	}

	private int parent(int index){
		return items[getParentIndex(index)];
	}

	private void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];

		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}
	//enalrges array after slots are filled
	private void ensureExtraCapacity() {
		if(size == capacity){
			items = Arrays.copyOf(items, capacity * 2);
			capacity *= 2;
		}
	}
	//returns first elem in array
	public int peek () {
		if(size == 0) throw new IllegalStateException();
		return items[0];
	}
	//removes minimum elem from array
	public int poll() {
		if (size == 0) throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size - 1];
		size--;
		heapifyDown();
		return item;
	}

	public void add(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size++;
		heapifyUp();
	}

	public void heapifyUp(){
		int index = size - 1;

		while(hasParent(index) && parent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	public void heapifyDown(){
		int index = 0;

		while(hasLeftChild(index)){
			int smallerChildIndex = getLeftChildIndex;
			if(hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}

			if(items[index] < items[smallerChildIndex]) {
				break;
			} else {
				swap(index, smallerChildIndex);
			}

			index = smallerChildIndex;
		}
	}

}