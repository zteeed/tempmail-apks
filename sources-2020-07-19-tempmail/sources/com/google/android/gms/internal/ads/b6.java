package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class b6 implements zzai {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3423a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ c6 f3424b;

    b6(zzazq zzazq, String str, c6 c6Var) {
        this.f3423a = str;
        this.f3424b = c6Var;
    }

    public final void a(zzao zzao) {
        String str = this.f3423a;
        String exc = zzao.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        zzbba.i(sb.toString());
        this.f3424b.b(null);
    }
}
