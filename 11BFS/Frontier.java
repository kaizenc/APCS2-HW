public class Frontier{
    MyDeque<Integer> list = new MyDeque<Integer>();
    private boolean behavior;// if true, then q

    public class DeqIterator implements Iterator{
	public boolean hasNext(){
	    asdf;
	}
	public int next(){
	    asdf;
	}
	public void remove(){
	    throw new UnsupportedOperationException();
	}
    }

    public Frontier(boolean behavior){
	this.behavior = behavior;
    }
    public void add(int item){
	list.addFirst(item);
    }
    public void remove(){
	if(behavior){
	    list.removeLast();
	}else{
	    list.removeFirst();
	}
    }
}