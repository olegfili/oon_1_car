package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, String productionCountry, int productionYear, int maxSpeed) {
        super(brand, model, color, productionCountry, productionYear, maxSpeed);
    }
    public String toString () {
        return "Автобус " + getBrand() + ", модель - " + getModel() + " , " + getProductionYear()  + " год выпуска в " + getProductionCountry() + " , цвет - " + getColor() + ", максимальная скорость - " + getMaxSpeed() + " км/ч ";
    }
}
