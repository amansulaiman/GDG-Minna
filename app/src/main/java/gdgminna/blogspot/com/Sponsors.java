package gdgminna.blogspot.com;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Sponsors extends Fragment {
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
    public static Sponsors newInstance() {
      Sponsors fragment = new Sponsors();
        return fragment;
    }

    public Sponsors() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_sponsors, container, false);

        final ImageView google = (ImageView) rootView.findViewById(R.id.imagegoogle);
        final ImageView develop = (ImageView) rootView.findViewById(R.id.imagedevelopers);
        mVibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);

        google.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                String url = "https://www.google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
        develop.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                String url = "https://developers.google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });

        return rootView;
    }


}
