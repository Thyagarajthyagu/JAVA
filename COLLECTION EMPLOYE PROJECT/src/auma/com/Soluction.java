package auma.com;

import java.util.*;

public class Soluction {
	public static void main(String[] args) {
		Employe e1=new Employe(22,"thyaga",30000);
		Employe e2=new Employe(12,"dhanu",300000);
		Employe e3=new Employe(32,"yashu",40000);
		Employe e4=new Employe(52,"rakshitha",220000);
		Employe e5=new Employe(32,"deepika",400000);
		Map <Integer,Employe> m= new LinkedHashMap<Integer,Employe>();
		m.put(e1.getId(), e1);
		m.put(e2.getId(), e2);
		m.put(e3.getId(), e3);
		m.put(e4.getId(), e4);
		m.put(e5.getId(), e5);
		//Convert Map into Set of Key
		Set<Integer>i=m.keySet();
		System.out.println("Transvering map Object");
		for(int k:i){
			System.out.println(m.get(k));
		}
		System.out.println("+=======================+");

		// get the value and stored the ArrayList
		SortEmployeId k1= new SortEmployeId();
		ShortEmployeName k2= new ShortEmployeName();
		SortEmployeSalary k3= new SortEmployeSalary();
		List<Employe>l=new ArrayList<Employe>();
		//"adding map object into Array
		for(Integer k:i){
			l.add(m.get(k));			
		}
		while(true){
			System.out.println("1:Sort By ID\n2: Sort By NAME\n3:Sort By SALARY\n4:EXIT");
			System.out.println("Enter the choice");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			switch(choice){
			case 1:
				Collections.sort(l, k1);
				for(Employe m1:l){
					System.out.println(m1);
				}
				break;

			case 2:
				Collections.sort(l, k2);
				for(Employe m1:l){
					System.out.println(m1);
				}
				break;

			case 3:
				Collections.sort(l, k3);
				for(Employe m1:l){
					System.out.println(m1);
				}
				break;
			case 4:
				System.out.println("THANK YOU");
				System.exit(0);
				break;

			default:
				System.out.println("INVALIED CHOCIE PLEASE");
				
				System.out.println("++++++++++++++++++++++++++");
			}
		}
	}
}

