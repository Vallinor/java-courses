public class Calculate {
	public static void main(String[] arg){
		System.out.println("Сalculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		int raz = first - second;
		int proiz = first * second;
		int chastn = first / second;
		int sqrt = (int)Math.pow(first, second);
		System.out.println("Sum " + sum);
		System.out.println("Raz " + raz);
		System.out.println("Proiz " + proiz);
		System.out.println("Chastn " + chastn);
		System.out.println("Sqrt " + sqrt);
	}
}