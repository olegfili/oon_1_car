package transport;

public class Car extends Transport {
    private double engineVolume;
    private String gear;
    private final String bodyType;
    private String regNumber;
    private final int capacity;
    private boolean summerTyres;
    private Key key;
    public static class Key {
        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }
        public boolean isRemoteRun() {
            return remoteRun;
        }
        public boolean isWithoutAccess () {
            return withoutAccess;
        }
        public String toString () {
            return (remoteRun?"удаленный запуск двигателя":"без удаленного заупска двигателя") + ", " + (withoutAccess?"бесключевой доступ":"бесключевой доступ отсутвует");
        }
    }

    public Car (String brand,
                String model,
                double engineVolume,
                String color,
                int productionYear,
                String productionCountry,
                String bodyType,
                String gear,
                String regNumber,
                int capacity,
                boolean summerTyres,
                Key key,
                int maxSpeed) {
        super(brand, model, color, productionCountry, productionYear, maxSpeed);
        setEngineVolume(engineVolume);
        setGear(gear);
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "седан";
        }
        this.bodyType = bodyType;
        setRegNumber(regNumber);
        if (capacity <=0) {
            capacity = 0;
        }
        this.capacity = capacity;
        this.summerTyres = summerTyres;
        setKey(key);
    }
    public double getEngineVolume () {
        return engineVolume;
    }
    public void setEngineVolume (double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public String getGear () {
        return gear;
    }
    public void setGear (String gear) {
        if (gear == null || gear.isEmpty()) {
            gear = "МКПП";
        }
        this.gear = gear;
    }
    public String getRegNumber () {
        return regNumber;
    }
    public void setRegNumber (String regNumber) {
        if (regNumber == null || regNumber.isEmpty()){
            regNumber = "х000хх000";
        }
        this.regNumber = regNumber;
    }
    public Key getKey () {
        return key;
    }
    public void setKey (Key key) {
        if ( key == null) {
            key = new Key(false,false);
        }
        this.key = key;
    }
    public void changeTyres (int month) {
       if ((month >=11 && month <=12) || (month >=1 && month <=3)) {
           summerTyres = false;
       }
       if (month >=4 && month <=10) {
           summerTyres = true;
       }
    }
    public String toString () {
        return getBrand() + getModel() + ", " + getProductionYear() + " год выпуска, сборка в " + getProductionCountry() + ", цвет кузова: " + getColor() + ", объем двигателя: " + engineVolume + " л, тип кузова: " + bodyType + ", коробка передач: " + gear + ", регистрационный номер: " + regNumber + ", кол-во мест: " + capacity + ", " + (summerTyres?"летняя":"зимняя") + " резина" + ", " + key;
    }
}
