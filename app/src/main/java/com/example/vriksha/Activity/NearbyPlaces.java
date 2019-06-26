package com.example.vriksha.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.vriksha.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NearbyPlaces extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_places);
        RecyclerView recList = findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        recList.setLayoutManager(llm);

        RecyclerViewAdapter ca = new RecyclerViewAdapter(createList(10));
        recList.setAdapter(ca);
    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/


    private List<Suggestion_Cardview> createList(int size) {

        List<Suggestion_Cardview> result = new ArrayList<Suggestion_Cardview>();
        for (int i = 1; i <= size; i++) {
            Suggestion_Cardview ci = new Suggestion_Cardview();
            ci.name = Suggestion_Cardview.NAME_PREFIX + i;
            ci.address = Suggestion_Cardview.ADDRESS_PREFIX + i;
            ci.trees_planted = Suggestion_Cardview.TREES_PLANTED_PREFIX + i ;
            ci.space_available= Suggestion_Cardview.SPACE_AVAILABLE_PREFIX + i;
            ci.rating= Suggestion_Cardview.RATING_PREFIX;
            result.add(ci);

        }

        return result;
    }

}
