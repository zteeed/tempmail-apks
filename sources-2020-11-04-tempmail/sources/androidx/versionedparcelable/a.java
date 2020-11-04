package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel */
class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f2015d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f2016e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2017f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a.e.a(), new a.e.a(), new a.e.a());
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f2016e.writeInt(bArr.length);
            this.f2016e.writeByteArray(bArr);
            return;
        }
        this.f2016e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2016e, 0);
    }

    public void E(int i2) {
        this.f2016e.writeInt(i2);
    }

    public void G(Parcelable parcelable) {
        this.f2016e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f2016e.writeString(str);
    }

    public void a() {
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.f2015d.get(i2);
            int dataPosition = this.f2016e.dataPosition();
            this.f2016e.setDataPosition(i3);
            this.f2016e.writeInt(dataPosition - i3);
            this.f2016e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public VersionedParcel b() {
        Parcel parcel = this.f2016e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f2017f) {
            i2 = this.g;
        }
        int i3 = i2;
        return new a(parcel, dataPosition, i3, this.h + "  ", this.f2012a, this.f2013b, this.f2014c);
    }

    public boolean g() {
        return this.f2016e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f2016e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2016e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2016e);
    }

    public boolean m(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f2016e.setDataPosition(this.j);
            int readInt = this.f2016e.readInt();
            this.k = this.f2016e.readInt();
            this.j += readInt;
        }
        if (this.k == i2) {
            return true;
        }
        return false;
    }

    public int o() {
        return this.f2016e.readInt();
    }

    public <T extends Parcelable> T q() {
        return this.f2016e.readParcelable(a.class.getClassLoader());
    }

    public String s() {
        return this.f2016e.readString();
    }

    public void w(int i2) {
        a();
        this.i = i2;
        this.f2015d.put(i2, this.f2016e.dataPosition());
        E(0);
        E(i2);
    }

    public void y(boolean z) {
        this.f2016e.writeInt(z ? 1 : 0);
    }

    private a(Parcel parcel, int i2, int i3, String str, a.e.a<String, Method> aVar, a.e.a<String, Method> aVar2, a.e.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2015d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f2016e = parcel;
        this.f2017f = i2;
        this.g = i3;
        this.j = i2;
        this.h = str;
    }
}
