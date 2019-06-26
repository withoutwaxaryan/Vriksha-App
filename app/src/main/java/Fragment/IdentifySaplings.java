package Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vriksha.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IdentifySaplings extends Fragment {


    public IdentifySaplings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_identify_saplings, container, false);
    }

}
