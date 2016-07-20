package wohlig.com.brokfree;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mahesh on 7/6/2016.
 */
public class SingleRateFragment extends Fragment implements View.OnClickListener{
    boolean off1=true,off2=true,off3=true,off4=true,off5=true;
    ImageView ivStar1,ivStar2,ivStar3,ivStar4,ivStar5;
    TextView tvfeedback1;
    LinearLayout llfeedback;
    int starVal;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.layout_single_feedback, container, false);
        llfeedback= (LinearLayout) view.findViewById(R.id.rllfb);
        tvfeedback1= (TextView) view.findViewById(R.id.tvfb1);
        tvfeedback1.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "NotoSans-Regular.ttf"));

        ivStar1= (ImageView) view.findViewById(R.id.rivStar1);
        ivStar2= (ImageView) view.findViewById(R.id.rivStar2);
        ivStar3= (ImageView) view.findViewById(R.id.rivStar3);
        ivStar4= (ImageView) view.findViewById(R.id.rivStar4);
        ivStar5= (ImageView) view.findViewById(R.id.rivStar5);

        ivStar1.setOnClickListener(this);
        ivStar2.setOnClickListener(this);
        ivStar3.setOnClickListener(this);
        ivStar4.setOnClickListener(this);
        ivStar5.setOnClickListener(this);
return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.rivStar1):
                if (off1) {

                    ivStar1.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);

                    off1 = false;
                    starVal = 1;

                } else {

                    ivStar1.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar2.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar3.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar4.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar5.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    off1 = true;
                    off2 = true;
                    off3 = true;
                    off4 = true;
                    off5 = true;
                    starVal = 0;
                }


                break;
            case (R.id.rivStar2):
                if (off2) {


                    ivStar2.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar1.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);

                    off2 = false;
                    off1 = false;
                    starVal = 2;
                } else {


                    ivStar2.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar3.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar4.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar5.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    off1 = false;
                    off2 = true;
                    off3 = true;
                    off4 = true;
                    off5 = true;
                    starVal = 1;
                }
                break;
            case (R.id.rivStar3):
                if (off3) {

                    ivStar3.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar2.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar1.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);

                    off2 = false;
                    off1 = false;
                    off3 = false;
                    starVal = 3;
                } else {

                    ivStar3.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar4.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    ivStar5.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    off1 = false;
                    off2 = false;
                    off3 = true;
                    off4 = true;
                    off5 = true;
                    starVal = 2;
                }

                break;
            case (R.id.rivStar4):
                if (off4) {



                    ivStar4.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar3.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar2.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar1.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);

                    off2 = false;
                    off1 = false;
                    off3 = false;
                    off4 = false;
                    starVal = 4;
                } else {



                    ivStar4.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);
                    ivStar5.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);


                    off1 = false;
                    off2 = false;
                    off3 = false;
                    off4 = true;
                    off5 = true;
                    starVal = 3;
                }

                break;
            case (R.id.rivStar5):
                if (off5) {



                    ivStar5.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar4.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar3.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);


                    ivStar2.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);

                    ivStar1.setImageResource(R.drawable.abc_btn_rating_star_on_mtrl_alpha);

                    off2 = false;
                    off1 = false;
                    off3 = false;
                    off4 = false;
                    off5 = false;
                    starVal = 5;
                } else {


                    ivStar5.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);

                    off1 = false;
                    off2 = false;
                    off3 = false;
                    off4 = false;
                    off5 = true;
                    starVal = 4;
                }
                break;
        }

    }

}
