package ir.uncode.course.app.ilness_diagnosis;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;


public class SourceActivity extends Activity {

    public static Typeface yekanfont;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu);
        yekanfont = Typeface.createFromAsset(getAssets(), "byekan.ttf");

    }

}