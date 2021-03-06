package com.wanle.lequan.sharedbicycle.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * autor:Jerry
 * fuction:
 * Date: 2017/2/24.
 */

public class ToastUtils {
    private static Context context = null;
    private static Toast toast = null;


    public static void getShortToast(Context context,int retId){
        if (toast == null) {
            toast = Toast.makeText(context, retId, Toast.LENGTH_SHORT);
        } else {
            toast.setText(retId);
            toast.setDuration(Toast.LENGTH_SHORT);
        }


        toast.show();
    }


    public static void getShortToastByString(Context context,String hint){
        if (toast == null) {
            toast = Toast.makeText(context, hint, Toast.LENGTH_SHORT);
        } else {
            toast.setText(hint);
            toast.setDuration(Toast.LENGTH_SHORT);
        }


        toast.show();
    }


    public static void getLongToast(Context context,int retId){
        if (toast == null) {
            toast = Toast.makeText(context, retId, Toast.LENGTH_LONG);
        } else {
            toast.setText(retId);
            toast.setDuration(Toast.LENGTH_LONG);
        }


        toast.show();
    }


    public static void getLongToastByString(Context context, String hint){
        if (toast == null) {
            toast = Toast.makeText(context, hint, Toast.LENGTH_LONG);
        } else {
            toast.setText(hint);
            toast.setDuration(Toast.LENGTH_LONG);
        }


        toast.show();
    }
}
