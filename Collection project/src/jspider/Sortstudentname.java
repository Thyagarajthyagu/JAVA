package jspider;

import java.util.Comparator;

public class Sortstudentname implements Comparator<Student> {
	public int compare(Student x , Student y){
		return x.getName().compareTo(y.getName());
	}
}
