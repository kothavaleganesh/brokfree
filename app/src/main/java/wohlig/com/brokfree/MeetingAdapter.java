package wohlig.com.brokfree;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Mahesh on 7/20/2016.
 */
public class MeetingAdapter extends BaseAdapter{
    Activity activity;
    ArrayList<HashMap<String, String>> list_property;

    public MeetingAdapter(Activity activity, ArrayList<HashMap<String, String>> list) {
        super();
        this.activity = activity;
        this.list_property = list;
    }
    @Override
    public int getCount() {
        return list_property.size();
    }

    @Override
    public Object getItem(int position) {
        return list_property.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder {
        //all the fields in layout specified
        TextView meeting_person;
        TextView meeting_time;
        RelativeLayout rlmeeting;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;

        LayoutInflater inflater = activity.getLayoutInflater();
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.layout_single_meeting, parent,false); //change the name of the layout

            holder.rlmeeting = (RelativeLayout) convertView.findViewById(R.id.llPlayer);

            holder.meeting_person = (TextView) convertView.findViewById(R.id.meeting_person); //find the different Views
            holder.meeting_time = (TextView) convertView.findViewById(R.id.time);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HashMap<String, String> map = list_property.get(position);
        String meeting_person = map.get("meeting_person");
        String day = map.get("day");
        String time = map.get("time");
        String location =map.get("location");
        holder.meeting_person.setText("Meeting with "+ meeting_person +", "+location);
        holder.meeting_person.setTypeface(Typeface.createFromAsset(activity.getAssets(), "NotoSans-Bold.ttf"));
        holder.meeting_time.setText(day+", "+time);
        holder.meeting_time.setTypeface(Typeface.createFromAsset(activity.getAssets(), "NotoSans-Bold.ttf"));
        holder.rlmeeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, UserActivity.class);
                activity.startActivity(intent);
            }
        });

        return convertView;
    }
}
