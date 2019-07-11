package com.bluohazard.aplikasidoaharianmuslim.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bluohazard.aplikasidoaharianmuslim.Model.Daftar;
import com.bluohazard.aplikasidoaharianmuslim.R;

import java.util.ArrayList;
import java.util.List;

public class DaftarAdapter extends
        RecyclerView.Adapter<DaftarAdapter.DaftarViewHolder>
{

    private List<Daftar> listDaftar = new ArrayList<>();

    public DaftarAdapter(List<Daftar> listDaftar)
    {
        this.listDaftar = listDaftar;
    }

    private OnDaftarClickListener listener;

    public interface OnDaftarClickListener {
        public void onClick(View view, int position);
    }

    public void setListener(OnDaftarClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public DaftarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_list, viewGroup, false);
        DaftarViewHolder viewHolder = new DaftarViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DaftarViewHolder listViewHolder, int i) {

        Daftar item = listDaftar.get(i);
        listViewHolder.txtTitle.setText(item.getTitle());
        listViewHolder.txtInstruction.setText(item.getInstruction());
        listViewHolder.txtArabDesc.setText(item.getArabDesc());
        listViewHolder.txtLatinDesc.setText(item.getLatinDesc());
    }

    @Override
    public int getItemCount() {
        return listDaftar.size();
    }

    public class DaftarViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle,txtInstruction, txtArabDesc, txtLatinDesc;

        public DaftarViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtInstruction = itemView.findViewById(R.id.txtInstruction);
            txtArabDesc = itemView.findViewById(R.id.txtArabDesc);
            txtLatinDesc = itemView.findViewById(R.id.txtLatinDesc);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }
}
