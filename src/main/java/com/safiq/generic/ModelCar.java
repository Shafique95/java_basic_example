package main.java.com.safiq.generic;

public class ModelCar<A,B,D> {
   private A carName;
    private B carColor;
    private D carModel;
    private  ModelCar(A a, B b, D c){
        this.carName=a;
        this.carColor=b;
        this.carModel=c;
    }
    public ModelCar(){}
    public void setCarName(A a){
        this.carName=a;
    }
    public void setCarColor(B c){
        this.carColor=c;
    }
    public void setCarMode(D d){
        this.carModel=d;
    }
    public A getCarName(){
        return carName;
    }
    public B getCarColor(){
        return carColor;
    }
    public D getCarModel(){
        return carModel;
    }
    public void setCarColor(B b , D d){
        this.carColor=b;
        this.carModel=d;
    }
    public static void main(String[] args) {
        System.out.println("ok");
        
       
    }
}
