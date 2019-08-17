package space.diantama.phonestore;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity  {

    public static final String EXTRA_FOTO = "extra_foto";
    public static final String EXTRA__NAME = "extra_name";
    public static final String EXTRA_HARGA = "extra_harga";

    ImageView fotodetail;
    TextView merkhp, hargahp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String foto = getString(EXTRA_FOTO);
        final String name = getString(EXTRA__NAME);
        final String harga = getString(EXTRA_HARGA);

        fotodetail  = findViewById(R.id.fotohp);
        merkhp = findViewById(R.id.namehp);
        hargahp = findViewById(R.id.harga_hp);

        Button buy = findViewById(R.id.Buy) ;

        Glide.with(this).load(getString(EXTRA_FOTO)).into(fotodetail);
        merkhp.setText(getString(EXTRA__NAME));
        hargahp.setText(getString(EXTRA_HARGA));

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder success = new AlertDialog.Builder(DetailActivity.this);
                success.setTitle("Pemabayaran Berhasil");
                success.setMessage("Nama HP = " + name + "\n" +
                "Harga = " +harga);
                AlertDialog alertDialog = success.create();
                alertDialog.show();

            }
        });
    }

    private String getString(String a) {
        return getIntent().getStringExtra(a);
    }
}
