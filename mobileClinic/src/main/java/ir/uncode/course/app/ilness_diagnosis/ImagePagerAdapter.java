package ir.uncode.course.app.ilness_diagnosis;

import java.util.ArrayList;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ImagePagerAdapter extends PagerAdapter {

    //public ViewPager          pager;
    public ArrayList<Integer> imageId;
    public ArrayList<String>  imageTitles;
    public Typeface           yekanfont1;


    public ImagePagerAdapter(ArrayList<Integer> imageIds, ArrayList<String> imageTitles) {
        this.imageId = imageIds;
        this.imageTitles = imageTitles;
        yekanfont1 = SourceActivity.yekanfont;

    }


    @Override
    public int getCount() {
        return imageId.size();
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = G.layoutInflater.inflate(R.layout.sample, null);
        //pager = (ViewPager) view.findViewById(R.id.pager);
        ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setTypeface(yekanfont1);

        text.setText(imageTitles.get(position));
        image.setImageResource(imageId.get(position));
        container.addView(view);
        return view;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    /* private int getItem(int i) {
         return pager.getCurrentItem() + i;
     } */
}
