package drone;

public class Drone {

    public static void main(String[] args) {
        
        Drone_1 drone = new Drone_1();
        
        drone.energi = 11;
        drone.kecepatan = 50;
        drone.ketinggian = 0;
        drone.merek = "Cina";
        
        drone.terbang();
        drone.maju();
        drone.belok();
        drone.mundur();
        drone.matikanMesin();
    }
    
}
