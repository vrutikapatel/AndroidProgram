package com.example.retrofitgetdataexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DemoModel> demoModelList;
    ApiInterface apiInterface;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        apiInterface=ApiClient.getRetrofit().create(ApiInterface.class);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        callService();
    }

    private void callService() {

        Call<ResponseBody> call=apiInterface.data();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    JSONArray jsonArray=new JSONArray(response.body().string());
                    demoModelList=new ArrayList<>();

                    for (int i=0;i<jsonArray.length();i++){
                        JSONObject jsonObject=jsonArray.getJSONObject(i);
                        String postId=jsonObject.getString("postId");
                        String id=jsonObject.getString("id");
                        String name=jsonObject.getString("name");
                        String email=jsonObject.getString("email");
                        String body=jsonObject.getString("body");
                        demoModelList.add(new DemoModel(postId,id,name,email,body));
                    }
                    recyclerView.setAdapter(new DemoAdapter(demoModelList));

                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("Retrofit Activity","Connect Failed");
            }
        });

    }
}