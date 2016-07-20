package wohlig.com.brokfree;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Mahesh on 7/7/2016.
 */
public class AlertDFragment extends DialogFragment {




@Override
public Dialog onCreateDialog(final Bundle savedInstanceState) {
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

    // setup your dialog here...
    builder.setTitle("LOG OUT");
    builder.setMessage("Are You Sure You Want to Log Out?");

    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(final DialogInterface dialog, final int which) {
            // do something
        }
    });

    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(final DialogInterface dialog, final int which) {
            // do something
            Intent i=new Intent(getActivity(), LoginActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }
    });

    final AlertDialog dialog = builder.create();

    dialog.setOnShowListener(new DialogInterface.OnShowListener() {
        @Override
        public void onShow(final DialogInterface dialog) {
            Button negativeButton = ((AlertDialog)dialog).getButton(DialogInterface.BUTTON_NEGATIVE);
            Button positiveButton = ((AlertDialog)dialog).getButton(DialogInterface.BUTTON_POSITIVE);
            final Resources res = getResources();
       final int yellow = res.getColor(R.color.title);
             //Title
        final int titleId = res.getIdentifier("alertTitle", "id", "android");
        final View title = getDialog().findViewById(titleId);
        if (title != null) {
            ((TextView) title).setTextColor(yellow);
        }

        // Title divider
        final int titleDividerId = res.getIdentifier("titleDivider", "id", "android");
        final View titleDivider = getDialog().findViewById(titleDividerId);
        if (titleDivider != null) {
            titleDivider.setBackgroundColor(yellow);
        }
            final Drawable negativeButtonDrawable = getResources().getDrawable(R.drawable.dialog_button);
            final Drawable positiveButtonDrawable = getResources().getDrawable(R.drawable.dialog_button);
            if (Build.VERSION.SDK_INT >= 16) {
                negativeButton.setBackground(negativeButtonDrawable);
                positiveButton.setBackground(positiveButtonDrawable);
            } else {
                negativeButton.setBackgroundDrawable(negativeButtonDrawable);
                positiveButton.setBackgroundDrawable(positiveButtonDrawable);
            }

            negativeButton.invalidate();
            positiveButton.invalidate();
        }
    });

    return dialog;
}


}
