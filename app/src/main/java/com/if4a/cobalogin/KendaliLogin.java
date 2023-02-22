package com.if4a.cobalogin;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class KendaliLogin {

    private SharedPreferences sp;
    private SharedPreferences.Editor spe;

    public void setPref(Context ctx, String key, String value){
        sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        spe = sp.edit();
        spe.putString(key, value);
        spe.commit();
    }

    public String getPref(Context ctx, String key){
        sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        String tampung = sp.getString(key, null);
        return tampung;
    }

    public boolean isLogin(Context ctx, String key){
        String tampung = getPref(ctx, key);

        if (tampung != null){
            return true;
        }else{
            return false;
        }
    }
}
