package tn.enis.calculatrice;

public class Calculator {
    public int evaluate(String expression)
    {
        int sum = 0;
        for (String summand:
                expression.split("\\+"))

            sum += Integer.parseInt(summand);
        return sum;
    }

    public int add(int a , int b){
        return a+b;
    }

    public  int subtract(int a,int b){
        return a-b;
    }
    public int devide(int a, int b) throws Exception{
        return a/b;
    }

    public int multiply(int a , int b){
        return a*b;
    }
}
