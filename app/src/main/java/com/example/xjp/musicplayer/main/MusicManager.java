package com.example.xjp.musicplayer.main;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore;

import com.example.xjp.musicplayer.bean.MusicItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XJP on 2017/10/9.
 */
public class MusicManager {



    public List<MusicItem> findSongs(ContentResolver contentResolver ){

            Cursor cursor = contentResolver.query(
                    MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, null, null,
                    MediaStore.Audio.Media.DEFAULT_SORT_ORDER);
            List<MusicItem> musicItems = new ArrayList<MusicItem>();
            for (int i = 0; i < cursor.getCount(); i++) {
                MusicItem MusicItem = new MusicItem();                               //新建一个歌曲对象,将从cursor里读出的信息存放进去,直到取完cursor里面的内容为止.
                cursor.moveToNext();

                long id = cursor.getLong(cursor
                        .getColumnIndex(MediaStore.Audio.Media._ID));   //音乐id

                String title = cursor.getString((cursor
                        .getColumnIndex(MediaStore.Audio.Media.TITLE)));//音乐标题

                String artist = cursor.getString(cursor
                        .getColumnIndex(MediaStore.Audio.Media.ARTIST));//艺术家

                long duration = cursor.getLong(cursor
                        .getColumnIndex(MediaStore.Audio.Media.DURATION));//时长

                long size = cursor.getLong(cursor
                        .getColumnIndex(MediaStore.Audio.Media.SIZE));  //文件大小

                String url = cursor.getString(cursor
                        .getColumnIndex(MediaStore.Audio.Media.DATA));  //文件路径

                String album = cursor.getString(cursor
                        .getColumnIndex(MediaStore.Audio.Media.ALBUM)); //唱片图片

                long album_id = cursor.getLong(cursor
                        .getColumnIndex(MediaStore.Audio.Media.ALBUM_ID)); //唱片图片ID

                int isMusic = cursor.getInt(cursor
                        .getColumnIndex(MediaStore.Audio.Media.IS_MUSIC));//是否为音乐

                if (isMusic != 0 ) {
                    MusicItem.setId(id);
                    MusicItem.setTitle(title);
                    MusicItem.setArtist(artist);
                    MusicItem.setDuration(duration);
                    MusicItem.setSize(size);
                    MusicItem.setUrl(url);
                    MusicItem.setAlbum(album);
                    MusicItem.setAlbum_id(album_id);
                    musicItems.add(MusicItem);
                }
            }

        return  musicItems;
    }
}
