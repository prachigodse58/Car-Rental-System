class Car{

    private String carId;
    private String brand ;
    private String model;
    private double bestPrice;
    private boolean isAvailable= true;

    public Car(String carId , String brand , String model, double bestPrice , boolean isAvailable){

        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.bestPrice = bestPrice;
        this.isAvailable = isAvailable;

        @getter
        public String getcarId(){
            return carId;
        }
    }
}