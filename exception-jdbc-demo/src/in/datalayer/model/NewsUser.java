package in.datalayer.model;

public class NewsUser {

	private String userName;
	private String mobileNo;
	private String emailId;
	private String planName;

	public NewsUser( ) {

	}

	public NewsUser(String userName, String mobileNo, String emailId, String planName) {
		super();
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.planName = planName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}



}
