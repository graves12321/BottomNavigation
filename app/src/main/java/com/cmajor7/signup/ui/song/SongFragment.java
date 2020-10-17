package com.cmajor7.signup.ui.song;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.cmajor7.signup.R;

public class SongFragment extends DialogFragment {
    private ListView listView;
    String mSong[] = {"Sweet But Psycho", "Childhood Dream", "Dusk Till Dawn", "Love Is Gone", "Bagaikan Langit", "Funny", "Waiting For Love"};
    String mSinger[] = {"Ava Max", "Seraphine", "Sia", "Slander", "Heiakim", "Zedd", "Avicii"};
    int images[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_song, container, false);
        listView = root.findViewById(R.id.listView);
        Adapter adapter = new Adapter(getActivity(), mSong, mSinger, images);
        listView.setAdapter(adapter);
        return root;
    }
}