package wohlig.com.brokfree;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mahesh on 7/5/2016.
 */
public class PropertyFragment extends Fragment {
    LinearLayout property1,property2,property3;
    TextView propertyname1,propertyname2,propertyname3,propertyadd1,propertyadd2,propertyadd3;
    Button seen1,seen2,seen3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_property, container, false);
        propertyname1= (TextView) view.findViewById(R.id.propertyname1);
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
        });

        return view;
    }



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
                String result=data.getStringExtra("result");
                Log.d("hello",result);
                seen1.setVisibility(View.VISIBLE);
                seen1.setText(result);
            }
        if (requestCode == 2) {
            Log.d("hello","seen");
            String result=data.getStringExtra("result");
            seen2.setVisibility(View.VISIBLE);
            seen2.setText(result);
        }
        if (requestCode == 3) {
            Log.d("hello","seen");
            String result=data.getStringExtra("result");
            seen3.setVisibility(View.VISIBLE);
            seen3.setText(result);
        }



        }
    }

