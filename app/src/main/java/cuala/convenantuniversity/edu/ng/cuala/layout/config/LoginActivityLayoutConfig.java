package cuala.convenantuniversity.edu.ng.cuala.layout.config;

import android.content.Intent;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import butterknife.BindView;
import cuala.convenantuniversity.edu.ng.cuala.R;
import cuala.convenantuniversity.edu.ng.cuala.activity.LoginActivity;
import cuala.convenantuniversity.edu.ng.cuala.activity.MainActivity;
import cuala.convenantuniversity.edu.ng.cuala.layout.AbstractLayoutConfig;

/**
 * Created by user on 11/13/2016.
 */

public class LoginActivityLayoutConfig extends AbstractLayoutConfig {


    @BindView(R.id.btn_signin_facbook)
    AppCompatButton btnLoginFacebook;

    public LoginActivityLayoutConfig(LoginActivity activity) {
        super(activity);
        setContentView(R.layout.activity_login);
    }

    public void setupSignupButtonConfigs(){
        btnLoginFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainActivity();
            }
        });

    }

    private void goToMainActivity(){
        Intent startMainActivityIntent = new Intent(getActivity(), MainActivity.class);
        getActivity().startActivity(startMainActivityIntent);
        getActivity().finish();
    }

    @Override
    public LoginActivity getActivity() {
        return (LoginActivity)activity;
    }
}
