package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzq;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyy implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7723a;

    /* renamed from: b  reason: collision with root package name */
    private final zzvh f7724b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Parcelable> f7725c;

    public zzcyy(Context context, zzvh zzvh, List<Parcelable> list) {
        this.f7723a = context;
        this.f7724b = zzvh;
        this.f7725c = list;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (zzacn.f5601a.a().booleanValue()) {
            Bundle bundle2 = new Bundle();
            zzq.zzkw();
            bundle2.putString("activity", zzaye.A(this.f7723a));
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f7724b.f9193f);
            bundle3.putInt("height", this.f7724b.f9190c);
            bundle2.putBundle("size", bundle3);
            if (this.f7725c.size() > 0) {
                List<Parcelable> list = this.f7725c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
