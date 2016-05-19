/**
 * Created by nurudeenlawal on 5/19/16.
 */
public class Calculator {
    static double add(double a, double b){
        return (a+b);
    }
    static double subtract(double a, double b){
        return (a-b);
    }
    static double multiply(double a, double b){
        return (a*b);
    }
    static double divide(double a, double b) throws DivisionByZeroException{
        if(b == 0 )throw new DivisionByZeroException();
        return (a/b);
    }
    static double squareRoot(double a) throws ComplexNumberException{
        if(a%1 !=0) throw new ComplexNumberException();
        return  Math.sqrt(a);
    }
}
class ComplexNumberException extends Exception{}
class DivisionByZeroException extends Exception{}