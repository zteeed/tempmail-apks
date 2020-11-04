package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: FragmentContainer */
public abstract class e {
    @Deprecated
    public Fragment a(Context context, String str, Bundle bundle) {
        return Fragment.s0(context, str, bundle);
    }

    public abstract View b(int i);

    public abstract boolean d();
}
