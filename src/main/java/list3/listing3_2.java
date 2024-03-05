package list3;

class Vehicle1 {
    int passengers; // кол-во пассажиров
    int wheels; // кол-во кослес
    int maxspeed; // максимальная скорость
    int burnup; // расход топлива
} // Vehicle class

class MoreVehiclesDemo {

    public static void main(String[] args) {

        // объект car 1
        Vehicle1 car1 = new Vehicle1();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        // другой экземпляр класса Vehicle: объект bus1
        Vehicle1 bus1 = new Vehicle1();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;

        // расчет пути, пройденного за 1.25 часа
        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;

        System.out.print("car1 может проехать за 1 час 15 мин. расстояние в ");
        System.out.print(distanceCar + "км с " + car1.passengers);
        System.out.println(" пассажирами. ");
        System.out.print("bus1 может проехать за 1 час 15 мин. расстояние в ");
        System.out.print(distanceBus + "км с " + bus1.passengers);
        System.out.println(" пассажирами.");
    } //main(String[])
} // VehicleDemo class
