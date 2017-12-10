package com.example.c4q.jsonq4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Birds> listOFBirds = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView birdRecyclerView = findViewById(R.id.bird_recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        try {
            JSONObject members = new JSONObject(Constants.values);
            JSONArray stuff = members.getJSONArray("birds");
//            String bird = stuff.toString();
            List<String> birdNames = new ArrayList<>();

            JSONObject jsonObject = (JSONObject) stuff.get(0);
            String s = jsonObject.get("family").toString();
            Log.d("MainActivity",s);
            for (int i = 0; i < stuff.length(); i++) {
                String types = stuff.get(i).toString();
                birdNames.add(types);
            }
            for (String ing : birdNames) {
                Birds birds = new Birds();
                birds.setName(ing);
                listOFBirds.add(birds);

            }



//            Log.d("onCeate", bird);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        BirdsAdapter adapter=new BirdsAdapter(listOFBirds);
        birdRecyclerView.setLayoutManager(linearLayoutManager);
        birdRecyclerView.setHasFixedSize(true);
        birdRecyclerView.setAdapter(adapter);
    }
}
