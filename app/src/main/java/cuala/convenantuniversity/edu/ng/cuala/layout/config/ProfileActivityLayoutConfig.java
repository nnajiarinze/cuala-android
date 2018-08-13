package cuala.convenantuniversity.edu.ng.cuala.layout.config;

import cuala.convenantuniversity.edu.ng.cuala.R;
import cuala.convenantuniversity.edu.ng.cuala.activity.ProfileActivity;
import cuala.convenantuniversity.edu.ng.cuala.layout.AbstractLayoutConfig;

/**
 * Created by user on 12/11/2016.
 */

public class ProfileActivityLayoutConfig extends AbstractLayoutConfig {

    public ProfileActivityLayoutConfig(ProfileActivity activity) {
        super(activity);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public ProfileActivity getActivity() {
        return (ProfileActivity)activity;
    }
}
