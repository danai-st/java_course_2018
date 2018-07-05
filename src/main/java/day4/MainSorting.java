package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {
	public static void main(String[] args) {
		MainSorting p = new MainSorting();
		p.start();
	}
	private void start() {
		// Create data set
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Somkiat", 200));
		employees.add(new Employee(2, "Pui", 100));
		employees.add(new Employee(3, "Abdul", 500));
		System.out.println("======= Original data=========");
		employees.forEach(System.out::println);
	
		// Sorting with comparator
		Collections.sort(employees, new Comparator<Employee>() 	{

			@Override
			public int compare(Employee e1, Employee e2) {
				//return e1.getName().compareTo(e2.getName());
				return(int)(e2.getSalary() - e1.getSalary());
			}
		} );
		System.out.println("======= Sort by salary =========");
		employees.forEach(System.out::println);
	}
}

