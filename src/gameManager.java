

public class gameManager {
	
		public void saleGame (User user, Game game) {
			System.out.println(game.getGameName()+ "is saled for"+ user.getUserId());   // "...." id li kullan�c�ya "..." adl� oyun sat�ld�
		}
		
		public void deleteGame (User user, Game game) {
			
			System.out.println(game.getGameName()+"is deleted for"+user.getFirstName()); // "...." id li oyun "..." adl� kullan�c� taraf�ndan silindi
			
		}
		
		public void updateGame (User user, Game game) {
			
			System.out.println(game.getGamePrice()+"'s price is update");    // oyunun fiyat� g�ncellendi 
		}

}
