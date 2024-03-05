package list2;

class NestVar {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("count = " + count);
        {
            // ошибка: переменная count уже объявленна.
            // Закомментируйте следующую строку
            int line_count = 2;
            System.out.println("Первый независымый блок: count = " + line_count);

            int n = 3;
            System.out.println("Первый независымый блок: n = " + n);
        }
        {
            int n = 5;
            System.out.println("Второй независымый блок: n = " + n);

        }

    } // main(String[]) method

} // NestVar class
