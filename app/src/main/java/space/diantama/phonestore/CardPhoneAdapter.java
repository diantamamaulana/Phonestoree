package space.diantama.phonestore;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardPhoneAdapter extends RecyclerView.Adapter<CardPhoneAdapter.CardViewHolder> {
    private ArrayList<Phone> listPhone;
    private Context context;

    public CardPhoneAdapter(ArrayList<Phone> phones, Context context) {
        this.listPhone = phones;
        this.context = context;
    }

    @NonNull

    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_phone, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        final Phone phone = listPhone.get(position);

        Glide.with(holder.itemView.getContext())
                .load(phone.getFoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.tvName.setText(phone.getName());
        holder.tvHarga.setText(phone.getHarga());
        holder.tvDeskripsi.setText(phone.getDeskripsi());
        holder.btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Buy"+
                        listPhone.get(holder.getAdapterPosition()).getName(),Toast.LENGTH_LONG).show();
            }
        });
        holder.btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra(DetailActivity.EXTRA__NAME, phone.getName());
                i.putExtra(DetailActivity.EXTRA_HARGA,phone.getHarga());
                i.putExtra(DetailActivity.EXTRA_FOTO,phone.getFoto());
                context.startActivity(i);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listPhone.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvHarga, tvDeskripsi;
        Button btn_buy;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvHarga = itemView.findViewById(R.id.tv_item_price);
            tvDeskripsi = itemView.findViewById(R.id.tv_item_deks);
            btn_buy = itemView.findViewById(R.id.btn_set_buy);
        }
    }
}

