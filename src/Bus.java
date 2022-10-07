public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineCapacity, Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
        if(capacity == null){
            System.out.println("Данных по авто недостаточно");
        }else{
            System.out.println("Вместимость автобуса : от " + capacity.getFrom() + " до " + capacity.getTo());
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