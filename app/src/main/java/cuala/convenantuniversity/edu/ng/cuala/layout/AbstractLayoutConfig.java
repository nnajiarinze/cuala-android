package cuala.convenantuniversity.edu.ng.cuala.layout;

import android.app.Activity;

import butterknife.ButterKnife;

/**
 * Created by user on 11/6/2016.
 */

public abstract class AbstractLayoutConfig {

    protected final Activity activity;

    public AbstractLayoutConfig(Activity activity) {
        this.activity = activity;
    }

    public void setContentView(Integer layoutResource){
        activity.setContentView(layoutResource);
        ButterKnife.bind(this,activity);
    }

    public abstract  <T extends Activity> T getActivity();
}
