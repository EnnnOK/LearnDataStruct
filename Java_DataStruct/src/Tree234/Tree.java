package Tree234;

public class Tree {
	public Node root=new Node();
	public int find(int key){
		Node curNode=root;
		int childNumber;
		while(true){
			if((childNumber=curNode.findItem(key))!=-1){
				return childNumber;
			}else if(curNode.isLeaf()){
				return -1;
			}else{
				curNode=getNextChild(curNode,key);
			}
		}
	}
	public Node getNextChild(Node theNode,int theValue){
		int i;
		int count=theNode.getCount();
		for(i=0;i<count;i++){
			if(theValue<theNode.getItem(i).mValue){
				return theNode.getChild(i);
			}
		}
		return theNode.getChild(i);
	}
	
	public void insert(int value){
		Node curNode=root;
		DataItem temp=new DataItem(value);
		while(true){
			if(curNode.isFull()){
				split(curNode);
				curNode=curNode.getParent();
				
			}
		}
		
	}
	
	public void split(Node thisNode){
		DataItem itemB,itemC;
		Node parent,child2,child3;
		int itemIndex;
		itemC=thisNode.removeItem();
		itemB=thisNode.removeItem();
		child3=thisNode.disconnectChild(3);
		child2=thisNode.disconnectChild(2);
		Node rightNode=new Node();
		if(thisNode==root){
			root=new Node();
			parent=root;
			root.connectChild(0,thisNode);
		}else{
			parent=thisNode.getParent();
		}
		itemIndex=parent.insertItem(itemB);
		int n=parent.getCount();
		for(int j=n-1;j>itemIndex;j--){
			Node temp=parent.disconnectChild(j);
			parent.connectChild(j+1, temp);
		}
		parent.connectChild(itemIndex+1, rightNode);
		rightNode.insertItem(itemC);
		rightNode.connectChild(0, child2);
		rightNode.connectChild(1, child3);
		
	}
}
