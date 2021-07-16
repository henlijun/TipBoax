package com.lj.toastlibrary;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import androidx.annotation.NonNull;

/**
 * @ProjectName: TipBoax
 * @Package: com.lj.toastlibrary
 * @ClassName: LToast
 * @Description: java类作用描述
 * @Author: 李军
 * @CreateDate: 2021/7/16 13:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/7/16 13:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LToast {
    private static Context context;
    public static void init(@NonNull Context applicationContext){
        context = applicationContext;
    }


    public static void show(String text){
        if(TextUtils.isEmpty(text)){
           return;
        }
        if(context != null)
            Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }
}
