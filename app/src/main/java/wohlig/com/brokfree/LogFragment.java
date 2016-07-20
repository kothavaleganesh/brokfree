package wohlig.com.brokfree;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Mahesh on 7/5/2016.
 */
public class LogFragment extends Fragment {
    Button save;
    TextView tvclient_name,tvstatus,tvfeedback_details;
    EditText etclient_name,etstatus,etfeedback_details;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_log, container, false);
        tvclient_name= (TextView) view.findViewById(R.id.tvclient_name);
        tvclient_name.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        tvstatus= (TextView) view.findViewById(R.id.tvstatus);
        tvstatus.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        tvfeedback_details= (TextView) view.findViewById(R.id.tvfeedback_details);
        tvfeedback_details.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        etclient_name= (EditText) view.findViewById(R.id.etclient_name);
        etclient_name.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        etstatus= (EditText) view.findViewById(R.id.etstatus);
        etstatus.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        etfeedback_details= (EditText) view.findViewById(R.id.etfeedback_details);
        etfeedback_details.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));




        save = (Button) view.findViewById(R.id.save);
        save.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle=new Bundle();
                bundle.putString("client_name", String.valueOf(etclient_name.getText()));
                bundle.putString("status", String.valueOf(etstatus.getText()));
                bundle.putString("feedback", String.valueOf(etfeedback_details.getText()));

                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                UserFragment userFragment = new UserFragment();
                userFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.container, userFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
//
//                Intent intent = new Intent(getActivity(), LogFragment.class);
//                startActivity(intent);
            }
        });
        return view;

    }
//    @Override
//    protected void onCreate( Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_log);
//    }
}
