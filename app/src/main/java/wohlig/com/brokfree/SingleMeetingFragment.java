package wohlig.com.brokfree;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Mahesh on 7/9/2016.
 */
public class SingleMeetingFragment extends Fragment {
    TextView meetingPerson,time;
    RelativeLayout meeting;
   /* @Override
    *//*public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.layout_single_meeting, container, false);
        meetingPerson= (TextView) view.findViewById(R.id.meeting_person);
        meetingPerson.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));
        time= (TextView) view.findViewById(R.id.time);
        time.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        meeting= (RelativeLayout) view.findViewById(R.id.llPlayer);
        meeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UserActivity.class);
                startActivity(intent);
            }
        });



        return view;

    }

}
