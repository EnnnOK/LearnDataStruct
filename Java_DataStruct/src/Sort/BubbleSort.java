package Sort;

public class BubbleSort {
	public static void main(String[] args){
		Sort s=new Sort(10);
		s.show();
		s.rank();
		s.show();
	}
}

class Sort{
	private int mSize;
	private int[] mArray;
	public Sort(int i){
		mSize=i;
		mArray=new int[mSize];
		for(int j=0;j<mSize;j++){
			mArray[j]=(int)(Math.random()*100);
		}
	}
	public void show(){
		for(int i=0;i<mSize;i++){
			System.out.print(mArray[i]+";");
		}
		System.out.println("");
	}
	public void rank(){
		for(int i=mSize-1;i>1;i--){
			for(int j=0;j<i;j++){
				if(mArray[j]>mArray[j+1]){
					int temp=mArray[j];
					mArray[j]=mArray[j+1];
					mArray[j+1]=temp;
				}
			}
		}
	}
}
