package gdgminna.blogspot.com;

import android.app.AlertDialog;
import android.support.v4.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;


public class FeedBack extends Fragment  implements OnClickListener, OnItemSelectedListener  {
    EditText name,mobiles, email,place,description;

    public static FeedBack newInstance() {
        FeedBack fragment = new FeedBack();
        return fragment;
    }

    public FeedBack() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView= inflater.inflate(R.layout.fragment_feed_back, container, false);
        name = (EditText) rootView.findViewById(R.id.name);
        mobiles= (EditText) rootView.findViewById(R.id.phone);
        email = (EditText) rootView.findViewById(R.id.email);
        place = (EditText)rootView.findViewById(R.id.places);
        description = (EditText)rootView.findViewById(R.id.description);
        final Button buttonSend= (Button)rootView.findViewById(R.id.send);
        buttonSend.setOnClickListener(this);


        return rootView;
    }
    public void onClick(View v)
    {
        if(name.getText().toString().length()==0)
        {
            name.setError( "Please Enter your name" );
        }
        else if(email.getText().toString().length()==0)
        {
            email.setError( "Please Enter your email Address" );
        }
        else if(mobiles.getText().toString().length() !=11)
        {
            mobiles.setError( "Please Enter your Phone number" );
        }
        else if(place.getText().toString().length()==0)
        {
            place.setError("Please Enter your Location");
        }
        else if(description.getText().toString().length()==0) {
            description.setError("Please Enter Discription");
        }

            else
            {
                String body=
                        "Name : "+name.getText().toString()+"<br>Mobile :"+mobiles.getText().toString()+
                                "<br>Email :"+email.getText().toString()+"<br>Place :"+place.getText().toString()+"<br>Description :"+description.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"umarmanofpeace@gmail.com"});
                email.putExtra(Intent.EXTRA_TEXT, Html.fromHtml(body));
                email.setType("message/rfc822");
                startActivityForResult(Intent.createChooser(email, "Choose an Email Client:"),1);
            }
        }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {

        new AlertDialog.Builder(getActivity())
                .setMessage("Your requested has been Accepted\nThank You")
                .setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.cancel();
                    }
                })
                .show();
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}
