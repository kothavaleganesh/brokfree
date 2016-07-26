package wohlig.com.brokfree;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Mahesh on 7/22/2016.
 */
public class PropertyAdapter extends BaseAdapter {
    Activity activity;
    ArrayList<HashMap<String, String>> list;
    ViewHolder holder;
    int id;

    public PropertyAdapter(Activity activity, ArrayList<HashMap<String, String>> list) {
        super();
        this.activity = activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        //all the fields in layout specified
        TextView propertyname;
        TextView propertyadd;
        Button seen;
        LinearLayout property;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;

        LayoutInflater inflater = activity.getLayoutInflater();
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.layout_single_property, parent, false);
            holder.propertyname = (TextView) convertView.findViewById(R.id.property_name_single);
            holder.propertyadd = (TextView) convertView.findViewById(R.id.property_add_single);
            holder.property = (LinearLayout) convertView.findViewById(R.id.llproperty);
            holder.seen = (Button) convertView.findViewById(R.id.seen_unseen);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        this.holder = holder;
        holder.propertyname.setTypeface(Typeface.createFromAsset(activity.getAssets(), "NotoSans-Bold.ttf"));
        holder.propertyadd.setTypeface(Typeface.createFromAsset(activity.getAssets(), "NotoSans-Regular.ttf"));

        HashMap<String, String> map = list.get(position);
        String property_name = map.get("property_name");
        String property_add = map.get("property_add");
        final String id = map.get("id");
        final int id1= Integer.parseInt(id);

        this.id=id1;


        holder.propertyname.setText(property_name);
        holder.propertyadd.setText(property_add);

        holder.property.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PropertyDetailsFragment.class);
                intent.putExtra("seen", id);
                Log.d("inside", "onClick: " + id);
                activity.startActivityForResult(intent, id1);
            }
        });


        return convertView;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("inside", "onActivityResult: ");
    }

}
