package ir.uncode.course.app.ilness_diagnosis;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class D_Eye1Activity extends SourceActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(D_Eye1Activity.this, D_BodyPartActivity.class);
        D_Eye1Activity.this.startActivity(intent);
        overridePendingTransition(R.anim.enter1, R.anim.exit1);
        finish();
    }

    public Typeface yekanfont;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_eye1);
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
                Intent intent = new Intent(D_Eye1Activity.this, DiagnosisActivity.class);
                D_Eye1Activity.this.startActivity(intent);
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
                Intent intent = new Intent(D_Eye1Activity.this, EmergencyActivity.class);
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, AboutActivity.class);
                D_Eye1Activity.this.startActivity(intent);
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
                Intent intent = new Intent(D_Eye1Activity.this, D_BodyPartActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button01.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/bleed.html");
                intent.putExtra("actionbartxt1", "خونریزی");
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button02.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, E_BurningActivity.class);
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button03.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/poisoning.html");
                intent.putExtra("actionbartxt1", "مسمومیت");
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button04.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, E_BasicSupportActivity.class);
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button05.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/heatstroke.html");
                intent.putExtra("actionbartxt1", "گرمازدگی");
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button06.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                intent.putExtra("actionbartxt1", "سرمازدگی");
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button07.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, E_HeadHurtActivity.class);
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button08.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, E_ChestHurtActivity.class);
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button09.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, E_AtelBandiActivity.class);
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });
        Button10.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_Eye1Activity.this, E_BimariActivity.class);
                D_Eye1Activity.this.startActivity(intent);
                finish();
            }
        });

        menu.setMenu(view);

        /** attention - main code */
        Button btngo = (Button) findViewById(R.id.btncontinue);
        LinearLayout dodoak = (LinearLayout) findViewById(R.id.list_dodoak);
        LinearLayout magas_paran = (LinearLayout) findViewById(R.id.list_magas);
        LinearLayout nakhonak = (LinearLayout) findViewById(R.id.list_nakhonak);
        LinearLayout golmoje = (LinearLayout) findViewById(R.id.list_golmoje);

        TextView txt1 = (TextView) findViewById(R.id.txt1);
        TextView txt2 = (TextView) findViewById(R.id.txt2);
        TextView txt3 = (TextView) findViewById(R.id.txt3);
        TextView txt4 = (TextView) findViewById(R.id.txt4);
        TextView txt5 = (TextView) findViewById(R.id.txt5);
        TextView txt6 = (TextView) findViewById(R.id.txt6);
        TextView txt7 = (TextView) findViewById(R.id.txt7);
        TextView txt8 = (TextView) findViewById(R.id.txt8);

        btngo.setTypeface(yekanfont);
        btngo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(D_Eye1Activity.this, D_Eye2Activity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.enter, R.anim.exit);

            }
        });
        dodoak.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(D_Eye1Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/dodoak.html");
                D_Eye1Activity.this.startActivity(intent);
                finish();

            }
        });
        magas_paran.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(D_Eye1Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/magas_paran.html");
                D_Eye1Activity.this.startActivity(intent);
                finish();

            }
        });
        nakhonak.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(D_Eye1Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/nakhonak.html");
                D_Eye1Activity.this.startActivity(intent);
                finish();

            }
        });
        golmoje.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(D_Eye1Activity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/gol_moje.html");
                D_Eye1Activity.this.startActivity(intent);
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