package list2;
// демонстрация команды if
// сохраните текст в файл с именем IfStatementDemo.java
class IfStatementDemo {
    public static void main(String[] arge){
        int a,b,c,d;
        a=2;
        b=3;
        System.out.println("a равно 2,b равно 3");
        if (a<b) System.out.println("a меньше b");
        if (a>b) System.out.println("этот текст вы никогда не увидите");
        System.out.println("");
        c=a-b; // c будет равно -1
        System.out.println("c равно -1");
        if (c>=0) System.out.println("с имеет положительное значение");
        if (c<0) System.out.println("c имеет отрицательное значение");
        System.out.println("");
        d=b-a; //d равно 1
        System.out.println("d равно 1");
        if (d>=0) System.out.println("d имеет положительное значение");
        if (d<0)  System.out.println("d имеет отрицательное значение");
        System.out.println("");
        if (a+c!=b)System.out.println("а плюс с не равняется b");
        if (a+d==b) System.out.println("a плюс d равняется b");
    }//main()method
}//IfStatementDemo class