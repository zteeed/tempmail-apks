package b.b;

final class f0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private b f2105a = this;

    enum a {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native"),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "io.flutter.plugin.common.MethodChannel.MethodCallHandler");
        
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f2109b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f2110c;

        private a(String str, String str2) {
            this.f2109b = str;
            this.f2110c = str2;
        }
    }

    interface b {
        Class<?> a(String str) throws ClassNotFoundException;
    }

    f0() {
    }

    private boolean c(String str) {
        try {
            this.f2105a.a(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            e.e(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            e.b(th.getMessage(), th);
            return false;
        }
    }

    public final Class<?> a(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        for (a aVar : a.values()) {
            if (c(aVar.f2110c)) {
                return aVar.f2109b;
            }
        }
        return a.DEFAULT.f2109b;
    }
}
