package wohlig.com.brokfree;

import android.app.DatePickerDialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by Mahesh on 7/5/2016.
 */
public class EnquiryFragment extends Fragment {

    private int mYear, mMonth, mDay;
    ImageView calender;
    TextView tvselectdate;
    EditText tvcalender;
    GridView meeting1;
    ArrayList<HashMap<String, String>> list1;
    View view;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_enquiry, container, false);
        initilizeViews();
        return view;
    }
    public void initilizeViews() {
        tvcalender= (EditText) view.findViewById(R.id.tvsearch_date);
        tvcalender.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));
        tvselectdate= (TextView) view.findViewById(R.id.tvselectdate);
        tvselectdate.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        list1 = new ArrayList<HashMap<String, String>>();
        meeting1 = (GridView) view.findViewById(R.id.grmeeting1);
        for (int j = 0; j <5; j++) {
            String meeting_person=null,day=null,time=null,location=null;

            meeting_person="Sohan Honakari";
            day="TODAY";
            time="11.40 AM";
            location="Andheri";

            populate(meeting_person,day,time,location);
        }

        if (list1.size() > 0) {
            MeetingAdapter meetingAdapter = new MeetingAdapter(getActivity(), list1);
            meeting1.setAdapter(meetingAdapter);
        } else {
            //istView.setEmptyView(tvNoBets);
        }




        calender= (ImageView) view.findViewById(R.id.calender);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                tvcalender.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });
    }
    public void populate(String meeting_person, String day, String time,String location) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("meeting_person", meeting_person);
        map.put("day", day);
        map.put("time", time);
        map.put("location", location);

        list1.add(map);
    }



}
