package com.bluohazard.aplikasidoaharianmuslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bluohazard.aplikasidoaharianmuslim.Adapter.DaftarAdapter;
import com.bluohazard.aplikasidoaharianmuslim.Model.Daftar;

import java.util.ArrayList;
import java.util.List;

public class DzikirPagiActivity extends AppCompatActivity implements DaftarAdapter.OnDaftarClickListener
{
    public RecyclerView rv;
    public DaftarAdapter daftarAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<Daftar> listDaftar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_pagi);

        rv = findViewById(R.id.rvList);

        listDaftar.add(new Daftar("Test","Test","Test"));
        listDaftar.add(new Daftar("Test2","Test","Test"));
        listDaftar.add(new Daftar("Test3","Test","Test"));

        daftarAdapter = new DaftarAdapter(listDaftar);
        daftarAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(daftarAdapter);
        rv.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View view, int position) {
        Daftar daftar = listDaftar.get(position);
        Toast.makeText(this, daftar.getTitle(), Toast.LENGTH_LONG)
                .show();
    }
}
