package com.newapp.iq_codes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
/***
 * WalkThrough
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 */
public class walkthrough extends AppCompatActivity {

    private TextView nextTxt;
    private ViewPager viewPager;
    private LinearLayout layoutDots;
    private IntroPref introPref;
    private int[] layouts;
    private MyViewPageAdapter viewPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        introPref = new IntroPref(this);
        nextTxt = findViewById(R.id.nextTxt);
        viewPager = findViewById(R.id.viewPager);
        layoutDots = findViewById(R.id.layoutDots);

        /***
         * pageViewer start oder
         */
        layouts = new int[]{
                R.layout.intro_three,  //1
                R.layout.intro_one,    //2
                R.layout.intro_two,    //3


        };
        /***
         * click next -> next PageViewer start
         */
        nextTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = getItem(+1);
                if (current < layouts.length) {
                    viewPager.setCurrentItem(current);
                } else {
                    launchHomeScreen();
                }
            }
        });

        viewPageAdapter = new MyViewPageAdapter();
        viewPager.setAdapter(viewPageAdapter);
        viewPager.addOnPageChangeListener(onPageChangeListener);


    }
    /***
     *  first show next on button,last page show start
     */
    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }
        /***
         *  current page display  "NEXT "   , Last page display "START"
         */
        @Override
        public void onPageSelected(int position) {
            if (position == layouts.length - 1) {
                nextTxt.setText("START");
            } else {
                nextTxt.setText("NEXT");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };


    public class MyViewPageAdapter extends PagerAdapter {
        LayoutInflater layoutInflater;

        public MyViewPageAdapter() {

        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }
    /***
     *  smoothly transform
     */
    private int getItem(int i) {
        return viewPager.getCurrentItem() + 1;
    }

    /***
     *  start next activity login page
     */
    private void launchHomeScreen() {
        introPref.setIsFirstTimeLaunch(false);
        startActivity(new Intent(walkthrough.this, Login.class));
    }
}
