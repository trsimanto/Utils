package com.towhid.libutils;

import android.content.Context;
import android.widget.Toast;

public class LibUtil {
    public static void toastShow(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
