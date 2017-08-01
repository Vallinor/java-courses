/**
	класс реализует калькулятор
*/

public class Calculator {
	/**
		результат вычисления
	*/
	private double result;
	
	/**
		Суммируем аргументы.
		@param params Аргументы суммирования.
	*/
	public void summa(double ... params){
		for (double param : params){
			this.result += param;
		}
	}
	/**
		Вычитаем аргументы.
		@double a, double b Аргументы суммирования.
	*/
	public void razn(double a, double b){
		this.result = a-b;
	}
	/**
		Умножаем аргументы.
		@double a, double b Аргументы суммирования.
	*/
	public void proizv(double a, double b){
		this.result = a*b;
	}
	/**
		Делим аргументы.
		@double a, double b Аргументы суммирования.
	*/
	public void chastn(double a, double b){
		this.result = a/b;
	}
	/**
		Возводим в степень аргументы.
		@double a, double b Аргументы суммирования.
	*/
	public void sqrt(double a, double b){
		this.result = Math.pow(a,b);
	}
	/**
		получить результат
		@return результат вычисления
	*/
	public double getResult(){
		return this.result;
	}
	/**
		Очистить результат вычисления
	*/
	public void cleanResult(){
		this.result=0;
	}
}