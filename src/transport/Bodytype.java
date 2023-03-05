package transport;

public enum Bodytype {
       TYPE1 ("SEDAN") ,
        TYPE2 ("HATCHBACK"),
        TYPE3 ("COUPE") ,
        TYPE4 ("UNIVERSAL") ,
        TYPE5 ("SUV") ,
        TYPE6 ("CROSSOVER") ,
        TYPE7 ("PICKUP"),
        TYPE8 ("VAN"),
        TYPE9 ("MINIVAN");

private String name;



        Bodytype(String name) {
                this.name = name;

        }
        @Override
        public String toString() {
                return "Тип кузова" + name ;
        }
}


