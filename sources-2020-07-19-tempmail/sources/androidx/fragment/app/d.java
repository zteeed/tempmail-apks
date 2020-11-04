package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: FragmentContainer */
public abstract class d {
    public Fragment a(Context context, String str, Bundle bundle) {
        return Fragment.o0(context, str, bundle);
    }

    public abstract View b(int i);

    public abstract boolean c();
}
