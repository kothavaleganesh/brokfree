package wohlig.com.brokfree;

import android.app.Activity;
import android.graphics.Typeface;

/**
 * Created by Jay on 19-01-2016.
 */
public class CustomFonts extends Activity {

    public static Typeface getRegularFont(Activity activity){
        return Typeface.createFromAsset(activity.getAssets(), "NotoSans-Regular.ttf");
    }

    public static Typeface getBoldItalicFont(Activity activity){
        return Typeface.createFromAsset(activity.getAssets(), "NotoSans-BoldItalic.ttf");
    }

    public static Typeface getItalicFont(Activity activity){
        return Typeface.createFromAsset(activity.getAssets(), "NotoSans-Italic.ttf");
    }

    public static Typeface getBoldFont(Activity activity){
        return Typeface.createFromAsset(activity.getAssets(), "NotoSans-Bold.ttf");
    }


}
