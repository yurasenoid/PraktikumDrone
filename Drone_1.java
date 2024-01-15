package drone;

public class Drone_1 {
    // atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    // method
    void terbang(){
        energi= 11;
        if(energi > 10){
            // terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone terbang...");
        } else {
            System.out.println("Energi lemah: Drone nggak bisa terbang");
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }

    void turun(){
        ketinggian = 0;
        energi = 11;
        System.out.println("Drone turun");
    }

    void belok(){
        energi=11;
        System.out.println("Drone belok");
    }

    void maju(){
        energi=11;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur(){
        energi=11;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}

