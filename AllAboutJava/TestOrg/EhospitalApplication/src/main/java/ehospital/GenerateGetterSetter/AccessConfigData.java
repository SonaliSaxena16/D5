package ehospital.GenerateGetterSetter;

public class AccessConfigData {
	
	private String userId;
	private String password;
	private String baseurl;
	private String browser;
	private String OS;
	

	public AccessConfigData() {
		// TODO Auto-generated constructor stub
	}
	


	public AccessConfigData(String userId, String password,String browser,String baseurl) {
		super();
		this.userId = userId;
		this.password = password;
		this.browser = browser;
		this.baseurl = baseurl;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBaseurl() {
		return baseurl;
	}

	public void setBaseurl(String baseurl) {
		this.baseurl = baseurl;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}
	
	@Override
	public String toString() {
		return "User [baseurl=" + baseurl + ",browser=" + browser + ",OS=" + OS + ",userId=" + userId + ", password=" + password + "]";
	}
	
	
	
	

}
