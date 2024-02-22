package ex05;

public class AutomaticCalculator {
    private int num1;
    private int num2;
    private int sum;
    private int difference;
    private int product;
    private int quotient;

    public void setNum1(String num1) {
        if (checkValidNum(num1)) {
            this.num1 = Integer.parseInt(num1);
        } else {
            System.out.println("Invalid Number");
        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(String num2) {
        if (checkValidNum(num2)) {
            this.num2 = Integer.parseInt(num2);
            generateCalculations();
        } else {
            System.out.println("Invalid Number");
        }
    }

    public int getNum2() {
        return num2;
    }

    private boolean checkValidNum(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (!(num.charAt(i) > '0') && !(num.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    private int calcSum() {
        return (num1 + num2);
    }

    private int calcDifference() {
        return (num1 - num2);
    }

    private int calcProduct() {
        return (num1 * num2);
    }

    private int calcQuotient() {
        return (num1 / num2);
    }

    private void generateCalculations(){
        sum = calcSum();
        difference = calcDifference();
        product = calcProduct();
        quotient = calcQuotient();
    }

    @Override
    public String toString() {
        return String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", num1, num2, sum, num1, num2, difference, num1, num2, product, num1, num2, quotient);
    }

}




