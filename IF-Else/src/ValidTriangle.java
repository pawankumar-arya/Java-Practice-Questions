public class ValidTriangle {
	public static void main(String[] args) {
		int a = 1 ;
		int b = 2 ;
		int c = 3 ;
		if(a+b==c || b+c==a||a+c==b){
			System.out.println("Valid");
		}else{
			System.out.println("Invalid");
		}
	}
}
