package com.weebly.ghostcoder.funchain;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;

public class Main extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*tabLayout=(TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout=(AppBarLayout)findViewById(R.id.appbar_id);
        viewPager   =(ViewPager)findViewById(R.id.viewpager_id);

        PageAdapter adapter=new PageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Videos(),"Videos");
        adapter.AddFragment(new Photos(),"Photos");
        adapter.AddFragment(new Chat(),"Chat");
        adapter.AddFragment(new Groups(),"Groups");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);*/
    }
}
