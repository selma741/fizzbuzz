package com.controle.tdd;

public class FizzBuzz {
    public String de(int nbre){

if(nbre%3==0){
    System.out.println("Fizz");
    //return"Fizz";
}
if(nbre%5==0){
    System.out.println("Buzz");
}
if(nbre%3==0 && nbre%5==0){
     System.out.println("FizzBuzz");
}
return String.valueOf(nbre);
    }
    public static void main(java.lang.String[] args) {
        FizzBuzz FB=new FizzBuzz();
    for(int i=1;i<=20;i++)
        System.out.println(FB.de(i));
       }
    }

