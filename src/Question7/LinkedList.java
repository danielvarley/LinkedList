package Question7;

public class LinkedList {
	Node head;

	LinkedList(int[] a){
		Node c = new Node(a[a.length-1], null);
		for(int i = (a.length-1); i >= 0; i--){
			c = new Node(a[i], c );
		}
		head = c;
	}

	LinkedList cons(int s){
		LinkedList ll = new LinkedList(new Node(s, this.head));
		return ll;

	}
	//I understand that I'd have to remove a given node and make the node before it refer to the node after the removed 
	//node but struggling to implement this
	//LinkedList remove(int n){
	//}
	LinkedList(Node h){
		head = h;
	}

	int getHead(){
		return head.val;
	}

	Integer getNth(int n){
		Node c = head;
		while(n >= 1){
			if(c == null)
				return null;
			c = c.next;
			n--;
		}
		if(c == null)
			return null;
		else
			return c.val;
	}

	int length(){
		int n = -1;
		for(int i = 0; this.getNth(i) != null;i++){
			n += 1;	
		}
		return n;
	}



}
