import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", " Granda",  1.7,"желтый",2015, "России","седан","МКПП","с222сс222",5,true,null);
        System.out.println(lada);
        Car audi =  new Car("Audi", " A8 50 L TDI quattro", 3.0,"черный", 2020, "Германии","купе","АКПП","с333сс333",5,true, new Car.Key(true,true));
        System.out.println(audi);
        Car bmw =  new Car("BMW", " Z8", 3.0, "черный", 2021, "Германии","купе","АКПП", "с444сс444", 5, true,new Car.Key(true,false));
        System.out.println(bmw);
        Car kia = new Car("Kia"," Sportage 4-го поколения",  2.4, "красный",2018, "Южной Кореи","купе", "АКПП", "с555сс555", 5, true,new Car.Key(false,true));
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", " Avante",  1.6, "оранжевый", 2016, "Южной Кореи","купе", "АКПП", "с666сс666",5,false,null);
        System.out.println(hyundai);
        hyundai.changeTyres(7);
        System.out.println(hyundai);
    }
}