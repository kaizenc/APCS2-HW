import java.util.*;

public class MyDeque<T> {

  private T[] list;
  private int head,tail,size;

  public MyDeque() {
    list = (T[]) new Object[10];
    head = 0;
    tail = 9;
    size = 0;
  }

  public void resize(){
    if(size == list.length){
      T[] newlist = (T[]) new Object[size * 2];
      for(int i = 0; i < size; i++){
        newlist[i] = list[(head + i) % size];
      }
      list = newlist;
      head = 0;
      tail = size - 1;
    }/*else if(size <= list.length/4){
      T[] newlist = (T[]) new Object[size/2];
      for(int i = 0; i < size; i++){
        newlist[i] = list[(head + i) % size];
      }
      list = newlist;
      head = 0;
      tail = size - 1;
    }*/
  }

  public void addFirst(T item){
    resize();
    head--;
    if(head < 0){
      head += list.length;
    }
    list[head] = item;
    size += 1;
  }
  public void addLast(T item){
    resize();
    tail++;
    if(tail != 0 && tail >= list.length){
      tail -= list.length;
    }
    list[tail] = item;
    size += 1;
  }

  public void removeFirst(T item){
    return;
  }
  public void removeLast(T item){
    return;
  }

  public T getFirst(){
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return list[head];
  }

  public T getLast(){
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return list[tail];
  }

  public int size(){
    return size;
  }

  public static void main(String[]args){
    MyDeque<Integer> D = new MyDeque<Integer>();
    for (int i = 0;i < 25;i++){
      D.addFirst(i);
    }
    System.out.println(D.size());
  }
}