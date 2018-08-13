package cuala.convenantuniversity.edu.ng.cuala.layout.config;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import butterknife.BindArray;
import butterknife.BindView;
import cuala.convenantuniversity.edu.ng.cuala.R;
import cuala.convenantuniversity.edu.ng.cuala.activity.MainActivity;
import cuala.convenantuniversity.edu.ng.cuala.activity.ProfileActivity;
import cuala.convenantuniversity.edu.ng.cuala.layout.AbstractLayoutConfig;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by user on 11/6/2016.
 */

public class MainActivityLayoutConfig extends AbstractLayoutConfig
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @BindArray(R.array.nav_menu_entries)
    String[] navigationListViewItems;

    public MainActivityLayoutConfig(MainActivity activity) {
        super(activity);
        setContentView(R.layout.activity_main);
    }

    //Setup Navigation drawer list
    public void setupNavigationDrawerList(){
        getActivity().setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.menu_feed_title);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                activity, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        View headerView = navigationView.getHeaderView(0);
        CircleImageView profileImage = (CircleImageView)headerView.findViewById(R.id.civProfileImage);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileEditIntent = new Intent(getActivity(),ProfileActivity.class);
                getActivity().startActivity(profileEditIntent);
            }
        });
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_feed) {
            toolbar.setTitle(R.string.menu_feed_title);
        } else if (id == R.id.nav_members) {
            toolbar.setTitle(R.string.menu_members);
        } else if (id == R.id.nav_jobsearch) {
            toolbar.setTitle(R.string.menu_jobsearch_title);
        } else if (id == R.id.nav_messages) {
            toolbar.setTitle(R.string.menu_messages_title);
        } else if (id == R.id.nav_events) {
            toolbar.setTitle(R.string.menu_events_title);
        }else if (id == R.id.nav_podcast) {
            toolbar.setTitle(R.string.menu_podcast_title);
        }else if (id == R.id.nav_alumni) {
            toolbar.setTitle(R.string.menu_alumni_services_title);
        }else if (id == R.id.nav_donate) {
            toolbar.setTitle(R.string.menu_donate_title);
        }else if (id == R.id.nav_financials) {
            toolbar.setTitle(R.string.menu_financial_reports_title);
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public MainActivity getActivity() {
        return (MainActivity)activity;
    }
}