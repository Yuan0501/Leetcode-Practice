
import java.util.ArrayList;

public class MaxHeap<E extends Comparable<E>> {
      ArrayList<E> arr;
      public MaxHeap(int capacity){
          arr = new ArrayList<E>(capacity);
    }
    public MaxHeap(){
          arr = new ArrayList<E>();
    }

    public boolean isEmpty(){
          return arr.isEmpty();
    }

    public int getSize(){
          return arr.size();
    }

    public int parent(int index){
          if(index == 0){
              throw new IllegalArgumentException("index-0 doesn't have parent");
          }
          return (index - 1) /  2;
    }

    public int leftChild(int index){
          return index * 2 + 1;
    }

    public int rightChild(int index){
          return index * 2 + 2;
    }

    public void swap(int a, int b){
          E e = arr.get(a);
          arr.set(a, arr.get(b));
          arr.set(b, e);
    }

    public void add(E e){
          arr.add(e);
          siftUp(arr.size() - 1);
    }

    public void siftUp(int k){
          while(k > 0 && arr.get(k).compareTo(arr.get(parent(k)))  > 0){
              int p = parent(k);
              swap(p,k);
              k = p;
          }
    }

    public E findMax(){
          if(arr.get(0) == null){
              throw new IllegalArgumentException("there is no element in the maxheap.");
          }
          return arr.get(0);
    }

    public E removeMax(){
          E e = findMax();
          swap(0,arr.size() - 1);
          arr.remove(arr.size() - 1);
          siftDown(0);
          return e;
    }


    private void siftDown(int k){
      while(leftChild(k) < arr.size() ){
          int j = leftChild(k);
          if(j + 1 < arr.size() && arr.get(j + 1).compareTo(arr.get(j)) > 0){
              j = rightChild(k);
          }

          if(arr.get(k).compareTo(arr.get(j)) >= 0){
              break;
          }
          swap(k, j);
          k = j;
      }
    }

    public void heapify(){

    }

}
