package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.b;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.f.a;
import java.io.IOException;

public final class AutoCrashlyticsReportEncoder implements a {
    public static final int CODEGEN_VERSION = 1;
    public static final a CONFIG = new AutoCrashlyticsReportEncoder();

    private static final class CrashlyticsReportCustomAttributeEncoder implements b<CrashlyticsReport.CustomAttribute> {
        static final CrashlyticsReportCustomAttributeEncoder INSTANCE = new CrashlyticsReportCustomAttributeEncoder();

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        public void encode(CrashlyticsReport.CustomAttribute customAttribute, c cVar) throws IOException {
            cVar.f("key", customAttribute.getKey());
            cVar.f("value", customAttribute.getValue());
        }
    }

    private static final class CrashlyticsReportEncoder implements b<CrashlyticsReport> {
        static final CrashlyticsReportEncoder INSTANCE = new CrashlyticsReportEncoder();

        private CrashlyticsReportEncoder() {
        }

        public void encode(CrashlyticsReport crashlyticsReport, c cVar) throws IOException {
            cVar.f("sdkVersion", crashlyticsReport.getSdkVersion());
            cVar.f("gmpAppId", crashlyticsReport.getGmpAppId());
            cVar.c("platform", crashlyticsReport.getPlatform());
            cVar.f("installationUuid", crashlyticsReport.getInstallationUuid());
            cVar.f("buildVersion", crashlyticsReport.getBuildVersion());
            cVar.f("displayVersion", crashlyticsReport.getDisplayVersion());
            cVar.f("session", crashlyticsReport.getSession());
            cVar.f("ndkPayload", crashlyticsReport.getNdkPayload());
        }
    }

    private static final class CrashlyticsReportFilesPayloadEncoder implements b<CrashlyticsReport.FilesPayload> {
        static final CrashlyticsReportFilesPayloadEncoder INSTANCE = new CrashlyticsReportFilesPayloadEncoder();

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        public void encode(CrashlyticsReport.FilesPayload filesPayload, c cVar) throws IOException {
            cVar.f("files", filesPayload.getFiles());
            cVar.f("orgId", filesPayload.getOrgId());
        }
    }

    private static final class CrashlyticsReportFilesPayloadFileEncoder implements b<CrashlyticsReport.FilesPayload.File> {
        static final CrashlyticsReportFilesPayloadFileEncoder INSTANCE = new CrashlyticsReportFilesPayloadFileEncoder();

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        public void encode(CrashlyticsReport.FilesPayload.File file, c cVar) throws IOException {
            cVar.f("filename", file.getFilename());
            cVar.f("contents", file.getContents());
        }
    }

    private static final class CrashlyticsReportSessionApplicationEncoder implements b<CrashlyticsReport.Session.Application> {
        static final CrashlyticsReportSessionApplicationEncoder INSTANCE = new CrashlyticsReportSessionApplicationEncoder();

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Application application, c cVar) throws IOException {
            cVar.f("identifier", application.getIdentifier());
            cVar.f("version", application.getVersion());
            cVar.f("displayVersion", application.getDisplayVersion());
            cVar.f("organization", application.getOrganization());
            cVar.f("installationUuid", application.getInstallationUuid());
        }
    }

    private static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements b<CrashlyticsReport.Session.Application.Organization> {
        static final CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = new CrashlyticsReportSessionApplicationOrganizationEncoder();

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Application.Organization organization, c cVar) throws IOException {
            cVar.f("clsId", organization.getClsId());
        }
    }

    private static final class CrashlyticsReportSessionDeviceEncoder implements b<CrashlyticsReport.Session.Device> {
        static final CrashlyticsReportSessionDeviceEncoder INSTANCE = new CrashlyticsReportSessionDeviceEncoder();

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Device device, c cVar) throws IOException {
            cVar.c("arch", device.getArch());
            cVar.f("model", device.getModel());
            cVar.c("cores", device.getCores());
            cVar.b("ram", device.getRam());
            cVar.b("diskSpace", device.getDiskSpace());
            cVar.a("simulator", device.isSimulator());
            cVar.c("state", device.getState());
            cVar.f("manufacturer", device.getManufacturer());
            cVar.f("modelClass", device.getModelClass());
        }
    }

    private static final class CrashlyticsReportSessionEncoder implements b<CrashlyticsReport.Session> {
        static final CrashlyticsReportSessionEncoder INSTANCE = new CrashlyticsReportSessionEncoder();

        private CrashlyticsReportSessionEncoder() {
        }

        public void encode(CrashlyticsReport.Session session, c cVar) throws IOException {
            cVar.f("generator", session.getGenerator());
            cVar.f("identifier", session.getIdentifierUtf8Bytes());
            cVar.b("startedAt", session.getStartedAt());
            cVar.f("endedAt", session.getEndedAt());
            cVar.a("crashed", session.isCrashed());
            cVar.f("app", session.getApp());
            cVar.f("user", session.getUser());
            cVar.f("os", session.getOs());
            cVar.f("device", session.getDevice());
            cVar.f("events", session.getEvents());
            cVar.c("generatorType", session.getGeneratorType());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationEncoder implements b<CrashlyticsReport.Session.Event.Application> {
        static final CrashlyticsReportSessionEventApplicationEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationEncoder();

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Application application, c cVar) throws IOException {
            cVar.f("execution", application.getExecution());
            cVar.f("customAttributes", application.getCustomAttributes());
            cVar.f("background", application.getBackground());
            cVar.c("uiOrientation", application.getUiOrientation());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements b<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, c cVar) throws IOException {
            cVar.b("baseAddress", binaryImage.getBaseAddress());
            cVar.b("size", binaryImage.getSize());
            cVar.f(AnalyticsConnectorReceiver.EVENT_NAME_KEY, binaryImage.getName());
            cVar.f("uuid", binaryImage.getUuidUtf8Bytes());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements b<CrashlyticsReport.Session.Event.Application.Execution> {
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, c cVar) throws IOException {
            cVar.f("threads", execution.getThreads());
            cVar.f("exception", execution.getException());
            cVar.f("signal", execution.getSignal());
            cVar.f("binaries", execution.getBinaries());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements b<CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, c cVar) throws IOException {
            cVar.f("type", exception.getType());
            cVar.f("reason", exception.getReason());
            cVar.f("frames", exception.getFrames());
            cVar.f("causedBy", exception.getCausedBy());
            cVar.c("overflowCount", exception.getOverflowCount());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements b<CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, c cVar) throws IOException {
            cVar.f(AnalyticsConnectorReceiver.EVENT_NAME_KEY, signal.getName());
            cVar.f("code", signal.getCode());
            cVar.b("address", signal.getAddress());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements b<CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, c cVar) throws IOException {
            cVar.f(AnalyticsConnectorReceiver.EVENT_NAME_KEY, thread.getName());
            cVar.c("importance", thread.getImportance());
            cVar.f("frames", thread.getFrames());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements b<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, c cVar) throws IOException {
            cVar.b("pc", frame.getPc());
            cVar.f("symbol", frame.getSymbol());
            cVar.f("file", frame.getFile());
            cVar.b("offset", frame.getOffset());
            cVar.c("importance", frame.getImportance());
        }
    }

    private static final class CrashlyticsReportSessionEventDeviceEncoder implements b<CrashlyticsReport.Session.Event.Device> {
        static final CrashlyticsReportSessionEventDeviceEncoder INSTANCE = new CrashlyticsReportSessionEventDeviceEncoder();

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Device device, c cVar) throws IOException {
            cVar.f("batteryLevel", device.getBatteryLevel());
            cVar.c("batteryVelocity", device.getBatteryVelocity());
            cVar.a("proximityOn", device.isProximityOn());
            cVar.c("orientation", device.getOrientation());
            cVar.b("ramUsed", device.getRamUsed());
            cVar.b("diskUsed", device.getDiskUsed());
        }
    }

    private static final class CrashlyticsReportSessionEventEncoder implements b<CrashlyticsReport.Session.Event> {
        static final CrashlyticsReportSessionEventEncoder INSTANCE = new CrashlyticsReportSessionEventEncoder();

        private CrashlyticsReportSessionEventEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event event, c cVar) throws IOException {
            cVar.b("timestamp", event.getTimestamp());
            cVar.f("type", event.getType());
            cVar.f("app", event.getApp());
            cVar.f("device", event.getDevice());
            cVar.f("log", event.getLog());
        }
    }

    private static final class CrashlyticsReportSessionEventLogEncoder implements b<CrashlyticsReport.Session.Event.Log> {
        static final CrashlyticsReportSessionEventLogEncoder INSTANCE = new CrashlyticsReportSessionEventLogEncoder();

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        public void encode(CrashlyticsReport.Session.Event.Log log, c cVar) throws IOException {
            cVar.f("content", log.getContent());
        }
    }

    private static final class CrashlyticsReportSessionOperatingSystemEncoder implements b<CrashlyticsReport.Session.OperatingSystem> {
        static final CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = new CrashlyticsReportSessionOperatingSystemEncoder();

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, c cVar) throws IOException {
            cVar.c("platform", operatingSystem.getPlatform());
            cVar.f("version", operatingSystem.getVersion());
            cVar.f("buildVersion", operatingSystem.getBuildVersion());
            cVar.a("jailbroken", operatingSystem.isJailbroken());
        }
    }

    private static final class CrashlyticsReportSessionUserEncoder implements b<CrashlyticsReport.Session.User> {
        static final CrashlyticsReportSessionUserEncoder INSTANCE = new CrashlyticsReportSessionUserEncoder();

        private CrashlyticsReportSessionUserEncoder() {
        }

        public void encode(CrashlyticsReport.Session.User user, c cVar) throws IOException {
            cVar.f("identifier", user.getIdentifier());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    public void configure(com.google.firebase.encoders.f.b<?> bVar) {
        bVar.a(CrashlyticsReport.class, CrashlyticsReportEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport.class, CrashlyticsReportEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.class, CrashlyticsReportSessionEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session.class, CrashlyticsReportSessionEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Application.class, CrashlyticsReportSessionApplicationEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Application.class, CrashlyticsReportSessionApplicationEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Application.Organization.class, CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Application_Organization.class, CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.User.class, CrashlyticsReportSessionUserEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_User.class, CrashlyticsReportSessionUserEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.OperatingSystem.class, CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Device.class, CrashlyticsReportSessionDeviceEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Device.class, CrashlyticsReportSessionDeviceEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.class, CrashlyticsReportSessionEventEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event.class, CrashlyticsReportSessionEventEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Application.class, CrashlyticsReportSessionEventApplicationEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application.class, CrashlyticsReportSessionEventApplicationEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.class, CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.CustomAttribute.class, CrashlyticsReportCustomAttributeEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_CustomAttribute.class, CrashlyticsReportCustomAttributeEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Device.class, CrashlyticsReportSessionEventDeviceEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Device.class, CrashlyticsReportSessionEventDeviceEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.Session.Event.Log.class, CrashlyticsReportSessionEventLogEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Log.class, CrashlyticsReportSessionEventLogEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.FilesPayload.class, CrashlyticsReportFilesPayloadEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_FilesPayload.class, CrashlyticsReportFilesPayloadEncoder.INSTANCE);
        bVar.a(CrashlyticsReport.FilesPayload.File.class, CrashlyticsReportFilesPayloadFileEncoder.INSTANCE);
        bVar.a(AutoValue_CrashlyticsReport_FilesPayload_File.class, CrashlyticsReportFilesPayloadFileEncoder.INSTANCE);
    }
}
