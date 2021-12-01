package com.newapp.iq_codes;

import android.content.Context;
import android.content.SharedPreferences;

public class IntroPref {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;
    int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "xxyz";
    private static final String IS_FIRST_TIME_LAUNCH = "firstTime";



    public   IntroPref(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = preferences.edit();

    }

    // store index of current adapter item as shared pref
    public  void  setIsFirstTimeLaunch(boolean firstTimeLaunch){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,firstTimeLaunch);
        editor.commit();

    }
    public  boolean isFirsTimeLaunch(){
        return  preferences.getBoolean(IS_FIRST_TIME_LAUNCH,true);
    }

}
