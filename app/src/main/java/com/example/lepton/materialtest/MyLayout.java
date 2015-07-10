package com.example.lepton.materialtest;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import java.util.jar.Attributes;

/**
 * Created by Lepton on 09-Jul-15.
 */
public class MyLayout extends FrameLayout{
    public static final String TAG="VIZ";
    Paint paint= null;

    public MyLayout(Context context) {
        super(context);
        init();
    }

    public MyLayout(Context context,AttributeSet attrs) {
        super(context,attrs);
        init();
    }


    public MyLayout(Context context,AttributeSet attrs,int defStyleAttr) {
        super(context,attrs,defStyleAttr);
        init();
    }


    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch(ev.getActionMasked()){

            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout dispatchTouchEvent Action Down");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout dispatchTouchEvent Action Up");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout dispatchTouchEvent Action MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout dispatchTouchEvent Action Cancel");
                break;


        }
        boolean  b = super.dispatchTouchEvent(ev);;
        Log.d(TAG, "MyLayout dispatchTouchEvent "+b);
        return b;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getActionMasked()){

            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout onTouchEvent Action Down");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout onTouchEvent Action Up");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout onTouchEvent Action MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout onTouchEvent Action Cancel");
                break;


        }
        boolean  b = super.onTouchEvent(event);;
        Log.d(TAG, "MyLayout onTouchEvent "+b);
        return b;
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        switch(ev.getActionMasked()){

            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout onInterceptTouchEvent Action Down");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout onInterceptTouchEvent Action Up");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout onInterceptTouchEvent Action MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout onInterceptTouchEvent Action Cancel");
                break;


        }
        boolean  b = super.onInterceptTouchEvent(ev);;
        Log.d(TAG, "MyLayout onInterceptTouchEvent "+b);
        return b;
    }
}
