package com.example.xjp.musicplayer.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.xjp.musicplayer.R;
import com.example.xjp.musicplayer.main.MusicManager;
import com.example.xjp.musicplayer.util.PermissionUtil;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    MusicManager musicManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

    }

    private void initUI(){
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        musicManager=MusicManager.getInstance();
        PermissionUtil.requestStoragePermisson(this);
        musicManager.findSongs(getContentResolver());
    }
}
