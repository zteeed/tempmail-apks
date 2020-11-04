package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zam implements Parcelable.Creator<ResolveAccountRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                account = (Account) SafeParcelReader.o(parcel, C, Account.CREATOR);
            } else if (v == 3) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.o(parcel, C, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
