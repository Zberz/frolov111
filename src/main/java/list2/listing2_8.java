package list2;
// пример использования типа данных boolean
// сохраните в файл BoolDemo.java
class BoolDemo {
    public static void main(String[] args){
        boolean b;

        b=false;
        System.out.println("b равно "+b);
        b=true;
        System.out.println("b равно "+b);

        //пременная логического типа может стоять
        //в условии операта if
        if (b) System.out.println("Как вы думаете, увидите ли вы эту строчку?");

        //операторы сравнения возвращают логическое значение
        System.out.println("выражение 10 > 9 имеет значение "+(10>9));

    }//main(String[] args)
}//BoolDemo class
