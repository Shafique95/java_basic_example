package main.java.com.safiq.generic;

public class GenericExample<A,B> {
    A first;
    B second;
   public GenericExample(A a,B b){
    this.first=a;
    this.second=b;
   }
public A getFirst(){
    return first;
}
 public B getSecond(){
    return second;
 }   
}
