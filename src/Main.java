public class Main {

	public static void main(String[] args) {
		
		Game game=new Game(1, "FİFA 2021", 300);
		User user=new User(1, "Berfin", "Çınar", "berfincnr06@outlook.com", "23569874586", 2002, 254156);
		Campaign campaign=new Campaign(1, "Kara Cuma", 20, 15);
		gameManager gameManager=new gameManager();
		saleManager saleManager=new saleManager();
		
		
		gameManager.saleGame(user, game);
		gameManager.deleteGame(user, game);
		gameManager.updateGame(user,game);
		
		saleManager.sale(campaign, game);
		saleManager.sale(campaign, game);

	}

}
