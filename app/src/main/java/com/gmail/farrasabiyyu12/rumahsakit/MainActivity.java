package com.gmail.farrasabiyyu12.rumahsakit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gmail.farrasabiyyu12.rumahsakit.adapter.RumsakAdapter;
import com.gmail.farrasabiyyu12.rumahsakit.model.GetRumsak;
import com.gmail.farrasabiyyu12.rumahsakit.model.Rumsak;
import com.gmail.farrasabiyyu12.rumahsakit.rest.ApiClient;
import com.gmail.farrasabiyyu12.rumahsakit.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button btIns, btUpd;
    ApiInterface mApiInterface;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public static MainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Insert Button
        btIns = (Button) findViewById(R.id.btIns);
        btIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InsertActivity.class));
            }
        });
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma=this;
        refresh();
    }

    public void refresh() {
        Call<GetRumsak> rumsakCall = mApiInterface.getRumsak();
        rumsakCall.enqueue(new Callback<GetRumsak>() {
            @Override
            public void onResponse(Call<GetRumsak> call, Response<GetRumsak>
                    response) {
                List<Rumsak> RumsakList = response.body().getListDataRumsak();
                Log.d("Retrofit Get", "Jumlah data Rumah Sakit (Rumsak): " +
                        String.valueOf(RumsakList.size()));
                mAdapter = new RumsakAdapter(RumsakList);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<GetRumsak> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }
}