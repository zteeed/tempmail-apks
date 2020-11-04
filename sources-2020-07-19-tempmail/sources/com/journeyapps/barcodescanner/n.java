package com.journeyapps.barcodescanner;

/* compiled from: Size */
public class n implements Comparable<n> {

    /* renamed from: b  reason: collision with root package name */
    public final int f12198b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12199c;

    public n(int i, int i2) {
        this.f12198b = i;
        this.f12199c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f12198b == nVar.f12198b && this.f12199c == nVar.f12199c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int compareTo(n nVar) {
        int i = this.f12199c * this.f12198b;
        int i2 = nVar.f12199c * nVar.f12198b;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public n g() {
        return new n(this.f12199c, this.f12198b);
    }

    public n h(n nVar) {
        int i = this.f12198b;
        int i2 = nVar.f12199c;
        int i3 = i * i2;
        int i4 = nVar.f12198b;
        int i5 = this.f12199c;
        if (i3 <= i4 * i5) {
            return new n(i4, (i5 * i4) / i);
        }
        return new n((i * i2) / i5, i2);
    }

    public int hashCode() {
        return (this.f12198b * 31) + this.f12199c;
    }

    public n k(n nVar) {
        int i = this.f12198b;
        int i2 = nVar.f12199c;
        int i3 = i * i2;
        int i4 = nVar.f12198b;
        int i5 = this.f12199c;
        if (i3 >= i4 * i5) {
            return new n(i4, (i5 * i4) / i);
        }
        return new n((i * i2) / i5, i2);
    }

    public String toString() {
        return this.f12198b + "x" + this.f12199c;
    }
}
