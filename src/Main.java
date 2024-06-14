import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", " Granda",  1.7,"желтый",2015, "России","седан","МКПП","с222сс222",5,true,null,100 );
        System.out.println(lada);
        Car audi =  new Car("Audi", " A8 50 L TDI quattro", 3.0,"черный", 2020, "Германии","купе","АКПП","с333сс333",5,true, new Car.Key(true,true),100);
        System.out.println(audi);
        Car bmw =  new Car("BMW", " Z8", 3.0, "черный", 2021, "Германии","купе","АКПП", "с444сс444", 5, true,new Car.Key(true,false),120);
        System.out.println(bmw);
        Car kia = new Car("Kia"," Sportage 4-го поколения",  2.4, "красный",2018, "Южной Кореи","купе", "АКПП", "с555сс555", 5, true,new Car.Key(false,true),130);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", " Avante",  1.6, "оранжевый", 2016, "Южной Кореи","купе", "АКПП", "с666сс666",5,false,null,50);
        System.out.println(hyundai);
        hyundai.changeTyres(7);
        System.out.println(hyundai);
        hyundai.refill();

        Train swallow = new Train("Поезд Ласточка","B-901",null,"Росиии",2011,301,3500,null, "Белорусского вокзала", "Минск-Пассажирский", 11);
        System.out.println(swallow);
        Train leningrad = new Train("Поезд Ленинград", "D-125",null,"России",2019,270,1700,null,"Ленинградского вокзала","Ленинград-Пассажирский",8);
        System.out.println(leningrad);
        leningrad.refill();

        Bus bus = new Bus("Volvo", "", "синий", "России",2010,100);
        System.out.println(bus);
        Bus bus1 = new Bus("Mercedes","","зеленый","Германии",2020,110);
        System.out.println(bus1);
        Bus bus2 = new Bus("Volvo","","синий", "Швеции",2023,130);
        System.out.println(bus2);
        bus2.refill();



    }
}