package reviews;

//Program related to enum keyword

public class Main {
	
	enum GameDifficulty {
		
		EASY,
		MEDIUM,
		HARD,
		INSANE
	}

	public static void main(String[] args) {
		
		
   GameDifficulty level = GameDifficulty.INSANE;
   
   System.out.println(level);
   
   }

}
