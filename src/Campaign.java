
public class Campaign {
	private int campaingId;	//kampanyanýn id'si
	private String campaingName; //kampanyanýn  adý
	private int campaingDay;	//kampanya günü
	private double discount;  //indirim
	
	public Campaign(int campaingId, String campaingName, int campaingDay, double discount) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.campaingDay = campaingDay;
		this.discount = discount;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public int getCampaingDay() {
		return campaingDay;
	}

	public void setCampaingDay(int campaingDay) {
		this.campaingDay = campaingDay;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
