package org.jsoup.e;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;
import org.jsoup.UncheckedIOException;
import org.jsoup.b.c;

/* compiled from: CharacterReader */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f14627a;

    /* renamed from: b  reason: collision with root package name */
    private final Reader f14628b;

    /* renamed from: c  reason: collision with root package name */
    private int f14629c;

    /* renamed from: d  reason: collision with root package name */
    private int f14630d;

    /* renamed from: e  reason: collision with root package name */
    private int f14631e;

    /* renamed from: f  reason: collision with root package name */
    private int f14632f;
    private int g;
    private final String[] h;

    public a(Reader reader, int i) {
        this.h = new String[AdRequest.MAX_CONTENT_URL_LENGTH];
        c.i(reader);
        c.d(reader.markSupported());
        this.f14628b = reader;
        this.f14627a = new char[(i > 32768 ? 32768 : i)];
        b();
    }

    static boolean G(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    private void b() {
        int i = this.f14631e;
        if (i >= this.f14630d) {
            try {
                this.f14628b.skip((long) i);
                this.f14628b.mark(32768);
                int read = this.f14628b.read(this.f14627a);
                this.f14628b.reset();
                if (read != -1) {
                    this.f14629c = read;
                    this.f14632f += this.f14631e;
                    this.f14631e = 0;
                    this.g = 0;
                    if (read > 24576) {
                        read = 24576;
                    }
                    this.f14630d = read;
                }
            } catch (IOException e2) {
                throw new UncheckedIOException(e2);
            }
        }
    }

    private static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        int length = i5 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        } else if (G(cArr, i, i2, str)) {
            return str;
        } else {
            String str3 = new String(cArr, i, i2);
            strArr[length] = str3;
            return str3;
        }
    }

    private boolean s() {
        return this.f14631e >= this.f14629c;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        char c2;
        if (!r() && (c2 = this.f14627a[this.f14631e]) >= '0' && c2 <= '9') {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean B(String str) {
        b();
        int length = str.length();
        if (length > this.f14629c - this.f14631e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f14627a[this.f14631e + i])) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        if (r()) {
            return false;
        }
        char c2 = this.f14627a[this.f14631e];
        if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int D(char c2) {
        b();
        for (int i = this.f14631e; i < this.f14629c; i++) {
            if (c2 == this.f14627a[i]) {
                return i - this.f14631e;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int E(CharSequence charSequence) {
        b();
        char charAt = charSequence.charAt(0);
        int i = this.f14631e;
        while (i < this.f14629c) {
            int i2 = 1;
            if (charAt != this.f14627a[i]) {
                do {
                    i++;
                    if (i >= this.f14629c) {
                        break;
                    }
                } while (charAt == this.f14627a[i]);
            }
            int i3 = i + 1;
            int length = (charSequence.length() + i3) - 1;
            int i4 = this.f14629c;
            if (i < i4 && length <= i4) {
                int i5 = i3;
                while (i5 < length && charSequence.charAt(i2) == this.f14627a[i5]) {
                    i5++;
                    i2++;
                }
                if (i5 == length) {
                    return i - this.f14631e;
                }
            }
            i = i3;
        }
        return -1;
    }

    public int F() {
        return this.f14632f + this.f14631e;
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.f14631e = this.g;
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.f14631e--;
    }

    public void a() {
        this.f14631e++;
    }

    /* access modifiers changed from: package-private */
    public char d() {
        b();
        char c2 = s() ? 65535 : this.f14627a[this.f14631e];
        this.f14631e++;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        char c2;
        b();
        int i = this.f14631e;
        int i2 = this.f14629c;
        char[] cArr = this.f14627a;
        while (true) {
            int i3 = this.f14631e;
            if (i3 >= i2 || (c2 = cArr[i3]) == '&' || c2 == '<' || c2 == 0) {
                int i4 = this.f14631e;
            } else {
                this.f14631e = i3 + 1;
            }
        }
        int i42 = this.f14631e;
        return i42 > i ? c(this.f14627a, this.h, i, i42 - i) : "";
    }

    /* access modifiers changed from: package-private */
    public String f() {
        char c2;
        b();
        int i = this.f14631e;
        while (true) {
            int i2 = this.f14631e;
            if (i2 < this.f14629c && (c2 = this.f14627a[i2]) >= '0' && c2 <= '9') {
                this.f14631e = i2 + 1;
            }
        }
        return c(this.f14627a, this.h, i, this.f14631e - i);
    }

    /* access modifiers changed from: package-private */
    public String g() {
        char c2;
        b();
        int i = this.f14631e;
        while (true) {
            int i2 = this.f14631e;
            if (i2 < this.f14629c && (((c2 = this.f14627a[i2]) >= '0' && c2 <= '9') || ((c2 >= 'A' && c2 <= 'F') || (c2 >= 'a' && c2 <= 'f')))) {
                this.f14631e++;
            }
        }
        return c(this.f14627a, this.h, i, this.f14631e - i);
    }

    /* access modifiers changed from: package-private */
    public String h() {
        char c2;
        b();
        int i = this.f14631e;
        while (true) {
            int i2 = this.f14631e;
            if (i2 < this.f14629c && (((c2 = this.f14627a[i2]) >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2)))) {
                this.f14631e++;
            }
        }
        return c(this.f14627a, this.h, i, this.f14631e - i);
    }

    /* access modifiers changed from: package-private */
    public String i() {
        char c2;
        b();
        int i = this.f14631e;
        while (true) {
            int i2 = this.f14631e;
            if (i2 < this.f14629c && (((c2 = this.f14627a[i2]) >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2)))) {
                this.f14631e++;
            }
        }
        while (!s() && (r1 = this.f14627a[r2]) >= '0' && r1 <= '9') {
            this.f14631e = (r2 = this.f14631e) + 1;
        }
        return c(this.f14627a, this.h, i, this.f14631e - i);
    }

    /* access modifiers changed from: package-private */
    public String j() {
        char c2;
        b();
        int i = this.f14631e;
        int i2 = this.f14629c;
        char[] cArr = this.f14627a;
        while (true) {
            int i3 = this.f14631e;
            if (i3 >= i2 || (c2 = cArr[i3]) == 9 || c2 == 10 || c2 == 13 || c2 == 12 || c2 == ' ' || c2 == '/' || c2 == '>' || c2 == 0) {
                int i4 = this.f14631e;
            } else {
                this.f14631e = i3 + 1;
            }
        }
        int i42 = this.f14631e;
        return i42 > i ? c(this.f14627a, this.h, i, i42 - i) : "";
    }

    public String k(char c2) {
        int D = D(c2);
        if (D == -1) {
            return o();
        }
        String c3 = c(this.f14627a, this.h, this.f14631e, D);
        this.f14631e += D;
        return c3;
    }

    /* access modifiers changed from: package-private */
    public String l(String str) {
        int E = E(str);
        if (E == -1) {
            return o();
        }
        String c2 = c(this.f14627a, this.h, this.f14631e, E);
        this.f14631e += E;
        return c2;
    }

    public String m(char... cArr) {
        b();
        int i = this.f14631e;
        int i2 = this.f14629c;
        char[] cArr2 = this.f14627a;
        loop0:
        while (this.f14631e < i2) {
            for (char c2 : cArr) {
                if (cArr2[this.f14631e] == c2) {
                    break loop0;
                }
            }
            this.f14631e++;
        }
        int i3 = this.f14631e;
        return i3 > i ? c(this.f14627a, this.h, i, i3 - i) : "";
    }

    /* access modifiers changed from: package-private */
    public String n(char... cArr) {
        b();
        int i = this.f14631e;
        int i2 = this.f14629c;
        char[] cArr2 = this.f14627a;
        while (true) {
            int i3 = this.f14631e;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                int i4 = this.f14631e;
            } else {
                this.f14631e++;
            }
        }
        int i42 = this.f14631e;
        return i42 > i ? c(this.f14627a, this.h, i, i42 - i) : "";
    }

    /* access modifiers changed from: package-private */
    public String o() {
        b();
        char[] cArr = this.f14627a;
        String[] strArr = this.h;
        int i = this.f14631e;
        String c2 = c(cArr, strArr, i, this.f14629c - i);
        this.f14631e = this.f14629c;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public boolean p(String str) {
        return E(str.toLowerCase(Locale.ENGLISH)) > -1 || E(str.toUpperCase(Locale.ENGLISH)) > -1;
    }

    public char q() {
        b();
        if (s()) {
            return 65535;
        }
        return this.f14627a[this.f14631e];
    }

    public boolean r() {
        b();
        return this.f14631e >= this.f14629c;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.g = this.f14631e;
    }

    public String toString() {
        char[] cArr = this.f14627a;
        int i = this.f14631e;
        return new String(cArr, i, this.f14629c - i);
    }

    /* access modifiers changed from: package-private */
    public boolean u(String str) {
        b();
        if (!x(str)) {
            return false;
        }
        this.f14631e += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean v(String str) {
        if (!B(str)) {
            return false;
        }
        this.f14631e += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean w(char c2) {
        return !r() && this.f14627a[this.f14631e] == c2;
    }

    /* access modifiers changed from: package-private */
    public boolean x(String str) {
        b();
        int length = str.length();
        if (length > this.f14629c - this.f14631e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f14627a[this.f14631e + i]) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean y(char... cArr) {
        if (r()) {
            return false;
        }
        b();
        char c2 = this.f14627a[this.f14631e];
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean z(char[] cArr) {
        b();
        return !r() && Arrays.binarySearch(cArr, this.f14627a[this.f14631e]) >= 0;
    }

    public a(Reader reader) {
        this(reader, 32768);
    }

    public a(String str) {
        this(new StringReader(str), str.length());
    }
}
