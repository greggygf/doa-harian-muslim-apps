package com.bluohazard.aplikasidoaharianmuslim.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bluohazard.aplikasidoaharianmuslim.Models.DaftarDzikirPagi;
import com.bluohazard.aplikasidoaharianmuslim.R;

import java.util.ArrayList;
import java.util.List;

public class DaftarDzikirPagiAdapter extends
        RecyclerView.Adapter<DaftarDzikirPagiAdapter.DaftarViewHolder> {

    private List<DaftarDzikirPagi> listDaftarDzikirPagi = new ArrayList<>();

    public DaftarDzikirPagiAdapter(List<DaftarDzikirPagi> listDaftarDzikirPagi) {
        this.listDaftarDzikirPagi = listDaftarDzikirPagi;
    }

    private OnDaftarClickListener listener;

    public interface OnDaftarClickListener {
        void onClick(View view, int position);
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

        DaftarDzikirPagi item = listDaftarDzikirPagi.get(i);
        listViewHolder.txtTitle.setText(item.getTitle());
        listViewHolder.txtInstruction.setText(item.getInstruction());
        listViewHolder.txtArabDesc.setText(item.getArabDesc());
        listViewHolder.txtLatinDesc.setText(item.getLatinDesc());
    }

    @Override
    public int getItemCount() {
        return listDaftarDzikirPagi.size();
    }

    public class DaftarViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle, txtInstruction, txtArabDesc, txtLatinDesc;

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
