package ir.uncode.course.app.ilness_diagnosis;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;


public class PageIndicator extends ImageView {

    private Paint            fillPaint;
    private Paint            strokePaint;
    private int              count;
    private int              indicatorWidth;
    private static int       CIRCLE_RADIUS       = 12;
    private static int       CIRCLE_SPACE        = 10;
    private static final int CIRCLE_STROKE_COLOR = Color.parseColor("#9c1762");
    private static final int CIRCLE_FILL_COLOR   = Color.parseColor("#9c1762");
    private int              screenWidth;
    private int              screenHeight;
    private int              screen;
    private float            offsetX;
    private float            changeX             = 2;
    private float            changeY             = 2;
    private int              currentPageIndex;
    private float            percent;


    public PageIndicator(Context context) {
        super(context);
        initialize();
    }


    public PageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }


    public PageIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initialize();
    }


    private void initialize() {
        fillPaint = new Paint();
        fillPaint.setStyle(Style.FILL);
        fillPaint.setColor(CIRCLE_FILL_COLOR);
        fillPaint.setAntiAlias(true);

        strokePaint = new Paint();
        strokePaint.setStyle(Style.STROKE);
        strokePaint.setColor(CIRCLE_STROKE_COLOR);
        strokePaint.setAntiAlias(true);

        screenWidth = G.context.getResources().getDisplayMetrics().widthPixels;
        screenHeight = G.context.getResources().getDisplayMetrics().heightPixels;

    }


    public void setIndicatorsCount(int value) {
        count = value;
        computeIndicatorWidth();
    }


    public void setCurrentPage(int value) {
        currentPageIndex = value;
    }


    public void setPercent(float percent) {
        this.percent = percent;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {
            CIRCLE_RADIUS = 16;
            CIRCLE_SPACE = 14;
            changeX = 3;
            changeY = 30;
        }
        else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_NORMAL) {
            CIRCLE_RADIUS = 15;
            CIRCLE_SPACE = 14;
            changeX = 4;
            changeY = 25;

        } else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_SMALL) {
            CIRCLE_RADIUS = 4;
            CIRCLE_SPACE = 3;
            changeX = 1;
            changeY = 10;
        }

        Log.i("LOG", "Percent: " + screenWidth);

        for (int i = 0; i < count; i++) {
            Paint paint = strokePaint;
            float radius = CIRCLE_RADIUS * 3 / 2.5f;

            boolean canDrawFill = false;
            if (i == currentPageIndex) {
                fillPaint.setAlpha((int) ((1.0f - percent) * 255));
                //radius = radius * 3 / 2;
                canDrawFill = true;
            }

            if (percent > 0) {
                if (i == currentPageIndex + 1) {
                    fillPaint.setAlpha((int) (percent * 255));
                    canDrawFill = true;
                }
            }
            canvas.drawCircle(13 + (radius * 2) * i, changeY, radius / 2.0f, strokePaint);

            if (canDrawFill) {
                canvas.drawCircle(13 + (radius * 2) * i, changeY, radius / 2.0f, fillPaint);
            }
        }
    }


    private Object getWindowManager() {
        // TODO Auto-generated method stub
        return null;
    }


    // offsetX + i * (CIRCLE_RADIUS + CIRCLE_SPACE)
    private void computeIndicatorWidth() {
        indicatorWidth = count * (CIRCLE_RADIUS + CIRCLE_SPACE);
        offsetX = (screenWidth - indicatorWidth) / changeX;
    }
}
