package tw.yes.androidskilltree;

import android.support.v7.app.ActionBarActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_start)
public class StartActivity extends ActionBarActivity implements StartFragment.GgListener {

    @AfterViews
    void initViews() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new StartFragment_()).commit();
    }

    @Override
    public void fire(String name) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AnimationDrawableFragment_()).addToBackStack("").commit();
    }
}
