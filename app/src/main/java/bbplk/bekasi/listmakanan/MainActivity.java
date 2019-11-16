package bbplk.bekasi.listmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //inisialisasi
    RecyclerView recyclerView;
    AdapterMakanan adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //untuk manggil data pada makanan
        adapter = new AdapterMakanan(getApplicationContext(),dataMakanan());

        recyclerView = findViewById(R.id.recycle_makanan);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(adapter);
    }
    //method untuk mengambil data
    ArrayList<Makanan> dataMakanan () {
        return DummyMakanan.listMakan();
    }
}
