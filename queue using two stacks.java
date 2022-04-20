//gfg problem

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   int item = 0;
	   if(s1.isEmpty() == true){
	       return -1;
	   }
	  
	   while(!s1.isEmpty()){
	       item = s1.pop();
	       s2.push(item);
	   }
	   int poped =  s2.pop();
	  
	   while(!s2.isEmpty()){
	       item = s2.pop();
	       s1.push(item);
	   }
	   
	   return poped;
    }
}
