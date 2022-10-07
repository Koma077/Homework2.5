public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", "Granta", 1.6, BodyType.SEDAN);
        Car car1 = new Car("Toyota", "Camry", 1.8, BodyType.COUPE);
        Car car2 = new Car("Kia", "K5", 2.0, BodyType.HATCHBACK);

        Bus bus = new Bus("Газ", "Газель", 2.0, Capacity.SMALL);
        Bus bus1 = new Bus("Hyundai", "Mighty", 2.5, Capacity.EXTRA_LARGE);
        Bus bus2 = new Bus("Mercedes", "Atego", 3.0, Capacity.MEDIUM);

        Truck truck = new Truck("Volvo", "9500", 7.7, LoadCapacity.N3);
        Truck truck1 = new Truck("Hyundai", "H350", 2.5, LoadCapacity.N1);
        Truck truck2 = new Truck("Mercedes", "Sprinter", 3.0, LoadCapacity.N2);


        Driver driver = new CategoryB("Макаров Григорий Вечиславович", true, 12);
        Driver driver1 = new CategoryC("Калашников Валерий Анатольевич", true, 15);
        Driver driver2 = new CategoryD("Иконников Никита Сергеевич", true, 10);

        printInfo(driver, car1);
        printInfo(driver1, truck2);
        printInfo(driver2, bus);


    }
    public static void printInfo(Driver<?> driver, Transport transport){
        System.out.println("Водитель " + driver.getFio() + " управляет автомобилем " +
                transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
        transport.typeOfCar();
    }


}