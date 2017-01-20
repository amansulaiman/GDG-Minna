package gdgminna.blogspot.com;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Organizers extends Fragment {
    Vibrator mVibrator;

    int dot = 200; // Length of a Morse Code "dot" in milliseconds
    int dash = 500; // Length of a Morse Code "dash" in milliseconds
    int short_gap = 200; // Length of Gap Between dots/dashes
    int medium_gap = 500; // Length of Gap Between Letters
    int long_gap = 1000; // Length of Gap Between Words

    long[] pattern = { 0, // Start immediately
            dot, short_gap, dot, short_gap, dot, // s
            medium_gap, dash, short_gap, dash, short_gap, dash, // o
            medium_gap, dot, short_gap, dot, short_gap, dot, // s
            long_gap };

    public static Organizers newInstance() {
        Organizers fragment = new Organizers();
        return fragment;
    }
    public Organizers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_organizers, container, false);

        final TextView UMAR= (TextView) rootView.findViewById(R.id.textumar);
        final TextView ISAAC= (TextView) rootView.findViewById(R.id.textisaac);
        final TextView GBEMILEKE= (TextView) rootView.findViewById(R.id.textgbemileke);
        mVibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
       UMAR.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), umar.class);
                Organizers.this.startActivity(intent);
            }

        });
        ISAAC.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), isaac.class);
                Organizers.this.startActivity(intent);
            }

        });
        GBEMILEKE.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), gbemileke.class);
                Organizers.this.startActivity(intent);
            }

        });


        return rootView;
    }


}
