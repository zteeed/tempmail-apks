package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbn extends zzekk implements Closeable {
    static {
        zzeks.b(zzbn.class);
    }

    public zzbn(zzekm zzekm, zzbo zzbo) throws IOException {
        e(zzekm, zzekm.size(), zzbo);
    }

    public void close() throws IOException {
        this.f8635c.close();
    }

    public String toString() {
        String obj = this.f8635c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
