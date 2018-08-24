package com.gmail.farrasabiyyu12.rumahsakit.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gmail.farrasabiyyu12.rumahsakit.EditActivity;
import com.gmail.farrasabiyyu12.rumahsakit.R;
import com.gmail.farrasabiyyu12.rumahsakit.model.Rumsak;

import java.util.List;

public class RumsakAdapter extends RecyclerView.Adapter<RumsakAdapter.MyViewHolder>{
    List<Rumsak> mRumsakList;

    public RumsakAdapter(List <Rumsak> RumsakList) {
        mRumsakList = RumsakList;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rumsak_list_layout, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder,final int position){
        holder.mTextViewId.setText("Id = " + mRumsakList.get(position).getId());
        holder.mTextViewNama.setText("Nama = " + mRumsakList.get(position).getNama());
        holder.mTextViewNomor.setText("Alamat = " + mRumsakList.get(position).getAlamat());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), EditActivity.class);
                mIntent.putExtra("Id", mRumsakList.get(position).getId());
                mIntent.putExtra("Nama", mRumsakList.get(position).getNama());
                mIntent.putExtra("Nomor", mRumsakList.get(position).getAlamat());
                view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount () {
        return mRumsakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewId, mTextViewNama, mTextViewNomor;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            mTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
            mTextViewNomor = (TextView) itemView.findViewById(R.id.tvAlamat);
        }
    }
}