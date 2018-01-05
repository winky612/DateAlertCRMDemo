package com.zkhz.datealertcrmdemo;

import android.app.Activity;

import com.zkhz.factory.Model;

import java.util.ArrayList;
import java.util.List;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Administrator on 2018/1/5 0005.
 */

public class Application extends android.app.Application {
    private List<Activity> mActivities=new ArrayList<Activity>();

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
        .setDefaultFontPath("fonts/FZLanTingHeiS-L-GB-Regular.TTF")
        .setFontAttrId(R.attr.fontPath)
        .build());

        Model.setApplication(this);

    }

    public void init(){


    }
}
