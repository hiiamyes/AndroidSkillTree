package tw.yes.androidskilltree;

import android.graphics.drawable.AnimationDrawable;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

@EFragment(R.layout.fragment_animation_drawable)
public class AnimationDrawableFragment extends Fragment {

    @ViewById
    ImageView animationImageView;

    @AfterViews
    void initViews() {
        ((AnimationDrawable) animationImageView.getBackground()).start();
    }

}
