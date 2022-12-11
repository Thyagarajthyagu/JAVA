package auma.com;

import java.util.Comparator;

public class ShortEmployeName implements Comparator<Employe> {
	@Override
	public int compare(Employe x, Employe y){
		return x.getName().compareTo(y.getName());
	}
}
