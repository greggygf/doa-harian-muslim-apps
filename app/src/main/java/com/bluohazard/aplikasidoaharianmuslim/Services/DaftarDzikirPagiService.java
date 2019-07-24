package com.bluohazard.aplikasidoaharianmuslim.Services;

import com.bluohazard.aplikasidoaharianmuslim.Models.DaftarDzikirPagi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DaftarDzikirPagiService {
    @GET("/bluohazard/doa-harian-muslim-server/dzikir_pagi")
    Call<List<DaftarDzikirPagi>> getDzikirPagi();
}
