package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzabj {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zzabg> f5740a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final zzabi f5741b;

    public zzabj(zzabi zzabi) {
        this.f5741b = zzabi;
    }

    public final void a(String str, zzabg zzabg) {
        this.f5740a.put(str, zzabg);
    }

    public final void b(String str, String str2, long j) {
        zzabg zzabg;
        zzabi zzabi = this.f5741b;
        zzabg zzabg2 = this.f5740a.get(str2);
        String[] strArr = {str};
        if (!(zzabi == null || zzabg2 == null)) {
            zzabi.a(zzabg2, j, strArr);
        }
        Map<String, zzabg> map = this.f5740a;
        zzabi zzabi2 = this.f5741b;
        if (zzabi2 == null) {
            zzabg = null;
        } else {
            zzabg = zzabi2.c(j);
        }
        map.put(str, zzabg);
    }

    public final zzabi c() {
        return this.f5741b;
    }
}
