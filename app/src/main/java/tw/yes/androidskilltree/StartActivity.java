package tw.yes.androidskilltree;

import android.support.v7.app.ActionBarActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import tw.yes.animationDrawableYes.AnimationDrawableYesFragment;
import tw.yes.selectorDrawableYes.SelectorDrawableYesFragment;

@EActivity(R.layout.activity_start)
public class StartActivity extends ActionBarActivity implements StartFragment.GgListener {

    @AfterViews
    void initViews() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new StartFragment_()).commit();
    }

    @Override
    public void fire(String name) {
        if (name.equals("animationlist")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AnimationDrawableYesFragment()).addToBackStack("").commit();
        } else if (name.equals("layerlist")) {
        } else if (name.equals("selector")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SelectorDrawableYesFragment()).addToBackStack("").commit();
        } else {

        }
    }
}
