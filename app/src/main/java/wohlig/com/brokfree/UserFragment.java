package wohlig.com.brokfree;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mahesh on 6/29/2016.
 */
public class UserFragment extends Fragment  {
    Button createlog,done;
    TextView reschedule;
    TextView username,useremil,userphone,useradd;
    TextView userclientreq;
    TextView cbRequirement1,cbRequirement2,cbRequirement3,cbRequirement4,cbRequirement5,cbRequirement6,cbRequirement7,cbRequirement8,cbRequirement9,cbRequirement10,cbRequirement11,cbRequirement12;
    TextView userlogs,username_add,userstatus,userstatusfull,usermeeting,usermeetingtime;
    LinearLayout lllog;
    Bundle bundle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user,container,false);
        username= (TextView) view.findViewById(R.id.username);
        username.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));
        useremil= (TextView) view.findViewById(R.id.useremail);
        useremil.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));
        userphone= (TextView) view.findViewById(R.id.userphone);
        userphone.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));
        useradd= (TextView) view.findViewById(R.id.useradd);
        useradd.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        userclientreq= (TextView) view.findViewById(R.id.user_clientreq);
        userclientreq.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));
        cbRequirement1= (TextView) view.findViewById(R.id.cbRequirement1);
        cbRequirement1.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement2= (TextView) view.findViewById(R.id.cbRequirement2);
        cbRequirement2.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement3= (TextView) view.findViewById(R.id.cbRequirement3);
        cbRequirement3.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement4= (TextView) view.findViewById(R.id.cbRequirement4);
        cbRequirement4.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement5= (TextView) view.findViewById(R.id.cbRequirement5);
        cbRequirement5.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement6= (TextView) view.findViewById(R.id.cbRequirement6);
        cbRequirement6.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement7= (TextView) view.findViewById(R.id.cbRequirement7);
        cbRequirement7.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement8= (TextView) view.findViewById(R.id.cbRequirement8);
        cbRequirement8.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement9= (TextView) view.findViewById(R.id.cbRequirement9);
        cbRequirement9.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement10= (TextView) view.findViewById(R.id.cbRequirement10);
        cbRequirement10.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement11= (TextView) view.findViewById(R.id.cbRequirement11);
        cbRequirement11.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        cbRequirement12= (TextView) view.findViewById(R.id.cbRequirement12);
        cbRequirement12.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));


        userlogs= (TextView) view.findViewById(R.id.userlogs);
        userlogs.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        username_add= (TextView) view.findViewById(R.id.username_add);
        username_add.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        userstatus= (TextView) view.findViewById(R.id.userstatus);
        userstatus.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        userstatusfull= (TextView) view.findViewById(R.id.userstatusfull);
        userstatusfull.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        usermeeting= (TextView) view.findViewById(R.id.userlastmeeting);
        usermeeting.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        usermeetingtime= (TextView) view.findViewById(R.id.userlastmeetingtime);
        usermeetingtime.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        lllog= (LinearLayout) view.findViewById(R.id.lllog);
        bundle=getArguments();
        if(bundle!=null)
        {
            lllog.setVisibility(View.VISIBLE);
            username_add.setText(getArguments().getString("client_name"));
            userstatus.setText(getArguments().getString("status"));
            userstatusfull.setText(getArguments().getString("feedback"));
            if(getArguments().getString("Date")!=null)
            {
                usermeetingtime.setText(getArguments().getString("Date"));
            }

        }



        createlog = (Button) view.findViewById(R.id.createlog);
        createlog.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        createlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                LogFragment logFragment=new LogFragment();

                fragmentTransaction.replace(R.id.container, logFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });
        reschedule= (TextView) view.findViewById(R.id.reschedule);
        reschedule.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        reschedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SetScheduleFragment setScheduleFragment=new SetScheduleFragment();
                setScheduleFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.container, setScheduleFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        done = (Button) view.findViewById(R.id.done);
        done.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
