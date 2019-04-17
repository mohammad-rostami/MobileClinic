package ir.uncode.course.app.ilness_diagnosis;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class D_Abdomen3Activity extends SourceActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(D_Abdomen3Activity.this, D_AbdomenActivity.class);
        D_Abdomen3Activity.this.startActivity(intent);
        overridePendingTransition(R.anim.enter1, R.anim.exit1);
        finish();
    }

    public Typeface          yekanfont;
    private static final int SPLASH_TIME  = 1 * 800; // 3 ثانیه
    private static final int SPLASH_TIME1 = 4 * 800; // 3 
    private static final int SPLASH_TIME2 = 5 * 730; // 3 


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_abdomen3);
        yekanfont = Typeface.createFromAsset(getAssets(), "byekan.ttf");

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
        final TextView age = (TextView) view.findViewById(R.id.txtage);
        final TextView sex = (TextView) view.findViewById(R.id.txtsex);
        final TextView txtmenu = (TextView) view.findViewById(R.id.txtmenu);
        final TextView txtmenu1 = (TextView) view.findViewById(R.id.txtmenu1);
        final TextView txtmenu2 = (TextView) view.findViewById(R.id.txtmenu2);
        final TextView txtmenu3 = (TextView) view.findViewById(R.id.txtmenu3);
        final TextView txtmenu4 = (TextView) view.findViewById(R.id.txtmenu4);
        final TextView txtmenu5 = (TextView) view.findViewById(R.id.txtmenu5);
        final TextView txtmenu6 = (TextView) view.findViewById(R.id.txtmenu6);

        String jensiat = DiagnosisActivity.sex;
        String sen = DiagnosisActivity.age;

        if (jensiat.equals("woman")) {
            sex.setText("مونث");
        }
        if (jensiat.equals("man")) {
            sex.setText("مذکر");
        }
        if (jensiat.equals("nothing")) {
            menulayout1.setVisibility(view.GONE);
            menulayout2.setVisibility(view.GONE);
        }
        txtmenu6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, DiagnosisActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        age.setText(sen);
        sex.setTypeface(yekanfont);
        txtmenu.setTypeface(yekanfont);
        txtmenu1.setTypeface(yekanfont);
        txtmenu2.setTypeface(yekanfont);
        txtmenu3.setTypeface(yekanfont);
        txtmenu4.setTypeface(yekanfont);
        txtmenu5.setTypeface(yekanfont);
        txtmenu6.setTypeface(yekanfont);
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

        btnmenu2.setBackgroundColor(Color.parseColor("#eeeeee"));
        btnmenu2.setTextColor(Color.parseColor("#689f38"));
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
                Intent intent = new Intent(D_Abdomen3Activity.this, EmergencyActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, AboutActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
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
                Intent intent = new Intent(D_Abdomen3Activity.this, D_AbdomenActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnmenu1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, EmergencyActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, AboutActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });

        btnmenu5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, D_AbdomenActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button01.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/bleed.html");
                intent.putExtra("actionbartxt1", "خونریزی");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button02.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, E_BurningActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button03.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/poisoning.html");
                intent.putExtra("actionbartxt1", "مسمومیت");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button04.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, E_BasicSupportActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button05.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/heatstroke.html");
                intent.putExtra("actionbartxt1", "گرمازدگی");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button06.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                intent.putExtra("actionbartxt1", "سرمازدگی");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button07.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, E_HeadHurtActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button08.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, E_ChestHurtActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button09.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, E_AtelBandiActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        Button10.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, E_BimariActivity.class);
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        menu.setMenu(view);

        /** attention - main code */
        final Button btnopen = (Button) findViewById(R.id.btnopen);
        final Button btnopen1 = (Button) findViewById(R.id.btnopen1);
        final Button btnopen2 = (Button) findViewById(R.id.btnopen2);
        final Button btnopen3 = (Button) findViewById(R.id.btnopen3);
        final Button btnopenw = (Button) findViewById(R.id.btnopenw);
        final Button btnopen1w = (Button) findViewById(R.id.btnopen1w);
        final Button btnopen2w = (Button) findViewById(R.id.btnopen2w);
        final Button btnopen3w = (Button) findViewById(R.id.btnopen3w);
        final Button btnopen5 = (Button) findViewById(R.id.btnopen5);
        final Button btnopen7 = (Button) findViewById(R.id.btnopen7);
        final LinearLayout list = (LinearLayout) findViewById(R.id.list);
        final LinearLayout list4 = (LinearLayout) findViewById(R.id.list4);
        final LinearLayout list2 = (LinearLayout) findViewById(R.id.list2);
        final LinearLayout list3 = (LinearLayout) findViewById(R.id.list3);
        final LinearLayout listw = (LinearLayout) findViewById(R.id.listw);
        final LinearLayout list4w = (LinearLayout) findViewById(R.id.list4w);
        final LinearLayout list2w = (LinearLayout) findViewById(R.id.list2w);
        final LinearLayout list3w = (LinearLayout) findViewById(R.id.list3w);
        final LinearLayout list5 = (LinearLayout) findViewById(R.id.list5);
        final LinearLayout list6 = (LinearLayout) findViewById(R.id.list6);
        final LinearLayout man = (LinearLayout) findViewById(R.id.man);
        final LinearLayout woman = (LinearLayout) findViewById(R.id.woman);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn1w = (Button) findViewById(R.id.btn1w);
        Button btn2w = (Button) findViewById(R.id.btn2w);
        Button btn3w = (Button) findViewById(R.id.btn3w);
        Button btn4w = (Button) findViewById(R.id.btn4w);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        TextView TextView03 = (TextView) findViewById(R.id.TextView03);
        TextView TextView04 = (TextView) findViewById(R.id.TextView04);
        TextView TextView05 = (TextView) findViewById(R.id.TextView05);
        TextView TextView06 = (TextView) findViewById(R.id.TextView06);
        TextView TextView03w = (TextView) findViewById(R.id.TextView03w);
        TextView TextView04w = (TextView) findViewById(R.id.TextView04w);
        TextView TextView05w = (TextView) findViewById(R.id.TextView05w);
        TextView TextView06w = (TextView) findViewById(R.id.TextView06w);
        TextView TextView07 = (TextView) findViewById(R.id.TextView07);
        TextView TextView08 = (TextView) findViewById(R.id.TextView08);

        TextView03.setTypeface(yekanfont);
        TextView04.setTypeface(yekanfont);
        TextView05.setTypeface(yekanfont);
        TextView06.setTypeface(yekanfont);
        TextView03w.setTypeface(yekanfont);
        TextView04w.setTypeface(yekanfont);
        TextView05w.setTypeface(yekanfont);
        TextView06w.setTypeface(yekanfont);
        TextView07.setTypeface(yekanfont);
        TextView08.setTypeface(yekanfont);
        btn1.setTypeface(yekanfont);
        btn2.setTypeface(yekanfont);
        btn3.setTypeface(yekanfont);
        btn4.setTypeface(yekanfont);
        btn1w.setTypeface(yekanfont);
        btn2w.setTypeface(yekanfont);
        btn3w.setTypeface(yekanfont);
        btn4w.setTypeface(yekanfont);
        btn5.setTypeface(yekanfont);
        btn6.setTypeface(yekanfont);

        list.setVisibility(View.GONE);
        list4.setVisibility(View.GONE);
        list2.setVisibility(View.GONE);
        list3.setVisibility(View.GONE);
        listw.setVisibility(View.GONE);
        list4w.setVisibility(View.GONE);
        list2w.setVisibility(View.GONE);
        list3w.setVisibility(View.GONE);
        list5.setVisibility(View.GONE);
        list6.setVisibility(View.GONE);

        String jens = DiagnosisActivity.sex;

        if (jens.equals("woman")) {
            man.setVisibility(view.GONE);
            woman.setVisibility(view.VISIBLE);
        }
        if (jens.equals("man")) {
            woman.setVisibility(view.GONE);
            man.setVisibility(view.VISIBLE);
        }
        if (jens.equals("nothing")) {
            woman.setVisibility(view.GONE);
            man.setVisibility(view.VISIBLE);
        }
        btn6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/kist_sine.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btn5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/kist_tokhmdan.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/davazdahe.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btn2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/apandis.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btn3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/kise_safra.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btn4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/ghalb.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });

        btn1w.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/davazdahe.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btn2w.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/apandis.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btn3w.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/kise_safra.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });
        btn4w.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Abdomen3Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/ghalb.html");
                D_Abdomen3Activity.this.startActivity(intent);
                finish();
            }
        });

        btnopen.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list.getVisibility() == View.GONE) {
                    list.setVisibility(View.VISIBLE);
                    list4.setVisibility(View.GONE);
                    list2.setVisibility(View.GONE);
                    list3.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list.setVisibility(View.GONE);
                    btnopen.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list4.getVisibility() == View.GONE) {
                    list4.setVisibility(View.VISIBLE);
                    list.setVisibility(View.GONE);
                    list2.setVisibility(View.GONE);
                    list3.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list4.setVisibility(View.GONE);
                    btnopen1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list2.getVisibility() == View.GONE) {
                    list2.setVisibility(View.VISIBLE);
                    list4.setVisibility(View.GONE);
                    list.setVisibility(View.GONE);
                    list3.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list2.setVisibility(View.GONE);
                    btnopen2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list3.getVisibility() == View.GONE) {
                    list3.setVisibility(View.VISIBLE);
                    list4.setVisibility(View.GONE);
                    list2.setVisibility(View.GONE);
                    list.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list3.setVisibility(View.GONE);
                    btnopen3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list5.getVisibility() == View.GONE) {
                    list5.setVisibility(View.VISIBLE);
                    list4.setVisibility(View.GONE);
                    list2.setVisibility(View.GONE);
                    list.setVisibility(View.GONE);
                    list3.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list5.setVisibility(View.GONE);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list6.getVisibility() == View.GONE) {
                    list6.setVisibility(View.VISIBLE);
                    list4.setVisibility(View.GONE);
                    list2.setVisibility(View.GONE);
                    list.setVisibility(View.GONE);
                    list3.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list6.setVisibility(View.GONE);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopenw.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (listw.getVisibility() == View.GONE) {
                    listw.setVisibility(View.VISIBLE);
                    list4w.setVisibility(View.GONE);
                    list2w.setVisibility(View.GONE);
                    list3w.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopenw.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    listw.setVisibility(View.GONE);
                    btnopenw.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen1w.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list4w.getVisibility() == View.GONE) {
                    list4w.setVisibility(View.VISIBLE);
                    listw.setVisibility(View.GONE);
                    list2w.setVisibility(View.GONE);
                    list3w.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen1w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopenw.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list4w.setVisibility(View.GONE);
                    btnopen1w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen2w.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list2w.getVisibility() == View.GONE) {
                    list2w.setVisibility(View.VISIBLE);
                    list4w.setVisibility(View.GONE);
                    listw.setVisibility(View.GONE);
                    list3w.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen2w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopenw.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list2w.setVisibility(View.GONE);
                    btnopen2w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen3w.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list3w.getVisibility() == View.GONE) {
                    list3w.setVisibility(View.VISIBLE);
                    list4w.setVisibility(View.GONE);
                    list2w.setVisibility(View.GONE);
                    listw.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen3w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopenw.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list3w.setVisibility(View.GONE);
                    btnopen3w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list5.getVisibility() == View.GONE) {
                    list5.setVisibility(View.VISIBLE);
                    list4w.setVisibility(View.GONE);
                    list2w.setVisibility(View.GONE);
                    listw.setVisibility(View.GONE);
                    list3w.setVisibility(View.GONE);
                    list6.setVisibility(View.GONE);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopenw.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list5.setVisibility(View.GONE);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        btnopen7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (list6.getVisibility() == View.GONE) {
                    list6.setVisibility(View.VISIBLE);
                    list4w.setVisibility(View.GONE);
                    list2w.setVisibility(View.GONE);
                    listw.setVisibility(View.GONE);
                    list3w.setVisibility(View.GONE);
                    list5.setVisibility(View.GONE);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_less_dark, 0);
                    btnopen1w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen2w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen3w.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopen5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);
                    btnopenw.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
                else
                {
                    list6.setVisibility(View.GONE);
                    btnopen7.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.expand_dark, 0);

                }
            }
        });
        final TextView guidtxt = (TextView) findViewById(R.id.guidtxt);

        guidtxt.setText("برای توضیحات بیشتر فلش ها را کلیک کنید!");

        guidtxt.setTypeface(yekanfont);
        final TranslateAnimation translate = new TranslateAnimation(0, 0, 200, 0);
        translate.setDuration(500);
        final TranslateAnimation translate1 = new TranslateAnimation(0, 0, 0, 200);
        translate1.setDuration(500);
        guidtxt.setVisibility(View.GONE);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                guidtxt.setVisibility(View.VISIBLE);
                guidtxt.startAnimation(translate);

            }
        }, SPLASH_TIME);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                guidtxt.startAnimation(translate1);

            }
        }, SPLASH_TIME1);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                guidtxt.setVisibility(View.GONE);

            }
        }, SPLASH_TIME2);
        /** attention - actionbar code */
        LinearLayout actionbar_long = (LinearLayout) findViewById(R.id.actionbar_long);
        TextView actionbartxt = (TextView) findViewById(R.id.actionbartxt);
        TextView actionbartxt1 = (TextView) findViewById(R.id.actionbartxt1);

        actionbar_long.setBackgroundColor(Color.parseColor("#2c6b17"));
        actionbartxt.setText("شکم و سینه");
        actionbartxt1.setText("علامت مشابه مشکل را انتخاب کنید");

        actionbartxt.setTypeface(yekanfont);
        actionbartxt1.setTypeface(yekanfont);

    }
}