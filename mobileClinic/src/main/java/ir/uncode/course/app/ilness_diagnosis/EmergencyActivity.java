package ir.uncode.course.app.ilness_diagnosis;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class EmergencyActivity extends SourceActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(EmergencyActivity.this, MenuActivity.class);
        EmergencyActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.enter1, R.anim.exit1);
        finish();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("menu");
        setContentView(R.layout.emergency);

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

        menulayout1.setVisibility(View.GONE);
        menulayout2.setVisibility(View.GONE);
        list1.setVisibility(View.GONE);
        open.setVisibility(View.GONE);

        btnmenu1.setTypeface(yekanfont);
        btnmenu2.setTypeface(yekanfont);
        btnmenu3.setTypeface(yekanfont);
        btnmenu4.setTypeface(yekanfont);
        btnmenu5.setTypeface(yekanfont);
        btnmenu1.setBackgroundColor(Color.parseColor("#eeeeee"));
        btnmenu1.setTextColor(Color.parseColor("#bc1111"));
        btnmenu2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, DiagnosisActivity.class);
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, AboutActivity.class);
                EmergencyActivity.this.startActivity(intent);
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
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

        menu.setMenu(view);

        /** attention - main code */
        Button btnbleed = (Button) findViewById(R.id.btnbleed);
        Button btnburn = (Button) findViewById(R.id.btnburn);
        Button btnbasicsup = (Button) findViewById(R.id.btnbasicsup);
        Button btnheadhurt = (Button) findViewById(R.id.btnheadhurt);
        Button btnchesthurt = (Button) findViewById(R.id.btnchesthurt);
        Button btnAtel = (Button) findViewById(R.id.btnAtel);
        Button btnBimari = (Button) findViewById(R.id.btnBimari);
        Button btnpoison = (Button) findViewById(R.id.btnpoison);
        Button btnheatstroke = (Button) findViewById(R.id.btnheatstroke);
        Button btnfrostbite = (Button) findViewById(R.id.btnfrostbite);
        TextView actionbartxt = (TextView) findViewById(R.id.actionbartxt);

        btnbleed.setTypeface(yekanfont);
        btnburn.setTypeface(yekanfont);
        btnbasicsup.setTypeface(yekanfont);
        btnheadhurt.setTypeface(yekanfont);
        btnchesthurt.setTypeface(yekanfont);
        btnAtel.setTypeface(yekanfont);
        btnBimari.setTypeface(yekanfont);
        btnpoison.setTypeface(yekanfont);
        btnheatstroke.setTypeface(yekanfont);
        btnfrostbite.setTypeface(yekanfont);
        btnbleed.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/bleed.html");
                intent.putExtra("actionbartxt1", "خونریزی");
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnburn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, E_BurningActivity.class);
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnpoison.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/poisoning.html");
                intent.putExtra("actionbartxt1", "مسمومیت");
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnbasicsup.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, E_BasicSupportActivity.class);
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnheatstroke.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/heatstroke.html");
                intent.putExtra("actionbartxt1", "گرمازدگی");
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnfrostbite.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                intent.putExtra("actionbartxt1", "سرمازدگی");
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });

        btnheadhurt.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, E_HeadHurtActivity.class);
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnchesthurt.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, E_ChestHurtActivity.class);
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnAtel.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, E_AtelBandiActivity.class);
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });
        btnBimari.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(EmergencyActivity.this, E_BimariActivity.class);
                EmergencyActivity.this.startActivity(intent);
                finish();
            }
        });

        /** attention - actionbar code */
        LinearLayout actionbar_short = (LinearLayout) findViewById(R.id.actionbar_short);

        actionbar_short.setBackgroundColor(Color.parseColor("#F44336"));
        actionbartxt.setText("اورژانس");
        actionbartxt.setTypeface(yekanfont);
    }


    private View getContext() {
        // TODO Auto-generated method stub
        return null;

    }
}