package cuala.convenantuniversity.edu.ng.cuala.activity;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import cuala.convenantuniversity.edu.ng.cuala.layout.config.LoginActivityLayoutConfig;

public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(Color.BLACK);
        }
        LoginActivityLayoutConfig layoutConfig
                = new LoginActivityLayoutConfig(this);
        layoutConfig.setupSignupButtonConfigs();
    }

}

