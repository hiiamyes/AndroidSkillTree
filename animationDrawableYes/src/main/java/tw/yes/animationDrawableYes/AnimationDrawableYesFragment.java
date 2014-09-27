package tw.yes.animationDrawableYes;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AnimationDrawableYesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animation_list, container, false);
        final ImageView qq = (ImageView) view.findViewById(R.id.animation);
        qq.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) qq.getBackground()).start();
            }
        });
        return view;
    }


}
