package com.example.lepton.materialtest;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Lepton on 09-Jul-15.
 */
public class MyView extends TextView{
    public static final String TAG="VIZ";
    Paint paint= null;

    public MyView(Context context) {
        super(context);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch(ev.getActionMasked()){

            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyView dispatchTouchEvent Action Down");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyView dispatchTouchEvent Action Up");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyView dispatchTouchEvent Action MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyView dispatchTouchEvent Action Cancel");
                break;


        }
        boolean  b = super.dispatchTouchEvent(ev);;
        Log.d(TAG, "MyView dispatchTouchEvent "+b);
        return b;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getActionMasked()){

            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyView onTouchEvent Action Down");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyView onTouchEvent Action Up");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyView onTouchEvent Action MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyView onTouchEvent Action Cancel");
                break;


        }
        boolean  b = super.onTouchEvent(event);;
        Log.d(TAG, "MyView onTouchEvent "+b);
        return b;
    }

}
