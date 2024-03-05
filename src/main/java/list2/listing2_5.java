package list2;
// пример использования блоков для выполнения нескольких
// операторов как одного
// сохраните исходный код в файл с именем BlockDemo.java
class BlockDemo {
    public static void main(String[] args){
        double i,j,d;
        i=50;
        j=150;
        if (i !=0) {
            System.out.println("делитель не равен нулю");
            d=j/i;
            System.out.println(" j/i равно "+d);
        }//if(i !=0)
    }//main(String[])
}//BlockDemo class
