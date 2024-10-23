package vuUyenThy_23730871;

public class PhongLT extends PhongHoc {

	@Override
	public boolean datChuan() {
		if (isMayChieu() && duSang()) {
			return true;
		} else {
			return false;
		}
	
	}
	
	private boolean mayChieu;

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}

	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String datChuan = (datChuan())?"Da dat chuan":"Chua dat chuan";
		String mayChieu = (isMayChieu())?"Co may chieu":"Khong co may chieu";
		return super.toString()+String.format("|%10s|%10s|", datChuan,mayChieu);
	}
	

}
