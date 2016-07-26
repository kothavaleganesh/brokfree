package wohlig.com.brokfree;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mahesh on 6/30/2016.
 */
public class PropertyDetailsFragment extends AppCompatActivity {
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view=inflater.inflate(R.layout.fragment_property_details,container,false);
//
//        return view;
//    }

    Button done_property ,seen_unseen;
    Toolbar toolbar=null ;
    public TextView toolbartitle;
    TextView propertyname,propertyadd,property_price,property_pricetag,property_location,property_room,property_area;
    TextView property_desc,property_prate,propperty_prate1,property_lastupdate,property_lupdate,property_bankA,property_amenities;
    CheckBox cbproperty1,cbproperty2,cbproperty3;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12;
    ImageView propertymap;
    Intent i;
    static int reqgetcode;
    ImageView backArrow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_property_details);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbartitle= (TextView) findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);
        toolbartitle.setText("Property");
        getSupportActionBar().setDisplayShowTitleEnabled(false );
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        propertyname= (TextView) findViewById(R.id.property_name);
        propertyname.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Bold.ttf"));

        propertyadd= (TextView) findViewById(R.id.property_add);
        propertyadd.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        property_price= (TextView) findViewById(R.id.property_price);
        property_price.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Bold.ttf"));

        property_pricetag= (TextView) findViewById(R.id.property_pricetag);
        property_pricetag.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        property_location= (TextView) findViewById(R.id.property_location);
        property_location.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        property_room= (TextView) findViewById(R.id.property_room);
        property_room.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        property_area= (TextView) findViewById(R.id.property_area);
        property_area.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        property_desc= (TextView) findViewById(R.id.property_desc);
        property_desc.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        property_prate= (TextView) findViewById(R.id.property_prate);
        property_prate.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Bold.ttf"));

        propperty_prate1= (TextView) findViewById(R.id.propperty_prate1);
        propperty_prate1.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        property_lastupdate= (TextView) findViewById(R.id.property_lastupdate);
        property_lastupdate.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Bold.ttf"));

        property_lupdate= (TextView) findViewById(R.id.property_lupdate);
        property_lupdate.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        property_bankA= (TextView) findViewById(R.id.property_bankA);
        property_bankA.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Bold.ttf"));


        cbproperty1= (CheckBox) findViewById(R.id.cbproperty1);
        cbproperty1.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cbproperty2= (CheckBox) findViewById(R.id.cbproperty2);
        cbproperty2.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cbproperty3= (CheckBox) findViewById(R.id.cbproperty3);
        cbproperty3.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        propertymap= (ImageView) findViewById(R.id.property_map);
        propertymap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        property_amenities= (TextView) findViewById(R.id.property_amenities);
        property_amenities.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Bold.ttf"));

        cb1= (CheckBox) findViewById(R.id.cb1);
        cb1.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb2= (CheckBox) findViewById(R.id.cb2);
        cb2.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb3= (CheckBox) findViewById(R.id.cb3);
        cb3.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb4= (CheckBox) findViewById(R.id.cb4);
        cb4.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb5= (CheckBox) findViewById(R.id.cb5);
        cb5.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb6= (CheckBox) findViewById(R.id.cb6);
        cb6.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb7= (CheckBox) findViewById(R.id.cb7);
        cb7.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb8= (CheckBox) findViewById(R.id.cb8);
        cb8.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb9= (CheckBox) findViewById(R.id.cb9);
        cb9.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb10= (CheckBox) findViewById(R.id.cb10);
        cb10.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb11= (CheckBox) findViewById(R.id.cb11);
        cb11.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        cb12= (CheckBox) findViewById(R.id.cb12);
        cb12.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        backArrow= (ImageView) findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toolbartitle.setText("Property");
                onBackPressed();
            }
        });
        seen_unseen= (Button) findViewById(R.id.seen_unseen);
        seen_unseen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=getIntent().getIntExtra("seen",0);
                Log.d("inside seen ", "onClick: "+num);
                if(seen_unseen.getText().equals("Seen"))
                {
                    seen_unseen.setText("Unseen");
                }else
                {
                    seen_unseen.setText("Seen");
                }
                String result;
                if(seen_unseen.getText().equals("Seen")) {
                    result = "Seen";
                }
                else{
                    result = "Unseen";
                }
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result",result);
                setResult(num,returnIntent);
                Log.d("inside result intent", "onClick: "+ result);
                finish();
            }
        });

        done_property= (Button) findViewById(R.id.done_property);
        done_property.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FeedbackFragment feedbackFragment = new FeedbackFragment();
                fragmentTransaction.replace(R.id.container, feedbackFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });



    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {

            //if (doubleBackToExitPressedOnce) {
            getFragmentManager().popBackStack();

        } else {
                finish();
        }

    }

    public void setToolbarText(String s) {
        toolbartitle.setText(s);

    }
}
