package b.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import b.b.x;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

final class d0 extends AsyncTask<String, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2093a = false;

    /* renamed from: b  reason: collision with root package name */
    Map<String, String> f2094b;

    /* renamed from: c  reason: collision with root package name */
    String f2095c;

    /* renamed from: d  reason: collision with root package name */
    private String f2096d = "";

    /* renamed from: e  reason: collision with root package name */
    private boolean f2097e = false;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Context> f2098f;
    private URL g;
    private boolean h;
    private HttpURLConnection i;
    private boolean j;

    d0(Context context, boolean z) {
        this.f2098f = new WeakReference<>(context);
        this.h = true;
        this.j = true;
        this.f2093a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String doInBackground(String... strArr) {
        if (this.f2093a) {
            return null;
        }
        try {
            this.g = new URL(strArr[0]);
            if (this.h) {
                h0.m().d(this.g.toString(), this.f2095c);
                int length = this.f2095c.getBytes("UTF-8").length;
                StringBuilder sb = new StringBuilder("call = ");
                sb.append(this.g);
                sb.append("; size = ");
                sb.append(length);
                sb.append(" byte");
                sb.append(length > 1 ? "s" : "");
                sb.append("; body = ");
                sb.append(this.f2095c);
                x.a.b(sb.toString());
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.g.openConnection();
            this.i = httpURLConnection;
            httpURLConnection.setReadTimeout(30000);
            this.i.setConnectTimeout(30000);
            this.i.setRequestMethod("POST");
            this.i.setDoInput(true);
            this.i.setDoOutput(true);
            this.i.setRequestProperty("Content-Type", AbstractSpiCall.ACCEPT_JSON_VALUE);
            OutputStream outputStream = this.i.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(this.f2095c);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            this.i.connect();
            int responseCode = this.i.getResponseCode();
            if (this.j) {
                i.e();
                this.f2096d = i.P(this.i);
            }
            if (this.h) {
                h0.m().n(this.g.toString(), responseCode, this.f2096d);
            }
            if (responseCode == 200) {
                e.c("Status 200 ok");
                Context context = this.f2098f.get();
                if (this.g.toString().startsWith(o.a(i.C)) && context != null) {
                    SharedPreferences.Editor edit = i.M(context).edit();
                    edit.putBoolean("sentRegisterRequestToAF", true);
                    edit.apply();
                    e.a("Successfully registered for Uninstall Tracking");
                }
            } else {
                this.f2097e = true;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Error while calling ");
            sb2.append(this.g.toString());
            e.b(sb2.toString(), th);
            this.f2097e = true;
        }
        return this.f2096d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void onPostExecute(String str) {
        if (this.f2097e) {
            e.c("Connection error: ".concat(String.valueOf(str)));
        } else {
            e.c("Connection call succeeded: ".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.h = false;
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f2095c == null) {
            this.f2095c = new JSONObject(this.f2094b).toString();
        }
    }
}
