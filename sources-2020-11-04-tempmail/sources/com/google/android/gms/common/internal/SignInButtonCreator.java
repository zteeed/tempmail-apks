package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

public final class SignInButtonCreator extends RemoteCreator<ISignInButtonCreator> {

    /* renamed from: c  reason: collision with root package name */
    private static final SignInButtonCreator f3218c = new SignInButtonCreator();

    private SignInButtonCreator() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        return f3218c.e(context, i, i2);
    }

    private final View e(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, (Scope[]) null);
            return (View) ObjectWrapper.V(((ISignInButtonCreator) b(context)).c3(ObjectWrapper.h0(context), signInButtonConfig));
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e2);
        }
    }

    /* renamed from: d */
    public final ISignInButtonCreator a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof ISignInButtonCreator) {
            return (ISignInButtonCreator) queryLocalInterface;
        }
        return new zah(iBinder);
    }
}
