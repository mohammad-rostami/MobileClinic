package ir.uncode.course.app.ilness_diagnosis;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class D_SkinActivity extends SourceActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(D_SkinActivity.this, D_BodyPartActivity.class);
        D_SkinActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.enter1, R.anim.exit1);
        finish();

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("menu");
        setContentView(R.layout.d_skin);

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
                Intent intent = new Intent(D_SkinActivity.this, DiagnosisActivity.class);
                D_SkinActivity.this.startActivity(intent);
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
                Intent intent = new Intent(D_SkinActivity.this, EmergencyActivity.class);
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, AboutActivity.class);
                D_SkinActivity.this.startActivity(intent);
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
                Intent intent = new Intent(D_SkinActivity.this, D_BodyPartActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button01.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/bleed.html");
                intent.putExtra("actionbartxt1", "خونریزی");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button02.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, E_BurningActivity.class);
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button03.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/poisoning.html");
                intent.putExtra("actionbartxt1", "مسمومیت");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button04.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, E_BasicSupportActivity.class);
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button05.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/heatstroke.html");
                intent.putExtra("actionbartxt1", "گرمازدگی");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button06.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                intent.putExtra("actionbartxt1", "سرمازدگی");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button07.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, E_HeadHurtActivity.class);
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button08.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, E_ChestHurtActivity.class);
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button09.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, E_AtelBandiActivity.class);
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        Button10.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, E_BimariActivity.class);
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });

        menu.setMenu(view);

        /** attention - main code */
        Button btn02 = (Button) findViewById(R.id.Button02);
        final LinearLayout btn_khal = (LinearLayout) findViewById(R.id.btn_khal);
        final LinearLayout btn_zaede_gooshti = (LinearLayout) findViewById(R.id.btn_zaede_gooshti);
        final LinearLayout btn_zigil = (LinearLayout) findViewById(R.id.btn_zigil);
        final LinearLayout btn_tabkhal = (LinearLayout) findViewById(R.id.btn_tabkhal);
        final LinearLayout btn_akne = (LinearLayout) findViewById(R.id.btn_akne);
        final LinearLayout btn_able_morghan = (LinearLayout) findViewById(R.id.btn_able_morghan);
        final LinearLayout btn_kachali_sar = (LinearLayout) findViewById(R.id.btn_kachali_sar);
        final LinearLayout btn_kachali_poost = (LinearLayout) findViewById(R.id.btn_kachali_poost);
        final LinearLayout btn_kachali_pa = (LinearLayout) findViewById(R.id.btn_kachali_pa);
        final LinearLayout btn_sorkhak = (LinearLayout) findViewById(R.id.btn_sorkhak);
        final LinearLayout btn_sotkhche = (LinearLayout) findViewById(R.id.btn_sotkhche);
        final LinearLayout btn_ofoonat_gharchi = (LinearLayout) findViewById(R.id.btn_ofoonat_gharchi);
        final LinearLayout btn_aritm_multiform = (LinearLayout) findViewById(R.id.btn_aritm_multiform);
        final LinearLayout btn_pesoyazis = (LinearLayout) findViewById(R.id.btn_pesoyazis);
        final LinearLayout btn_tinea_versicaler = (LinearLayout) findViewById(R.id.btn_tinea_versicaler);
        final LinearLayout btn_zona = (LinearLayout) findViewById(R.id.btn_zona);
        final LinearLayout btn_kandidiazis = (LinearLayout) findViewById(R.id.btn_kandidiazis);
        final LinearLayout btn_karsinom_bazal = (LinearLayout) findViewById(R.id.btn_karsinom_bazal);
        final LinearLayout btn_karisnom_eskoamasel = (LinearLayout) findViewById(R.id.btn_karisnom_eskoamasel);
        final LinearLayout btn_kahir = (LinearLayout) findViewById(R.id.btn_kahir);
        final LinearLayout btn_gal = (LinearLayout) findViewById(R.id.btn_gal);
        final LinearLayout btn_melaskom = (LinearLayout) findViewById(R.id.btn_melaskom);
        final LinearLayout btn_vitiligo = (LinearLayout) findViewById(R.id.btn_vitiligo);
        final LinearLayout btn_panjom = (LinearLayout) findViewById(R.id.btn_panjom);
        final LinearLayout btn_liken_plan = (LinearLayout) findViewById(R.id.btn_liken_plan);
        final LinearLayout btn_melanoma = (LinearLayout) findViewById(R.id.btn_melanoma);
        final LinearLayout btn_melasma = (LinearLayout) findViewById(R.id.btn_melasma);

        btn_khal.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/khal.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_zaede_gooshti.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/zaede_gooshti.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_zigil.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/zigil.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_tabkhal.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/tabkhal.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_akne.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/akne.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_able_morghan.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/able_morghan.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_kachali_sar.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/kachali_poost_sar.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_kachali_poost.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_kachali_pa.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/kachali_pa.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_sorkhak.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/sorkhak.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_sotkhche.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/sorkhak.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_ofoonat_gharchi.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/ofoonat_gharchi.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_aritm_multiform.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/aritm_multi.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_pesoyazis.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/pesoyazis.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_tinea_versicaler.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/tinea_versicaler.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_zona.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/zona.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_kandidiazis.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/candidiazis.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_karsinom_bazal.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/carsinom_bazall.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_karisnom_eskoamasel.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/carsinom_scoamasol.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_kahir.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/kahir.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_gal.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/gal.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_melaskom.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/moloskom.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_vitiligo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/vitiligo.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_panjom.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/panjom.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_liken_plan.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/liken_plan.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_melanoma.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/melanoma.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });
        btn_melasma.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(D_SkinActivity.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/melasma.html");
                D_SkinActivity.this.startActivity(intent);
                finish();
            }
        });

        /** attention - guid text code */
        final TextView guidtxt = (TextView) findViewById(R.id.guidtxt);
        guidtxt.setText("مشخصات خود را وارد کنید!");
        guidtxt.setTypeface(yekanfont);
        final TranslateAnimation translate = new TranslateAnimation(0, 0, 200, 0);
        translate.setDuration(500);
        final TranslateAnimation translate1 = new TranslateAnimation(0, 0, 0, 200);
        translate1.setDuration(500);
        guidtxt.setVisibility(View.GONE);

        /** attention - actionbar code */
        LinearLayout actionbar_long = (LinearLayout) findViewById(R.id.actionbar_long);
        TextView actionbartxt = (TextView) findViewById(R.id.actionbartxt);
        TextView actionbartxt1 = (TextView) findViewById(R.id.actionbartxt1);

        actionbar_long.setBackgroundColor(Color.parseColor("#ade74d"));
        actionbartxt.setText("بیماری‌های پوست");
        actionbartxt1.setText("نزدیک‌ترین تصویر به مشکل خود را انتخاب کنید");

        actionbartxt.setTypeface(yekanfont);
        actionbartxt1.setTypeface(yekanfont);
    }
}