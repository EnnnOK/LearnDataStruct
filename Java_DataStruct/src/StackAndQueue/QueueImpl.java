package StackAndQueue;

public class QueueImpl {
	public static void main(String[] args){
		Queue mQueue=new Queue(10);
		for(int i=0;i<10;i++){
			mQueue.insert(i);
		}

		mQueue.showQueue();
		System.out.println("first remove:"+mQueue.remove());
		mQueue.showQueue();
		int i1=mQueue.remove();
		int i2=mQueue.remove();
		mQueue.showQueue();
		mQueue.insert(21);
		mQueue.insert(22);
		mQueue.showQueue();
		
	}
}

class Queue{
	private int[] mArray;
	private int mSize;
	private int mHead;
//	private int count;
	private int mTail;
	
	public Queue(int size){
		mSize=size;
		mArray=new int[mSize];
		mHead=0;
		mTail=0;
//		count=0;
	}

	public void insert(int key){
		if(this.isFull()){
			return;
		}
		
		if(mTail==mSize){
			mTail=0;
		}
	
		mArray[mTail]=key;
		mTail++;
	}
	
	public int remove(){
		if(mHead==mSize){
			mHead=0;
		}
		return mArray[mHead++];
	}
	
	public void showQueue(){
		if(mTail-1>=mHead-1){
			show(mHead,mTail-1);
		}else{
			show(mHead,9);
			show(0,mTail-1);
		}
		System.out.println("");
	}
	
	public void show(int start,int end){
		for(int i=start;i<=end;i++){
			System.out.print(mArray[i]);
		}
		
	}
	
	public boolean isFull(){
		int count=mTail-mHead;
		if(count<0){
			count=count+10;
		}
		
		return (count==mSize);
	}
		
}