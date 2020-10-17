package com.cmajor7.signup.ui.song;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cmajor7.signup.R;

public class Adapter extends ArrayAdapter<String> {
    Context c;
    String[] rSong;
    String[] rSinger;
    int[] img;
    LayoutInflater inflater;
    public Adapter(Context context, String[] song, String[] singer, int[] images) {
        super(context, R.layout.rows, song);
        this.c = context;
        this.rSong = song;
        this.rSinger = singer;
        this.img = images;
    }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView==null){
                inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.rows,null);
        }
            ImageView images = convertView.findViewById(R.id.image);
            TextView mSong = convertView.findViewById(R.id.tv1);
            TextView mSinger = convertView.findViewById(R.id.tv2);

            images.setImageResource(img[position]);
            mSong.setText(rSong[position]);
            mSinger.setText(rSinger[position]);
            return convertView;
    }
}
