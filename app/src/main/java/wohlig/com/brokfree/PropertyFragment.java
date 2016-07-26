package wohlig.com.brokfree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Mahesh on 7/5/2016.
 */
public class PropertyFragment extends Fragment {
    LinearLayout property1,property2,property3;
    TextView propertyname1,propertyname2,propertyname3,propertyadd1,propertyadd2,propertyadd3;
    Button seen1,seen2,seen3;
    ListView lvproperty;
    ArrayList<HashMap<String, String>> lvlist;
    View view;
    PropertyAdapter propertyAdapter ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_property, container, false);
/*        propertyname1= (TextView) view.findViewById(R.id.propertyname1);
        propertyname1.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        propertyname2= (TextView) view.findViewById(R.id.propertyname2);
        propertyname2.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));

        propertyname3= (TextView) view.findViewById(R.id.propertyname3);
        propertyname3.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Bold.ttf"));


        propertyadd1= (TextView) view.findViewById(R.id.propertyadd1);
        propertyadd1.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        propertyadd2= (TextView) view.findViewById(R.id.propertyadd2);
        propertyadd2.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        propertyadd3= (TextView) view.findViewById(R.id.propertyadd3);
        propertyadd3.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));



        seen1= (Button) view.findViewById(R.id.seen1);
        seen2= (Button) view.findViewById(R.id.seen2);
        seen3= (Button) view.findViewById(R.id.seen3);



        property1= (LinearLayout) view.findViewById(R.id.property1);
        property1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PropertyDetailsFragment.class);
                intent.putExtra("seen",1);
                startActivityForResult(intent,1);
            }
        });
        property2= (LinearLayout) view.findViewById(R.id.property2);
        property2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PropertyDetailsFragment.class);
                intent.putExtra("seen",2);
                startActivityForResult(intent,2);
            }
        });
        property3= (LinearLayout) view.findViewById(R.id.property3);
        property3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PropertyDetailsFragment.class);
                intent.putExtra("seen",3);
                startActivityForResult(intent,3);
            }
        });*/
        initilizeViews();
        return view;
    }


    public void initilizeViews() {
        lvlist = new ArrayList<HashMap<String, String>>();
        lvproperty = (ListView) view.findViewById(R.id.lvproperty);
        for (int j = 0; j <5; j++) {
            String property_name=null,property_add=null;
            int id;

            property_name="568 E 1st Ave, Ney Jersey";
            property_add="London, 93-107 Shaftesbury Ave, W1D 5DY ";
            id= j+1;

            populate(property_name,property_add,id);
        }

        if (lvlist.size() > 0) {
            propertyAdapter = new PropertyAdapter(getActivity(), lvlist);
            lvproperty.setAdapter(propertyAdapter);
        } else {
            //istView.setEmptyView(tvNoBets);
        }
    }
    public void populate(String property_name, String property_add,int id) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("property_name", property_name);
        map.put("property_add", property_add);
        map.put("id", String.valueOf(id));
        lvlist.add(map);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    /*   @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
                String result=data.getStringExtra("result");
                seen1.setVisibility(View.VISIBLE);
                seen1.setText(result);
            }
        if (requestCode == 2) {
            String result=data.getStringExtra("result");
            seen2.setVisibility(View.VISIBLE);
            seen2.setText(result);
        }
        if (requestCode == 3) {
            String result=data.getStringExtra("result");
            seen3.setVisibility(View.VISIBLE);
            seen3.setText(result);
        }



        }*/
    }

