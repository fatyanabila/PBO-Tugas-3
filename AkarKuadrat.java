import java.util.Scanner;

public class AkarKuadrat {
private double a;
private double b;
private double c;
private double x1;
private double x2;

public AkarKuadrat (double a, double b, double c) {
 this.a = a;
 this.b = b;
 this.c = c;
 calcX();
}

private double calcDiscriminant (){
 return b*b - 4*a*c;
}

private double imajiner() {
 return -b/(2*a);
 }

private void calcX() {
 double d = calcDiscriminant ();
 if (d > 0) {
  x1 = (-b + Math.sqrt(d))/(2*a);
  x2 = (-b - Math.sqrt(d))/(2*a);
  //fValid = true;
  }
 }
 
public double getA() {
 return a;
 }
public double getB() {
 return b;
 }
public double getC() {
 return c;
 }
public double getx1() {
 return x1;
 }
public double getx2() {
 return x2;
 }
 
static void test() {
 System.out.println ();

 Scanner angka = new Scanner(System.in);
 System.out.print("Masukan nilai a : ");
 double a = angka.nextDouble();
 System.out.println();
 System.out.print("Masukan nilai b : ");
 double b = angka.nextDouble();
 System.out.println();
 System.out.print("Masukan nilai c : ");
 double c = angka.nextDouble();
 System.out.println();
 
 
 AkarKuadrat s = new AkarKuadrat(a,b,c);
 System.out.println("Nilai diskriminan : " +s.calcDiscriminant());
 System.out.println();
 if (s.calcDiscriminant() > 0){
  System.out.println ("Persamaan  "+ s.getA() + "X^2" + " + " + s.getB()  + "X" + " + "+ s.getC()+ " Memiliki 2 akar berebeda dan keduanya real "+ s.getx1() +" atau "+ s.getx2());
  }
 else if (s.calcDiscriminant() < 0) {
  System.out.println ("Persamaan  " + s.getA() + "X^2" + " + " + s.getB()  + "X" + " + "+ s.getC()+ " Akar-akar persamaan imaginer ");
  }
 else {
  System.out.println ("Persamaan  " + s.getA() + "X^2" + " + " + s.getB()  + "X" + " + "+ s.getC()+ " Akar-akar persamaan nyata tetapi kembar, yaitu " + s.imajiner());
 }
 }
 public static void main (String [] args) {
  test();
 }
}