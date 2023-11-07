package main.java.com.safiq.pass_by_value_pass_by_refference;

public class TestPassValue {
    public static void main(String[] args){
        int passValueIs=34;
        PassByValue psvl=new PassByValue();
        psvl.tryToChangeValue(passValueIs);
        // here passValue is actual parameter
        System.err.println(passValueIs);
    }
    
}
