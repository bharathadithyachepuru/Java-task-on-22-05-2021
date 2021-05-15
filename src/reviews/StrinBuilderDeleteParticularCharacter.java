package reviews;

public class StrinBuilderDeleteParticularCharacter {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("My Program");
		
		sb.deleteCharAt(3);
		
		System.out.println(sb);

	}

}
