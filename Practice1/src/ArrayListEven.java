package comp;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEven {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(6);
		al.add(7);
		Iterator<Integer> it=al.iterator();
		String s=al.toString();
		System.out.println(s);
		
		while(it.hasNext())
		{
			int x=it.next();
			
			int index=al.indexOf(x);
			if(index%2==0)
			{
				System.out.println(x);
			}
			
		}
		

	}

}
