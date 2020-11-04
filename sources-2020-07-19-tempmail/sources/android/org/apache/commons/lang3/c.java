package android.org.apache.commons.lang3;

import java.util.Random;

/* compiled from: RandomUtils */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Random f652a = new Random();

    public static int a(int i, int i2) {
        boolean z = true;
        d.a(i2 >= i, "Start value must be smaller or equal to end value.", new Object[0]);
        if (i < 0) {
            z = false;
        }
        d.a(z, "Both range values must be non-negative.", new Object[0]);
        if (i == i2) {
            return i;
        }
        return i + f652a.nextInt(i2 - i);
    }
}
