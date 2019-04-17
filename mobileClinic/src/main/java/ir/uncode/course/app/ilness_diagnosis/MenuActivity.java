package ir.uncode.course.app.ilness_diagnosis;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class MenuActivity extends SourceActivity {

    boolean doubleBackToExitPressedOnce = false;


    @Override
    public void onBackPressed() {

        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "برای خروج دوباره کلیک کنید", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("menu");
        setContentView(R.layout.main);
        yekanfont = Typeface.createFromAsset(getAssets(), "byekan.ttf");

        boolean skipWelcome = G.preferences.getBoolean("SKIP_WELCOME", false);
        if ( !skipWelcome) {
            Intent intent = new Intent(MenuActivity.this, ActivityStartup.class);
            MenuActivity.this.startActivity(intent);
            finish();
            SharedPreferences.Editor editor = G.preferences.edit();
            editor.putBoolean("SKIP_WELCOME", true);
            editor.commit();
        }

        /** attention - Sliding menu codes */
        float scaleValue = getBaseContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (80 * scaleValue + 0.5f);
        SlidingMenu menu = new SlidingMenu(this);

        menu.setMode(SlidingMenu.RIGHT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setFadeDegree(0.35f);
        menu.setBehindOffset(pixels);
        menu.setShadowDrawable(R.drawable.shadow);
        menu.setShadowWidthRes(R.dimen.shadow_width);
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);

        View view = G.layoutInflater.inflate(R.layout.menu, null);
        final Button btnmenu1 = (Button) view.findViewById(R.id.menu1);
        final Button btnmenu2 = (Button) view.findViewById(R.id.menu2);
        final Button btnmenu3 = (Button) view.findViewById(R.id.menu3);
        final Button btnmenu4 = (Button) view.findViewById(R.id.menu4);
        final Button btnmenu5 = (Button) view.findViewById(R.id.menu5);
        final Button open = (Button) view.findViewById(R.id.open);
        final LinearLayout list1 = (LinearLayout) view.findViewById(R.id.list1);
        final LinearLayout menulayout1 = (LinearLayout) view.findViewById(R.id.menulayout1);
        final LinearLayout menulayout2 = (LinearLayout) view.findViewById(R.id.menulayout2);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int ht = displaymetrics.heightPixels;
        int wt = displaymetrics.widthPixels;
        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {
            btnmenu5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.exit1, 0);
        }
        else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_NORMAL) {
            btnmenu5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.exit, 0);
        } else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_SMALL) {
            btnmenu5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.exit, 0);

        }
        btnmenu5.setText("خروج");
        menulayout1.setVisibility(View.GONE);
        menulayout2.setVisibility(View.GONE);

        btnmenu1.setVisibility(View.GONE);
        btnmenu2.setVisibility(View.GONE);
        list1.setVisibility(View.GONE);
        open.setVisibility(View.GONE);

        btnmenu3.setTypeface(yekanfont);
        btnmenu4.setTypeface(yekanfont);
        btnmenu5.setTypeface(yekanfont);
        btnmenu5.setVisibility(view.GONE);
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MenuActivity.this, AboutActivity.class);
                MenuActivity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu4.setOnClickListener(new OnClickListener() {

            public boolean isPackageInstalled(String PackageName) {
                PackageManager manager = getPackageManager();
                boolean isAppInstalled = false;
                try {
                    manager.getPackageInfo(PackageName, PackageManager.GET_ACTIVITIES);
                    isAppInstalled = true;
                }
                catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                return isAppInstalled;
            }


            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                if (isPackageInstalled("com.farsitel.bazaar")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("bazaar://details?id=" + "ir.uncode.course.app.ilness_diagnosis"));
                    intent.setPackage("com.farsitel.bazaar");
                    startActivity(intent);
                }
                else {
                    Toast.makeText(G.context, "لطفا برنامه بازار را بروی دستگاه گوشی نصب کنید", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnmenu5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        menu.setMenu(view);

        /** attention - main code */
        Button btnemergency = (Button) findViewById(R.id.btnemergency);
        Button btndiagnosis = (Button) findViewById(R.id.btndiagnosis);
        Button btnabout = (Button) findViewById(R.id.btnabout);

        btnemergency.setTypeface(yekanfont);
        btndiagnosis.setTypeface(yekanfont);
        btnabout.setTypeface(yekanfont);
        btnemergency.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MenuActivity.this, EmergencyActivity.class);
                MenuActivity.this.startActivity(intent);
                finish();
            }
        });
        btnabout.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MenuActivity.this, AboutActivity.class);
                MenuActivity.this.startActivity(intent);
                finish();

            }
        });
        btndiagnosis.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Cursor cursor = G.database.rawQuery("UPDATE abdomen SET score = 0", null);
                while (cursor.moveToNext()) {}
                cursor.close();
                Cursor cursor1 = G.database.rawQuery("UPDATE ear SET score = 0", null);
                while (cursor1.moveToNext()) {}
                cursor1.close();
                Cursor cursor2 = G.database.rawQuery("UPDATE eye SET score = 0", null);
                while (cursor2.moveToNext()) {}
                cursor2.close();
                Cursor cursor3 = G.database.rawQuery("UPDATE sexual SET score = 0", null);
                while (cursor3.moveToNext()) {}
                cursor3.close();

                Intent intent = new Intent(MenuActivity.this, DiagnosisActivity.class);
                MenuActivity.this.startActivity(intent);
                finish();

            }
        });

        /** attention - actionbar code */
        LinearLayout actionbar_short = (LinearLayout) findViewById(R.id.actionbar_short);
        TextView actionbartxt = (TextView) findViewById(R.id.actionbartxt);
        MarginLayoutParams marginParams = (MarginLayoutParams) actionbartxt.getLayoutParams();
        actionbar_short.setBackgroundColor(Color.parseColor("#b71111"));

        actionbartxt.setText("صفحه اصلی");
        actionbartxt.setTypeface(yekanfont);
    }
};
