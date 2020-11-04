package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class s0 extends zzcv<Boolean> {
    s0(zzdb zzdb, String str, Boolean bool, boolean z) {
        super(zzdb, str, bool, z, (p0) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzcg.f9759c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzcg.f9760d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String m = super.m();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(m);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
