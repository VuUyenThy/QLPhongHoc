package vuUyenThy_23730871;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPhong {
	List<PhongHoc> ls;
	public ListPhong() {
		ls=new ArrayList<PhongHoc>(2);
	}
	
	
//them phong 
	public boolean themPhong(PhongHoc ph) {
		if(ls.contains(ph)) {
			return false;
		}else {
			return ls.add(ph);
		}
	}
	
	
//sap xep	
	public void sapXep() {
		Collections.sort(ls, new Comparator<PhongHoc>() {
			public int compare(PhongHoc p1, PhongHoc p2) {
				String x = new String(p1.getMaPhong());
				String y = new String(p2.getMaPhong());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	
	
//tim kiem 
	
	
	
	
	
	
	
	
	
//Xuat ds
	public List<PhongHoc> xuatDS(){
		return ls;
	}
	
//DS DatChuan
	public List<PhongHoc> DSPhongDatChuan(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
			for(PhongHoc ph : ls) {
				if(ph.datChuan())
					dsDC.add(ph);
				return dsDC;
			}
			return null;
	}
	
	
}
