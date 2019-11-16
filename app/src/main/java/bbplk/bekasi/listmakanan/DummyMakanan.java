package bbplk.bekasi.listmakanan;

import java.util.ArrayList;

public class DummyMakanan {
    public static ArrayList<Makanan> listMakan(){

        //buat variabel arraylist
        //static bisa diambil dikelas lain dibuat static
        //sebagai penjelas
        //R.adalah resource

        ArrayList<Makanan> makanan = new ArrayList<>();
        makanan.add(new Makanan(1,"Ayam goreng",R.drawable.ayam,"Ayam goreng adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(2,"rendang",R.drawable.rendang, "rendang  adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(3,"bakso",R.drawable.bakso, "bakso adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(4,"sate",R.drawable.sate, "sate adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(5,"soto",R.drawable.soto, "soto adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(6,"Ayam goreng",R.drawable.ayam,"Ayam goreng adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(7,"rendang",R.drawable.rendang, "rendang  adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(8,"bakso",R.drawable.bakso, "bakso adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(9,"sate",R.drawable.sate, "sate adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(10,"soto",R.drawable.soto, "soto adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        return makanan;


    }
}
