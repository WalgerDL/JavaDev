package sber.homeWork;

import sber.Main;

import java.sql.SQLOutput;

public class ShildtBook {
    int a, b;

    ShildtBook(int i, int j) {
        a=i;
        b=j;
    }
    void meth (ShildtBook o){
        o.a*=2;
        o.b/=2;
    }
}
class PassObjRe{
    public static void main(String[] args) {
        ShildtBook ob = new ShildtBook(15,20);
        System.out.println("ob.a & ob.b до вызова: "+ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println("ob.a & ob.b после вызова: "+ob.a+" "+ob.b);
    }
}
class Factorial{
    int fact (int n){
        int result;
        if(n==1) return 1;
        result=fact(n-1)*n;
        return result;
    }
}
class Recursion{
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial 3 = "+ f.fact(3));
        System.out.println("Factorial 4 = "+ f.fact(4));
        System.out.println("Factorial 5 = "+ f.fact(5));
    }
}
class CommandLine {
    public static void main(String[] args)   {
        for(int i=0; i<args.length; i++)
            System.out.println("args[" +i+ "]: " +args[i]);
    }
}

class PassArray{
    static void vaTest(int[] v){
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x:v)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
    int[] n1 ={10};
    int[] n2 ={1,2,3};
    int[] n3 ={};
    vaTest(n1);
    vaTest(n2);
    vaTest(n3);
    }
}
class VarArgs {
    static void vaTest(int ... v){
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x:v)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
class VarArgs3{
    static void vaTest(int ...v){
        System.out.print("vaTest(int...v): "+"Количество аргументов: "+v.length+" Содержимое: ");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean...v): "+"Количество аргументов: "+v.length+" Содержимое: ");
        for(boolean x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    static void vaTest(String msg, int ...v) {
        System.out.print("vaTest(String msg, int...v): " + msg + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Проверка: ", 10,20);
        vaTest(true,false,false);
    }
}
abstract class Figure{
    double dim1;
    double dim2;

    Figure (double a, double b){
        dim1=a;
        dim2=b;
    }
   abstract double area();
       // System.out.println("Площадь фигуры не определена.");
        //return 0;

}
class Rectangle extends Figure{
    Rectangle (double a, double b){
        super(a, b);
    }
    double area (){
        System.out.println("В области четырехугольника.");
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle (double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("В области треугольника.");
        return dim1*dim2/2;
    }
}
class AbstractAreas{
    public static void main(String[] args) {
       // Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figuref;

        figuref=r;
        System.out.println("Площадь равна "+figuref.area());

        figuref=t;
        System.out.println("Площадь равна "+figuref.area());

       // figuref=f;
       // System.out.println("Площадь равна "+figuref.area());
    }
}
