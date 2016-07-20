package wohlig.com.brokfree;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Mahesh on 6/28/2016.
 */
public class OtpFragment extends Fragment{
    TextView tvotp;
    EditText etotp;
    Button btotp_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_otp,container,false);
        tvotp= (TextView) view.findViewById(R.id.tvotp);
        tvotp.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));
        ((PropertyDetailsFragment)this.getActivity()).setToolbarText("OTP");

        etotp= (EditText) view.findViewById(R.id.etotp);
        etotp.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        btotp_submit= (Button) view.findViewById(R.id.btotp_submit);
        btotp_submit.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));
        btotp_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });



        return view;
    }
}
