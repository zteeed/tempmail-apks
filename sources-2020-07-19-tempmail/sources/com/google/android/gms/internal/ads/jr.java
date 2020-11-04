package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class jr implements zzddz {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f4160a;

    jr(ArrayList arrayList) {
        this.f4160a = arrayList;
    }

    public final void a(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.f4160a);
    }
}
