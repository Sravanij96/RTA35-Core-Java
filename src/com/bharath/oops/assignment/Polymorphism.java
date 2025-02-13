package com.bharath.oops.assignment;

class Payment{

    private double amount;


    public void processPayment(double amount){
        this.amount = amount;
        System.out.println("Each payment method has its own implementation");
    }
}

class CreditCardPayment extends Payment{
   @Override
   public void processPayment(double amount) {
       System.out.println("Payment process is hapenning through CreditCard is :: " +amount);
   }
}
class PayPalPayment extends Payment{
@Override
    public void processPayment(double amount){
    System.out.println("Payment process is hapenning through PayPal is :: " +amount);
}
}
class UPIPayment extends Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Payment process is hapenning through UPI is :: " +amount);
    }
}
public class Polymorphism {
    public static void main(String[] args) {

       //method overriding
        Payment payment;
        payment = new CreditCardPayment();
        payment.processPayment(230.50);

        payment = new PayPalPayment();
        payment.processPayment(560.00);

        payment = new UPIPayment();
        payment.processPayment(9000.00);


        //method overloading
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.sum(10,20);
        methodOverloading.sum(10,20,30);
        methodOverloading.sum(10,20,30.84787F);
        methodOverloading.sum(10,20,30.00F,30.45785);
    }
}

class MethodOverloading{
    int x;
    int y;
    int z;
    double d;
    float f;
    public void  sum(int x, int y){
        int add = x+y;
        System.out.println(add);

    }
    public  void sum(int x, int y,int z){
        int add = x+y+z;
        System.out.println(add);
    }
    public  void sum(int x, int y,float f){
        float add = x+y+f;
        System.out.println(add);
    }
    public  void sum(int x, int y,float f,double d){
      double add = x+y+f+d;
        System.out.println(add);
    }
}