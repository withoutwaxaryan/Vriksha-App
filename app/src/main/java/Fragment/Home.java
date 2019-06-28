package Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vriksha.Activity.RecyclerViewAdapter;
import com.example.vriksha.Activity.RecyclerViewAdapter_Timeline;
import com.example.vriksha.Activity.Timeline;
import com.example.vriksha.R;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Timeline> FirstCard;
    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false);
        myrecyclerview =v.findViewById(R.id.recycler_view_timeline);
        RecyclerViewAdapter_Timeline recyclerAdapter= new RecyclerViewAdapter_Timeline(getContext(),FirstCard);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        FirstCard= new ArrayList<>();
        FirstCard.add(new Timeline("Ariana Grande","US","Ariana Grande just planted a tree",R.drawable.ariana,R.drawable.trek));
        FirstCard.add(new Timeline("Aryan Gupta","India","Aryan Gupta just planted a tree",R.drawable.aryan,R.drawable.vriksha));
    }


}
