package info.zhufree.fitt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;


/**
 * Created by Administrator on 2017/11/22.
 *
 */

public class BaseFragment extends Fragment {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    DrawerLayout drawer;

    final String TAG = getClass().getName();

    protected void bindDrawer() {
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        // title, setting
        drawer = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                getActivity(), drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }
}
