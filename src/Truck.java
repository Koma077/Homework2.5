public class Truck extends Transport implements Competing {

    private LoadCapacity loadCapacity;


    public Truck(String brand, String model, double engineCapacity, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMovement() {
        System.out.println("Начать движение");

    }
    @Override
    public void endMovement() {
        System.out.println("Закончить движение");

    }

    @Override
    public void typeOfCar() {
        if(loadCapacity == null){
            System.out.println("Данных по авто недостаточно");
        }else{

            System.out.println("Гузоподъемность авто : " + loadCapacity.getFrom());;
        }

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");

    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");

    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");

    }

}
