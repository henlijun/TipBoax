package com.lj.tipboax;

import android.app.Application;
import android.widget.Toast;

/**
 * @ProjectName: TipBoax
 * @Package: com.lj.tipboax
 * @ClassName: MainApplication
 * @Description: java类作用描述
 * @Author: 李军
 * @CreateDate: 2021/7/16 13:56
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/7/16 13:56
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"haha",Toast.LENGTH_LONG).show();
    }
}
