package jspider;

import java.util.*;


public class Soluction {

	public static void main(String[] args) {
		Student s1= new Student(18,"thyaga",98);
		Student s2= new Student(6,"raj",88);
		Student s3= new Student(2,"shri",87);
		Student s4= new Student(5,"avi",86);
		Student s5= new Student(1,"deepu",84);
		Map <Integer,Student>m=new LinkedHashMap<Integer,Student>();
		m.put(s1.getId(), s1);
		m.put(s2.getId(), s2);
		m.put(s3.getId(), s3);
		m.put(s4.getId(), s4);
		m.put(s5.getId(), s5);

		//1.convert map into set of key
		Set<Integer> s=m.keySet();
		System.out.println("entries present inside map");
		for(int sub:s){
			System.out.println(m.get(sub));
		}
		System.out.println("-----------------------");
		//2.get the values (Student object )in to ArrayList
		List <Student>l=new ArrayList<Student>();
		for(int i:s){
			Student obj=m.get(s);
			l.add(obj);// l.add(m.get(i));	  
		}
		System.out.println("------------------------");
		Scanner scan= new Scanner(System.in);
		System.out.println("1:Short By Id \n2:Short By Name \n3:Short By Marks");
		System.out.println("Enter The Choice");
		int choice = scan.nextInt();
		switch(choice){
		case 1:
			Collections.sort(l,new Studentimpl());
			for(Student ss:l){
				System.out.println(ss);
			}
			break;
		case 2:
			Collections.sort(l,new Sortstudentname());
			for(Student ss:l){
				System.out.println(ss);
			}
			break;
		case 3:
			Collections.sort(l,new sortStudentmarks());
			for(Student ss:l){
				System.out.println(ss);
			}
			break;
		default:
			System.out.println("invalied choice");

		}
	}
}
