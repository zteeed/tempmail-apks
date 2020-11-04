package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f2923b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private ParcelFileDescriptor f2924c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f2925d;

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f2926e = null;

    /* renamed from: f  reason: collision with root package name */
    private File f2927f;

    @SafeParcelable.Constructor
    BitmapTeleporter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) int i2) {
        this.f2923b = i;
        this.f2924c = parcelFileDescriptor;
        this.f2925d = i2;
    }

    private static void u(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("BitmapTeleporter", "Could not close stream", e2);
        }
    }

    private final FileOutputStream v() {
        File file = this.f2927f;
        if (file != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.f2924c = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e2) {
                throw new IllegalStateException("Could not create temporary file", e2);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f2924c == null) {
            Bitmap bitmap = this.f2926e;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(v()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                u(dataOutputStream);
            } catch (IOException e2) {
                throw new IllegalStateException("Could not write into unlinked file", e2);
            } catch (Throwable th) {
                u(dataOutputStream);
                throw th;
            }
        }
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f2923b);
        SafeParcelWriter.r(parcel, 2, this.f2924c, i | 1, false);
        SafeParcelWriter.l(parcel, 3, this.f2925d);
        SafeParcelWriter.b(parcel, a2);
        this.f2924c = null;
    }
}
