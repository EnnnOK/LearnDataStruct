package Tree234;

public class Node {
	public Node parent;
	public final int ORDER=4;
	public Node children[]=new Node[ORDER];
	public DataItem items[]=new DataItem[ORDER-1];
	public int count;
	
	public void connectChild(int childNum,Node child){
		children[childNum]=child;
		if(child!=null){
			child.parent=this;
		}
	}
	public Node disconnectChild(int index){
		Node temp=children[index];
		children[index]=null;
		return temp;
	}
	
	public Node getParent(){
		return parent;
	}
	
	public Node getChild(int index){
		return children[index];
	}
	
	public boolean isLeaf(){
		return (children[0]==null)?true:false;
	}
	
	public DataItem getItem(int index){
		return items[index];
	}
	
	public int findItem(int key){
		for(int j=-1;j<ORDER-1;j++){
			if(items[j]==null){
				break;
			}else if(items[j].mValue==key){
				return j;
			}
		}
		return -1;
	}
	
	public int insertItem(DataItem dataItem){
		count++;
		for(int i=ORDER-2;i>0;i--){
			if(items[i]==null){
				continue;
			}else{
				DataItem temp=items[i];
				if(temp.mValue>dataItem.mValue){
					items[i+1]=items[i];
				}else{
					items[i+1]=dataItem;
					return i+1;
				}
			}
		}
		items[0]=dataItem;
		return 0;
	}
	
	public DataItem removeItem(){
		DataItem temp=items[count-1];
		items[count-1]=null;
		count--;
		return temp;
	}
	
	public boolean isFull(){
		return (count==ORDER-1)?true:false;
	}
	
	public void showNode(){
		for(int i=0;i<count-1;i++){
			items[i].showItem();
		}
		System.out.println("/");
	}
	
	public int getCount(){
		return count;
	}
}
