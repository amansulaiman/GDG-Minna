package gdgminna.blogspot.com;


import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
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
public class Contact_us extends Fragment {
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
    public static Contact_us newInstance() {
       Contact_us fragment = new Contact_us();
        return fragment;
    }

    public Contact_us() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_contact_us, container, false);
        final TextView groups = (TextView) rootView.findViewById(R.id.groups);
        groups.setPaintFlags(groups.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        final TextView plus = (TextView) rootView.findViewById(R.id.plus);
        plus.setPaintFlags(plus.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        final TextView blog = (TextView) rootView.findViewById(R.id.blog);
        blog.setPaintFlags(blog.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        final TextView face = (TextView) rootView.findViewById(R.id.face);
        face.setPaintFlags(face.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        final TextView developed = (TextView) rootView.findViewById(R.id.develop);
        developed.setPaintFlags(developed.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        final TextView women = (TextView) rootView.findViewById(R.id.women);
        women.setPaintFlags(women.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        mVibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);

        groups.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                String url = "http://goo.gl/QxQK4v";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
        plus.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                String url = "https://google.com/+GdgminnaBlogspot";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
        blog.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                String url = "https://www.gdgminna.blogspot.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
       face.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                String url = "https://www.facebook.com/GDGMinna";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
        developed.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                String url = "http://goo.gl/hNuzmw";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
       women.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                String url = "https://www.womentechmakers.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });



        return rootView;
    }


}
