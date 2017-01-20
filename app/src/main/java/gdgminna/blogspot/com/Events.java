package gdgminna.blogspot.com;


import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class Events extends Fragment {
    private WebView mwebView;
    private View rootView = null;
    private ProgressBar progressBarT4 = null;

    public static Events newInstance() {
        Events fragment = new Events();
        return fragment;
    }

    public Events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       rootView= inflater.inflate(R.layout.fragment_events, container, false);
        mwebView = (WebView) rootView.findViewById(R.id.webView1);
        progressBarT4 = (ProgressBar) rootView.findViewById(R.id.progressBar1);
        mwebView.setWebViewClient(new WebViewClient());
        mwebView.getSettings().setAppCacheEnabled(true);
        mwebView.getSettings().setLoadsImagesAutomatically(true);
        mwebView.getSettings().setAppCacheMaxSize(1024*1024*8);
        mwebView.getSettings().setAppCachePath( getActivity().getCacheDir().getAbsolutePath() );
        mwebView.getSettings().setAllowFileAccess( true );
        mwebView.getSettings().setJavaScriptEnabled(true);
        mwebView.getSettings().setUserAgentString("Mozilla/5.0 (iPhone; U; CPU like Mac OS X; en) AppleWebKit/420+ (KHTML, like Gecko) Version/3.0 Mobile/1A543a Safari/419.3");
        mwebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                progressBarT4.setVisibility(View.VISIBLE);
                progressBarT4.setProgress(progress);
                if (progress == 100) {
                    progressBarT4.setVisibility(View.GONE); // Make the bar disappear after URL is loaded
                }
            }
        });
        progressBarT4.setVisibility(View.VISIBLE);
        mwebView.loadUrl("https://plus.google.com/b/113224920428716041640/events");
        if ( !isNetworkAvailable() ) { // loading offline
            mwebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        }

        mwebView.setOnKeyListener(new View.OnKeyListener(){
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && mwebView.canGoBack())
                {
                    mwebView.goBack();
                    return true;
                }
                return false;
            }
        });




        return rootView;

    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

}
