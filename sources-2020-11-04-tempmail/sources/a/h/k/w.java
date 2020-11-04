package a.h.k;

import a.h.c;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupCompat */
public final class w {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && u.z(viewGroup) == null) ? false : true;
    }
}
