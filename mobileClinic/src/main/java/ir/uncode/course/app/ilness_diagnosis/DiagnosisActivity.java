package ir.uncode.course.app.ilness_diagnosis;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class DiagnosisActivity extends SourceActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(DiagnosisActivity.this, MenuActivity.class);
        DiagnosisActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.enter1, R.anim.exit1);
        finish();
    }

    public static String     age          = "1000";
    public static String     sex          = "woman";
    public static String     wallpaper    = "wallpaper_name";
    private static final int SPLASH_TIME  = 1 * 800;         // 3 ثانیه
    private static final int SPLASH_TIME1 = 4 * 800;         // 3 
    private static final int SPLASH_TIME2 = 5 * 730;         // 3 
    public int               answer;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        super.onCreate(savedInstanceState);
        setTitle("menu");
        setContentView(R.layout.diagnosis);

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
                Intent intent = new Intent(DiagnosisActivity.this, EmergencyActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, AboutActivity.class);
                DiagnosisActivity.this.startActivity(intent);
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
                Intent intent = new Intent(DiagnosisActivity.this, MenuActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button01.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/bleed.html");
                intent.putExtra("actionbartxt1", "خونریزی");
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button02.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, E_BurningActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button03.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/poisoning.html");
                intent.putExtra("actionbartxt1", "مسمومیت");
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button04.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, E_BasicSupportActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button05.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/heatstroke.html");
                intent.putExtra("actionbartxt1", "گرمازدگی");
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button06.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                intent.putExtra("actionbartxt1", "سرمازدگی");
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button07.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, E_HeadHurtActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button08.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, E_ChestHurtActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button09.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, E_AtelBandiActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        Button10.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(DiagnosisActivity.this, E_BimariActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                finish();
            }
        });
        menu.setMenu(view);

        /** attention - main code */
        Button btnconfirm = (Button) findViewById(R.id.btnconfirm);
        Button btnedit = (Button) findViewById(R.id.btnedit);
        Button btnNext = (Button) findViewById(R.id.btnNext);
        TextView txt1 = (TextView) findViewById(R.id.txt1);
        TextView txt2 = (TextView) findViewById(R.id.txt2);
        TextView txt3 = (TextView) findViewById(R.id.txt3);
        final RadioButton radio0 = (RadioButton) findViewById(R.id.radio0);
        final RadioButton radio1 = (RadioButton) findViewById(R.id.radio1);
        final EditText editText = (EditText) findViewById(R.id.edittxt1);
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);

        btnedit.setTypeface(yekanfont);
        btnconfirm.setTypeface(yekanfont);
        btnNext.setTypeface(yekanfont);
        txt1.setTypeface(yekanfont);
        txt2.setTypeface(yekanfont);
        txt3.setTypeface(yekanfont);
        radio0.setTypeface(yekanfont);
        radio1.setTypeface(yekanfont);

        //radio1.setChecked(true);
        //radio0.setChecked(false);

        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int arg1) {
                // TODO Auto-generated method stub
                switch (arg1)
                {
                    case R.id.radio0:
                        answer = 0;
                        break;
                    case R.id.radio1:
                        answer = 1;
                        break;
                }

            }
        });
        btnNext.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(DiagnosisActivity.this, D_BodyPartActivity.class);
                DiagnosisActivity.this.startActivity(intent);
                sex = "nothing";
                finish();

            }
        });

        btnedit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                editText.setText("");
                // radio1.setChecked(true);
                // radio0.setChecked(false);
            }
        });
        btnconfirm.setOnClickListener(new OnClickListener() {

            public void edittxt() {
                Integer editTextinput = Integer.parseInt(editText.getText().toString());
                editText.setTypeface(yekanfont);

                if (editTextinput >= 1 && editTextinput <= 100) {
                    if (editTextinput >= 40 && editTextinput <= 60) {
                        Cursor radio0 = G.database.rawQuery("UPDATE ear SET score = score + 1 Where Name = 'سندورم منيير'", null);
                        while (radio0.moveToNext()) {}
                        radio0.close();

                        Cursor radio1 = G.database.rawQuery("UPDATE eye SET score = score + 1 Where Name = 'آب سياه'", null);
                        while (radio1.moveToNext()) {}
                        radio1.close();

                    }
                    if (editTextinput >= 30 && editTextinput <= 50) {
                        Cursor radio2 = G.database.rawQuery("UPDATE ear SET score = score + 2 Where Name = 'نوروم آکوستيک'", null);
                        while (radio2.moveToNext()) {}
                        radio2.close();
                    }
                    if (editTextinput >= 0 && editTextinput <= 5) {
                        Cursor radio3 = G.database.rawQuery("UPDATE ear SET score = score + 1 Where Name = 'التهاب گوش'", null);
                        while (radio3.moveToNext()) {}
                        radio3.close();

                    }
                    if (editTextinput >= 60 && editTextinput <= 100) {
                        Cursor radio4 = G.database.rawQuery("UPDATE eye SET score = score + 1 Where Name = 'اکتروپيون'", null);
                        while (radio4.moveToNext()) {}
                        radio4.close();
                        Cursor radio5 = G.database.rawQuery("UPDATE eye SET score = score + 1 Where Name = 'آب سياه'", null);
                        while (radio5.moveToNext()) {}
                        radio5.close();
                        Cursor radio6 = G.database.rawQuery("UPDATE eye SET score = score + 1 Where Name = 'آب مرواريد'", null);
                        while (radio6.moveToNext()) {}
                        radio6.close();
                    }
                    if (editTextinput >= 45 && editTextinput <= 70) {
                        Cursor radio7 = G.database.rawQuery("UPDATE eye SET score = score + 1 Where Name = 'انتروپيون'", null);
                        while (radio7.moveToNext()) {}
                        radio7.close();
                    }
                    if (editTextinput >= 3 && editTextinput <= 20) {
                        Cursor radio8 = G.database.rawQuery("UPDATE eye SET score = score + 1 Where Name = 'کراتوکنژنکتيويت بهاره'", null);
                        while (radio8.moveToNext()) {}
                        radio8.close();
                    }
                    Intent intent = new Intent(DiagnosisActivity.this, D_BodyPartActivity.class);
                    DiagnosisActivity.this.startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "سن وارد شده صحیح نیست", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "سن را بین ۱ تا ۱۰۰ وارد کنید", Toast.LENGTH_SHORT).show();
                    return;
                }
                finish();

            }


            @Override
            public void onClick(View arg0) {
                if (editText.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "لطفا سن خود را وارد کنید", Toast.LENGTH_SHORT).show();

                    return;
                }
                else {
                    if (answer == 0)
                    {

                        wallpaper = "woman";
                        sex = "woman";
                        age = editText.getText().toString();
                        edittxt();

                    }
                    if (answer == 1)
                    {

                        wallpaper = "man";
                        sex = "man";
                        age = editText.getText().toString();
                        edittxt();

                    }
                }
            }
        });

        /** attention - guid text code */
        final TextView guidtxt = (TextView) findViewById(R.id.guidtxt);

        guidtxt.setText("روند جستحو ممکن است اندکی طولانی شود. صبور باشید!");

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

        actionbar_long.setBackgroundColor(Color.parseColor("#689f38"));
        actionbartxt.setText("تشخیص بیماری");
        actionbartxt1.setText("سن و جنسیت را وارد کنید...");

        actionbartxt.setTypeface(yekanfont);
        actionbartxt1.setTypeface(yekanfont);

    }
}