package bbplk.bekasi.listmakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    //mewariskan recview digunakan extends
    //alt enter untuk membuat class makananviewholder
    //AdapterMakanan Alt enter implement methods dipilih semua

public class AdapterMakanan extends RecyclerView.Adapter <AdapterMakanan.MakananViewHolder>  {
    //mengambil root dari activity untuk diakses
    Context context;
    List<Makanan> dataMakanan;

    public AdapterMakanan(Context context, List<Makanan> dataMakanan) {
        this.context = context;
        this.dataMakanan = dataMakanan;
    }

    @NonNull
    @Override
    //set layout
    public MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.gird_simple,parent,false);
        return new MakananViewHolder(view);
    }

    @Override
    //memasukan data ke layout
    //nama di get sesuai indeks
    public void onBindViewHolder(@NonNull MakananViewHolder holder, int position) {
        holder.nama.setText(dataMakanan.get(position).getNama());

        //memuculkan gambar
        Glide.with(context).load(dataMakanan.get(position).getPhoto()).into(holder.gambar);
    }

    @Override
    //mengatur jumlah data yang ada
    public int getItemCount() {
        return dataMakanan.size();
    }
    //extends
    //binding data dengan view
    //memasukan data ke layout
    //makananviewholder ladalah kelas untuk inisialisasi id
    public class MakananViewHolder extends RecyclerView.ViewHolder {

        ImageView gambar;
        TextView nama;
    //Item view diambil dari constructor
        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.image_makanan);
            nama = itemView.findViewById(R.id.nama_makanan);
        }
    }
}
