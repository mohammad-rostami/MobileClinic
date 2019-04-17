package ir.uncode.course.app.ilness_diagnosis;

import java.util.ArrayList;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;


public class ActivityStartup extends EnhancedActivity {

    public Typeface  yekanfont;
    public ViewPager pager;
    public Button    btnnext;
    public Button    next;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.pager);
        yekanfont = Typeface.createFromAsset(getAssets(), "byekan.ttf");

        ArrayList<Integer> imageIds = new ArrayList<Integer>();
        ArrayList<String> imageTitles = new ArrayList<String>();
        for (int i = 1; i < 5; i++) {
            int imageId = G.context.getResources().getIdentifier("slide_" + i, "drawable", G.context.getPackageName());
            imageIds.add(imageId);
            if (i == 1) {
                imageTitles.add("خوش آمدید  \n  با کمک این اپلیکیشن دکتر همیشه همراه شماست");
            }
            if (i == 2) {
                imageTitles.add("برای گرفتن نتایج بهتر سعی کنید بیشترین علایم ممکن را انتخاب کنید");
            }
            if (i == 3) {
                imageTitles.add("در بخش اورژانس برنامه می توانید از آموزش کمک های اولیه بهره ببرید");
            }
            if (i == 4) {
                imageTitles.add("نتایج بدست آمده از بخش جستجو حتمی نیست بلکه نزدیک ترین احتمال نمایش داده می شود");
            }

        }
        btnnext = (Button) findViewById(R.id.btnnext);
        next = (Button) findViewById(R.id.Button01);
        final ImageView imgIndicator = (ImageView) findViewById(R.id.imgIndicator);

        btnnext.setTypeface(yekanfont);
        next.setTypeface(yekanfont);
        next.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(ActivityStartup.this, MenuActivity.class);
                ActivityStartup.this.startActivity(intent);
                finish();
            }
        });
        btnnext.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                pager.setCurrentItem(getItem( +1), true);
            }


            private int getItem(int i) {
                // TODO Auto-generated method stub
                return pager.getCurrentItem() + i;
            }
        });
        next.setVisibility(View.INVISIBLE);

        imgIndicator.setBackgroundResource(R.drawable.page1);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setOnPageChangeListener(new OnPageChangeListener() {

            int     positionCurrent;
            boolean dontLoadList;


            @Override
            public void onPageSelected(int position) {
                next.setVisibility(View.INVISIBLE);

                if (position == 0) {
                    imgIndicator.setBackgroundResource(R.drawable.page1);
                    imgIndicator.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    next.setVisibility(View.INVISIBLE);
                }
                if (position == 1) {
                    imgIndicator.setBackgroundResource(R.drawable.page2);
                    imgIndicator.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    next.setVisibility(View.INVISIBLE);

                }
                else if (position == 2) {
                    imgIndicator.setBackgroundResource(R.drawable.page3);
                    imgIndicator.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    next.setVisibility(View.INVISIBLE);

                }
                else if (position == 3) {
                    imgIndicator.setBackgroundResource(R.drawable.page4);
                    imgIndicator.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    next.setVisibility(View.VISIBLE);

                }
            }


            @Override
            public void onPageScrolled(int startIndex, float percent, int pixel) {

                positionCurrent = startIndex;
                if (percent == 0 && pixel == 0) { // the offset is zero when the swiping ends{
                    dontLoadList = false;
                }
                else {
                    dontLoadList = true; // To avoid loading content for list after swiping the pager.
                }
                pager.setOffscreenPageLimit(1);
                Log.i("LOG", "Percent: " + startIndex + ", " + percent);
            }


            @Override
            public void onPageScrollStateChanged(int state) {

                if (state == 0) { // the viewpager is idle as swipping ended
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            if ( !dontLoadList) {
                                //async thread code to execute loading the list... 
                            }
                        }
                    }, 300);
                }
            }

        });

        ImagePagerAdapter adapter = new ImagePagerAdapter(imageIds, imageTitles);
        pager.setAdapter(adapter);
    }
}