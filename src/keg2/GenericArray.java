package keg2;

import java.util.ArrayList;
                                                            // Class GenericArray 
public class GenericArray <K,V>{
    ArrayList<Generic> list = new ArrayList<>();
    Generic<String, String> hewan1 = new Generic<>();
    Generic<String, String> hewan2 = new Generic<>();       // inisialisasi objek key dan value
    Generic<String, String> hewan3 = new Generic<>();
    int total = 0;
    
    public String PrintList(){
        System.out.println(hewan1);
        System.out.println(hewan2);                         // menampilkan semua item dengan informasi key dan value
        System.out.println(hewan3);                     
        return null;
    }

    public int getTotalItem(){
        System.out.println("Total Item : " + list.size());  // menampilkan jumlah data yang sudah di masukkan 
        return total;
    }

    public void InsertItem(){
        hewan1.Generic("Harimau", "Karnivora");
        list.add(hewan1);
        hewan2.Generic("Ikan Lele", "Omnivora");            // isi data
        list.add(hewan2);
        hewan3.Generic("Sapi", "Herbivora");
        list.add(hewan3);
    }
}
