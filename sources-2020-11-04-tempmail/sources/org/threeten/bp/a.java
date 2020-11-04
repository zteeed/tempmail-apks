package org.threeten.bp;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.bp.format.DateTimeParseException;

/* compiled from: Period */
public final class a extends org.threeten.bp.b.a implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15262e = new a(0, 0, 0);

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f15263f = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private static final long serialVersionUID = -8290556941213247973L;

    /* renamed from: b  reason: collision with root package name */
    private final int f15264b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15265c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15266d;

    private a(int i, int i2, int i3) {
        this.f15264b = i;
        this.f15265c = i2;
        this.f15266d = i3;
    }

    private static a a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return f15262e;
        }
        return new a(i, i2, i3);
    }

    public static a c(CharSequence charSequence) {
        org.threeten.bp.c.a.a(charSequence, "text");
        Matcher matcher = f15263f.matcher(charSequence);
        if (matcher.matches()) {
            int i = 1;
            if ("-".equals(matcher.group(1))) {
                i = -1;
            }
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            String group4 = matcher.group(5);
            if (!(group == null && group2 == null && group3 == null && group4 == null)) {
                try {
                    return a(d(charSequence, group, i), d(charSequence, group2, i), org.threeten.bp.c.a.b(d(charSequence, group4, i), org.threeten.bp.c.a.c(d(charSequence, group3, i), 7)));
                } catch (NumberFormatException e2) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e2));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    private static int d(CharSequence charSequence, String str, int i) {
        if (str == null) {
            return 0;
        }
        try {
            return org.threeten.bp.c.a.c(Integer.parseInt(str), i);
        } catch (ArithmeticException e2) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e2));
        }
    }

    private Object readResolve() {
        return ((this.f15264b | this.f15265c) | this.f15266d) == 0 ? f15262e : this;
    }

    public int b() {
        return this.f15266d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f15264b == aVar.f15264b && this.f15265c == aVar.f15265c && this.f15266d == aVar.f15266d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f15264b + Integer.rotateLeft(this.f15265c, 8) + Integer.rotateLeft(this.f15266d, 16);
    }

    public String toString() {
        if (this == f15262e) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.f15264b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f15265c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f15266d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
