public class RunningMedian{
    private MyHeap left,right;
    public RunningMedian(){
	left = new MyHeap();
	right = new MyHeap(false);
    }
    public double getmedian(){
	if(left.size() > right.size()){
	    return left.peek();
	}else if(right.size() > left.size()){
	    return right.peek();
	}else{
	    return (right.peek() + left.peek() / 2) + 1.0;
	}
    }
    public void add (int val){
	if(left.size() == right.size() == 0){//empty heaps
	    left.add(val);
	}else if(left.size() == right.size() + 1 == 1){//only one item
	    right.add(val);
	}else if(left.size() == right.size()){//both sides are equal
	    if(val > getmedian()){
		right.add(val);
	    }else{
		left.add(val);
	    }
	}else{//the pain
	    if(val>getmedian()){
		if(right.size() > left.size()){
		    right.add(val);
		    left.add(right.remove);
		}else{
		    right.add(val);
		}
	    }else{
		if(left.size() > right.size()){
		    left.add(val);
		    right.add(left.remove);
		}else{
		    left.add(val);
		}
	    }
	}
    }
}