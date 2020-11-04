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
    private static final String[] f15154e = new String[0];
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f15155b = 0;

    /* renamed from: c  reason: collision with root package name */
    String[] f15156c;

    /* renamed from: d  reason: collision with root package name */
    String[] f15157d;

    /* compiled from: Attributes */
    class a implements Iterator<a> {

        /* renamed from: b  reason: collision with root package name */
        int f15158b = 0;

        a() {
        }

        /* renamed from: b */
        public a next() {
            b bVar = b.this;
            String[] strArr = bVar.f15156c;
            int i = this.f15158b;
            a aVar = new a(strArr[i], bVar.f15157d[i], bVar);
            this.f15158b++;
            return aVar;
        }

        public boolean hasNext() {
            return this.f15158b < b.this.f15155b;
        }

        public void remove() {
            b bVar = b.this;
            int i = this.f15158b - 1;
            this.f15158b = i;
            bVar.b0(i);
        }
    }

    public b() {
        String[] strArr = f15154e;
        this.f15156c = strArr;
        this.f15157d = strArr;
    }

    private int W(String str) {
        c.i(str);
        for (int i = 0; i < this.f15155b; i++) {
            if (str.equalsIgnoreCase(this.f15156c[i])) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public void b0(int i) {
        c.b(i >= this.f15155b);
        int i2 = (this.f15155b - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f15156c;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.f15157d;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.f15155b - 1;
        this.f15155b = i4;
        this.f15156c[i4] = null;
        this.f15157d[i4] = null;
    }

    private void j(String str, String str2) {
        s(this.f15155b + 1);
        String[] strArr = this.f15156c;
        int i = this.f15155b;
        strArr[i] = str;
        this.f15157d[i] = str2;
        this.f15155b = i + 1;
    }

    private void s(int i) {
        c.d(i >= this.f15155b);
        int length = this.f15156c.length;
        if (length < i) {
            int i2 = 4;
            if (length >= 4) {
                i2 = this.f15155b * 2;
            }
            if (i <= i2) {
                i = i2;
            }
            this.f15156c = z(this.f15156c, i);
            this.f15157d = z(this.f15157d, i);
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
        return w(this.f15157d[V]);
    }

    public String F(String str) {
        int W = W(str);
        if (W == -1) {
            return "";
        }
        return w(this.f15157d[W]);
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
        int i = this.f15155b;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f15156c[i2];
            String str2 = this.f15157d[i2];
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
        for (int i = 0; i < this.f15155b; i++) {
            if (str.equals(this.f15156c[i])) {
                return i;
            }
        }
        return -1;
    }

    public void X() {
        for (int i = 0; i < this.f15155b; i++) {
            String[] strArr = this.f15156c;
            strArr[i] = org.jsoup.c.a.a(strArr[i]);
        }
    }

    public b Y(String str, String str2) {
        int V = V(str);
        if (V != -1) {
            this.f15157d[V] = str2;
        } else {
            j(str, str2);
        }
        return this;
    }

    public b Z(a aVar) {
        c.i(aVar);
        Y(aVar.getKey(), aVar.getValue());
        aVar.f15153d = this;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a0(String str, String str2) {
        int W = W(str);
        if (W != -1) {
            this.f15157d[W] = str2;
            if (!this.f15156c[W].equals(str)) {
                this.f15156c[W] = str;
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
        if (this.f15155b == bVar.f15155b && Arrays.equals(this.f15156c, bVar.f15156c)) {
            return Arrays.equals(this.f15157d, bVar.f15157d);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f15155b * 31) + Arrays.hashCode(this.f15156c)) * 31) + Arrays.hashCode(this.f15157d);
    }

    public Iterator<a> iterator() {
        return new a();
    }

    public void l(b bVar) {
        if (bVar.size() != 0) {
            s(this.f15155b + bVar.f15155b);
            Iterator<a> it = bVar.iterator();
            while (it.hasNext()) {
                Z(it.next());
            }
        }
    }

    public int size() {
        return this.f15155b;
    }

    public String toString() {
        return Q();
    }

    /* renamed from: y */
    public b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f15155b = this.f15155b;
            this.f15156c = z(this.f15156c, this.f15155b);
            this.f15157d = z(this.f15157d, this.f15155b);
            return bVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
