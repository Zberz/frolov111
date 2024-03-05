package list3;

class Vehicle2 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    // объявляем метод,вычисляющий пройденный путь.
    // метод принимает параметр interval, задающий время,
    // и не возвращает никакого значения ( void)
    void distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("пдройденный путь, равный " + value + " км.");
    } // distance (double interval)
} // Vehicle class

class VehicleMethodDemo {

    public static void main(String[] args) {

        Vehicle2 car = new Vehicle2();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        //другой экземпляр класса Vehicle
        Vehicle2 bus = new Vehicle2();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        // расчет пути, пройденного за 0.5 часа
        double time = 0.5;
        System.out.print("автомобиль с " + car.passengers + " пассажирами ");
        car.distance(time);
        System.out.print("автобус c " + bus.passengers + " пассажирами ");
        bus.distance(time);

    } //main(String[])
} // VehicleMethodDemo class
