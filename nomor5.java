import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) throws Exception {
    //String[] nama = {"G","U","C","Y"};
    ArrayList <String> nama = new ArrayList<String>();
    nama.add("G"); 
    nama.add("U"); 
    nama.add("C"); 
    nama.add("Y"); 

    System.out.println("Arraylist sebelum remove:");
    for(String var: nama){
         System.out.println(var);
    }

    //Tentukan hasil yang didapatkan ketika dilakukan perintah remove(0), remove(3), remove(2)

    //System.out.println(nama.remove(0));
    //System.out.println(nama.remove(3));
    //System.out.println(nama.remove(2));

    nama.remove(2);
    System.out.println("Arraylist setelah remove:");
    for(String var2: nama){
        System.out.println(var2);
    }
    
}
}
