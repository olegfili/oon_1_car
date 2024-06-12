package transport;

public class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, String color, String productionCountry, int productionYear, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        if (productionYear <=0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }
        public String getModel () {
            return model;
        }
        public void setModel (String model){
            if (model == null || model.isEmpty()) {
                this.model = "default";
            } else {
                this.model = model;
            }
        }
        public int getProductionYear () {
            return productionYear;
        }
        public String getProductionCountry () {
            return productionCountry;
        }
        public String getColor () {
            return color;
        }
        public void setColor (String color){
            if (color == null || color.isEmpty()) {
                this.color = "белый";
            } else {
                this.color = color;
            }
        }
        public int getMaxSpeed () {
            return maxSpeed;
        }
        public void setMaxSpeed (int maxSpeed){
        if (maxSpeed <= 0 ) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
        }
    }
