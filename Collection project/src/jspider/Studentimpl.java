package jspider;

import java.util.Comparator;

public class Studentimpl  implements Comparator<Student>{
	public int compare(Student x , Student y){
		return x.getId()-y.getId();
	}
}