package ir.uncode.course.app.ilness_diagnosis;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class D_Eye2Activity extends SourceActivity {

    @Override
    public void onBackPressed() {
        Cursor cursor2 = G.database.rawQuery("UPDATE eye SET score = 0", null);
        while (cursor2.moveToNext()) {}
        cursor2.close();
        Intent intent = new Intent(D_Eye2Activity.this, D_Eye1Activity.class);
        D_Eye2Activity.this.startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish();
    }

    public Typeface yekanfont;
    public int      answer;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_eye2);
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
                Intent intent = new Intent(D_Eye2Activity.this, DiagnosisActivity.class);
                D_Eye2Activity.this.startActivity(intent);
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
                Intent intent = new Intent(D_Eye2Activity.this, EmergencyActivity.class);
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, AboutActivity.class);
                D_Eye2Activity.this.startActivity(intent);
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
                Intent intent = new Intent(D_Eye2Activity.this, D_Eye1Activity.class);
                startActivity(intent);
                finish();
            }
        });
        Button01.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/bleed.html");
                intent.putExtra("actionbartxt1", "خونریزی");
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button02.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, E_BurningActivity.class);
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button03.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/poisoning.html");
                intent.putExtra("actionbartxt1", "مسمومیت");
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button04.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, E_BasicSupportActivity.class);
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button05.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/heatstroke.html");
                intent.putExtra("actionbartxt1", "گرمازدگی");
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button06.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                intent.putExtra("actionbartxt1", "سرمازدگی");
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button07.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, E_HeadHurtActivity.class);
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button08.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, E_ChestHurtActivity.class);
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button09.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, E_AtelBandiActivity.class);
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });
        Button10.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, E_BimariActivity.class);
                D_Eye2Activity.this.startActivity(intent);
                finish();
            }
        });

        menu.setMenu(view);

        /** attention - main code */
        Button btnselect = (Button) findViewById(R.id.btnselect);
        Button btngo = (Button) findViewById(R.id.btncontinue);
        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
        RadioButton radio0 = (RadioButton) findViewById(R.id.radio0);
        RadioButton radio1 = (RadioButton) findViewById(R.id.radio1);
        RadioButton radio2 = (RadioButton) findViewById(R.id.radio2);
        RadioButton radio3 = (RadioButton) findViewById(R.id.radio3);
        RadioButton radio4 = (RadioButton) findViewById(R.id.radio4);

        btngo.setTypeface(yekanfont);
        btnselect.setTypeface(yekanfont);
        radio0.setTypeface(yekanfont);
        radio1.setTypeface(yekanfont);
        radio2.setTypeface(yekanfont);
        radio3.setTypeface(yekanfont);
        radio4.setTypeface(yekanfont);

        radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

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
                    case R.id.radio2:
                        answer = 2;
                        break;
                    case R.id.radio3:
                        answer = 3;
                        break;
                    case R.id.radio4:
                        answer = 4;
                        break;

                }

            }
        });
        btngo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye2Activity.this, D_Eye3Activity.class);
                D_Eye2Activity.this.startActivity(intent);
                finish();
                overridePendingTransition(R.anim.enter, R.anim.exit);
            }
        });

        btnselect.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (answer == 0)
                {
                    Intent intent = new Intent(D_Eye2Activity.this, TextActivity1.class);
                    intent.putExtra("txt", "file:///android_asset/ectropion.html");
                    D_Eye2Activity.this.startActivity(intent);
                }
                if (answer == 1)
                {
                    Intent intent = new Intent(D_Eye2Activity.this, TextActivity1.class);
                    intent.putExtra("txt", "file:///android_asset/entropion.html");
                    D_Eye2Activity.this.startActivity(intent);
                }
                if (answer == 2)
                {
                    Intent intent = new Intent(D_Eye2Activity.this, TextActivity1.class);
                    intent.putExtra("txt", "file:///android_asset/oftadegi_pelk.html");
                    D_Eye2Activity.this.startActivity(intent);
                }
                if (answer == 3)
                {
                    Intent intent = new Intent(D_Eye2Activity.this, TextActivity1.class);
                    intent.putExtra("txt", "file:///android_asset/gol_moje.html");
                    D_Eye2Activity.this.startActivity(intent);
                }
                if (answer == 4)
                {
                    Intent intent = new Intent(D_Eye2Activity.this, TextActivity1.class);
                    intent.putExtra("txt", "file:///android_asset/bahare.html");
                    D_AnswerActivity.bahare = "no";
                    D_Eye2Activity.this.startActivity(intent);
                }
                finish();
            }
        });

        /** attention - actionbar code */
        LinearLayout actionbar_long = (LinearLayout) findViewById(R.id.actionbar_long);
        TextView actionbartxt = (TextView) findViewById(R.id.actionbartxt);
        TextView actionbartxt1 = (TextView) findViewById(R.id.actionbartxt1);

        actionbar_long.setBackgroundColor(Color.parseColor("#8bc943"));
        actionbartxt.setText("چشم");
        actionbartxt1.setText("اگر علایم مشکل خود را می‌بینید آن را انتخاب کنید");

        actionbartxt.setTypeface(yekanfont);
        actionbartxt1.setTypeface(yekanfont);

    }
}