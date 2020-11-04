package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.a;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final int[] f1432b;

    /* renamed from: c  reason: collision with root package name */
    final int f1433c;

    /* renamed from: d  reason: collision with root package name */
    final int f1434d;

    /* renamed from: e  reason: collision with root package name */
    final String f1435e;

    /* renamed from: f  reason: collision with root package name */
    final int f1436f;
    final int g;
    final CharSequence h;
    final int i;
    final CharSequence j;
    final ArrayList<String> k;
    final ArrayList<String> l;
    final boolean m;

    /* compiled from: BackStackRecord */
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
        int size = aVar.f1472b.size();
        this.f1432b = new int[(size * 6)];
        if (aVar.i) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                a.C0043a aVar2 = aVar.f1472b.get(i3);
                int[] iArr = this.f1432b;
                int i4 = i2 + 1;
                iArr[i2] = aVar2.f1477a;
                int i5 = i4 + 1;
                Fragment fragment = aVar2.f1478b;
                iArr[i4] = fragment != null ? fragment.f1441f : -1;
                int[] iArr2 = this.f1432b;
                int i6 = i5 + 1;
                iArr2[i5] = aVar2.f1479c;
                int i7 = i6 + 1;
                iArr2[i6] = aVar2.f1480d;
                int i8 = i7 + 1;
                iArr2[i7] = aVar2.f1481e;
                i2 = i8 + 1;
                iArr2[i8] = aVar2.f1482f;
            }
            this.f1433c = aVar.g;
            this.f1434d = aVar.h;
            this.f1435e = aVar.k;
            this.f1436f = aVar.m;
            this.g = aVar.n;
            this.h = aVar.o;
            this.i = aVar.p;
            this.j = aVar.q;
            this.k = aVar.r;
            this.l = aVar.s;
            this.m = aVar.t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(h hVar) {
        a aVar = new a(hVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f1432b.length) {
            a.C0043a aVar2 = new a.C0043a();
            int i4 = i2 + 1;
            aVar2.f1477a = this.f1432b[i2];
            if (h.F) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f1432b[i4]);
            }
            int i5 = i4 + 1;
            int i6 = this.f1432b[i4];
            if (i6 >= 0) {
                aVar2.f1478b = hVar.f1500f.get(i6);
            } else {
                aVar2.f1478b = null;
            }
            int[] iArr = this.f1432b;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.f1479c = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f1480d = i10;
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            aVar2.f1481e = i12;
            int i13 = iArr[i11];
            aVar2.f1482f = i13;
            aVar.f1473c = i8;
            aVar.f1474d = i10;
            aVar.f1475e = i12;
            aVar.f1476f = i13;
            aVar.l(aVar2);
            i3++;
            i2 = i11 + 1;
        }
        aVar.g = this.f1433c;
        aVar.h = this.f1434d;
        aVar.k = this.f1435e;
        aVar.m = this.f1436f;
        aVar.i = true;
        aVar.n = this.g;
        aVar.o = this.h;
        aVar.p = this.i;
        aVar.q = this.j;
        aVar.r = this.k;
        aVar.s = this.l;
        aVar.t = this.m;
        aVar.m(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1432b);
        parcel.writeInt(this.f1433c);
        parcel.writeInt(this.f1434d);
        parcel.writeString(this.f1435e);
        parcel.writeInt(this.f1436f);
        parcel.writeInt(this.g);
        TextUtils.writeToParcel(this.h, parcel, 0);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeStringList(this.k);
        parcel.writeStringList(this.l);
        parcel.writeInt(this.m ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f1432b = parcel.createIntArray();
        this.f1433c = parcel.readInt();
        this.f1434d = parcel.readInt();
        this.f1435e = parcel.readString();
        this.f1436f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.createStringArrayList();
        this.l = parcel.createStringArrayList();
        this.m = parcel.readInt() != 0;
    }
}
