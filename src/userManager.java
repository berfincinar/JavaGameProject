

public class userManager implements userService{

	@Override
	public void addUser(User user) {
		
	System.out.println("User Added: " + user.getFirstName());   //kullanýcýnýn eklendiðine dair çýktý mesajý
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("User Deleted: "+ user.getFirstName());	 //kullanýcýnýn silindiðine dair çýktý mesajý
		
	}

	@Override
	public void updateUser(User user) {
		
		System.out.println("Password Updated: "+ user.getPassword());	 //þifrenin güncellendiðine dair çýktý mesajý
		
	}
	

}
