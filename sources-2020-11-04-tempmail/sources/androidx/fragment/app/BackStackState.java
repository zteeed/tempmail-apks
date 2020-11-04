package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.q;
import androidx.lifecycle.g;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final int[] f1463b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<String> f1464c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f1465d;

    /* renamed from: e  reason: collision with root package name */
    final int[] f1466e;

    /* renamed from: f  reason: collision with root package name */
    final int f1467f;
    final String g;
    final int h;
    final int i;
    final CharSequence j;
    final int k;
    final CharSequence l;
    final ArrayList<String> m;
    final ArrayList<String> n;
    final boolean o;

    static class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(a aVar) {
        int size = aVar.f1572a.size();
        this.f1463b = new int[(size * 5)];
        if (aVar.g) {
            this.f1464c = new ArrayList<>(size);
            this.f1465d = new int[size];
            this.f1466e = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                q.a aVar2 = aVar.f1572a.get(i2);
                int i4 = i3 + 1;
                this.f1463b[i3] = aVar2.f1578a;
                ArrayList<String> arrayList = this.f1464c;
                Fragment fragment = aVar2.f1579b;
                arrayList.add(fragment != null ? fragment.f1472f : null);
                int[] iArr = this.f1463b;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1580c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1581d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f1582e;
                iArr[i7] = aVar2.f1583f;
                this.f1465d[i2] = aVar2.g.ordinal();
                this.f1466e[i2] = aVar2.h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f1467f = aVar.f1577f;
            this.g = aVar.i;
            this.h = aVar.t;
            this.i = aVar.j;
            this.j = aVar.k;
            this.k = aVar.l;
            this.l = aVar.m;
            this.m = aVar.n;
            this.n = aVar.o;
            this.o = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(k kVar) {
        a aVar = new a(kVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f1463b.length) {
            q.a aVar2 = new q.a();
            int i4 = i2 + 1;
            aVar2.f1578a = this.f1463b[i2];
            if (k.r0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f1463b[i4]);
            }
            String str = this.f1464c.get(i3);
            if (str != null) {
                aVar2.f1579b = kVar.X(str);
            } else {
                aVar2.f1579b = null;
            }
            aVar2.g = g.b.values()[this.f1465d[i3]];
            aVar2.h = g.b.values()[this.f1466e[i3]];
            int[] iArr = this.f1463b;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.f1580c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.f1581d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f1582e = i10;
            int i11 = iArr[i9];
            aVar2.f1583f = i11;
            aVar.f1573b = i6;
            aVar.f1574c = i8;
            aVar.f1575d = i10;
            aVar.f1576e = i11;
            aVar.e(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f1577f = this.f1467f;
        aVar.i = this.g;
        aVar.t = this.h;
        aVar.g = true;
        aVar.j = this.i;
        aVar.k = this.j;
        aVar.l = this.k;
        aVar.m = this.l;
        aVar.n = this.m;
        aVar.o = this.n;
        aVar.p = this.o;
        aVar.t(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1463b);
        parcel.writeStringList(this.f1464c);
        parcel.writeIntArray(this.f1465d);
        parcel.writeIntArray(this.f1466e);
        parcel.writeInt(this.f1467f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f1463b = parcel.createIntArray();
        this.f1464c = parcel.createStringArrayList();
        this.f1465d = parcel.createIntArray();
        this.f1466e = parcel.createIntArray();
        this.f1467f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }
}
