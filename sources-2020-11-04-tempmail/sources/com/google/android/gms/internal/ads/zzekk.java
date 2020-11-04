package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzekk implements zzbs, Closeable, Iterator<zzbp> {
    private static final zzbp h = new p90("eof ");

    /* renamed from: b  reason: collision with root package name */
    protected zzbo f8817b;

    /* renamed from: c  reason: collision with root package name */
    protected zzekm f8818c;

    /* renamed from: d  reason: collision with root package name */
    private zzbp f8819d = null;

    /* renamed from: e  reason: collision with root package name */
    long f8820e = 0;

    /* renamed from: f  reason: collision with root package name */
    long f8821f = 0;
    private List<zzbp> g = new ArrayList();

    static {
        zzeks.b(zzekk.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final zzbp next() {
        zzbp a2;
        zzbp zzbp = this.f8819d;
        if (zzbp == null || zzbp == h) {
            zzekm zzekm = this.f8818c;
            if (zzekm == null || this.f8820e >= this.f8821f) {
                this.f8819d = h;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzekm) {
                    this.f8818c.s(this.f8820e);
                    a2 = this.f8817b.a(this.f8818c, this);
                    this.f8820e = this.f8818c.position();
                }
                return a2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f8819d = null;
            return zzbp;
        }
    }

    public void close() throws IOException {
        this.f8818c.close();
    }

    public void e(zzekm zzekm, long j, zzbo zzbo) throws IOException {
        this.f8818c = zzekm;
        this.f8820e = zzekm.position();
        zzekm.s(zzekm.position() + j);
        this.f8821f = zzekm.position();
        this.f8817b = zzbo;
    }

    public final List<zzbp> f() {
        if (this.f8818c == null || this.f8819d == h) {
            return this.g;
        }
        return new zzekq(this.g, this);
    }

    public boolean hasNext() {
        zzbp zzbp = this.f8819d;
        if (zzbp == h) {
            return false;
        }
        if (zzbp != null) {
            return true;
        }
        try {
            this.f8819d = (zzbp) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f8819d = h;
            return false;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.g.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.g.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
