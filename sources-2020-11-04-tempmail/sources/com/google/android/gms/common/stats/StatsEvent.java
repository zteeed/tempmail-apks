package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public interface Types {
    }

    public abstract long A();

    public abstract String B();

    public String toString() {
        long v = v();
        int u = u();
        long A = A();
        String B = B();
        StringBuilder sb = new StringBuilder(String.valueOf(B).length() + 53);
        sb.append(v);
        sb.append("\t");
        sb.append(u);
        sb.append("\t");
        sb.append(A);
        sb.append(B);
        return sb.toString();
    }

    public abstract int u();

    public abstract long v();
}
