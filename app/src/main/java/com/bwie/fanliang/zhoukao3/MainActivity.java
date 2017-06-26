package com.bwie.fanliang.zhoukao3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity {
    private ViewPager pager;
    private RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.view_pager);
        group = (RadioGroup) findViewById(R.id.group);


        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                // TODO Auto-generated method stub
                return 4;
            }

            @Override
            public Fragment getItem(int arg0) {
                Fragment fragment = null;

                switch (arg0) {
                    case 0:
                        fragment = new Fragment01();
                        break;
                    case 1:
                        fragment = new Fragment02();
                        break;
                    case 2:
                        fragment = new Fragment03();
                        break;
                    case 3:
                        fragment = new Fragment04();
                        break;

                    default:
                        break;
                }
                return fragment;
            }
        });

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                for (int i = 0; i < 4; i++) {
                    if (group.getChildAt(i).getId() == checkedId) {
                        //pager.setCurrentItem(i);
                        //设置切换界面没有滚动效果
                        pager.setCurrentItem(i, false);
                    }
                }

            }
        });
    }

}
