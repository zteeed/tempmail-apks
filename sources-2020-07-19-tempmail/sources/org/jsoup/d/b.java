package org.jsoup.d;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.jsoup.SerializationException;
import org.jsoup.b.c;
import org.jsoup.d.f;

/* compiled from: Attributes */
public class b implements Iterable<a>, Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f14585e = new String[0];
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f14586b = 0;

    /* renamed from: c  reason: collision with root package name */
    String[] f14587c;

    /* renamed from: d  reason: collision with root package name */
    String[] f14588d;

    /* compiled from: Attributes */
    class a implements Iterator<a> {

        /* renamed from: b  reason: collision with root package name */
        int f14589b = 0;

        a() {
        }

        /* renamed from: b */
        public a next() {
            b bVar = b.this;
            String[] strArr = bVar.f14587c;
            int i = this.f14589b;
            a aVar = new a(strArr[i], bVar.f14588d[i], bVar);
            this.f14589b++;
            return aVar;
        }

        public boolean hasNext() {
            return this.f14589b < b.this.f14586b;
        }

        public void remove() {
            b bVar = b.this;
            int i = this.f14589b - 1;
            this.f14589b = i;
            bVar.b0(i);
        }
    }

    public b() {
        String[] strArr = f14585e;
        this.f14587c = strArr;
        this.f14588d = strArr;
    }

    private int W(String str) {
        c.i(str);
        for (int i = 0; i < this.f14586b; i++) {
            if (str.equalsIgnoreCase(this.f14587c[i])) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public void b0(int i) {
        c.b(i >= this.f14586b);
        int i2 = (this.f14586b - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f14587c;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.f14588d;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.f14586b - 1;
        this.f14586b = i4;
        this.f14587c[i4] = null;
        this.f14588d[i4] = null;
    }

    private void j(String str, String str2) {
        s(this.f14586b + 1);
        String[] strArr = this.f14587c;
        int i = this.f14586b;
        strArr[i] = str;
        this.f14588d[i] = str2;
        this.f14586b = i + 1;
    }

    private void s(int i) {
        c.d(i >= this.f14586b);
        int length = this.f14587c.length;
        if (length < i) {
            int i2 = 4;
            if (length >= 4) {
                i2 = this.f14586b * 2;
            }
            if (i <= i2) {
                i = i2;
            }
            this.f14587c = z(this.f14587c, i);
            this.f14588d = z(this.f14588d, i);
        }
    }

    static String w(String str) {
        return str == null ? "" : str;
    }

    private static String[] z(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    public String C(String str) {
        int V = V(str);
        if (V == -1) {
            return "";
        }
        return w(this.f14588d[V]);
    }

    public String F(String str) {
        int W = W(str);
        if (W == -1) {
            return "";
        }
        return w(this.f14588d[W]);
    }

    public boolean M(String str) {
        return V(str) != -1;
    }

    public boolean P(String str) {
        return W(str) != -1;
    }

    public String Q() {
        StringBuilder sb = new StringBuilder();
        try {
            U(sb, new f("").s0());
            return sb.toString();
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void U(Appendable appendable, f.a aVar) throws IOException {
        int i = this.f14586b;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f14587c[i2];
            String str2 = this.f14588d[i2];
            appendable.append(' ').append(str);
            if (!a.k(str, str2, aVar)) {
                appendable.append("=\"");
                if (str2 == null) {
                    str2 = "";
                }
                i.e(appendable, str2, aVar, true, false, false);
                appendable.append('\"');
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int V(String str) {
        c.i(str);
        for (int i = 0; i < this.f14586b; i++) {
            if (str.equals(this.f14587c[i])) {
                return i;
            }
        }
        return -1;
    }

    public void X() {
        for (int i = 0; i < this.f14586b; i++) {
            String[] strArr = this.f14587c;
            strArr[i] = org.jsoup.c.a.a(strArr[i]);
        }
    }

    public b Y(String str, String str2) {
        int V = V(str);
        if (V != -1) {
            this.f14588d[V] = str2;
        } else {
            j(str, str2);
        }
        return this;
    }

    public b Z(a aVar) {
        c.i(aVar);
        Y(aVar.getKey(), aVar.getValue());
        aVar.f14584d = this;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a0(String str, String str2) {
        int W = W(str);
        if (W != -1) {
            this.f14588d[W] = str2;
            if (!this.f14587c[W].equals(str)) {
                this.f14587c[W] = str;
                return;
            }
            return;
        }
        j(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f14586b == bVar.f14586b && Arrays.equals(this.f14587c, bVar.f14587c)) {
            return Arrays.equals(this.f14588d, bVar.f14588d);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14586b * 31) + Arrays.hashCode(this.f14587c)) * 31) + Arrays.hashCode(this.f14588d);
    }

    public Iterator<a> iterator() {
        return new a();
    }

    public void l(b bVar) {
        if (bVar.size() != 0) {
            s(this.f14586b + bVar.f14586b);
            Iterator<a> it = bVar.iterator();
            while (it.hasNext()) {
                Z(it.next());
            }
        }
    }

    public int size() {
        return this.f14586b;
    }

    public String toString() {
        return Q();
    }

    /* renamed from: y */
    public b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f14586b = this.f14586b;
            this.f14587c = z(this.f14587c, this.f14586b);
            this.f14588d = z(this.f14588d, this.f14586b);
            return bVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
