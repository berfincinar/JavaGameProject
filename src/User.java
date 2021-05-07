
public class User {
	private int userId;
	 private String firstName;   //isim
	 private String lastName;	//Soyisim
	 private String mail;		//mail
	 private String nationalityId;	//TC
	 private int yearOfBirth;		//Doðum Tarýhý
	 private int password;			//Þifre
	
	 public User(int userId, String firstName, String lastName, String mail, String nationalityId, int yearOfBirth, int password) {
		super();
		this.userId= userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	 
	 
	 

}
