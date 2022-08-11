class Maths {
    private double result;
    double add(double a, double b) {
        return this.result = a + b;
    }
    double substract(double a, double b) {
        return this.result = a - b;
    }
    double multiply(double a, double b) {
        return this.result = a * b;
    }
    double divide(double a, double b) {
        if (a == 0 && b == 0){
            System.out.println("0/0 Error");
            return this.result = -2147483648 ;
        } else if (b == 0) {
            System.out.println("Dzielisz przez 0");
            return this.result = -2147483648;
        }
        return this.result = a / b;
    }
    double getResult(){
        return this.result;
    }
}
