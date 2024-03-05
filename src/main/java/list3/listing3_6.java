package list3;

class Ten {
    int x;
    // объявляя конструктор, мы закрываем доступ
    // к конструктуру по умолчанию
    Ten() {

        x = 10;
    } // Ten () constructor
} // Ten class

class TenDemo {

    public static void main(String[] args) {

        Ten s1 = new Ten();
        Ten s2 = new Ten();
        if (s1.x == s2.x)
            System.out.println(s1.x + " = " + s2.x);
    } // main(String[])
} // TenDemo class
