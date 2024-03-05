package list3;

class Vehicle4 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    // объявляем метод, вычисляющий пройденный путь.
    // теперь он возвращает вычисленное значение типа double
    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    } // distance(double interval)
} // Vehicle4 class

class VehicleRetMethod {

    public static void main(String[] args) {

        Vehicle4 car = new Vehicle4();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

    // другой экземпляр класса Vehicle
        Vehicle4 bus = new Vehicle4();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

    // расчет пути, пройденного за 0.5 часа
        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.print("автомобиль с " + car.passengers + " пассажирами ");
        System.out.println("пройдет за полчаса путь " + distanceCar + " км.");
        System.out.print("автобус с " + bus.passengers + " пассажирами ");
        System.out.println("пройдет за полчаса путь " + distanceBus + " км.");

    } // main(String[])

} // VehicleRetMethod class
