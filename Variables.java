public class Variables {
    public String Variables(int number) {
        if (number % 5 == 0 && number % 3 == 0){
			return "FizzBuzz";
		}
		else if(number % 5 == 0){
			return "Buzz";
		}
		else if(number % 3 == 0){
			return "Fizz";
		}
		else{
			return String.format("%d", number);
		}
    }
}
