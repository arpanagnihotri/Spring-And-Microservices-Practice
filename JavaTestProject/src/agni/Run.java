package agni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<Customer> c=new ArrayList<>();
		Customer[] cust=new Customer[5];
		for(int i=0;i<cust.length;i++) {
			System.out.println("Enter the Customer Id,Age and Salary.");
			int id=sc.nextInt();
			sc.nextLine();
			int age=sc.nextInt();
			sc.nextLine();
			int salary=sc.nextInt();
			sc.nextLine();
			cust[i]=new Customer(id,age,salary);
			
		}
		for(int i=0;i<cust.length;i++) {
			c.add(cust[i]);
		}
		Collections.sort(c);
		for(Customer e:c) {
			System.out.println(e);
		}
	}
}
