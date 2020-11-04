package com.google.firebase.encoders.g;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.firebase:firebase-encoders-json@@16.1.0 */
public final class d implements com.google.firebase.encoders.f.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final com.google.firebase.encoders.b<Object> f11662e = a.a();

    /* renamed from: f  reason: collision with root package name */
    private static final com.google.firebase.encoders.d<String> f11663f = b.a();
    private static final com.google.firebase.encoders.d<Boolean> g = c.a();
    private static final b h = new b((a) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, com.google.firebase.encoders.b<?>> f11664a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, com.google.firebase.encoders.d<?>> f11665b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public com.google.firebase.encoders.b<Object> f11666c = f11662e;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f11667d = false;

    /* compiled from: com.google.firebase:firebase-encoders-json@@16.1.0 */
    class a implements com.google.firebase.encoders.a {
        a() {
        }

        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f11664a, d.this.f11665b, d.this.f11666c, d.this.f11667d);
            eVar.i(obj, false);
            eVar.r();
        }

        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* compiled from: com.google.firebase:firebase-encoders-json@@16.1.0 */
    private static final class b implements com.google.firebase.encoders.d<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f11669a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f11669a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* renamed from: a */
        public void encode(Date date, e eVar) throws IOException {
            eVar.d(f11669a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f11663f);
        m(Boolean.class, g);
        m(Date.class, h);
    }

    static /* synthetic */ void i(Object obj, c cVar) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public /* bridge */ /* synthetic */ com.google.firebase.encoders.f.b a(Class cls, com.google.firebase.encoders.b bVar) {
        l(cls, bVar);
        return this;
    }

    public com.google.firebase.encoders.a f() {
        return new a();
    }

    public d g(com.google.firebase.encoders.f.a aVar) {
        aVar.configure(this);
        return this;
    }

    public d h(boolean z) {
        this.f11667d = z;
        return this;
    }

    public <T> d l(Class<T> cls, com.google.firebase.encoders.b<? super T> bVar) {
        this.f11664a.put(cls, bVar);
        this.f11665b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, com.google.firebase.encoders.d<? super T> dVar) {
        this.f11665b.put(cls, dVar);
        this.f11664a.remove(cls);
        return this;
    }
}
