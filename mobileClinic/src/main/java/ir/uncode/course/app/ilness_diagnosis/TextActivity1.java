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


public class TextActivity1 extends SourceActivity {

    @Override
    public void onBackPressed() {

        Intent goB = getIntent();
        String goback = goB.getStringExtra("txt");

        if (goback.equals("file:///android_asset/kist_sine.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Abdomen3Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/kist_tokhmdan.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Abdomen3Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/davazdahe.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Abdomen3Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/apandis.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Abdomen3Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/kise_safra.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Abdomen3Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/ghalb.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Abdomen3Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }

        //-----------------------------------------------------------------------------------------------------
        else if (goback.equals("file:///android_asset/eltehab_goosh.html")) {

            finish();

        }
        else if (goback.equals("file:///android_asset/barotroma.html")) {

            finish();
        }

        else if (goback.equals("file:///android_asset/norom_acostic.html")) {

            finish();
        }
        else if (goback.equals("file:///android_asset/oto_scloroz.html")) {

            finish();
        }
        else if (goback.equals("file:///android_asset/sandrom_monir.html")) {
            finish();
        }

        else if (goback.equals("file:///android_asset/astigmat.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/bahare.html")) {
            if (D_AnswerActivity.bahare == "yes") {
                finish();
            }
            else if (D_AnswerActivity.bahare == "no") {
                Intent intent = new Intent(TextActivity1.this, D_Eye2Activity.class);
                TextActivity1.this.startActivity(intent);
                finish();
            }
        }
        else if (goback.equals("file:///android_asset/ab_morvarid.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/abe_siah.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/belfarit.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/khoshki_chashm.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/yoiit.html")) {
            finish();
        }

        else if (goback.equals("file:///android_asset/saratan_sine.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/meede.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/koliye.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/shosh.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/kabed.html")) {
            finish();
        }
        else if (goback.equals("file:///android_asset/pankeras.html")) {
            finish();
        }

        //-----------------------------------------------------------------------------------------------------        

        else if (goback.equals("file:///android_asset/pelip.html")) {
            Intent intent = new Intent(TextActivity1.this, D_BiniActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/sinos.html")) {
            Intent intent = new Intent(TextActivity1.this, D_BiniActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }

        else if (goback.equals("file:///android_asset/dodoak.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Eye1Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/magas_paran.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Eye1Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/nakhonak.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Eye1Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/gol_moje.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Eye1Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/ectropion.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Eye2Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/oftadegi_pelk.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Eye2Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/entropion.html")) {
            Intent intent = new Intent(TextActivity1.this, D_Eye2Activity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }

        else if (goback.equals("file:///android_asset/hand_artrit.html")) {
            Intent intent = new Intent(TextActivity1.this, D_HandActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/hand_tenis.html")) {
            Intent intent = new Intent(TextActivity1.this, D_HandActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/hand_romatism.html")) {
            Intent intent = new Intent(TextActivity1.this, D_HandActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/hand_mafsal.html")) {
            Intent intent = new Intent(TextActivity1.this, D_HandActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }

        else if (goback.equals("file:///android_asset/leg_artrit.html")) {
            Intent intent = new Intent(TextActivity1.this, D_LegActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/leg_neghres.html")) {
            Intent intent = new Intent(TextActivity1.this, D_LegActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/leg_mikhche.html")) {
            Intent intent = new Intent(TextActivity1.this, D_LegActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/Leg_kafpa.html")) {
            Intent intent = new Intent(TextActivity1.this, D_LegActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }

        else if (goback.equals("file:///android_asset/aft.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/abse_dandan.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/pioreh.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/felorozis.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/eltehab_lase.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/jerm_dandan.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/poosidegy_dandan.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/amase_zaban.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/porzhaye_siah_zaban.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/loco_plaki.html")) {
            Intent intent = new Intent(TextActivity1.this, D_MouthActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }

        else if (goback.equals("file:///android_asset/tabkhal_tanasoli.html")) {
            Intent intent = new Intent(TextActivity1.this, D_SexualActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/tabkhal.html")) {
            Intent intent = new Intent(TextActivity1.this, D_SexualActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/zigil_tanasoli.html")) {
            Intent intent = new Intent(TextActivity1.this, D_SexualActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/soozak.html")) {
            Intent intent = new Intent(TextActivity1.this, D_SexualActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        else if (goback.equals("file:///android_asset/seflis.html")) {
            Intent intent = new Intent(TextActivity1.this, D_SexualActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }

        else if (goback.equals("file:///android_asset/dismonre.html")) {
            Intent intent = new Intent(TextActivity1.this, D_SexualActivity.class);
            TextActivity1.this.startActivity(intent);
        }

        else {
            Intent intent = new Intent(TextActivity1.this, D_SkinActivity.class);
            TextActivity1.this.startActivity(intent);
            finish();
        }
        overridePendingTransition(R.anim.enter1, R.anim.exit1);

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text1);

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
                Intent intent = new Intent(TextActivity1.this, DiagnosisActivity.class);
                TextActivity1.this.startActivity(intent);
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
                Intent intent = new Intent(TextActivity1.this, EmergencyActivity.class);
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });

        btnmenu3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity1.this, AboutActivity.class);
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
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
                Intent intent = new Intent(TextActivity1.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/bleed.html");
                intent.putExtra("actionbartxt1", "خونریزی");
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });
        Button02.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity1.this, E_BurningActivity.class);
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });
        Button03.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity1.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/poisoning.html");
                intent.putExtra("actionbartxt1", "مسمومیت");
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });
        Button04.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity1.this, E_BasicSupportActivity.class);
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });
        Button05.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity1.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/heatstroke.html");
                intent.putExtra("actionbartxt1", "گرمازدگی");
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });
        Button06.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity1.this, TextActivity1.class);
                intent.putExtra("txt", "file:///android_asset/frostbite.html");
                intent.putExtra("actionbartxt1", "سرمازدگی");
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });
        Button07.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity1.this, E_HeadHurtActivity.class);
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });
        Button08.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(TextActivity1.this, E_ChestHurtActivity.class);
                TextActivity1.this.startActivity(intent);
                D_AnswerActivity.close.finish();
                finish();
            }
        });

        menu.setMenu(view);

        /** attention - main code */
        TextView actionbartxt = (TextView) findViewById(R.id.actionbartxt);
        TextView actionbartxt1 = (TextView) findViewById(R.id.actionbartxt1);
        LinearLayout actionbar_long = (LinearLayout) findViewById(R.id.actionbar_long);
        WebView webview = (WebView) findViewById(R.id.webview);
        Intent intent = getIntent();
        String str = intent.getStringExtra("txt");
        webview.loadUrl(str);
        String str1 = intent.getStringExtra("actionbartxt1");
        actionbar_long.setBackgroundColor(Color.parseColor("#8bc943"));
        actionbartxt.setText("تشخیص بیماری");
        actionbartxt1.setText(str1);

        actionbartxt.setTypeface(yekanfont);
        actionbartxt1.setTypeface(yekanfont);

    }
}