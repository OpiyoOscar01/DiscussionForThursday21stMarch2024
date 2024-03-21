package ConceptPackage;

public class Main {
public static void main(String[] args) {
student st=new student();
student kk=new student();
st.homework();
st.draw();
double p=st.addition(8,4);
System.out.println(kk.addition(7,8));
System.out.println("The sum of your points is "+st.addition(3,7));
System.out.println(p);
System.out.println(kk.divide(2));
}
}
