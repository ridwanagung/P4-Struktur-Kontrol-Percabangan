	public class DemoIfElseIf {
		public static void main(String[] args) {
			double grande = 92.0;
			if( grande >= 90 ){
				System.out.println("Excellent!");
			}else if( (grande < 90) && (grande >= 80)){
				System.out.println("Good job!" );
			}else if( (grande < 80) && (grande >= 60)){
				System.out.println("Study harder!" );
			}else {
				System.out.println("Sorry, you failed." );
			}
		}
	}