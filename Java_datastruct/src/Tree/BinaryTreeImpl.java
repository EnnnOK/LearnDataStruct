package Tree;

public class BinaryTreeImpl {
	public static void main(String[] args){
		Tree t=new Tree(10);
		for(int i=0;i<10;i++){
			int j=(int)(Math.random()*50);
			System.out.print(j+";");
			t.insert(new Node(j));
		}
		System.out.println("");
		t.show();
	}
}

class Node{
	private int mValue;
	public Node leftKid;
	public Node rightKid;
	public Node(int key){
		mValue=key;
	}
	public int getmValue(){
		return mValue;
	}
	public void show(){
		System.out.print(mValue+";");
	}
}

class Tree{
	private Node root;
	
	public Tree(int key){
		root=null;
	}
	public void insert(Node node){
		if(root==null){
//			System.out.println("parent null");
			root=node;
			return;
		}
		Node parent=root;
		while(true){
//			System.out.println("parent"+parent.getmValue());
//			System.out.println("node:"+node.getmValue());

			if(node.getmValue()>parent.getmValue()){
				if(parent.rightKid==null){
					parent.rightKid=node;
					return;
				}
				parent=parent.rightKid;
			}else{
				if(parent.leftKid==null){
					parent.leftKid=node;
					return;
				}
				parent=parent.leftKid;
			}
		
		}
	}
	
	public void inOrder(Node local){
		if(local!=null){
			inOrder(local.leftKid);
			local.show();
			inOrder(local.rightKid);
		}
	}
	
	public void show(){
		inOrder(root);
	}
}
