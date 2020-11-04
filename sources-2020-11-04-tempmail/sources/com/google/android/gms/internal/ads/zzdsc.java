package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzdsc {

    /* renamed from: a  reason: collision with root package name */
    private final String f8540a;

    /* renamed from: b  reason: collision with root package name */
    private final hz f8541b;

    /* renamed from: c  reason: collision with root package name */
    private hz f8542c;

    private zzdsc(String str) {
        hz hzVar = new hz();
        this.f8541b = hzVar;
        this.f8542c = hzVar;
        zzdsh.b(str);
        this.f8540a = str;
    }

    public final zzdsc a(@NullableDecl Object obj) {
        hz hzVar = new hz();
        this.f8542c.f4185b = hzVar;
        this.f8542c = hzVar;
        hzVar.f4184a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f8540a);
        sb.append('{');
        hz hzVar = this.f8541b.f4185b;
        String str = "";
        while (hzVar != null) {
            Object obj = hzVar.f4184a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            hzVar = hzVar.f4185b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
