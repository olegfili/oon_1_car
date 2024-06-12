package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, String productionCountry, int productionYear, int maxSpeed) {
        super(brand, model, color, productionCountry, productionYear, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке!");
    }

    public String toString () {
        return "Автобус " + getBrand() + ", модель - " + getModel() + " , " + getProductionYear()  + " год выпуска в " + getProductionCountry() + " , цвет - " + getColor() + ", максимальная скорость - " + getMaxSpeed() + " км/ч ";
    }
}
