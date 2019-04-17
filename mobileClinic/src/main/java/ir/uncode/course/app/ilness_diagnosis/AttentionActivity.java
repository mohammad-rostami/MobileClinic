package ir.uncode.course.app.ilness_diagnosis;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;


public class AttentionActivity extends Activity {

    private static final int SPLASH_TIME = 1 * 800; // 3 ثانیه

    public static Typeface   yekanfont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.attention);
        yekanfont = Typeface.createFromAsset(getAssets(), "byekan.ttf");

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setTypeface(yekanfont);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent intent = new Intent(AttentionActivity.this,
                        MenuActivity.class);
                startActivity(intent);

                AttentionActivity.this.finish();

            }
        }, SPLASH_TIME);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {}
        }, SPLASH_TIME);

    }


    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
    }
}