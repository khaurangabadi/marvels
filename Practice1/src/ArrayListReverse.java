package comp;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("America");
		al.add("India");
		al.add("china");
		al.add("Germany");
		al.add("japan");
		
		
	ListIterator<String> li=	al.listIterator(al.size());
	
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}


	}

}
