package vuUyenThy_23730871;

import java.util.Objects;

public abstract class PhongHoc {
	public abstract boolean datChuan();
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) throws Exception {
		if (maPhong != null) {
			this.maPhong = maPhong;
		} else {
			throw new Exception("Loi");
		}
		
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) throws Exception {
		if (dayNha != null) {
			this.dayNha = dayNha;
		} else {
			throw new Exception("Loi");	
		}
		
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) throws Exception {
		if (dienTich > 0) {
			this.dienTich = dienTich;
		} else {
			throw new Exception("Loi");	
		}
		
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) throws Exception {
		if (soBongDen > 0) {
			this.soBongDen = soBongDen;
		} else {
			throw new Exception("Loi");	
		}
		
	}
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) throws Exception {
		if (maPhong != null) {
			this.maPhong = maPhong;
		} else {
			throw new Exception("Loi");
		}
		if (dayNha != null) {
			this.dayNha = dayNha;
		} else {
			throw new Exception("Loi");	
		}
		if (dienTich > 0) {
			this.dienTich = dienTich;
		} else {
			throw new Exception("Loi");	
		}
		if (soBongDen > 0) {
			this.soBongDen = soBongDen;
		} else {
			throw new Exception("Loi");	
		}
	}
	
	public boolean duSang() {
		int s= (int) (getDienTich()/10);
		if(s/getSoBongDen() == 1) {
			return true;
		}else {
			return false;
		}
		
	}
	
@Override
public String toString() {
	String duSang = duSang()?"Phong Du Sang":"Phong Khong Du Sang";
	String s=" ";
	s+=s.format("%10s|%10s|%10s|%10s|%10s",getMaPhong(),getDayNha(),getDienTich(),getSoBongDen(),duSang);
	return super.toString();
}
@Override
public int hashCode() {
	return Objects.hash(maPhong);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PhongHoc other = (PhongHoc) obj;
	return Objects.equals(maPhong, other.maPhong);
}


	
	
}