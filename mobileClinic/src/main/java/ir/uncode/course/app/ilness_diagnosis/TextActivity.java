package ir.uncode.course.app.ilness_diagnosis;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class TextActivity extends SourceActivity {

    @Override
    public void onBackPressed() {

        Intent goB = getIntent();
        String goback = goB.getStringExtra("actionbartxt1");

        if (goback.equals("علایم حیاتی")) {
            Intent intent = new Intent(TextActivity.this, E_BasicSupportActivity.class);
            TextActivity.this.startActivity(intent);

        }
        else if (goback.equals("انسداد راه هوایی کودکان")) {
            Intent intent = new Intent(TextActivity.this, E_BasicSupportActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("حمایت پایه")) {
            Intent intent = new Intent(TextActivity.this, E_BasicSupportActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("انسداد راه هوایی بزرگسالان")) {
            Intent intent = new Intent(TextActivity.this, E_BasicSupportActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("سوختگی الکتریکی")) {
            Intent intent = new Intent(TextActivity.this, E_BurningActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("سوختگی حرارتی")) {
            Intent intent = new Intent(TextActivity.this, E_BurningActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("سوختگی شیمیایی")) {
            Intent intent = new Intent(TextActivity.this, E_BurningActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آسیب به قفسه سینه")) {
            Intent intent = new Intent(TextActivity.this, E_ChestHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آسیب به شکم")) {
            Intent intent = new Intent(TextActivity.this, E_ChestHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آسیب به استخوان")) {
            Intent intent = new Intent(TextActivity.this, E_ChestHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("پیچ خوردگی,کشیدگی,دررفتگی")) {
            Intent intent = new Intent(TextActivity.this, E_ChestHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("خون زیر ناخن")) {
            Intent intent = new Intent(TextActivity.this, E_ChestHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("گیر کردن حلقه یا انگشتر")) {
            Intent intent = new Intent(TextActivity.this, E_ChestHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آسیب به ستون فقرات")) {
            Intent intent = new Intent(TextActivity.this, E_HeadHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آسیب به سر")) {
            Intent intent = new Intent(TextActivity.this, E_HeadHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آسیب به بینی")) {
            Intent intent = new Intent(TextActivity.this, E_HeadHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }

        else if (goback.equals("آسیب به دندان")) {
            Intent intent = new Intent(TextActivity.this, E_HeadHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آسیب به چشم")) {
            Intent intent = new Intent(TextActivity.this, E_HeadHurtActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آتل بندی اندام تحتانی")) {
            Intent intent = new Intent(TextActivity.this, E_AtelBandiActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آتل بندی اندام فوقانی")) {
            Intent intent = new Intent(TextActivity.this, E_AtelBandiActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("آتل بندی آرنج و زانو")) {
            Intent intent = new Intent(TextActivity.this, E_AtelBandiActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("افزایش تعداد تنفس")) {
            Intent intent = new Intent(TextActivity.this, E_BimariActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("اورژانس دیابتی ها")) {
            Intent intent = new Intent(TextActivity.this, E_BimariActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("تشنج")) {
            Intent intent = new Intent(TextActivity.this, E_BimariActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("حمله قلبی")) {
            Intent intent = new Intent(TextActivity.this, E_BimariActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("غش کردن")) {
            Intent intent = new Intent(TextActivity.this, E_BimariActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("فوریت های دوران حاملگی")) {
            Intent intent = new Intent(TextActivity.this, E_BimariActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("قند خون بالا")) {
            Intent intent = new Intent(TextActivity.this, E_BimariActivity.class);
            TextActivity.this.startActivity(intent);
        }
        else if (goback.equals("قند خون پایین")) {
            Intent intent = new Intent(TextActivity.this, E_BimariActivity.class);
            TextActivity.this.startActivity(intent);
        }

        else {
            Intent intent = new Intent(TextActivity.this, EmergencyActivity.class);
            TextActivity.this.startActivity(intent);
        }
        overridePendingTransition(R.anim.enter1, R.anim.exit1);
        finish();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);

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
        final Button Button01 = (Button) view.findViewById(R.id.Button01);
        final Button Button02 = (Button) view.findViewById(R.id.Button02);
        final Button Button03 = (Button) view.findViewById(R.id.Button03);
        final Button Button04 = (Button) view.findViewById(R.id.Button04);
        final Button Button05 = (Button) view.findViewById(R.id.Button05);
        final Button Button06 = (Button) view.findViewById(R.id.Button06);
        final Button Button07 = (Button) view.findViewById(R.id.Button07);
        final Button Button08 = (Button) view.findViewById(R.id.Button08);
        final Button Button09 = (Button) view.findViewById(R.id.Button09);
        final Button Button10 = (Button) view.findViewById(R.id.Button10);
        final LinearLayout list1 = (LinearLayout) view.findViewById(R.id.list1);
        final LinearLayout menulayout1 = (LinearLayout) view.findViewById(R.id.menulayout1);
        final LinearLayout menulayout2 = (LinearLayout) view.findViewById(R.id.menulayout2);

        menulayout1.setVisibility(View.GONE);
        menulayout2.setVisibility(View.GONE);
        list1.setVisibility(View.GONE);
        btnmenu1.setTypeface(yekanfont);
        btnmenu2.setTypeface(yekanfont);
        btnmenu3.setTypeface(yekanfont);
        btnmenu4.setTypeface(yekanfont);
        btnmenu5.setTypeface(yekanfont);
        Button01.setTypeface(yekanfont);
        Button02.setTypeface(yekanfont);
        Button03.setTypeface(yekanfont);
        Button04.setTypeface(yekanfont);
        Button05.setTypeface(yekanfont);
        Button06.setTypeface(yekanfont);
        Button07.setTypeface(yekanfont);
        Button08.setTypeface(yekanfont);
        Button09.setTypeface(yekanfont);
        Button10.setTypeface(yekanfont);

        btnmenu1.setBackgroundColor(Color.parseColor("#eeeeee"));
        open.setBackgroundColor(Color.parseColor("#eeeeee"));
        btnmenu1.setTextColor(Color.parseColor("#bc1111"));

        open.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list1.getVisibility() == View.GONE) {
                    list1.setVisibility(View.VISIBLE);
                    open.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);

                }
                else
                {
                    list1.setVisibility(View.GONE);
                    open.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });

        btnmenu1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, EmergencyActivity.class);
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, DiagnosisActivity.class);
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, AboutActivity.class);
                TextActivity.this.startActivity(intent);
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
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });
        Button01.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/bleed.html");
                intent.putExtra("actionbartxt1", "خونریزی");
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button02.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, E_BurningActivity.class);
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button03.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/poisoning.html");
                intent.putExtra("actionbartxt1", "مسمومیت");
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button04.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, E_BasicSupportActivity.class);
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button05.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/heatstroke.html");
                intent.putExtra("actionbartxt1", "گرمازدگی");
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button06.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                intent.putExtra("actionbartxt1", "سرمازدگی");
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button07.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, E_HeadHurtActivity.class);
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button08.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, E_ChestHurtActivity.class);
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button09.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, E_AtelBandiActivity.class);
                TextActivity.this.startActivity(intent);
                finish();
            }
        });
        Button10.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity.this, E_ChestHurtActivity.class);
                TextActivity.this.startActivity(intent);
                finish();
            }
        });

        menu.setMenu(view);

        /** attention - main code */
        TextView actionbartxt = (TextView) findViewById(R.id.actionbartxt);
        TextView actionbartxt1 = (TextView) findViewById(R.id.actionbartxt1);
        WebView webview = (WebView) findViewById(R.id.webview);
        Intent intent = getIntent();
        String str = intent.getStringExtra("txt");
        webview.loadUrl(str);
        String str1 = intent.getStringExtra("actionbartxt1");

        actionbartxt.setText("اورژانس");
        actionbartxt1.setText(str1);

        actionbartxt.setTypeface(yekanfont);
        actionbartxt1.setTypeface(yekanfont);

    }
}