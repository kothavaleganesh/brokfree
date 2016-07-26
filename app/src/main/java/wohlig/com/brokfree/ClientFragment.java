package wohlig.com.brokfree;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Mahesh on 6/25/2016.
 */
public class ClientFragment extends Fragment {
    RelativeLayout meeting7,meeting8,meeting9,meeting10,meeting11,meeting12;
    TextView tvserach;
    AutoCompleteTextView etsearch;
    ImageView ivsearch;
    View view;
    GridView meeting;
    ArrayList<HashMap<String, String>> list;
    TextView meeting_person1,meeting_person2,meeting_person3,meeting_person4,meeting_person5,meeting_person6;
    String name1,name2,name3,name4,name5,name6;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_client, container, false);
        initilizeViews();

        return view;
    }
    public void initilizeViews() {
        ivsearch= (ImageView) view.findViewById(R.id.ivsearch);
        tvserach= (TextView) view.findViewById(R.id.tvserach_name);
        tvserach.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));
        etsearch = (AutoCompleteTextView) view.findViewById(R.id.searchView);
        etsearch.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        etsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String city[] = {"Ram", "Rahul", "Mahesh", "Akshay", "Aakash",
                        "Rohan", "Sohan", "Rakesh"};

                AutoCompleteTextView t1 = (AutoCompleteTextView)
                        v.findViewById(R.id.searchView);

                ArrayAdapter<String> adp = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_dropdown_item_1line, city);

                t1.setThreshold(1);
                t1.setAdapter(adp);

            }
        });
        ivsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etsearch.showDropDown();
            }
        });

        list = new ArrayList<HashMap<String, String>>();
        meeting = (GridView) view.findViewById(R.id.grmeetings);
        for (int j = 0; j <5; j++) {
            String meeting_person=null,day=null,time=null,location=null;

            meeting_person="Sohan Honakari";
            day="TODAY";
            time="11.40 AM";
            location="Andheri";

            populate(meeting_person,day,time,location);
        }

        if (list.size() > 0) {
            MeetingAdapter meetingAdapter = new MeetingAdapter(getActivity(), list);
            meeting.setAdapter(meetingAdapter);
        } else {
            //istView.setEmptyView(tvNoBets);
        }


        /*meeting7= (RelativeLayout) view.findViewById(R.id.meeting7);
        meeting8= (RelativeLayout) view.findViewById(R.id.meeting8);
        meeting9= (RelativeLayout) view.findViewById(R.id.meeting9);
        meeting10= (RelativeLayout) view.findViewById(R.id.meeting10);
        meeting11= (RelativeLayout) view.findViewById(R.id.meeting11);
        meeting12= (RelativeLayout) view.findViewById(R.id.meeting12);*/

    }
    public void populate(String meeting_person, String day, String time,String location) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("meeting_person", meeting_person);
        map.put("day", day);
        map.put("time", time);
        map.put("location", location);

        list.add(map);
    }
}
