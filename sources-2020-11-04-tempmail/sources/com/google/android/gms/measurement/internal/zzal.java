package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzal {

    /* renamed from: a  reason: collision with root package name */
    final String f10556a;

    /* renamed from: b  reason: collision with root package name */
    final String f10557b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10558c;

    /* renamed from: d  reason: collision with root package name */
    final long f10559d;

    /* renamed from: e  reason: collision with root package name */
    final long f10560e;

    /* renamed from: f  reason: collision with root package name */
    final zzan f10561f;

    private zzal(zzfy zzfy, String str, String str2, String str3, long j, long j2, zzan zzan) {
        Preconditions.g(str2);
        Preconditions.g(str3);
        Preconditions.k(zzan);
        this.f10556a = str2;
        this.f10557b = str3;
        this.f10558c = TextUtils.isEmpty(str) ? null : str;
        this.f10559d = j;
        this.f10560e = j2;
        if (j2 != 0 && j2 > j) {
            zzfy.h().J().c("Event created with reverse previous/current timestamps. appId, name", zzeu.x(str2), zzeu.x(str3));
        }
        this.f10561f = zzan;
    }

    /* access modifiers changed from: package-private */
    public final zzal a(zzfy zzfy, long j) {
        return new zzal(zzfy, this.f10558c, this.f10556a, this.f10557b, this.f10559d, j, this.f10561f);
    }

    public final String toString() {
        String str = this.f10556a;
        String str2 = this.f10557b;
        String valueOf = String.valueOf(this.f10561f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    zzal(zzfy zzfy, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzan zzan;
        Preconditions.g(str2);
        Preconditions.g(str3);
        this.f10556a = str2;
        this.f10557b = str3;
        this.f10558c = TextUtils.isEmpty(str) ? null : str;
        this.f10559d = j;
        this.f10560e = j2;
        if (j2 != 0 && j2 > j) {
            zzfy.h().J().b("Event created with reverse previous/current timestamps. appId", zzeu.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzan = new zzan(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    zzfy.h().G().a("Param name can't be null");
                    it.remove();
                } else {
                    Object G = zzfy.G().G(str4, bundle2.get(str4));
                    if (G == null) {
                        zzfy.h().J().b("Param value can't be null", zzfy.H().z(str4));
                        it.remove();
                    } else {
                        zzfy.G().N(bundle2, str4, G);
                    }
                }
            }
            zzan = new zzan(bundle2);
        }
        this.f10561f = zzan;
    }
}
