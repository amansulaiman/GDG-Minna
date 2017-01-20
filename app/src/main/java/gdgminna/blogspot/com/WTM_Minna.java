package gdgminna.blogspot.com;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class WTM_Minna extends Fragment {

    public static WTM_Minna newInstance() {
        WTM_Minna fragment = new WTM_Minna();
        return fragment;
    }
    public WTM_Minna() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wtm__minna, container, false);
    }



}
