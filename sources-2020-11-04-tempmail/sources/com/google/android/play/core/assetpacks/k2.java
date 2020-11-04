package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

final class k2 {
    private static final a h = new a("SliceMetadataManager");

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f11313a = new byte[8192];

    /* renamed from: b  reason: collision with root package name */
    private final b0 f11314b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11315c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11316d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11317e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11318f;
    private int g;

    k2(b0 b0Var, String str, int i, long j, String str2) {
        this.f11314b = b0Var;
        this.f11315c = str;
        this.f11316d = i;
        this.f11317e = j;
        this.f11318f = str2;
        this.g = 0;
    }

    private final File l() {
        File y = this.f11314b.y(this.f11315c, this.f11316d, this.f11317e, this.f11318f);
        if (!y.exists()) {
            y.mkdirs();
        }
        return y;
    }

    private final File m() throws IOException {
        File n = this.f11314b.n(this.f11315c, this.f11316d, this.f11317e, this.f11318f);
        n.getParentFile().mkdirs();
        n.createNewFile();
        return n;
    }

    /* access modifiers changed from: package-private */
    public final j2 a() throws IOException {
        File n = this.f11314b.n(this.f11315c, this.f11316d, this.f11317e, this.f11318f);
        if (n.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(n);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new v0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new i0(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e2) {
                    throw new v0("Slice checkpoint file corrupt.", (Exception) e2);
                }
            } catch (Throwable th) {
                x.a(th, th);
            }
        } else {
            throw new v0("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(h().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    public final void c(InputStream inputStream, long j) throws IOException {
        int read;
        File h2 = h();
        h2.getParentFile().mkdirs();
        RandomAccessFile randomAccessFile = new RandomAccessFile(h2, "rw");
        randomAccessFile.seek(j);
        do {
            read = inputStream.read(this.f11313a);
            if (read > 0) {
                randomAccessFile.write(this.f11313a, 0, read);
            }
        } while (read == this.f11313a.length);
        randomAccessFile.close();
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    public final void e(byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        File l = l();
        int i = this.g;
        this.g = i + 1;
        try {
            fileOutputStream = new FileOutputStream(new File(l, String.format("%s-LFH.dat", new Object[]{Integer.valueOf(i)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e2) {
            throw new v0("Could not write metadata file.", (Exception) e2);
        } catch (Throwable th) {
            x.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void f(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
        File s = this.f11314b.s(this.f11315c, this.f11316d, this.f11317e, this.f11318f);
        if (s.exists()) {
            s.delete();
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(s);
        fileOutputStream2.write(bArr);
        fileOutputStream2.close();
    }

    /* access modifiers changed from: package-private */
    public final void g(byte[] bArr, InputStream inputStream) throws IOException {
        File l = l();
        int i = this.g;
        this.g = i + 1;
        FileOutputStream fileOutputStream = new FileOutputStream(new File(l, String.format("%s-NAM.dat", new Object[]{Integer.valueOf(i)})));
        fileOutputStream.write(bArr);
        int read = inputStream.read(this.f11313a);
        while (read > 0) {
            fileOutputStream.write(this.f11313a, 0, read);
            read = inputStream.read(this.f11313a);
        }
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    public final File h() {
        return new File(l(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.g - 1)}));
    }

    /* access modifiers changed from: package-private */
    public final void i(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    public final int j() throws IOException {
        File n = this.f11314b.n(this.f11315c, this.f11316d, this.f11317e, this.f11318f);
        if (!n.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(n);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
            return -1;
        }
        if (properties.getProperty("previousChunk") != null) {
            return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
        }
        throw new v0("Slice checkpoint file corrupt.");
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        File n = this.f11314b.n(this.f11315c, this.f11316d, this.f11317e, this.f11318f);
        if (n.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(n);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                h.e("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (IOException e2) {
                h.e("Could not read checkpoint while checking if extraction finished. %s", e2);
            }
        }
        return false;
    }
}
