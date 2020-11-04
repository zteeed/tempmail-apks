package com.google.firebase.encoders.g;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.b;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-encoders-json@@16.1.0 */
final class e implements c, com.google.firebase.encoders.e {

    /* renamed from: a  reason: collision with root package name */
    private e f11120a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11121b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f11122c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, b<?>> f11123d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f11124e;

    /* renamed from: f  reason: collision with root package name */
    private final b<Object> f11125f;
    private final boolean g;

    e(Writer writer, Map<Class<?>, b<?>> map, Map<Class<?>, d<?>> map2, b<Object> bVar, boolean z) {
        this.f11122c = new JsonWriter(writer);
        this.f11123d = map;
        this.f11124e = map2;
        this.f11125f = bVar;
        this.g = z;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e t(String str, Object obj) throws IOException, EncodingException {
        v();
        this.f11122c.name(str);
        if (obj == null) {
            this.f11122c.nullValue();
            return this;
        }
        i(obj, false);
        return this;
    }

    private e u(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        v();
        this.f11122c.name(str);
        i(obj, false);
        return this;
    }

    private void v() throws IOException {
        if (this.f11121b) {
            e eVar = this.f11120a;
            if (eVar != null) {
                eVar.v();
                this.f11120a.f11121b = false;
                this.f11120a = null;
                this.f11122c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public /* bridge */ /* synthetic */ c a(String str, boolean z) throws IOException {
        n(str, z);
        return this;
    }

    public /* bridge */ /* synthetic */ c b(String str, long j) throws IOException {
        l(str, j);
        return this;
    }

    public /* bridge */ /* synthetic */ c c(String str, int i) throws IOException {
        k(str, i);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.firebase.encoders.e d(String str) throws IOException {
        j(str);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.firebase.encoders.e e(boolean z) throws IOException {
        o(z);
        return this;
    }

    public /* bridge */ /* synthetic */ c f(String str, Object obj) throws IOException {
        m(str, obj);
        return this;
    }

    public e g(int i) throws IOException {
        v();
        this.f11122c.value((long) i);
        return this;
    }

    public e h(long j) throws IOException {
        v();
        this.f11122c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e i(Object obj, boolean z) throws IOException {
        Class<?> cls;
        int i = 0;
        if (z && q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f11122c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f11122c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                p((byte[]) obj);
                return this;
            }
            this.f11122c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f11122c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f11122c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f11122c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    i(i3, false);
                }
            }
            this.f11122c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f11122c.beginArray();
            for (Object i4 : (Collection) obj) {
                i(i4, false);
            }
            this.f11122c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f11122c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            this.f11122c.endObject();
            return this;
        } else {
            b bVar = this.f11123d.get(obj.getClass());
            if (bVar != null) {
                s(bVar, obj, z);
                return this;
            }
            d dVar = this.f11124e.get(obj.getClass());
            if (dVar != null) {
                dVar.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                j(((Enum) obj).name());
                return this;
            } else {
                s(this.f11125f, obj, z);
                return this;
            }
        }
    }

    public e j(String str) throws IOException {
        v();
        this.f11122c.value(str);
        return this;
    }

    public e k(String str, int i) throws IOException {
        v();
        this.f11122c.name(str);
        g(i);
        return this;
    }

    public e l(String str, long j) throws IOException {
        v();
        this.f11122c.name(str);
        h(j);
        return this;
    }

    public e m(String str, Object obj) throws IOException {
        if (this.g) {
            u(str, obj);
            return this;
        }
        t(str, obj);
        return this;
    }

    public e n(String str, boolean z) throws IOException {
        v();
        this.f11122c.name(str);
        o(z);
        return this;
    }

    public e o(boolean z) throws IOException {
        v();
        this.f11122c.value(z);
        return this;
    }

    public e p(byte[] bArr) throws IOException {
        v();
        if (bArr == null) {
            this.f11122c.nullValue();
        } else {
            this.f11122c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() throws IOException {
        v();
        this.f11122c.flush();
    }

    /* access modifiers changed from: package-private */
    public e s(b<Object> bVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f11122c.beginObject();
        }
        bVar.encode(obj, this);
        if (!z) {
            this.f11122c.endObject();
        }
        return this;
    }
}
