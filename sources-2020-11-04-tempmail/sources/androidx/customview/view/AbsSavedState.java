package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final AbsSavedState f1421c = new AbsSavedState() {
    };

    /* renamed from: b  reason: collision with root package name */
    private final Parcelable f1422b;

    static class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        a() {
        }

        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f1421c;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    public final Parcelable a() {
        return this.f1422b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1422b, i);
    }

    private AbsSavedState() {
        this.f1422b = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1422b = parcelable == f1421c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1422b = readParcelable == null ? f1421c : readParcelable;
    }
}
