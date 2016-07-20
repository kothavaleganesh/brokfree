package wohlig.com.brokfree;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Mahesh on 7/20/2016.
 */
public class MeetingAdapter extends BaseAdapter{
    Activity activity;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
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
        ViewHolder holder;

        LayoutInflater inflater = activity.getLayoutInflater();
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.layout_single_feedback, parent,false); //change the name of the layout

            holder.rlmeeting = (RelativeLayout) convertView.findViewById(R.id.llPlayer);

            holder.meeting_person = (TextView) convertView.findViewById(R.id.meeting_person); //find the different Views
            holder.meeting_time = (TextView) convertView.findViewById(R.id.time);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }



        return null;
    }
}
