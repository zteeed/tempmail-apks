package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

final class m extends l<ParcelFileDescriptor> {
    m(q qVar, com.google.android.play.core.tasks.m<ParcelFileDescriptor> mVar) {
        super(qVar, mVar);
    }

    public final void s3(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.s3(bundle, bundle2);
        this.f11320b.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
