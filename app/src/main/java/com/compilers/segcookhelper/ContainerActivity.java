package com.compilers.segcookhelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Weierstrass on 2016-11-23.
 */

public class ContainerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_container);
        ListView listView = (ListView) findViewById(R.id.list_recipe);
        // Retrieve objects created by the search query (not yet implemented)
        Recipe results;

        RecipeAdapter ad = new RecipeAdapter(this, results);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                final Recipe recipe = (Recipe) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(getApplicationContext(), RecipeViewActivity.class); //Application Context and Activity
                // Need some way to give recipe to the intent
                startActivityForResult(intent, 0);

            }
        });

    }





}