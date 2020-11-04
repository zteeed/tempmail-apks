package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaam {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<zzaag<?>> f5521a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Collection<zzaag<String>> f5522b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Collection<zzaag<String>> f5523c = new ArrayList();

    public final void a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzaag next : this.f5521a) {
            if (next.b() == 1) {
                next.i(editor, next.l(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzbba.g("Flag Json is null.");
        }
    }

    public final void b(zzaag zzaag) {
        this.f5521a.add(zzaag);
    }

    public final void c(zzaag<String> zzaag) {
        this.f5522b.add(zzaag);
    }

    public final void d(zzaag<String> zzaag) {
        this.f5523c.add(zzaag);
    }

    public final List<String> e() {
        ArrayList arrayList = new ArrayList();
        for (zzaag<String> c2 : this.f5522b) {
            String str = (String) zzwg.e().c(c2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzaaw.b());
        return arrayList;
    }

    public final List<String> f() {
        List<String> e2 = e();
        for (zzaag<String> c2 : this.f5523c) {
            String str = (String) zzwg.e().c(c2);
            if (!TextUtils.isEmpty(str)) {
                e2.add(str);
            }
        }
        e2.addAll(zzaaw.c());
        return e2;
    }
}
