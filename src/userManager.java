

public class userManager implements userService{

	@Override
	public void addUser(User user) {
		
	System.out.println("User Added: " + user.getFirstName());   //kullan�c�n�n eklendi�ine dair ��kt� mesaj�
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("User Deleted: "+ user.getFirstName());	 //kullan�c�n�n silindi�ine dair ��kt� mesaj�
		
	}

	@Override
	public void updateUser(User user) {
		
		System.out.println("Password Updated: "+ user.getPassword());	 //�ifrenin g�ncellendi�ine dair ��kt� mesaj�
		
	}
	

}
