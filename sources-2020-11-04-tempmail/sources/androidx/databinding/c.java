package androidx.databinding;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: DataBinderMapper */
public abstract class c {
    public List<c> a() {
        return Collections.emptyList();
    }

    public abstract ViewDataBinding b(e eVar, View view, int i);

    public abstract ViewDataBinding c(e eVar, View[] viewArr, int i);
}
