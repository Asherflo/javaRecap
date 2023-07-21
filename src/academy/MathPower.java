package academy;

public class MathPower {

    public int power(int firstNumber,int secondNumber){
        if(secondNumber <= 0){
            return 1;
        }else
            return firstNumber * power(firstNumber, secondNumber-1);
    }


}
