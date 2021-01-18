package keg1;

public class App {
    public static void main (String[]args){
        Kubus<Double> kubusDouble= new Kubus<>();
        Kubus<Integer> kubusInteger = new Kubus<>();    //main methon untuk memanggil method,objek di class lainya 
        Kubus<Long> kubusLong = new Kubus<>();
        
        kubusDouble.Kubus(3.5,3.5,3.5);
        System.out.println(kubusDouble.toString());
        kubusDouble.getResultAsDouble();
        
        kubusInteger.Kubus(20,20,20);
        System.out.println(kubusInteger.toString());    // isi data kubus
        kubusInteger.getResultAsInteger();
      
        kubusLong.Kubus(50L, 50L, 50L);
        System.out.println(kubusLong.toString());
        kubusLong.getResultAsLong();

        
        
    }
}
