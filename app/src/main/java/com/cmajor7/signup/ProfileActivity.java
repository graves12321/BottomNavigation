package com.cmajor7.signup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ListView listView;
    String mSong[] = {"Sweet But Psycho", "Childhood Dream", "Dusk Till Dawn"};
    String mSinger[] = {"Ava Max", "Seraphine", "Sia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        listView = findViewById(R.id.listView);
        ListViewAdapter adapter = new ListViewAdapter(this, mSong, mSinger);
        listView.setAdapter(adapter);
    }
    class ListViewAdapter extends ArrayAdapter<String> {
        Context context;
        String rSong[];
        String rSinger[];
        ListViewAdapter (Context c, String song[], String singer[]){
            super(c, R.layout.rows, R.id.tv1, song);
            this.context = c;
            this.rSong = song;
            this.rSinger = singer;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rows = layoutInflater.inflate(R.layout.rows, parent, false);
            TextView mSong = rows.findViewById(R.id.tv1);
            TextView mSinger = rows.findViewById(R.id.tv2);

            mSong.setText(rSong[position]);
            mSinger.setText(rSinger[position]);
            return rows;
        }
    }
}