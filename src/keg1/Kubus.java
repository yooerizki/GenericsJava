package keg1;

public class Kubus <T extends Number> {
    private T Panjang;
    private T Lebar;                        // Generic class
    private T Tinggi;
    
public void Kubus (T panjang, T lebar, T tinggi){
    this.Panjang = panjang;
    this.Lebar = lebar;                  // inisialisasi variabel 
    this.Tinggi = tinggi;
}

public String toString(){                // menampilkan nilai panjang,tinggi,lebar dalam bentuk string
    return "Panjang" + Panjang +"Lebar" + Lebar + "Tinggi" + Tinggi;      
}

public void getResultAsDouble(){        // Mendapatkan hasil perhitunganvolume dalam bentuk tipedouble.
    double Volume = Panjang.doubleValue() * Lebar.doubleValue() * Tinggi.doubleValue();
    System.out.println("Volume");
}

public void getResultAsInteger(){       // Mendapatkan hasil perhitunganvolume dalam bentuk tipeinteger   
    int Volume = Panjang.intValue() * Lebar.intValue() * Tinggi.intValue();
    System.out.println("Volume");
}

public void getResultAsLong(){          // Mendapatkan hasil perhitunganvolume dalam bentuk tipe long
    long Volume = Panjang.longValue() * Lebar.longValue() * Tinggi.longValue();
    System.out.println("Volume");
}
}