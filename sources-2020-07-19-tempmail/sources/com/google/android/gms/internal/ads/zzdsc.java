package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzdsc {

    /* renamed from: a  reason: collision with root package name */
    private final String f8357a;

    /* renamed from: b  reason: collision with root package name */
    private final hz f8358b;

    /* renamed from: c  reason: collision with root package name */
    private hz f8359c;

    private zzdsc(String str) {
        hz hzVar = new hz();
        this.f8358b = hzVar;
        this.f8359c = hzVar;
        zzdsh.b(str);
        this.f8357a = str;
    }

    public final zzdsc a(@NullableDecl Object obj) {
        hz hzVar = new hz();
        this.f8359c.f4002b = hzVar;
        this.f8359c = hzVar;
        hzVar.f4001a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f8357a);
        sb.append('{');
        hz hzVar = this.f8358b.f4002b;
        String str = "";
        while (hzVar != null) {
            Object obj = hzVar.f4001a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            hzVar = hzVar.f4002b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
