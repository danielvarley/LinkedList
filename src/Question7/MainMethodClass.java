package Question7;

public class MainMethodClass {
	public static void main(String[] args){


		int[] p = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		LinkedList a = new LinkedList(p); 
		System.out.println( a.getNth(3));

		LinkedList b = a.cons(0);
		System.out.println( b.getNth(0));
		
		int n = b.length();
		System.out.println(n);
			
		
	}


}



