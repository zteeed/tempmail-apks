package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

public interface zabd {
    void B(int i);

    void H(Bundle bundle);

    void V(ConnectionResult connectionResult, Api<?> api, boolean z);

    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T W(T t);

    void X();

    void connect();

    boolean disconnect();
}
