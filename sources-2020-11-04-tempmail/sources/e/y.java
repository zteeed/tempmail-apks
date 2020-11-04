package e;

import e.m0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: Headers */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f14785a;

    /* compiled from: Headers */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<String> f14786a = new ArrayList(20);

        public a a(String str, String str2) {
            y.a(str);
            y.b(str2, str);
            d(str, str2);
            return this;
        }

        public a b(y yVar) {
            int h = yVar.h();
            for (int i = 0; i < h; i++) {
                d(yVar.e(i), yVar.i(i));
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public a c(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                d(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                d("", str.substring(1));
                return this;
            } else {
                d("", str);
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        public a d(String str, String str2) {
            this.f14786a.add(str);
            this.f14786a.add(str2.trim());
            return this;
        }

        public a e(String str, String str2) {
            y.a(str);
            d(str, str2);
            return this;
        }

        public y f() {
            return new y(this);
        }

        public a g(String str) {
            int i = 0;
            while (i < this.f14786a.size()) {
                if (str.equalsIgnoreCase(this.f14786a.get(i))) {
                    this.f14786a.remove(i);
                    this.f14786a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a h(String str, String str2) {
            y.a(str);
            y.b(str2, str);
            g(str);
            d(str, str2);
            return this;
        }
    }

    y(a aVar) {
        List<String> list = aVar.f14786a;
        this.f14785a = (String[]) list.toArray(new String[list.size()]);
    }

    static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(e.p("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(e.p("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    @Nullable
    private static String d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static y g(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                a(str);
                b(str2, str);
            }
            return new y(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    @Nullable
    public String c(String str) {
        return d(this.f14785a, str);
    }

    public String e(int i) {
        return this.f14785a[i * 2];
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof y) && Arrays.equals(((y) obj).f14785a, this.f14785a);
    }

    public a f() {
        a aVar = new a();
        Collections.addAll(aVar.f14786a, this.f14785a);
        return aVar;
    }

    public int h() {
        return this.f14785a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14785a);
    }

    public String i(int i) {
        return this.f14785a[(i * 2) + 1];
    }

    public List<String> j(String str) {
        int h = h();
        ArrayList arrayList = null;
        for (int i = 0; i < h; i++) {
            if (str.equalsIgnoreCase(e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int h = h();
        for (int i = 0; i < h; i++) {
            sb.append(e(i));
            sb.append(": ");
            sb.append(i(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    private y(String[] strArr) {
        this.f14785a = strArr;
    }
}
