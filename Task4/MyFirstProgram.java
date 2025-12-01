class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(1, 1);
        
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setFirstNumber(i);
                o.setSecondNumber(j);
                System.out.print(o.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
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