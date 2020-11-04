package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxq {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f6217a = BigInteger.ONE;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private String f6218b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.f6217a.toString();
        this.f6217a = this.f6217a.add(BigInteger.ONE);
        this.f6218b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f6218b;
    }
}
