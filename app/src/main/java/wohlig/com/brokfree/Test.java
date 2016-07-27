package wohlig.com.brokfree;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Mahesh on 7/8/2016.
 */
public class Test extends Fragment {
    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner, spinner7;
    TextView amen;
    LinearLayout floor, amen1, car, vastu, locality, loan, sell, payment;
    CardView cardView, cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7;
    Button submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_other_requirements, container, false);
        ((PropertyDetailsFragment)this.getActivity()).setToolbarText("Requirements");
        String[] items = new String[]{"Inevitable", "important", "doesnt matter"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, items);

        spinner1 = (Spinner) view.findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter);
        spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter);
        spinner3 = (Spinner) view.findViewById(R.id.spinner3);
        spinner3.setAdapter(adapter);
        spinner4 = (Spinner) view.findViewById(R.id.spinner4);
        spinner4.setAdapter(adapter);
        spinner5 = (Spinner) view.findViewById(R.id.spinner5);
        spinner5.setAdapter(adapter);
        spinner6 = (Spinner) view.findViewById(R.id.spinner6);
        spinner6.setAdapter(adapter);
        spinner = (Spinner) view.findViewById(R.id.spinner);
        String[] items1 = new String[]{"posh", "good", "any"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, items1);
        spinner.setAdapter(adapter1);
        spinner7 = (Spinner) view.findViewById(R.id.spinner7);
        spinner7.setAdapter(adapter);
        amen1 = (LinearLayout) view.findViewById(R.id.amen_1);
        amen = (TextView) view.findViewById(R.id.amen);
        cardView = (CardView) view.findViewById(R.id.card_view1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amen1.setVisibility(amen1.isShown() ? View.GONE : View.VISIBLE);
            }
        });
        floor = (LinearLayout) view.findViewById(R.id.floor);
        cardView1 = (CardView) view.findViewById(R.id.card_view);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                floor.setVisibility(floor.isShown() ? View.GONE : View.VISIBLE);

            }
        });
        vastu = (LinearLayout) view.findViewById(R.id.vastu);
        cardView2 = (CardView) view.findViewById(R.id.card_view2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vastu.setVisibility(vastu.isShown() ? View.GONE : View.VISIBLE);

            }
        });

        locality = (LinearLayout) view.findViewById(R.id.locality);
        cardView3 = (CardView) view.findViewById(R.id.card_view3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locality.setVisibility(locality.isShown() ? View.GONE : View.VISIBLE);

            }
        });

        car = (LinearLayout) view.findViewById(R.id.car);
        cardView4 = (CardView) view.findViewById(R.id.card_view4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.setVisibility(car.isShown() ? View.GONE : View.VISIBLE);

            }
        });
        loan = (LinearLayout) view.findViewById(R.id.loan);
        cardView5 = (CardView) view.findViewById(R.id.card_view5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loan.setVisibility(loan.isShown() ? View.GONE : View.VISIBLE);

            }
        });
        sell = (LinearLayout) view.findViewById(R.id.sell);
        cardView6 = (CardView) view.findViewById(R.id.card_view6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sell.setVisibility(sell.isShown() ? View.GONE : View.VISIBLE);

            }
        });
        payment = (LinearLayout) view.findViewById(R.id.payment);
        cardView7 = (CardView) view.findViewById(R.id.card_view7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payment.setVisibility(payment.isShown() ? View.GONE : View.VISIBLE);

            }
        });
        submit = (Button) view.findViewById(R.id.brequiemnts_submit);
        submit.setOnClickListener(new View.OnClickListener() {
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

        return view;
    }


}
