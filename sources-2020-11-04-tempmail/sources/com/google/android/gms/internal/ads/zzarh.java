package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzarh {
    /* access modifiers changed from: private */
    @Nonnull

    /* renamed from: a  reason: collision with root package name */
    public View f6067a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f6068b = new HashMap();

    public final zzarh c(Map<String, View> map) {
        this.f6068b.clear();
        for (Map.Entry next : map.entrySet()) {
            View view = (View) next.getValue();
            if (view != null) {
                this.f6068b.put((String) next.getKey(), new WeakReference(view));
            }
        }
        return this;
    }

    public final zzarh d(View view) {
        this.f6067a = view;
        return this;
    }
}
