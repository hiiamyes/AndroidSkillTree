package tw.yes.androidskilltree;

import android.app.Activity;
import android.support.v4.app.Fragment;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;

@EFragment(R.layout.fragment_start)
public class StartFragment extends Fragment {

    public interface GgListener {
        void fire(String name);
    }

    GgListener ggListener;

    @Override
    public void onAttach(Activity activity) {
        ggListener = (GgListener) activity;
        super.onAttach(activity);
    }

    @Click(R.id.animationDrawableButton)
    void animationDrawableButtonClicked() {
        ggListener.fire("animationlist");
    }

    @Click(R.id.layerDrawableButton)
    void layerDrawableButtonClicked() {
        ggListener.fire("layerlist");
    }

    @Click(R.id.selectorDrawableButton)
    void selectorDrawableButtonClicked(){
        ggListener.fire("selector");
    }
}
