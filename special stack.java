//gfg problem

class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
    {
        //add code here.
        int x = s.pop();
        return x;
	}
	public int min(Stack<Integer> s)
    {
        //add code here.
        int min = s.pop();
        while(!s.isEmpty()){
            int y = s.pop();
            if(y<min){
                min = y;
            }
        }
        return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
    {
        //add code here.
        if(s.size() == n){
            return true;
        }
        else{
            return false;
        }
	}
	public boolean isEmpty(Stack<Integer>s)
    {
        //add code here.
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
	}
}
