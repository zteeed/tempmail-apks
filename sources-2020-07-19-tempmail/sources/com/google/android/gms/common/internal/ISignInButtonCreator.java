package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface ISignInButtonCreator extends IInterface {
    IObjectWrapper Q2(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig) throws RemoteException;
}
