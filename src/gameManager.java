

public class gameManager {
	
		public void saleGame (User user, Game game) {
			System.out.println(game.getGameName()+ "is saled for"+ user.getUserId());   // "...." id li kullanýcýya "..." adlý oyun satýldý
		}
		
		public void deleteGame (User user, Game game) {
			
			System.out.println(game.getGameName()+"is deleted for"+user.getFirstName()); // "...." id li oyun "..." adlý kullanýcý tarafýndan silindi
			
		}
		
		public void updateGame (User user, Game game) {
			
			System.out.println(game.getGamePrice()+"'s price is update");    // oyunun fiyatý güncellendi 
		}

}
