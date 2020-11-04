package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzjm extends zzjf {

    /* renamed from: b  reason: collision with root package name */
    public final zzji f8795b = new zzji();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f8796c;

    /* renamed from: d  reason: collision with root package name */
    public long f8797d;

    public zzjm(int i) {
    }

    private final ByteBuffer j(int i) {
        ByteBuffer byteBuffer = this.f8796c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f8796c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean h() {
        return d(1073741824);
    }

    public final void i(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f8796c;
        if (byteBuffer != null) {
            int capacity = byteBuffer.capacity();
            int position = this.f8796c.position() + i;
            if (capacity < position) {
                j(position);
                throw null;
            }
            return;
        }
        j(i);
        throw null;
    }
}
