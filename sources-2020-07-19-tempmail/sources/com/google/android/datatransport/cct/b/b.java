package com.google.android.datatransport.cct.b;

import java.io.IOException;

public final class b implements com.google.firebase.encoders.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.firebase.encoders.f.a f2453a = new b();

    private static final class a implements com.google.firebase.encoders.b<a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f2454a = new a();

        private a() {
        }

        public void encode(Object obj, Object obj2) throws IOException {
            a aVar = (a) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("sdkVersion", aVar.i());
            cVar.f("model", aVar.f());
            cVar.f("hardware", aVar.d());
            cVar.f("device", aVar.b());
            cVar.f("product", aVar.h());
            cVar.f("osBuild", aVar.g());
            cVar.f("manufacturer", aVar.e());
            cVar.f("fingerprint", aVar.c());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.b$b  reason: collision with other inner class name */
    private static final class C0068b implements com.google.firebase.encoders.b<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C0068b f2455a = new C0068b();

        private C0068b() {
        }

        public void encode(Object obj, Object obj2) throws IOException {
            ((com.google.firebase.encoders.c) obj2).f("logRequest", ((j) obj).b());
        }
    }

    private static final class c implements com.google.firebase.encoders.b<k> {

        /* renamed from: a  reason: collision with root package name */
        static final c f2456a = new c();

        private c() {
        }

        public void encode(Object obj, Object obj2) throws IOException {
            k kVar = (k) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("clientType", kVar.c());
            cVar.f("androidClientInfo", kVar.b());
        }
    }

    private static final class d implements com.google.firebase.encoders.b<l> {

        /* renamed from: a  reason: collision with root package name */
        static final d f2457a = new d();

        private d() {
        }

        public void encode(Object obj, Object obj2) throws IOException {
            l lVar = (l) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.b("eventTimeMs", lVar.d());
            cVar.f("eventCode", lVar.c());
            cVar.b("eventUptimeMs", lVar.e());
            cVar.f("sourceExtension", lVar.g());
            cVar.f("sourceExtensionJsonProto3", lVar.h());
            cVar.b("timezoneOffsetSeconds", lVar.i());
            cVar.f("networkConnectionInfo", lVar.f());
        }
    }

    private static final class e implements com.google.firebase.encoders.b<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f2458a = new e();

        private e() {
        }

        public void encode(Object obj, Object obj2) throws IOException {
            m mVar = (m) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.b("requestTimeMs", mVar.g());
            cVar.b("requestUptimeMs", mVar.h());
            cVar.f("clientInfo", mVar.b());
            cVar.f("logSource", mVar.d());
            cVar.f("logSourceName", mVar.e());
            cVar.f("logEvent", mVar.c());
            cVar.f("qosTier", mVar.f());
        }
    }

    private static final class f implements com.google.firebase.encoders.b<o> {

        /* renamed from: a  reason: collision with root package name */
        static final f f2459a = new f();

        private f() {
        }

        public void encode(Object obj, Object obj2) throws IOException {
            o oVar = (o) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("networkType", oVar.c());
            cVar.f("mobileSubtype", oVar.b());
        }
    }

    private b() {
    }

    public void configure(com.google.firebase.encoders.f.b<?> bVar) {
        bVar.a(j.class, C0068b.f2455a);
        bVar.a(d.class, C0068b.f2455a);
        bVar.a(m.class, e.f2458a);
        bVar.a(g.class, e.f2458a);
        bVar.a(k.class, c.f2456a);
        bVar.a(e.class, c.f2456a);
        bVar.a(a.class, a.f2454a);
        bVar.a(c.class, a.f2454a);
        bVar.a(l.class, d.f2457a);
        bVar.a(f.class, d.f2457a);
        bVar.a(o.class, f.f2459a);
        bVar.a(i.class, f.f2459a);
    }
}
