package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f10236b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10237c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f10238d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f10239e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Object f10240f;
    private final /* synthetic */ zzeu g;

    i3(zzeu zzeu, int i, String str, Object obj, Object obj2, Object obj3) {
        this.g = zzeu;
        this.f10236b = i;
        this.f10237c = str;
        this.f10238d = obj;
        this.f10239e = obj2;
        this.f10240f = obj3;
    }

    public final void run() {
        q3 A = this.g.f10357a.A();
        if (A.t()) {
            if (this.g.f10588c == 0) {
                if (this.g.l().F()) {
                    zzeu zzeu = this.g;
                    zzeu.m();
                    char unused = zzeu.f10588c = 'C';
                } else {
                    zzeu zzeu2 = this.g;
                    zzeu2.m();
                    char unused2 = zzeu2.f10588c = 'c';
                }
            }
            if (this.g.f10589d < 0) {
                zzeu zzeu3 = this.g;
                long unused3 = zzeu3.f10589d = zzeu3.l().D();
            }
            char charAt = "01VDIWEA?".charAt(this.f10236b);
            char u = this.g.f10588c;
            long E = this.g.f10589d;
            String z = zzeu.z(true, this.f10237c, this.f10238d, this.f10239e, this.f10240f);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(u);
            sb.append(E);
            sb.append(":");
            sb.append(z);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f10237c.substring(0, 1024);
            }
            A.f10374d.b(sb2, 1);
            return;
        }
        this.g.A(6, "Persisted config not initialized. Not logging error/warn");
    }
}
