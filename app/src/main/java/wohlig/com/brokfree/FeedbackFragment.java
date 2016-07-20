package wohlig.com.brokfree;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Mahesh on 6/29/2016.
 */
public class FeedbackFragment extends Fragment {

Button submit_rating;
    LinearLayout feedback1,feedback2,feedback3,feedback4,feedback5;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.fragment_feedback,container,false);
        feedback1= (LinearLayout) view.findViewById(R.id.fb1);
        feedback2= (LinearLayout) view.findViewById(R.id.fb2);
        feedback3= (LinearLayout) view.findViewById(R.id.fb3);
        feedback4= (LinearLayout) view.findViewById(R.id.fb4);
        feedback5= (LinearLayout) view.findViewById(R.id.fb5);

        ((PropertyDetailsFragment)this.getActivity()).setToolbarText("Feedback");

        submit_rating= (Button) view.findViewById(R.id.submit_rating);
        submit_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                OtpFragment otpFragment = new OtpFragment();

                fragmentTransaction.replace(R.id.container, otpFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;

    }


}
