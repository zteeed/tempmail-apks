package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
public class ListenerHolders {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ListenerHolder<?>> f2759a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        for (ListenerHolder<?> a2 : this.f2759a) {
            a2.a();
        }
        this.f2759a.clear();
    }
}
