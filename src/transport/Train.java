package transport;

public class Train extends Transport {
    private int price;
    private String travelTime;
    private String nameStation;
    private String finalStop;
    private int numberWagons;


    public Train(String brand, String model, String color, String productionCountry, int productionYear, int maxSpeed,
                 int price, String travelTime, String nameStation, String finalStop, int numberWagons) {
        super(brand, model, color, productionCountry, productionYear, maxSpeed);
        setPrice(price);
        setTravelTime(travelTime);
        setNameStation(nameStation);
        setFinalStop(finalStop);
        setNumberWagons(numberWagons);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0 ) {
            this.price = 1000;
        } else {
            this.price = price;
        }
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = nameStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        if (numberWagons <= 0) {
            this.numberWagons = 1;
        } else {
            this.numberWagons = numberWagons;
        }
    }
    public String toString () {
        return getBrand() + ", модель: " + getModel() + ", " + getProductionYear() + " год выпуска в " + getProductionCountry() + ", скорость передвижения - " + getMaxSpeed() + " км/ч, отходит от " + getNameStation() + " и следует до станции " + getFinalStop() + ". Цена поездки - " + getPrice() + " рублей, в поезде " + getNumberWagons() + " вагонов" ;
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем!");
    }
}
