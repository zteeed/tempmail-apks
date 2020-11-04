package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ac0 extends bc0 {
    public final long P0;
    public final List<dc0> Q0 = new ArrayList();
    public final List<ac0> R0 = new ArrayList();

    public ac0(int i, long j) {
        super(i);
        this.P0 = j;
    }

    public final void d(ac0 ac0) {
        this.R0.add(ac0);
    }

    public final void e(dc0 dc0) {
        this.Q0.add(dc0);
    }

    public final dc0 f(int i) {
        int size = this.Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            dc0 dc0 = this.Q0.get(i2);
            if (dc0.f3640a == i) {
                return dc0;
            }
        }
        return null;
    }

    public final ac0 g(int i) {
        int size = this.R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ac0 ac0 = this.R0.get(i2);
            if (ac0.f3640a == i) {
                return ac0;
            }
        }
        return null;
    }

    public final String toString() {
        String c2 = bc0.c(this.f3640a);
        String arrays = Arrays.toString(this.Q0.toArray());
        String arrays2 = Arrays.toString(this.R0.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(c2);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
