public class MyStack<T>{
  private LNode<T> top;
  public MyStack(){
    return;
  }
  public T peek(){
    return top.getData();
  }
  public T pop(){
    T temp = top.getData();
    top = top.getNext();
    return temp;
  }
  public T push(T item){
    LNode<T> temp = new LNode<T>(item);
    temp.setNext(top);
    top = temp;
    return item;
  }
}