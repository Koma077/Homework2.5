public class CategoryB extends Driver {

    public CategoryB(String fio, boolean driverLicense, int experience) {
            super(fio, driverLicense, experience);
        }


        @Override
        public void startMovement() {
            System.out.println("Начать движение");
        }

        @Override
        public void stop() {
            System.out.println("Остановиться");

        }

        @Override
        public void refuelTheCar() {
            System.out.println("Заправить авто");

        }
    }
