package com.example.xjp.musicplayer.adaptr;


import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.xjp.musicplayer.bean.MusicItem;

import java.util.List;

/**
 * Created by XJP on 2017/10/9.
 */
public class LocalAdapter extends RecyclerView.Adapter{

    List<MusicItem> list;
    public LocalAdapter(List<MusicItem> list){
        this.list=list;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
