package keg2;
                                                    // Class Generic 
public class Generic <K,V>{
    private K k;
    private V v;

    public void Generic (K Key, V Value){
        this.k = Key;                                // inisialisasi key dan value
        this.v = Value;
    }

    public String toString(){
        return ("Hewan : " + k + " Jenis : " + v);  //  mengembalikan nilai variabel key dan value
    }
    
}
