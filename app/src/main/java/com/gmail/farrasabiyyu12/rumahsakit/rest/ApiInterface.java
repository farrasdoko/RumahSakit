package com.gmail.farrasabiyyu12.rumahsakit.rest;

import com.gmail.farrasabiyyu12.rumahsakit.model.GetRumsak;
import com.gmail.farrasabiyyu12.rumahsakit.model.PostPutDelRumsak;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("read_data.php")
    Call<GetRumsak> getRumsak();

    @FormUrlEncoded
    @POST("create_data.php")
    Call<PostPutDelRumsak> postRumsak(@Field("nama") String nama,
                                      @Field("alamat") String alamat);
    @FormUrlEncoded
    @PUT("update_data.php")
    Call<PostPutDelRumsak> putRumsak(@Field("id") String id,
                                     @Field("nama") String nama,
                                     @Field("alamat") String alamat);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "delete_data.php", hasBody = true)
    Call<PostPutDelRumsak> deleteRumsak(@Field("id") String id);

}