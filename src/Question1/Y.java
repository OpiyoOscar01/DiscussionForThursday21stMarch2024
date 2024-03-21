package Question1;

public class Y implements C {
public double mA(double a){
return 2.9*a;
}
public void mB(int b){
System.out.println("Play song number "+b);
}

public static void main(String[] args) {
Y yy= new Y();
System.out.println(yy.mA(2));
System.out.println("The result of multiplication is "+yy.mA(2));
yy.mB(3);
C.mC();
System.out.println("2 plus KC gives us "+(C.KC+2));

}
}
