public class Car extends Transport implements Competing {

    private BodyType bodytype;

    public Car(String brand, String model, double engineCapacity, BodyType bodytype) {
        super(brand, model, engineCapacity);
        this.bodytype = bodytype;
    }

    public BodyType getBodytype() {
        return bodytype;
    }

    public void setBodytype(BodyType bodytype) {
        this.bodytype = bodytype;
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
        if(bodytype == null){
            System.out.println("Данных по авто недостаточно");
        }else{
            System.out.println("Тип авто : " + bodytype);;
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