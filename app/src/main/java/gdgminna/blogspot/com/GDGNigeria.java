package gdgminna.blogspot.com;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class GDGNigeria extends Fragment {
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
    public static GDGNigeria newInstance() {
        GDGNigeria fragment = new GDGNigeria();
        return fragment;
    }

    public GDGNigeria() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_gdgnigeria, container, false);
       final Button btnGDGAAUA = (Button) rootView.findViewById(R.id.gdgminna1);
        final Button btnGDGAbia_poly = (Button) rootView.findViewById(R.id.gdgminna2);
        final Button btnGDGAbuja = (Button) rootView.findViewById(R.id.gdgminna3);
        final Button btnGDGAdo_Ekiti = (Button) rootView.findViewById(R.id.gdgminna4);
        final Button btnGDGAkure = (Button) rootView.findViewById(R.id.gdgminna5);
        final Button btnGDGBells_University = (Button) rootView.findViewById(R.id.gdgminna6);
        final Button btnGDGBenin = (Button) rootView.findViewById(R.id.gdgminna7);
        final Button btnGDGBingham_University = (Button) rootView.findViewById(R.id.gdgminna8);
        final Button btnGDGBUK = (Button) rootView.findViewById(R.id.gdgminna9);
        final Button btnGDGCalabar = (Button) rootView.findViewById(R.id.gdgminna10);
        final Button btnGDGEkiti_State_University = (Button) rootView.findViewById(R.id.gdgminna11);
        final Button btnGDGEnugu = (Button) rootView.findViewById(R.id.gdgminna12);
        final Button btnGDGFederal_University_Dutse = (Button) rootView.findViewById(R.id.gdgminna13);
        final Button btnGDGFUNAAB = (Button) rootView.findViewById(R.id.gdgminna14);
        final Button btnGDGIbadan = (Button) rootView.findViewById(R.id.gdgminna15);
        final Button btnGDGJSIIT = (Button) rootView.findViewById(R.id.gdgminna16);
        final Button btnGDGKaduna = (Button) rootView.findViewById(R.id.gdgminna17);
        final Button btnGDGKaduna_State_University = (Button) rootView.findViewById(R.id.gdgminna18);
        final Button btnGDGKano = (Button) rootView.findViewById(R.id.gdgminna19);
        final Button btnGDGLafia = (Button) rootView.findViewById(R.id.gdgminna20);
        final Button btnGDGLagos = (Button) rootView.findViewById(R.id.gdgminna21);
        final Button btnGDGLAUTECH = (Button) rootView.findViewById(R.id.gdgminna22);
        final Button btnGDGMinna = (Button) rootView.findViewById(R.id.gdgminna23);
        final Button btnGDGNjikoka = (Button) rootView.findViewById(R.id.gdgminna24);
        final Button btnGDGNWU = (Button) rootView.findViewById(R.id.gdgminna25);
        final Button btnGDGOAU = (Button) rootView.findViewById(R.id.gdgminna26);
        final Button btnGDGOko = (Button) rootView.findViewById(R.id.gdgminna27);
        final Button btnGDGPort_Harcourt = (Button) rootView.findViewById(R.id.gdgminna28);
        final Button btnGDGTaraba = (Button) rootView.findViewById(R.id.gdgminna29);
        final Button btnGDGUnilag = (Button) rootView.findViewById(R.id.gdgminna30);
        final Button btnGDGUnilorin = (Button) rootView.findViewById(R.id.gdgminna31);
        final Button btnGDGUNN = (Button) rootView.findViewById(R.id.gdgminna32);
        final Button btnGDGUyo = (Button) rootView.findViewById(R.id.gdgminna33);
        mVibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);

        btnGDGAAUA.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    mVibrator.vibrate(100);
                    Intent intent = new Intent(getActivity(), GDGMinnaweb.class);
                    GDGNigeria.this.startActivity(intent);
                }

        });
        btnGDGAbia_poly.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGAbiaPoly.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGAbuja.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGAbuja.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGAdo_Ekiti.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGAdo_Ekiti.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGAkure.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGAkure.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGBells_University.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGBells_University.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGBenin.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGBenin.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGBingham_University.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGBingham_University.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGBUK.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGBUK.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGCalabar.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGCalabar.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGEkiti_State_University.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGEkiti_State_University.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGEnugu.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGEnugu.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGFederal_University_Dutse.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGFederal_University_Dutse.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGFUNAAB.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGFUNAAB.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGIbadan.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGIbadan.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGJSIIT.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGJSIIT.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGKaduna.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGKaduna.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGKaduna_State_University.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGKaduna_State_University.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGKano.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGKano.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGLafia.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGLafia.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGLagos.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGLagos.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGLAUTECH.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGLAUTECH.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGMinna.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGMinna.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGNjikoka.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGNjikoka.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGNWU.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGNWU.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGOAU.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGOAU.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGOko.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGOko.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGPort_Harcourt.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGPort_Harcourt.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGTaraba.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGTaraba.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGUnilag.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGUnilag.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGUnilorin.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGUnilorin.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGUNN.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGUNN.class);
                GDGNigeria.this.startActivity(intent);
            }

        });
        btnGDGUyo.setOnClickListener(new View.OnClickListener() {
            // TODO Auto-generated method stub
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mVibrator.vibrate(100);
                Intent intent = new Intent(getActivity(), GDGUyo.class);
                GDGNigeria.this.startActivity(intent);
            }

        });

        return rootView;
    }


}
