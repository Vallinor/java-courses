import java.util.Scanner;

/**
	класс для запуска калькулятора. Поддерживает ввод пользователя
*/
public class InteractRunner{
	
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";	//значение выхода
			String reuse = "no"; //использовать ли результат после вычисления
			Double result = null;//значение результата
			String first;	//значение после первого аргумента
			while(!exit.equals("yes")){
				if(!reuse.equals("yes")){
					System.out.println("Enter first arg : ");
					first = reader.next();
				}else 
					first = String.valueOf(result);
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Select action : +, -, *, /, ^");
				String operation = reader.next();
				switch(operation){
					case "+":
					calc.summa(Double.valueOf(first),Double.valueOf(second));
					break;
					case "-":
					calc.razn(Double.valueOf(first),Double.valueOf(second));
					break;
					case "*":
					calc.proizv(Double.valueOf(first),Double.valueOf(second));
					break;
					case "/":
					calc.chastn(Double.valueOf(first),Double.valueOf(second));
					break;
					case "^":
					calc.sqrt(Double.valueOf(first),Double.valueOf(second));
					break;
				}System.out.println("Result: " + calc.getResult());
			System.out.println("Exit? yes/no");	
			exit = reader.next();
			if (!exit.equals("no")) break;
			System.out.println("Use calculation result? yes/no");
			reuse = reader.next();
			if (!reuse.equals("yes"))
				calc.cleanResult();
			result = calc.getResult();
			}
		
		} finally {
			reader.close();
		}

	}
}