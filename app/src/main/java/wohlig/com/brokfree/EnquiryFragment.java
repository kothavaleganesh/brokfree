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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by Mahesh on 7/5/2016.
 */
public class EnquiryFragment extends Fragment implements View.OnClickListener{
    RelativeLayout meeting1,meeting2,meeting3,meeting4,meeting5,meeting6;

    private int mYear, mMonth, mDay;
    ImageView calender;
    RelativeLayout meeting;
    TextView tvselectdate;
    EditText tvcalender;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_enquiry, container, false);
        tvcalender= (EditText) view.findViewById(R.id.tvsearch_date);
        tvcalender.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));
        tvselectdate= (TextView) view.findViewById(R.id.tvselectdate);
        tvselectdate.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));
        meeting1= (RelativeLayout) view.findViewById(R.id.meeting1);
        meeting2= (RelativeLayout) view.findViewById(R.id.meeting2);
        meeting3= (RelativeLayout) view.findViewById(R.id.meeting3);
        meeting4= (RelativeLayout) view.findViewById(R.id.meeting4);
        meeting5= (RelativeLayout) view.findViewById(R.id.meeting5);
        meeting6= (RelativeLayout) view.findViewById(R.id.meeting6);


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

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
