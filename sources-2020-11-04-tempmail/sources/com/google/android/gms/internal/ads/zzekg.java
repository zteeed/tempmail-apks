package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzekg implements zzbp {
    private static zzeks i = zzeks.b(zzekg.class);

    /* renamed from: b  reason: collision with root package name */
    private String f8812b;

    /* renamed from: c  reason: collision with root package name */
    boolean f8813c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8814d;

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer f8815e;

    /* renamed from: f  reason: collision with root package name */
    private long f8816f;
    private long g = -1;
    private zzekm h;

    protected zzekg(String str) {
        this.f8812b = str;
        this.f8814d = true;
        this.f8813c = true;
    }

    private final synchronized void a() {
        if (!this.f8814d) {
            try {
                zzeks zzeks = i;
                String valueOf = String.valueOf(this.f8812b);
                zzeks.a(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.f8815e = this.h.y(this.f8816f, this.g);
                this.f8814d = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void b(zzekm zzekm, ByteBuffer byteBuffer, long j, zzbo zzbo) throws IOException {
        this.f8816f = zzekm.position();
        byteBuffer.remaining();
        this.g = j;
        this.h = zzekm;
        zzekm.s(zzekm.position() + j);
        this.f8814d = false;
        this.f8813c = false;
        c();
    }

    public final synchronized void c() {
        a();
        zzeks zzeks = i;
        String valueOf = String.valueOf(this.f8812b);
        zzeks.a(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.f8815e != null) {
            ByteBuffer byteBuffer = this.f8815e;
            this.f8813c = true;
            byteBuffer.rewind();
            e(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.f8815e = null;
        }
    }

    public final void d(zzbs zzbs) {
    }

    /* access modifiers changed from: protected */
    public abstract void e(ByteBuffer byteBuffer);

    public final String getType() {
        return this.f8812b;
    }
}
