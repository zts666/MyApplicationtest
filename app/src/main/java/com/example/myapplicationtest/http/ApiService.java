package com.example.myapplicationtest.http;


import com.example.myapplicationtest.bean.UserBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("project/tree/json")
    Call<UserBean> getProjectTitle();
}
