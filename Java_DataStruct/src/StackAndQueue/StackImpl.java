package StackAndQueue;

public class StackImpl {
	public static void main(String[] args){
		Stack s=new Stack(10);
		System.out.println("begin");
		for(int i=0;!s.isFull();i++){
			s.push((int)(Math.random()*100));
		}
		System.out.println("end");
		
	}
}


class Stack{
	private int mSize;
	private int[] mArray;
	private int top;
	
	public Stack(int i){
		mSize=i;
		mArray=new int[mSize];
		top=-1;
	}
	
	public boolean push(int i){
		if(top>mSize-1){
			return false;
		}
		mArray[++top]=i;
		return true;
	}
	
	public int pop(){
		return mArray[top--];
	}
	
	public int peek(){
		return mArray[top];
	}
	
	public boolean isFull(){
		return top==mSize-1;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void show(){
		for(int i=0;!this.isFull();i++){
			System.out.print(mArray[i]+";");
		}
	}
}
