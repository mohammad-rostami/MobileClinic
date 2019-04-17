package ir.uncode.course.app.ilness_diagnosis;

import android.app.Activity;


public class EnhancedActivity extends Activity {

    @Override
    protected void onResume() {
        G.currentActivity = this;
        super.onResume();
    }
}
