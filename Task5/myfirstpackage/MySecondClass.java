package myfirstpackage;
public class MySecondClass {
    private int firstNumber;
    private int secondNumber;
    
    public MySecondClass(int first, int second) {
        this.firstNumber = first;
        this.secondNumber = second;
    }
    
    public int getFirstNumber() {
        return firstNumber;
    }
    
    public void setFirstNumber(int value) {
        this.firstNumber = value;
    }
    
    public int getSecondNumber() {
        return secondNumber;
    }
    
    public void setSecondNumber(int value) {
        this.secondNumber = value;
    }
    
    public int multiply() {
        return firstNumber * secondNumber;
    }
}