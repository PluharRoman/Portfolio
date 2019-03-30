

public class MAIN {

    public static void main(String[] args ){
        Car bmw = new Car();
        bmw.speed = 200;
        bmw.setAll("M3",1345.5f,"Blue", false);
        bmw.printAll();
        System.out.println(bmw.speed);

        Car mercedec = new Car();
        mercedec.speed = 320;
        mercedec.setAll("E350",1470.2f, "Dark Grey", true);
        mercedec.printAll();
        System.out.println(mercedec.speed);


    }
}
