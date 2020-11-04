package com.google.zxing.s.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* compiled from: BeepManager */
public final class b {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f11747d = "b";

    /* renamed from: a  reason: collision with root package name */
    private final Context f11748a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11749b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11750c = false;

    /* compiled from: BeepManager */
    class a implements MediaPlayer.OnCompletionListener {
        a(b bVar) {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    /* renamed from: com.google.zxing.s.a.b$b  reason: collision with other inner class name */
    /* compiled from: BeepManager */
    class C0115b implements MediaPlayer.OnErrorListener {
        C0115b(b bVar) {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String a2 = b.f11747d;
            Log.w(a2, "Failed to beep " + i + ", " + i2);
            mediaPlayer.stop();
            mediaPlayer.release();
            return true;
        }
    }

    public b(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f11748a = activity.getApplicationContext();
    }

    public MediaPlayer b() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new a(this));
        mediaPlayer.setOnErrorListener(new C0115b(this));
        try {
            openRawResourceFd = this.f11748a.getResources().openRawResourceFd(i.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e2) {
            Log.w(f11747d, e2);
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void c() {
        Vibrator vibrator;
        if (this.f11749b) {
            b();
        }
        if (this.f11750c && (vibrator = (Vibrator) this.f11748a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200);
        }
    }

    public void d(boolean z) {
        this.f11749b = z;
    }
}
