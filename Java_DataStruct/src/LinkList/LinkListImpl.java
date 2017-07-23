package LinkList;

public class LinkListImpl {

	public static void main(String[] args){
		LinkList linkList=new LinkList();
		linkList.insert(1);
		
		linkList.insert(2);
		linkList.insert(3);
		System.out.println(linkList.isEmpty());
		linkList.insert(4);
		linkList.insert(5);
		linkList.insert(6);
		linkList.insert(7);
		linkList.showList();
		Link l1=linkList.delete();
		Link l2=linkList.delete();
		linkList.showList();
	
	}

}

class Link{
	public int mValue;
	public Link next;
	
	public Link(int i){
		mValue=i;
	}
	
	public void showLink(){
		System.out.print(mValue+";");
	}
}


class LinkList{
	private Link first;
	
	public LinkList(){
		first=null;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void insert(int key){
		Link temp=new Link(key);
		temp.next=first;
		first=temp;
	}
	
	public Link delete(){
		System.out.println("first"+first.mValue);
		Link temp=first;
		this.first=temp.next;
		return temp;
	}
	

	
	
	public void showList(){
		Link temp=first;
		while(temp!=null){
			temp.showLink();
			temp=temp.next;
		}
	}
}