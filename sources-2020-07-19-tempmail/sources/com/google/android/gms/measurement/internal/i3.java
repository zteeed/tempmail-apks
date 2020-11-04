package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f10050b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10051c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f10052d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f10053e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Object f10054f;
    private final /* synthetic */ zzeu g;

    i3(zzeu zzeu, int i, String str, Object obj, Object obj2, Object obj3) {
        this.g = zzeu;
        this.f10050b = i;
        this.f10051c = str;
        this.f10052d = obj;
        this.f10053e = obj2;
        this.f10054f = obj3;
    }

    public final void run() {
        q3 A = this.g.f10171a.A();
        if (A.t()) {
            if (this.g.f10402c == 0) {
                if (this.g.l().F()) {
                    zzeu zzeu = this.g;
                    zzeu.m();
                    char unused = zzeu.f10402c = 'C';
                } else {
                    zzeu zzeu2 = this.g;
                    zzeu2.m();
                    char unused2 = zzeu2.f10402c = 'c';
                }
            }
            if (this.g.f10403d < 0) {
                zzeu zzeu3 = this.g;
                long unused3 = zzeu3.f10403d = zzeu3.l().D();
            }
            char charAt = "01VDIWEA?".charAt(this.f10050b);
            char u = this.g.f10402c;
            long E = this.g.f10403d;
            String z = zzeu.z(true, this.f10051c, this.f10052d, this.f10053e, this.f10054f);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(u);
            sb.append(E);
            sb.append(":");
            sb.append(z);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f10051c.substring(0, 1024);
            }
            A.f10188d.b(sb2, 1);
            return;
        }
        this.g.A(6, "Persisted config not initialized. Not logging error/warn");
    }
}
