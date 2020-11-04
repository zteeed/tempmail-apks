package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ByteString */
public abstract class d implements Iterable<Byte>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final d f12105c = new g(j.f12145b);

    /* renamed from: d  reason: collision with root package name */
    private static final C0108d f12106d;

    /* renamed from: b  reason: collision with root package name */
    private int f12107b = 0;

    /* compiled from: ByteString */
    class a implements e {

        /* renamed from: b  reason: collision with root package name */
        private int f12108b = 0;

        /* renamed from: c  reason: collision with root package name */
        private final int f12109c = d.this.size();

        a() {
        }

        /* renamed from: b */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        public boolean hasNext() {
            return this.f12108b < this.f12109c;
        }

        public byte nextByte() {
            try {
                d dVar = d.this;
                int i = this.f12108b;
                this.f12108b = i + 1;
                return dVar.c(i);
            } catch (IndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString */
    private static final class b implements C0108d {
        private b() {
        }

        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString */
    private static final class c extends g {
        private static final long serialVersionUID = 1;

        /* renamed from: f  reason: collision with root package name */
        private final int f12111f;
        private final int g;

        c(byte[] bArr, int i, int i2) {
            super(bArr);
            d.i(i, i + i2, bArr.length);
            this.f12111f = i;
            this.g = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        public int G() {
            return this.f12111f;
        }

        public byte c(int i) {
            d.h(i, size());
            return this.f12112e[this.f12111f + i];
        }

        /* access modifiers changed from: protected */
        public void m(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f12112e, G() + i, bArr, i2, i3);
        }

        public int size() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return d.B(y());
        }
    }

    /* renamed from: com.google.protobuf.d$d  reason: collision with other inner class name */
    /* compiled from: ByteString */
    private interface C0108d {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* compiled from: ByteString */
    public interface e extends Iterator<Byte> {
    }

    /* compiled from: ByteString */
    static abstract class f extends d {
        f() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return d.super.iterator();
        }
    }

    /* compiled from: ByteString */
    private static class g extends f {
        private static final long serialVersionUID = 1;

        /* renamed from: e  reason: collision with root package name */
        protected final byte[] f12112e;

        g(byte[] bArr) {
            this.f12112e = bArr;
        }

        /* access modifiers changed from: protected */
        public final String A(Charset charset) {
            return new String(this.f12112e, G(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final boolean F(d dVar, int i, int i2) {
            if (i2 <= dVar.size()) {
                int i3 = i + i2;
                if (i3 > dVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + dVar.size());
                } else if (!(dVar instanceof g)) {
                    return dVar.w(i, i3).equals(w(0, i2));
                } else {
                    g gVar = (g) dVar;
                    byte[] bArr = this.f12112e;
                    byte[] bArr2 = gVar.f12112e;
                    int G = G() + i2;
                    int G2 = G();
                    int G3 = gVar.G() + i;
                    while (G2 < G) {
                        if (bArr[G2] != bArr2[G3]) {
                            return false;
                        }
                        G2++;
                        G3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int G() {
            return 0;
        }

        public byte c(int i) {
            return this.f12112e[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d) || size() != ((d) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof g)) {
                return obj.equals(this);
            }
            g gVar = (g) obj;
            int v = v();
            int v2 = gVar.v();
            if (v == 0 || v2 == 0 || v == v2) {
                return F(gVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void m(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f12112e, i, bArr, i2, i3);
        }

        public final e s() {
            return e.f(this.f12112e, G(), size(), true);
        }

        public int size() {
            return this.f12112e.length;
        }

        /* access modifiers changed from: protected */
        public final int u(int i, int i2, int i3) {
            return j.c(i, this.f12112e, G() + i2, i3);
        }

        public final d w(int i, int i2) {
            int i3 = d.i(i, i2, size());
            if (i3 == 0) {
                return d.f12105c;
            }
            return new c(this.f12112e, G() + i, i3);
        }
    }

    /* compiled from: ByteString */
    private static final class h implements C0108d {
        private h() {
        }

        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        Class<d> cls = d.class;
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f12106d = z ? new h((a) null) : new b((a) null);
    }

    d() {
    }

    static d B(byte[] bArr) {
        return new g(bArr);
    }

    static d C(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    static void h(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static d j(byte[] bArr, int i, int i2) {
        return new g(f12106d.a(bArr, i, i2));
    }

    public static d l(String str) {
        return new g(str.getBytes(j.f12144a));
    }

    /* access modifiers changed from: protected */
    public abstract String A(Charset charset);

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f12107b;
        if (i == 0) {
            int size = size();
            i = u(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f12107b = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract void m(byte[] bArr, int i, int i2, int i3);

    /* renamed from: q */
    public final e iterator() {
        return new a();
    }

    public abstract e s();

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* access modifiers changed from: protected */
    public abstract int u(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public final int v() {
        return this.f12107b;
    }

    public abstract d w(int i, int i2);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return j.f12145b;
        }
        byte[] bArr = new byte[size];
        m(bArr, 0, 0, size);
        return bArr;
    }

    public final String z(Charset charset) {
        return size() == 0 ? "" : A(charset);
    }
}
