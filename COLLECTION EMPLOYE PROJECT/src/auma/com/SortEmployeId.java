package auma.com;

import java.util.Comparator;

public class SortEmployeId  implements Comparator<Employe>{
	@Override
	public int compare(Employe x, Employe y){
		return x.getId()-y.getId();
	}
}
