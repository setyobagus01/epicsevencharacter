package com.gabut.projection.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCharacter;
    private ArrayList<Character> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCharacter = findViewById(R.id.rv_character);
        rvCharacter.setHasFixedSize(true);

        list.addAll(CharacterData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedItem){
        switch (selectedItem){
            case R.id.about:
                Intent intent = new Intent(this, activity_about.class);
                startActivity(intent);
                break;
        }
    }

    private void showRecyclerList(){
        rvCharacter.setLayoutManager(new LinearLayoutManager(this));
        ListCharacterAdapter listCharacterAdapter = new ListCharacterAdapter(list);
        rvCharacter.setAdapter(listCharacterAdapter);

        listCharacterAdapter.setOnItemClickCallback(new ListCharacterAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Character data) {
                showSelectedCharacter(data);
            }
        });
    }

    private void showSelectedCharacter(Character character){
        Intent intent = new Intent(MainActivity.this,activity_detail.class);
        intent.putExtra(activity_detail.EXTRA_DATA, character);
        startActivity(intent);
    }



}
