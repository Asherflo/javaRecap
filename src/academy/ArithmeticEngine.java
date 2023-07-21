package academy;

public class ArithmeticEngine {
    private  double firstNumber;
    private double secondNumber;
    public ArithmeticEngine(double fn, double sn){
        this.firstNumber=fn;
        this.secondNumber= sn;

    }
    public double addTwoNumber(){
        return  this.firstNumber+ this.secondNumber;
    }
    public double minusTwoNumber(){
        return  this.firstNumber -this.secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
