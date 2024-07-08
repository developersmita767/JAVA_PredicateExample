package Java_8;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Java_8.Student;

public class PredicateExample {

	public static void main(String[] args) {
		/**
		 * Find even numbers in a given list
		 */
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		//Predicate<Integer> predicate=(a)->a%2==0;
		//list.stream().filter((a)->a%2==0).forEach(System.out::println);
		List<Integer> evenList=list.stream().filter((a)->a%2==0).collect(Collectors.toList());
		/**
		 * Display student names whose percentage is more than 90
		 */
		Student s1=new Student(1, "Rahul", 56, null);
		Student s2=new Student(1, "Dinesh", 91, null);
		Student s3=new Student(1, "Suresh", 78, null);
		Student s4=new Student(1, "Rahul", 96, null);
		List<Student> stdList=List.of(s1,s2,s3,s4);
		stdList.stream().filter((s)->s.getPercent()>90)
						.forEach((s)->System.out.println(s.name));
		
	}

}
