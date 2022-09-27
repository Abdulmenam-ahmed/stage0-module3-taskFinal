package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
    	String numberAsString = String.valueOf(number);
    	int sum = 0;
    	   for (int i = 0; i < numberAsString.length(); i++) {
	    	    sum = number % 10 + sum;
	            number /=10;
    	   }
    System.out.println(sum);
    }
}
