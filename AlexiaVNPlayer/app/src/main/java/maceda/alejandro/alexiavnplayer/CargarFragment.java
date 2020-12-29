package maceda.alejandro.alexiavnplayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CargarFragment extends Fragment {

    private TextView txtSlots;


    public CargarFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cargar, container, false);
        txtSlots = (TextView) view.findViewById(R.id.editTextSlots);
        txtSlots.setText("Slots");
        return view;
    }
}