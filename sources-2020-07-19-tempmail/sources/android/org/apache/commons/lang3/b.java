package android.org.apache.commons.lang3;

import java.util.Random;

/* compiled from: RandomStringUtils */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Random f651a = new Random();

    public static String a(int i, int i2, int i3, boolean z, boolean z2) {
        return b(i, i2, i3, z, z2, (char[]) null, f651a);
    }

    public static String b(int i, int i2, int i3, boolean z, boolean z2, char[] cArr, Random random) {
        char c2;
        if (i == 0) {
            return "";
        }
        if (i < 0) {
            throw new IllegalArgumentException("Requested random string length " + i + " is less than 0.");
        } else if (cArr == null || cArr.length != 0) {
            if (i2 == 0 && i3 == 0) {
                if (cArr != null) {
                    i3 = cArr.length;
                } else if (z || z2) {
                    i3 = 123;
                    i2 = 32;
                } else {
                    i3 = Integer.MAX_VALUE;
                }
            } else if (i3 <= i2) {
                throw new IllegalArgumentException("Parameter end (" + i3 + ") must be greater than start (" + i2 + ")");
            }
            char[] cArr2 = new char[i];
            int i4 = i3 - i2;
            while (true) {
                int i5 = i - 1;
                if (i == 0) {
                    return new String(cArr2);
                }
                if (cArr == null) {
                    c2 = (char) (random.nextInt(i4) + i2);
                } else {
                    c2 = cArr[random.nextInt(i4) + i2];
                }
                if ((z && Character.isLetter(c2)) || ((z2 && Character.isDigit(c2)) || (!z && !z2))) {
                    if (c2 < 56320 || c2 > 57343) {
                        if (c2 < 55296 || c2 > 56191) {
                            if (c2 < 56192 || c2 > 56319) {
                                cArr2[i5] = c2;
                                i = i5;
                            }
                        } else if (i5 != 0) {
                            cArr2[i5] = (char) (random.nextInt(128) + 56320);
                            i5--;
                            cArr2[i5] = c2;
                            i = i5;
                        }
                    } else if (i5 != 0) {
                        cArr2[i5] = c2;
                        i5--;
                        cArr2[i5] = (char) (random.nextInt(128) + 55296);
                        i = i5;
                    }
                }
                i5++;
                i = i5;
            }
        } else {
            throw new IllegalArgumentException("The chars array must not be empty");
        }
    }

    public static String c(int i, boolean z, boolean z2) {
        return a(i, 0, 0, z, z2);
    }

    public static String d(int i) {
        return c(i, true, false);
    }

    public static String e(int i, int i2) {
        return d(c.a(i, i2));
    }

    public static String f(int i) {
        return c(i, false, true);
    }
}
