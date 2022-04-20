//gfg problem

class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        if(sq.top1 < (sq.size/2+1) ){
            sq.top1++;
            sq.arr[sq.top1] = x;
        }
        else{
            System.out.println("StackOverflow!!!!");
        }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        if(sq.top2 > (sq.size/2) ){
            sq.top2--;
            sq.arr[sq.top2] = x;
        }
        else{
            System.out.println("StackOverflow!!!!");
        }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        if(sq.top1 != -1){
            int x = sq.arr[sq.top1];
            sq.top1--;
            return x;
        }
        else{
            return -1;
        }
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        if(sq.top2 != sq.size){
            int x = sq.arr[sq.top2];
            sq.top2++;
            return x;
        }
        else{
            return -1;
        }
    }
}
