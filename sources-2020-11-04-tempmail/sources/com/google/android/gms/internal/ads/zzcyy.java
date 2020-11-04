package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzq;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyy implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7906a;

    /* renamed from: b  reason: collision with root package name */
    private final zzvh f7907b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Parcelable> f7908c;

    public zzcyy(Context context, zzvh zzvh, List<Parcelable> list) {
        this.f7906a = context;
        this.f7907b = zzvh;
        this.f7908c = list;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (zzacn.f5784a.a().booleanValue()) {
            Bundle bundle2 = new Bundle();
            zzq.zzkw();
            bundle2.putString("activity", zzaye.A(this.f7906a));
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f7907b.f9376f);
            bundle3.putInt("height", this.f7907b.f9373c);
            bundle2.putBundle("size", bundle3);
            if (this.f7908c.size() > 0) {
                List<Parcelable> list = this.f7908c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
