package comp;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
	Integer id;
	String name;
	float salary;
	public Employee(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	public static void main(String args[])
	{
		Employee e1=new Employee(1,"pooja",1000);
		Employee e2=new Employee(2,"ram",2000);
		Employee e3=new Employee(3,"suresh",3000);
		Employee e4=new Employee(4,"abhay",4000);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(100);
		al2.add(50);
		al2.add(10);
		al2.add(15);
		System.out.println("-----");
		
		Collections.sort(al2);
		
		System.out.println(al2);
		
		System.out.println("-----sorting in basis of salary descending wise----");
		Collections.sort(al, new SortingSalary());
		
		System.out.println(al);
		
		
		System.out.println("-----sorting on basis of id descending wise----");
		Collections.sort(al, new SortingId());
		
		System.out.println(al);
	}
	
	

}
