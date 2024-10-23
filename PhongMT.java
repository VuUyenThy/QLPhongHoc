package vuUyenThy_23730871;

public class PhongMT extends PhongHoc {

	@Override
	public boolean datChuan() {
		if (getDienTich()/mayTinh> 1.5 && getDienTich()/mayTinh < 3 ) {
			return true;
		} else {
			return false;
		}	
	}
	
	private int mayTinh;

	public int getMayTinh() {
		return mayTinh;
	}

	public void setMayTinh(int mayTinh) {
		this.mayTinh = mayTinh;
	}

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen, int mayTinh) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayTinh = mayTinh;
	}

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		String datChuan = (datChuan())?"Da dat chuan":"Chua dat chuan";
		return super.toString()+String.format("|%10s|%10s|",getMayTinh(),datChuan);
	}
	
	
	
}
