package ir.uncode.course.app.ilness_diagnosis;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;


public class D_AnswerActivity extends SourceActivity {

    public static String bahare = "no";


    @Override
    public void onBackPressed() {
        D_Abdomen1Activity.check = true;
        Intent goB = getIntent();
        String goBack = goB.getStringExtra("txt");
        if (goBack.equals("ear")) {
            Cursor cursor1 = G.database.rawQuery("UPDATE ear SET score = 0", null);
            while (cursor1.moveToNext()) {}
            cursor1.close();
            Intent intent = new Intent(D_AnswerActivity.this, D_EarActivity.class);
            D_AnswerActivity.this.startActivity(intent);
        }
        if (goBack.equals("eye")) {
            Cursor cursor2 = G.database.rawQuery("UPDATE eye SET score = 0", null);
            while (cursor2.moveToNext()) {}
            cursor2.close();
            Intent intent = new Intent(D_AnswerActivity.this, D_Eye3Activity.class);
            D_AnswerActivity.this.startActivity(intent);
        }
        if (goBack.equals("abdomen")) {
            Cursor cursor = G.database.rawQuery("UPDATE abdomen SET score = 0", null);
            while (cursor.moveToNext()) {}
            cursor.close();
            Intent intent = new Intent(D_AnswerActivity.this, D_Abdomen1Activity.class);
            D_AnswerActivity.this.startActivity(intent);
        }
        String age = DiagnosisActivity.age;
        Integer editTextinput = Integer.parseInt(age);
        if (editTextinput == 1000) {

        }
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

        }
        finish();
    }

    public Typeface        yekanfont;
    public static Activity close;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_answer);
        close = this;
        yekanfont = Typeface.createFromAsset(getAssets(), "byekan.ttf");
        TextView tV1 = (TextView) findViewById(R.id.tV1);
        TextView tV2 = (TextView) findViewById(R.id.tV2);
        TextView tV3 = (TextView) findViewById(R.id.tV3);
        tV1.setTypeface(yekanfont);
        tV2.setTypeface(yekanfont);
        tV3.setTypeface(yekanfont);
        final Intent intent = getIntent();
        String str = intent.getStringExtra("txt");
        if (str.equals("ear")) {
            final String[] name = new String[5];
            Integer[] score = new Integer[5];
            int m;
            int n = name.length;
            Cursor cursor = G.database.rawQuery("SELECT * FROM ear WHERE score >= 0", null);
            for (m = 0; m < 5; m++)
            {
                cursor.moveToNext();
                name[m] = cursor.getString(cursor.getColumnIndex("Name"));
                score[m] = cursor.getInt(cursor.getColumnIndex("score"));
            }
            int i, j, t = 0;
            String s;
            for (i = 0; i < n; i++) {
                for (j = 1; j < (n - i); j++) {
                    if (score[j - 1] < score[j]) {
                        t = score[j - 1];
                        score[j - 1] = score[j];
                        score[j] = t;
                        s = name[j - 1];
                        name[j - 1] = name[j];
                        name[j] = s;
                    }
                }
            }
            tV1.setText(name[0]);
            tV2.setText(name[1]);

            final String tv1 = tV1.getText().toString();
            final String tv2 = tV2.getText().toString();
            tV1.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    if (tv1.equals("التهاب گوش"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/eltehab_goosh.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv1.equals("باروتروما"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/barotroma.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv1.equals("اتواسکلروز"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/oto_scloroz.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv1.equals("نوروم آکوستیک"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/norom_acostic.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }

                    if (tv1.equals("سندورم منییر"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/sandrom_monir.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }

                }
            });

            tV2.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    if (tv2.equals("التهاب گوش"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/eltehab_goosh.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv2.equals("باروتروما"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/barotroma.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv2.equals("نوروم آکوستیک"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/barotroma.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv2.equals("اتواسکلروز"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/oto_scloroz.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }

                    if (tv2.equals("سندورم منییر"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/sandrom_monir.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }

                }
            });
        }

        if (str.equals("eye")) {

            String[] name = new String[7];
            Integer[] score = new Integer[7];
            int n = name.length;
            int m;
            Cursor cursor = G.database.rawQuery("SELECT * FROM eye WHERE score >= 0", null);
            for (m = 0; m < 7; m++)
            {
                cursor.moveToNext();
                name[m] = cursor.getString(cursor.getColumnIndex("Name"));
                score[m] = cursor.getInt(cursor.getColumnIndex("score"));
            }
            int i, j, t = 0;
            String s;
            for (i = 0; i < n; i++) {
                for (j = 1; j < (n - i); j++) {
                    if (score[j - 1] < score[j]) {
                        t = score[j - 1];
                        score[j - 1] = score[j];
                        score[j] = t;
                        s = name[j - 1];
                        name[j - 1] = name[j];
                        name[j] = s;
                    }
                }
            }
            tV1.setText(name[0]);
            tV2.setText(name[1]);
            final String tv1 = tV1.getText().toString();
            final String tv2 = tV2.getText().toString();
            tV1.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    if (tv1.equals("آستیگماتیسم"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/astigmat.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }

                    if (tv1.equals("کراتوکنژنکتیویت بهاره"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/bahare.html");
                        bahare = "yes";
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv1.equals("آب مروارید"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/ab_morvarid.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv1.equals("آب سیاه"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/abe_siah.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }

                    if (tv1.equals("بلفاریت"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/belfarit.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }

                    if (tv1.equals("خشک چشمی"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/khoshki_chashm.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    if (tv1.endsWith("يوئيت"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/yoiit.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }

                }
            });
            if (score[1] >= 1) {
                tV2.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        if (tv2.equals("آستیگماتیسم"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/astigmat.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                        if (tv2.equals("آب مروارید"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/ab_morvarid.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                        if (tv2.equals("آب سیاه"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/abe_siah.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }

                        if (tv2.equals("کراتوکنژنکتیویت بهاره"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/bahare.html");
                            bahare = "yes";
                            D_AnswerActivity.this.startActivity(intent);
                        }

                        if (tv2.equals("خشک چشمی"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/khoshki_chashm.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                    }
                });

            } else {
                tV2.setVisibility(View.GONE);
            }
        }
        if (str.equals("abdomen")) {

            String[] name = new String[6];
            Integer[] score = new Integer[6];
            int n = name.length;
            int m;
            Cursor cursor = G.database.rawQuery("SELECT * FROM abdomen WHERE score >= 0", null);
            for (m = 0; m < 6; m++)
            {
                cursor.moveToNext();
                name[m] = cursor.getString(cursor.getColumnIndex("Name"));
                score[m] = cursor.getInt(cursor.getColumnIndex("score"));
            }
            int i, j, t = 0;
            String s;
            for (i = 0; i < n; i++) {
                for (j = 1; j < (n - i); j++) {
                    if (score[j - 1] < score[j]) {
                        t = score[j - 1];
                        score[j - 1] = score[j];
                        score[j] = t;
                        s = name[j - 1];
                        name[j - 1] = name[j];
                        name[j] = s;
                    }
                }
            }
            tV1.setText(name[0]);
            if (score[1] >= 1) {
                tV2.setText(name[1]);
            }
            final String tv1 = tV1.getText().toString();
            final String tv2 = tV2.getText().toString();
            tV1.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    if (tv1.equals("سرطان سینه"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/saratan_sine.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    else if (tv1.equals("معده"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/meede.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    else if (tv1.equals("کلیه"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/koliye.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    else if (tv1.equals("شش"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/shosh.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    else if (tv1.equals("کبد"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/kabed.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                    else if (tv1.equals("پانکراس"))
                    {
                        Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                        intent.putExtra("txt", "file:///android_asset/pankeras.html");
                        D_AnswerActivity.this.startActivity(intent);
                    }
                }
            });
            if (score[1] >= 1) {
                tV2.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        if (tv2.equals("سرطان سینه"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/saratan_sine.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                        else if (tv2.equals("کلیه"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/koliye.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                        else if (tv2.equals("شش"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/shosh.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                        else if (tv2.equals("معده"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/meede.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                        else if (tv2.equals("کبد"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/kabed.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                        else if (tv2.equals("پانکراس"))
                        {
                            Intent intent = new Intent(D_AnswerActivity.this, TextActivity1.class);
                            intent.putExtra("txt", "file:///android_asset/pankeras.html");
                            D_AnswerActivity.this.startActivity(intent);
                        }
                    }
                });
            } else {
                tV2.setVisibility(View.GONE);
            }
        }

        /** attention - actionbar code */
        LinearLayout actionbar_short = (LinearLayout) findViewById(R.id.actionbar_short);
        TextView actionbartxt = (TextView) findViewById(R.id.actionbartxt);

        actionbar_short.setBackgroundColor(Color.parseColor("#689f38"));
        actionbartxt.setText("نتیجه ...");
        actionbartxt.setTypeface(yekanfont);

    }
}