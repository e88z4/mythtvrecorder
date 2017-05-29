
package mythtvapi.myth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mythtvapi.myth package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LabelValue_QNAME = new QName("http://mythtv.org", "LabelValue");
    private final static QName _StorageGroupDirList_QNAME = new QName("http://mythtv.org", "StorageGroupDirList");
    private final static QName _DatabaseInfo_QNAME = new QName("http://mythtv.org", "DatabaseInfo");
    private final static QName _TimeZoneInfo_QNAME = new QName("http://mythtv.org", "TimeZoneInfo");
    private final static QName _ArrayOfLabelValue_QNAME = new QName("http://mythtv.org", "ArrayOfLabelValue");
    private final static QName _StorageGroupDir_QNAME = new QName("http://mythtv.org", "StorageGroupDir");
    private final static QName _LogInfo_QNAME = new QName("http://mythtv.org", "LogInfo");
    private final static QName _ArrayOfStorageGroupDir_QNAME = new QName("http://mythtv.org", "ArrayOfStorageGroupDir");
    private final static QName _ArrayOfFrontend_QNAME = new QName("http://mythtv.org", "ArrayOfFrontend");
    private final static QName _BackendInfo_QNAME = new QName("http://mythtv.org", "BackendInfo");
    private final static QName _MapOfStringString_QNAME = new QName("http://mythtv.org", "MapOfStringString");
    private final static QName _Frontend_QNAME = new QName("http://mythtv.org", "Frontend");
    private final static QName _LogMessage_QNAME = new QName("http://mythtv.org", "LogMessage");
    private final static QName _ArrayOfString_QNAME = new QName("http://mythtv.org", "ArrayOfString");
    private final static QName _BuildInfo_QNAME = new QName("http://mythtv.org", "BuildInfo");
    private final static QName _VersionInfo_QNAME = new QName("http://mythtv.org", "VersionInfo");
    private final static QName _FrontendList_QNAME = new QName("http://mythtv.org", "FrontendList");
    private final static QName _SettingList_QNAME = new QName("http://mythtv.org", "SettingList");
    private final static QName _WOLInfo_QNAME = new QName("http://mythtv.org", "WOLInfo");
    private final static QName _LogMessageList_QNAME = new QName("http://mythtv.org", "LogMessageList");
    private final static QName _EnvInfo_QNAME = new QName("http://mythtv.org", "EnvInfo");
    private final static QName _ArrayOfLogMessage_QNAME = new QName("http://mythtv.org", "ArrayOfLogMessage");
    private final static QName _ConnectionInfo_QNAME = new QName("http://mythtv.org", "ConnectionInfo");
    private final static QName _BackupDatabaseResponseBackupDatabaseResult_QNAME = new QName("http://mythtv.org", "BackupDatabaseResult");
    private final static QName _GetFormatDateShortDate_QNAME = new QName("http://mythtv.org", "ShortDate");
    private final static QName _GetFormatDateDate_QNAME = new QName("http://mythtv.org", "Date");
    private final static QName _GetSettingResponseGetSettingResult_QNAME = new QName("http://mythtv.org", "GetSettingResult");
    private final static QName _SendNotificationMessage_QNAME = new QName("http://mythtv.org", "Message");
    private final static QName _SendNotificationAddress_QNAME = new QName("http://mythtv.org", "Address");
    private final static QName _SendNotificationTimeout_QNAME = new QName("http://mythtv.org", "Timeout");
    private final static QName _SendNotificationPriority_QNAME = new QName("http://mythtv.org", "Priority");
    private final static QName _SendNotificationOrigin_QNAME = new QName("http://mythtv.org", "Origin");
    private final static QName _SendNotificationProgress_QNAME = new QName("http://mythtv.org", "Progress");
    private final static QName _SendNotificationDescription_QNAME = new QName("http://mythtv.org", "Description");
    private final static QName _SendNotificationImage_QNAME = new QName("http://mythtv.org", "Image");
    private final static QName _SendNotificationUdpPort_QNAME = new QName("http://mythtv.org", "udpPort");
    private final static QName _SendNotificationError_QNAME = new QName("http://mythtv.org", "Error");
    private final static QName _SendNotificationProgressText_QNAME = new QName("http://mythtv.org", "ProgressText");
    private final static QName _SendNotificationExtra_QNAME = new QName("http://mythtv.org", "Extra");
    private final static QName _SendNotificationType_QNAME = new QName("http://mythtv.org", "Type");
    private final static QName _SendNotificationFullscreen_QNAME = new QName("http://mythtv.org", "Fullscreen");
    private final static QName _SendNotificationVisibility_QNAME = new QName("http://mythtv.org", "Visibility");
    private final static QName _CheckDatabaseResponseCheckDatabaseResult_QNAME = new QName("http://mythtv.org", "CheckDatabaseResult");
    private final static QName _LogMessageTime_QNAME = new QName("http://mythtv.org", "Time");
    private final static QName _BackendInfoLog_QNAME = new QName("http://mythtv.org", "Log");
    private final static QName _BackendInfoBuild_QNAME = new QName("http://mythtv.org", "Build");
    private final static QName _BackendInfoEnv_QNAME = new QName("http://mythtv.org", "Env");
    private final static QName _GetLogsResponseGetLogsResult_QNAME = new QName("http://mythtv.org", "GetLogsResult");
    private final static QName _GetHostsResponseGetHostsResult_QNAME = new QName("http://mythtv.org", "GetHostsResult");
    private final static QName _PutSettingHostName_QNAME = new QName("http://mythtv.org", "HostName");
    private final static QName _PutSettingKey_QNAME = new QName("http://mythtv.org", "Key");
    private final static QName _PutSettingValue_QNAME = new QName("http://mythtv.org", "Value");
    private final static QName _ProfileSubmitResponseProfileSubmitResult_QNAME = new QName("http://mythtv.org", "ProfileSubmitResult");
    private final static QName _GetFormatDateTimeDateTime_QNAME = new QName("http://mythtv.org", "DateTime");
    private final static QName _ChangePasswordNewPassword_QNAME = new QName("http://mythtv.org", "NewPassword");
    private final static QName _ChangePasswordUserName_QNAME = new QName("http://mythtv.org", "UserName");
    private final static QName _ChangePasswordOldPassword_QNAME = new QName("http://mythtv.org", "OldPassword");
    private final static QName _GetFormatTimeResponseGetFormatTimeResult_QNAME = new QName("http://mythtv.org", "GetFormatTimeResult");
    private final static QName _RemoveStorageGroupDirDirName_QNAME = new QName("http://mythtv.org", "DirName");
    private final static QName _RemoveStorageGroupDirGroupName_QNAME = new QName("http://mythtv.org", "GroupName");
    private final static QName _GetConnectionInfoPin_QNAME = new QName("http://mythtv.org", "Pin");
    private final static QName _RemoveStorageGroupDirResponseRemoveStorageGroupDirResult_QNAME = new QName("http://mythtv.org", "RemoveStorageGroupDirResult");
    private final static QName _GetFrontendsOnLine_QNAME = new QName("http://mythtv.org", "OnLine");
    private final static QName _GetBackendInfoResponseGetBackendInfoResult_QNAME = new QName("http://mythtv.org", "GetBackendInfoResult");
    private final static QName _ProfileDeleteResponseProfileDeleteResult_QNAME = new QName("http://mythtv.org", "ProfileDeleteResult");
    private final static QName _GetFormatDateTimeResponseGetFormatDateTimeResult_QNAME = new QName("http://mythtv.org", "GetFormatDateTimeResult");
    private final static QName _GetLogsLine_QNAME = new QName("http://mythtv.org", "Line");
    private final static QName _GetLogsFunction_QNAME = new QName("http://mythtv.org", "Function");
    private final static QName _GetLogsToTime_QNAME = new QName("http://mythtv.org", "ToTime");
    private final static QName _GetLogsApplication_QNAME = new QName("http://mythtv.org", "Application");
    private final static QName _GetLogsFromTime_QNAME = new QName("http://mythtv.org", "FromTime");
    private final static QName _GetLogsTID_QNAME = new QName("http://mythtv.org", "TID");
    private final static QName _GetLogsThread_QNAME = new QName("http://mythtv.org", "Thread");
    private final static QName _GetLogsMsgContains_QNAME = new QName("http://mythtv.org", "MsgContains");
    private final static QName _GetLogsFilename_QNAME = new QName("http://mythtv.org", "Filename");
    private final static QName _GetLogsPID_QNAME = new QName("http://mythtv.org", "PID");
    private final static QName _GetLogsLevel_QNAME = new QName("http://mythtv.org", "Level");
    private final static QName _TestDBSettingsDbPort_QNAME = new QName("http://mythtv.org", "dbPort");
    private final static QName _TestDBSettingsPassword_QNAME = new QName("http://mythtv.org", "Password");
    private final static QName _TestDBSettingsDBName_QNAME = new QName("http://mythtv.org", "DBName");
    private final static QName _AddStorageGroupDirResponseAddStorageGroupDirResult_QNAME = new QName("http://mythtv.org", "AddStorageGroupDirResult");
    private final static QName _ProfileTextResponseProfileTextResult_QNAME = new QName("http://mythtv.org", "ProfileTextResult");
    private final static QName _GetSettingDefault_QNAME = new QName("http://mythtv.org", "Default");
    private final static QName _GetFrontendsResponseGetFrontendsResult_QNAME = new QName("http://mythtv.org", "GetFrontendsResult");
    private final static QName _GetTimeZoneResponseGetTimeZoneResult_QNAME = new QName("http://mythtv.org", "GetTimeZoneResult");
    private final static QName _GetHostNameResponseGetHostNameResult_QNAME = new QName("http://mythtv.org", "GetHostNameResult");
    private final static QName _GetKeysResponseGetKeysResult_QNAME = new QName("http://mythtv.org", "GetKeysResult");
    private final static QName _SendMessageResponseSendMessageResult_QNAME = new QName("http://mythtv.org", "SendMessageResult");
    private final static QName _PutSettingResponsePutSettingResult_QNAME = new QName("http://mythtv.org", "PutSettingResult");
    private final static QName _ChangePasswordResponseChangePasswordResult_QNAME = new QName("http://mythtv.org", "ChangePasswordResult");
    private final static QName _GetConnectionInfoResponseGetConnectionInfoResult_QNAME = new QName("http://mythtv.org", "GetConnectionInfoResult");
    private final static QName _CheckDatabaseRepair_QNAME = new QName("http://mythtv.org", "Repair");
    private final static QName _TimeZoneInfoCurrentDateTime_QNAME = new QName("http://mythtv.org", "CurrentDateTime");
    private final static QName _GetFormatDateResponseGetFormatDateResult_QNAME = new QName("http://mythtv.org", "GetFormatDateResult");
    private final static QName _ProfileUpdatedResponseProfileUpdatedResult_QNAME = new QName("http://mythtv.org", "ProfileUpdatedResult");
    private final static QName _GetSettingListResponseGetSettingListResult_QNAME = new QName("http://mythtv.org", "GetSettingListResult");
    private final static QName _ParseISODateStringResponseParseISODateStringResult_QNAME = new QName("http://mythtv.org", "ParseISODateStringResult");
    private final static QName _ConnectionInfoVersion_QNAME = new QName("http://mythtv.org", "Version");
    private final static QName _ConnectionInfoWOL_QNAME = new QName("http://mythtv.org", "WOL");
    private final static QName _ConnectionInfoDatabase_QNAME = new QName("http://mythtv.org", "Database");
    private final static QName _ProfileURLResponseProfileURLResult_QNAME = new QName("http://mythtv.org", "ProfileURLResult");
    private final static QName _GetStorageGroupDirsResponseGetStorageGroupDirsResult_QNAME = new QName("http://mythtv.org", "GetStorageGroupDirsResult");
    private final static QName _SendNotificationResponseSendNotificationResult_QNAME = new QName("http://mythtv.org", "SendNotificationResult");
    private final static QName _TestDBSettingsResponseTestDBSettingsResult_QNAME = new QName("http://mythtv.org", "TestDBSettingsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mythtvapi.myth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MapOfStringString }
     * 
     */
    public MapOfStringString createMapOfStringString() {
        return new MapOfStringString();
    }

    /**
     * Create an instance of {@link GetFormatDateResponse }
     * 
     */
    public GetFormatDateResponse createGetFormatDateResponse() {
        return new GetFormatDateResponse();
    }

    /**
     * Create an instance of {@link LabelValue }
     * 
     */
    public LabelValue createLabelValue() {
        return new LabelValue();
    }

    /**
     * Create an instance of {@link DatabaseInfo }
     * 
     */
    public DatabaseInfo createDatabaseInfo() {
        return new DatabaseInfo();
    }

    /**
     * Create an instance of {@link PutSettingResponse }
     * 
     */
    public PutSettingResponse createPutSettingResponse() {
        return new PutSettingResponse();
    }

    /**
     * Create an instance of {@link GetBackendInfo }
     * 
     */
    public GetBackendInfo createGetBackendInfo() {
        return new GetBackendInfo();
    }

    /**
     * Create an instance of {@link GetConnectionInfo }
     * 
     */
    public GetConnectionInfo createGetConnectionInfo() {
        return new GetConnectionInfo();
    }

    /**
     * Create an instance of {@link ProfileUpdated }
     * 
     */
    public ProfileUpdated createProfileUpdated() {
        return new ProfileUpdated();
    }

    /**
     * Create an instance of {@link GetSettingResponse }
     * 
     */
    public GetSettingResponse createGetSettingResponse() {
        return new GetSettingResponse();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link FrontendList }
     * 
     */
    public FrontendList createFrontendList() {
        return new FrontendList();
    }

    /**
     * Create an instance of {@link ProfileURLResponse }
     * 
     */
    public ProfileURLResponse createProfileURLResponse() {
        return new ProfileURLResponse();
    }

    /**
     * Create an instance of {@link GetStorageGroupDirs }
     * 
     */
    public GetStorageGroupDirs createGetStorageGroupDirs() {
        return new GetStorageGroupDirs();
    }

    /**
     * Create an instance of {@link GetFormatTime }
     * 
     */
    public GetFormatTime createGetFormatTime() {
        return new GetFormatTime();
    }

    /**
     * Create an instance of {@link RemoveStorageGroupDirResponse }
     * 
     */
    public RemoveStorageGroupDirResponse createRemoveStorageGroupDirResponse() {
        return new RemoveStorageGroupDirResponse();
    }

    /**
     * Create an instance of {@link GetFormatDateTime }
     * 
     */
    public GetFormatDateTime createGetFormatDateTime() {
        return new GetFormatDateTime();
    }

    /**
     * Create an instance of {@link GetSettingListResponse }
     * 
     */
    public GetSettingListResponse createGetSettingListResponse() {
        return new GetSettingListResponse();
    }

    /**
     * Create an instance of {@link SettingList }
     * 
     */
    public SettingList createSettingList() {
        return new SettingList();
    }

    /**
     * Create an instance of {@link ProfileUpdatedResponse }
     * 
     */
    public ProfileUpdatedResponse createProfileUpdatedResponse() {
        return new ProfileUpdatedResponse();
    }

    /**
     * Create an instance of {@link GetHostNameResponse }
     * 
     */
    public GetHostNameResponse createGetHostNameResponse() {
        return new GetHostNameResponse();
    }

    /**
     * Create an instance of {@link GetLogsResponse }
     * 
     */
    public GetLogsResponse createGetLogsResponse() {
        return new GetLogsResponse();
    }

    /**
     * Create an instance of {@link LogMessageList }
     * 
     */
    public LogMessageList createLogMessageList() {
        return new LogMessageList();
    }

    /**
     * Create an instance of {@link TestDBSettings }
     * 
     */
    public TestDBSettings createTestDBSettings() {
        return new TestDBSettings();
    }

    /**
     * Create an instance of {@link GetTimeZone }
     * 
     */
    public GetTimeZone createGetTimeZone() {
        return new GetTimeZone();
    }

    /**
     * Create an instance of {@link WOLInfo }
     * 
     */
    public WOLInfo createWOLInfo() {
        return new WOLInfo();
    }

    /**
     * Create an instance of {@link AddStorageGroupDirResponse }
     * 
     */
    public AddStorageGroupDirResponse createAddStorageGroupDirResponse() {
        return new AddStorageGroupDirResponse();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link ProfileSubmit }
     * 
     */
    public ProfileSubmit createProfileSubmit() {
        return new ProfileSubmit();
    }

    /**
     * Create an instance of {@link GetStorageGroupDirsResponse }
     * 
     */
    public GetStorageGroupDirsResponse createGetStorageGroupDirsResponse() {
        return new GetStorageGroupDirsResponse();
    }

    /**
     * Create an instance of {@link StorageGroupDirList }
     * 
     */
    public StorageGroupDirList createStorageGroupDirList() {
        return new StorageGroupDirList();
    }

    /**
     * Create an instance of {@link BackupDatabaseResponse }
     * 
     */
    public BackupDatabaseResponse createBackupDatabaseResponse() {
        return new BackupDatabaseResponse();
    }

    /**
     * Create an instance of {@link GetFormatTimeResponse }
     * 
     */
    public GetFormatTimeResponse createGetFormatTimeResponse() {
        return new GetFormatTimeResponse();
    }

    /**
     * Create an instance of {@link GetSettingList }
     * 
     */
    public GetSettingList createGetSettingList() {
        return new GetSettingList();
    }

    /**
     * Create an instance of {@link GetConnectionInfoResponse }
     * 
     */
    public GetConnectionInfoResponse createGetConnectionInfoResponse() {
        return new GetConnectionInfoResponse();
    }

    /**
     * Create an instance of {@link ConnectionInfo }
     * 
     */
    public ConnectionInfo createConnectionInfo() {
        return new ConnectionInfo();
    }

    /**
     * Create an instance of {@link GetFrontendsResponse }
     * 
     */
    public GetFrontendsResponse createGetFrontendsResponse() {
        return new GetFrontendsResponse();
    }

    /**
     * Create an instance of {@link RemoveStorageGroupDir }
     * 
     */
    public RemoveStorageGroupDir createRemoveStorageGroupDir() {
        return new RemoveStorageGroupDir();
    }

    /**
     * Create an instance of {@link GetHostsResponse }
     * 
     */
    public GetHostsResponse createGetHostsResponse() {
        return new GetHostsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetKeysResponse }
     * 
     */
    public GetKeysResponse createGetKeysResponse() {
        return new GetKeysResponse();
    }

    /**
     * Create an instance of {@link SendNotification }
     * 
     */
    public SendNotification createSendNotification() {
        return new SendNotification();
    }

    /**
     * Create an instance of {@link ProfileDeleteResponse }
     * 
     */
    public ProfileDeleteResponse createProfileDeleteResponse() {
        return new ProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link TestDBSettingsResponse }
     * 
     */
    public TestDBSettingsResponse createTestDBSettingsResponse() {
        return new TestDBSettingsResponse();
    }

    /**
     * Create an instance of {@link CheckDatabase }
     * 
     */
    public CheckDatabase createCheckDatabase() {
        return new CheckDatabase();
    }

    /**
     * Create an instance of {@link GetBackendInfoResponse }
     * 
     */
    public GetBackendInfoResponse createGetBackendInfoResponse() {
        return new GetBackendInfoResponse();
    }

    /**
     * Create an instance of {@link BackendInfo }
     * 
     */
    public BackendInfo createBackendInfo() {
        return new BackendInfo();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link PutSetting }
     * 
     */
    public PutSetting createPutSetting() {
        return new PutSetting();
    }

    /**
     * Create an instance of {@link GetFormatDate }
     * 
     */
    public GetFormatDate createGetFormatDate() {
        return new GetFormatDate();
    }

    /**
     * Create an instance of {@link ProfileURL }
     * 
     */
    public ProfileURL createProfileURL() {
        return new ProfileURL();
    }

    /**
     * Create an instance of {@link GetLogs }
     * 
     */
    public GetLogs createGetLogs() {
        return new GetLogs();
    }

    /**
     * Create an instance of {@link ProfileDelete }
     * 
     */
    public ProfileDelete createProfileDelete() {
        return new ProfileDelete();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ArrayOfLabelValue }
     * 
     */
    public ArrayOfLabelValue createArrayOfLabelValue() {
        return new ArrayOfLabelValue();
    }

    /**
     * Create an instance of {@link AddStorageGroupDir }
     * 
     */
    public AddStorageGroupDir createAddStorageGroupDir() {
        return new AddStorageGroupDir();
    }

    /**
     * Create an instance of {@link StorageGroupDir }
     * 
     */
    public StorageGroupDir createStorageGroupDir() {
        return new StorageGroupDir();
    }

    /**
     * Create an instance of {@link GetSetting }
     * 
     */
    public GetSetting createGetSetting() {
        return new GetSetting();
    }

    /**
     * Create an instance of {@link TimeZoneInfo }
     * 
     */
    public TimeZoneInfo createTimeZoneInfo() {
        return new TimeZoneInfo();
    }

    /**
     * Create an instance of {@link CheckDatabaseResponse }
     * 
     */
    public CheckDatabaseResponse createCheckDatabaseResponse() {
        return new CheckDatabaseResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFrontend }
     * 
     */
    public ArrayOfFrontend createArrayOfFrontend() {
        return new ArrayOfFrontend();
    }

    /**
     * Create an instance of {@link GetHosts }
     * 
     */
    public GetHosts createGetHosts() {
        return new GetHosts();
    }

    /**
     * Create an instance of {@link GetTimeZoneResponse }
     * 
     */
    public GetTimeZoneResponse createGetTimeZoneResponse() {
        return new GetTimeZoneResponse();
    }

    /**
     * Create an instance of {@link GetFormatDateTimeResponse }
     * 
     */
    public GetFormatDateTimeResponse createGetFormatDateTimeResponse() {
        return new GetFormatDateTimeResponse();
    }

    /**
     * Create an instance of {@link GetFrontends }
     * 
     */
    public GetFrontends createGetFrontends() {
        return new GetFrontends();
    }

    /**
     * Create an instance of {@link ProfileText }
     * 
     */
    public ProfileText createProfileText() {
        return new ProfileText();
    }

    /**
     * Create an instance of {@link ArrayOfLogMessage }
     * 
     */
    public ArrayOfLogMessage createArrayOfLogMessage() {
        return new ArrayOfLogMessage();
    }

    /**
     * Create an instance of {@link BackupDatabase }
     * 
     */
    public BackupDatabase createBackupDatabase() {
        return new BackupDatabase();
    }

    /**
     * Create an instance of {@link LogInfo }
     * 
     */
    public LogInfo createLogInfo() {
        return new LogInfo();
    }

    /**
     * Create an instance of {@link ArrayOfStorageGroupDir }
     * 
     */
    public ArrayOfStorageGroupDir createArrayOfStorageGroupDir() {
        return new ArrayOfStorageGroupDir();
    }

    /**
     * Create an instance of {@link ProfileSubmitResponse }
     * 
     */
    public ProfileSubmitResponse createProfileSubmitResponse() {
        return new ProfileSubmitResponse();
    }

    /**
     * Create an instance of {@link ParseISODateStringResponse }
     * 
     */
    public ParseISODateStringResponse createParseISODateStringResponse() {
        return new ParseISODateStringResponse();
    }

    /**
     * Create an instance of {@link GetKeys }
     * 
     */
    public GetKeys createGetKeys() {
        return new GetKeys();
    }

    /**
     * Create an instance of {@link VersionInfo }
     * 
     */
    public VersionInfo createVersionInfo() {
        return new VersionInfo();
    }

    /**
     * Create an instance of {@link Frontend }
     * 
     */
    public Frontend createFrontend() {
        return new Frontend();
    }

    /**
     * Create an instance of {@link LogMessage }
     * 
     */
    public LogMessage createLogMessage() {
        return new LogMessage();
    }

    /**
     * Create an instance of {@link ProfileTextResponse }
     * 
     */
    public ProfileTextResponse createProfileTextResponse() {
        return new ProfileTextResponse();
    }

    /**
     * Create an instance of {@link SendNotificationResponse }
     * 
     */
    public SendNotificationResponse createSendNotificationResponse() {
        return new SendNotificationResponse();
    }

    /**
     * Create an instance of {@link BuildInfo }
     * 
     */
    public BuildInfo createBuildInfo() {
        return new BuildInfo();
    }

    /**
     * Create an instance of {@link ParseISODateString }
     * 
     */
    public ParseISODateString createParseISODateString() {
        return new ParseISODateString();
    }

    /**
     * Create an instance of {@link GetHostName }
     * 
     */
    public GetHostName createGetHostName() {
        return new GetHostName();
    }

    /**
     * Create an instance of {@link EnvInfo }
     * 
     */
    public EnvInfo createEnvInfo() {
        return new EnvInfo();
    }

    /**
     * Create an instance of {@link MapOfStringString.String }
     * 
     */
    public MapOfStringString.String createMapOfStringStringString() {
        return new MapOfStringString.String();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LabelValue")
    public JAXBElement<LabelValue> createLabelValue(LabelValue value) {
        return new JAXBElement<LabelValue>(_LabelValue_QNAME, LabelValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageGroupDirList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroupDirList")
    public JAXBElement<StorageGroupDirList> createStorageGroupDirList(StorageGroupDirList value) {
        return new JAXBElement<StorageGroupDirList>(_StorageGroupDirList_QNAME, StorageGroupDirList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DatabaseInfo")
    public JAXBElement<DatabaseInfo> createDatabaseInfo(DatabaseInfo value) {
        return new JAXBElement<DatabaseInfo>(_DatabaseInfo_QNAME, DatabaseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeZoneInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "TimeZoneInfo")
    public JAXBElement<TimeZoneInfo> createTimeZoneInfo(TimeZoneInfo value) {
        return new JAXBElement<TimeZoneInfo>(_TimeZoneInfo_QNAME, TimeZoneInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLabelValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfLabelValue")
    public JAXBElement<ArrayOfLabelValue> createArrayOfLabelValue(ArrayOfLabelValue value) {
        return new JAXBElement<ArrayOfLabelValue>(_ArrayOfLabelValue_QNAME, ArrayOfLabelValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageGroupDir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroupDir")
    public JAXBElement<StorageGroupDir> createStorageGroupDir(StorageGroupDir value) {
        return new JAXBElement<StorageGroupDir>(_StorageGroupDir_QNAME, StorageGroupDir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LogInfo")
    public JAXBElement<LogInfo> createLogInfo(LogInfo value) {
        return new JAXBElement<LogInfo>(_LogInfo_QNAME, LogInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStorageGroupDir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfStorageGroupDir")
    public JAXBElement<ArrayOfStorageGroupDir> createArrayOfStorageGroupDir(ArrayOfStorageGroupDir value) {
        return new JAXBElement<ArrayOfStorageGroupDir>(_ArrayOfStorageGroupDir_QNAME, ArrayOfStorageGroupDir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFrontend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfFrontend")
    public JAXBElement<ArrayOfFrontend> createArrayOfFrontend(ArrayOfFrontend value) {
        return new JAXBElement<ArrayOfFrontend>(_ArrayOfFrontend_QNAME, ArrayOfFrontend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackendInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "BackendInfo")
    public JAXBElement<BackendInfo> createBackendInfo(BackendInfo value) {
        return new JAXBElement<BackendInfo>(_BackendInfo_QNAME, BackendInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapOfStringString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MapOfStringString")
    public JAXBElement<MapOfStringString> createMapOfStringString(MapOfStringString value) {
        return new JAXBElement<MapOfStringString>(_MapOfStringString_QNAME, MapOfStringString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Frontend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Frontend")
    public JAXBElement<Frontend> createFrontend(Frontend value) {
        return new JAXBElement<Frontend>(_Frontend_QNAME, Frontend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LogMessage")
    public JAXBElement<LogMessage> createLogMessage(LogMessage value) {
        return new JAXBElement<LogMessage>(_LogMessage_QNAME, LogMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "BuildInfo")
    public JAXBElement<BuildInfo> createBuildInfo(BuildInfo value) {
        return new JAXBElement<BuildInfo>(_BuildInfo_QNAME, BuildInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VersionInfo")
    public JAXBElement<VersionInfo> createVersionInfo(VersionInfo value) {
        return new JAXBElement<VersionInfo>(_VersionInfo_QNAME, VersionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrontendList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FrontendList")
    public JAXBElement<FrontendList> createFrontendList(FrontendList value) {
        return new JAXBElement<FrontendList>(_FrontendList_QNAME, FrontendList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SettingList")
    public JAXBElement<SettingList> createSettingList(SettingList value) {
        return new JAXBElement<SettingList>(_SettingList_QNAME, SettingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WOLInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "WOLInfo")
    public JAXBElement<WOLInfo> createWOLInfo(WOLInfo value) {
        return new JAXBElement<WOLInfo>(_WOLInfo_QNAME, WOLInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LogMessageList")
    public JAXBElement<LogMessageList> createLogMessageList(LogMessageList value) {
        return new JAXBElement<LogMessageList>(_LogMessageList_QNAME, LogMessageList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EnvInfo")
    public JAXBElement<EnvInfo> createEnvInfo(EnvInfo value) {
        return new JAXBElement<EnvInfo>(_EnvInfo_QNAME, EnvInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfLogMessage")
    public JAXBElement<ArrayOfLogMessage> createArrayOfLogMessage(ArrayOfLogMessage value) {
        return new JAXBElement<ArrayOfLogMessage>(_ArrayOfLogMessage_QNAME, ArrayOfLogMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ConnectionInfo")
    public JAXBElement<ConnectionInfo> createConnectionInfo(ConnectionInfo value) {
        return new JAXBElement<ConnectionInfo>(_ConnectionInfo_QNAME, ConnectionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "BackupDatabaseResult", scope = BackupDatabaseResponse.class)
    public JAXBElement<Boolean> createBackupDatabaseResponseBackupDatabaseResult(Boolean value) {
        return new JAXBElement<Boolean>(_BackupDatabaseResponseBackupDatabaseResult_QNAME, Boolean.class, BackupDatabaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ShortDate", scope = GetFormatDate.class)
    public JAXBElement<Boolean> createGetFormatDateShortDate(Boolean value) {
        return new JAXBElement<Boolean>(_GetFormatDateShortDate_QNAME, Boolean.class, GetFormatDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Date", scope = GetFormatDate.class)
    public JAXBElement<XMLGregorianCalendar> createGetFormatDateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFormatDateDate_QNAME, XMLGregorianCalendar.class, GetFormatDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetSettingResult", scope = GetSettingResponse.class)
    public JAXBElement<java.lang.String> createGetSettingResponseGetSettingResult(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetSettingResponseGetSettingResult_QNAME, java.lang.String.class, GetSettingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Message", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationMessage(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationMessage_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Address", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationAddress(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationAddress_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Timeout", scope = SendNotification.class)
    public JAXBElement<Integer> createSendNotificationTimeout(Integer value) {
        return new JAXBElement<Integer>(_SendNotificationTimeout_QNAME, Integer.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Priority", scope = SendNotification.class)
    public JAXBElement<Long> createSendNotificationPriority(Long value) {
        return new JAXBElement<Long>(_SendNotificationPriority_QNAME, Long.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Origin", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationOrigin(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationOrigin_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Progress", scope = SendNotification.class)
    public JAXBElement<Float> createSendNotificationProgress(Float value) {
        return new JAXBElement<Float>(_SendNotificationProgress_QNAME, Float.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Description", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationDescription(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationDescription_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Image", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationImage(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationImage_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "udpPort", scope = SendNotification.class)
    public JAXBElement<Integer> createSendNotificationUdpPort(Integer value) {
        return new JAXBElement<Integer>(_SendNotificationUdpPort_QNAME, Integer.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Error", scope = SendNotification.class)
    public JAXBElement<Boolean> createSendNotificationError(Boolean value) {
        return new JAXBElement<Boolean>(_SendNotificationError_QNAME, Boolean.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProgressText", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationProgressText(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationProgressText_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Extra", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationExtra(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationExtra_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Type", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationType(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationType_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Fullscreen", scope = SendNotification.class)
    public JAXBElement<Boolean> createSendNotificationFullscreen(Boolean value) {
        return new JAXBElement<Boolean>(_SendNotificationFullscreen_QNAME, Boolean.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Visibility", scope = SendNotification.class)
    public JAXBElement<Long> createSendNotificationVisibility(Long value) {
        return new JAXBElement<Long>(_SendNotificationVisibility_QNAME, Long.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CheckDatabaseResult", scope = CheckDatabaseResponse.class)
    public JAXBElement<Boolean> createCheckDatabaseResponseCheckDatabaseResult(Boolean value) {
        return new JAXBElement<Boolean>(_CheckDatabaseResponseCheckDatabaseResult_QNAME, Boolean.class, CheckDatabaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Time", scope = LogMessage.class)
    public JAXBElement<XMLGregorianCalendar> createLogMessageTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LogMessageTime_QNAME, XMLGregorianCalendar.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Log", scope = BackendInfo.class)
    public JAXBElement<LogInfo> createBackendInfoLog(LogInfo value) {
        return new JAXBElement<LogInfo>(_BackendInfoLog_QNAME, LogInfo.class, BackendInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Build", scope = BackendInfo.class)
    public JAXBElement<BuildInfo> createBackendInfoBuild(BuildInfo value) {
        return new JAXBElement<BuildInfo>(_BackendInfoBuild_QNAME, BuildInfo.class, BackendInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Env", scope = BackendInfo.class)
    public JAXBElement<EnvInfo> createBackendInfoEnv(EnvInfo value) {
        return new JAXBElement<EnvInfo>(_BackendInfoEnv_QNAME, EnvInfo.class, BackendInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetLogsResult", scope = GetLogsResponse.class)
    public JAXBElement<LogMessageList> createGetLogsResponseGetLogsResult(LogMessageList value) {
        return new JAXBElement<LogMessageList>(_GetLogsResponseGetLogsResult_QNAME, LogMessageList.class, GetLogsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetHostsResult", scope = GetHostsResponse.class)
    public JAXBElement<ArrayOfString> createGetHostsResponseGetHostsResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetHostsResponseGetHostsResult_QNAME, ArrayOfString.class, GetHostsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = PutSetting.class)
    public JAXBElement<java.lang.String> createPutSettingHostName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingHostName_QNAME, java.lang.String.class, PutSetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Key", scope = PutSetting.class)
    public JAXBElement<java.lang.String> createPutSettingKey(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingKey_QNAME, java.lang.String.class, PutSetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Value", scope = PutSetting.class)
    public JAXBElement<java.lang.String> createPutSettingValue(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingValue_QNAME, java.lang.String.class, PutSetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProfileSubmitResult", scope = ProfileSubmitResponse.class)
    public JAXBElement<Boolean> createProfileSubmitResponseProfileSubmitResult(Boolean value) {
        return new JAXBElement<Boolean>(_ProfileSubmitResponseProfileSubmitResult_QNAME, Boolean.class, ProfileSubmitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ShortDate", scope = GetFormatDateTime.class)
    public JAXBElement<Boolean> createGetFormatDateTimeShortDate(Boolean value) {
        return new JAXBElement<Boolean>(_GetFormatDateShortDate_QNAME, Boolean.class, GetFormatDateTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DateTime", scope = GetFormatDateTime.class)
    public JAXBElement<XMLGregorianCalendar> createGetFormatDateTimeDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetFormatDateTimeDateTime_QNAME, XMLGregorianCalendar.class, GetFormatDateTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "NewPassword", scope = ChangePassword.class)
    public JAXBElement<java.lang.String> createChangePasswordNewPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_ChangePasswordNewPassword_QNAME, java.lang.String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UserName", scope = ChangePassword.class)
    public JAXBElement<java.lang.String> createChangePasswordUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_ChangePasswordUserName_QNAME, java.lang.String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OldPassword", scope = ChangePassword.class)
    public JAXBElement<java.lang.String> createChangePasswordOldPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_ChangePasswordOldPassword_QNAME, java.lang.String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetFormatTimeResult", scope = GetFormatTimeResponse.class)
    public JAXBElement<java.lang.String> createGetFormatTimeResponseGetFormatTimeResult(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetFormatTimeResponseGetFormatTimeResult_QNAME, java.lang.String.class, GetFormatTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DirName", scope = RemoveStorageGroupDir.class)
    public JAXBElement<java.lang.String> createRemoveStorageGroupDirDirName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_RemoveStorageGroupDirDirName_QNAME, java.lang.String.class, RemoveStorageGroupDir.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GroupName", scope = RemoveStorageGroupDir.class)
    public JAXBElement<java.lang.String> createRemoveStorageGroupDirGroupName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_RemoveStorageGroupDirGroupName_QNAME, java.lang.String.class, RemoveStorageGroupDir.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = RemoveStorageGroupDir.class)
    public JAXBElement<java.lang.String> createRemoveStorageGroupDirHostName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingHostName_QNAME, java.lang.String.class, RemoveStorageGroupDir.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Pin", scope = GetConnectionInfo.class)
    public JAXBElement<java.lang.String> createGetConnectionInfoPin(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetConnectionInfoPin_QNAME, java.lang.String.class, GetConnectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveStorageGroupDirResult", scope = RemoveStorageGroupDirResponse.class)
    public JAXBElement<Boolean> createRemoveStorageGroupDirResponseRemoveStorageGroupDirResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveStorageGroupDirResponseRemoveStorageGroupDirResult_QNAME, Boolean.class, RemoveStorageGroupDirResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OnLine", scope = GetFrontends.class)
    public JAXBElement<Boolean> createGetFrontendsOnLine(Boolean value) {
        return new JAXBElement<Boolean>(_GetFrontendsOnLine_QNAME, Boolean.class, GetFrontends.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackendInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetBackendInfoResult", scope = GetBackendInfoResponse.class)
    public JAXBElement<BackendInfo> createGetBackendInfoResponseGetBackendInfoResult(BackendInfo value) {
        return new JAXBElement<BackendInfo>(_GetBackendInfoResponseGetBackendInfoResult_QNAME, BackendInfo.class, GetBackendInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProfileDeleteResult", scope = ProfileDeleteResponse.class)
    public JAXBElement<Boolean> createProfileDeleteResponseProfileDeleteResult(Boolean value) {
        return new JAXBElement<Boolean>(_ProfileDeleteResponseProfileDeleteResult_QNAME, Boolean.class, ProfileDeleteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetFormatDateTimeResult", scope = GetFormatDateTimeResponse.class)
    public JAXBElement<java.lang.String> createGetFormatDateTimeResponseGetFormatDateTimeResult(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetFormatDateTimeResponseGetFormatDateTimeResult_QNAME, java.lang.String.class, GetFormatDateTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Line", scope = GetLogs.class)
    public JAXBElement<Integer> createGetLogsLine(Integer value) {
        return new JAXBElement<Integer>(_GetLogsLine_QNAME, Integer.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Function", scope = GetLogs.class)
    public JAXBElement<java.lang.String> createGetLogsFunction(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetLogsFunction_QNAME, java.lang.String.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ToTime", scope = GetLogs.class)
    public JAXBElement<XMLGregorianCalendar> createGetLogsToTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetLogsToTime_QNAME, XMLGregorianCalendar.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Application", scope = GetLogs.class)
    public JAXBElement<java.lang.String> createGetLogsApplication(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetLogsApplication_QNAME, java.lang.String.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FromTime", scope = GetLogs.class)
    public JAXBElement<XMLGregorianCalendar> createGetLogsFromTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetLogsFromTime_QNAME, XMLGregorianCalendar.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = GetLogs.class)
    public JAXBElement<java.lang.String> createGetLogsHostName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingHostName_QNAME, java.lang.String.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "TID", scope = GetLogs.class)
    public JAXBElement<Integer> createGetLogsTID(Integer value) {
        return new JAXBElement<Integer>(_GetLogsTID_QNAME, Integer.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Thread", scope = GetLogs.class)
    public JAXBElement<java.lang.String> createGetLogsThread(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetLogsThread_QNAME, java.lang.String.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MsgContains", scope = GetLogs.class)
    public JAXBElement<java.lang.String> createGetLogsMsgContains(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetLogsMsgContains_QNAME, java.lang.String.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Filename", scope = GetLogs.class)
    public JAXBElement<java.lang.String> createGetLogsFilename(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetLogsFilename_QNAME, java.lang.String.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PID", scope = GetLogs.class)
    public JAXBElement<Integer> createGetLogsPID(Integer value) {
        return new JAXBElement<Integer>(_GetLogsPID_QNAME, Integer.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Level", scope = GetLogs.class)
    public JAXBElement<java.lang.String> createGetLogsLevel(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetLogsLevel_QNAME, java.lang.String.class, GetLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "dbPort", scope = TestDBSettings.class)
    public JAXBElement<Integer> createTestDBSettingsDbPort(Integer value) {
        return new JAXBElement<Integer>(_TestDBSettingsDbPort_QNAME, Integer.class, TestDBSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UserName", scope = TestDBSettings.class)
    public JAXBElement<java.lang.String> createTestDBSettingsUserName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_ChangePasswordUserName_QNAME, java.lang.String.class, TestDBSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = TestDBSettings.class)
    public JAXBElement<java.lang.String> createTestDBSettingsHostName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingHostName_QNAME, java.lang.String.class, TestDBSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Password", scope = TestDBSettings.class)
    public JAXBElement<java.lang.String> createTestDBSettingsPassword(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_TestDBSettingsPassword_QNAME, java.lang.String.class, TestDBSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DBName", scope = TestDBSettings.class)
    public JAXBElement<java.lang.String> createTestDBSettingsDBName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_TestDBSettingsDBName_QNAME, java.lang.String.class, TestDBSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Time", scope = GetFormatTime.class)
    public JAXBElement<XMLGregorianCalendar> createGetFormatTimeTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LogMessageTime_QNAME, XMLGregorianCalendar.class, GetFormatTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Message", scope = SendMessage.class)
    public JAXBElement<java.lang.String> createSendMessageMessage(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationMessage_QNAME, java.lang.String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Address", scope = SendMessage.class)
    public JAXBElement<java.lang.String> createSendMessageAddress(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationAddress_QNAME, java.lang.String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Timeout", scope = SendMessage.class)
    public JAXBElement<Integer> createSendMessageTimeout(Integer value) {
        return new JAXBElement<Integer>(_SendNotificationTimeout_QNAME, Integer.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "udpPort", scope = SendMessage.class)
    public JAXBElement<Integer> createSendMessageUdpPort(Integer value) {
        return new JAXBElement<Integer>(_SendNotificationUdpPort_QNAME, Integer.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DirName", scope = AddStorageGroupDir.class)
    public JAXBElement<java.lang.String> createAddStorageGroupDirDirName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_RemoveStorageGroupDirDirName_QNAME, java.lang.String.class, AddStorageGroupDir.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GroupName", scope = AddStorageGroupDir.class)
    public JAXBElement<java.lang.String> createAddStorageGroupDirGroupName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_RemoveStorageGroupDirGroupName_QNAME, java.lang.String.class, AddStorageGroupDir.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = AddStorageGroupDir.class)
    public JAXBElement<java.lang.String> createAddStorageGroupDirHostName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingHostName_QNAME, java.lang.String.class, AddStorageGroupDir.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddStorageGroupDirResult", scope = AddStorageGroupDirResponse.class)
    public JAXBElement<Boolean> createAddStorageGroupDirResponseAddStorageGroupDirResult(Boolean value) {
        return new JAXBElement<Boolean>(_AddStorageGroupDirResponseAddStorageGroupDirResult_QNAME, Boolean.class, AddStorageGroupDirResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProfileTextResult", scope = ProfileTextResponse.class)
    public JAXBElement<java.lang.String> createProfileTextResponseProfileTextResult(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_ProfileTextResponseProfileTextResult_QNAME, java.lang.String.class, ProfileTextResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GroupName", scope = GetStorageGroupDirs.class)
    public JAXBElement<java.lang.String> createGetStorageGroupDirsGroupName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_RemoveStorageGroupDirGroupName_QNAME, java.lang.String.class, GetStorageGroupDirs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = GetStorageGroupDirs.class)
    public JAXBElement<java.lang.String> createGetStorageGroupDirsHostName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingHostName_QNAME, java.lang.String.class, GetStorageGroupDirs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Default", scope = GetSetting.class)
    public JAXBElement<java.lang.String> createGetSettingDefault(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetSettingDefault_QNAME, java.lang.String.class, GetSetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = GetSetting.class)
    public JAXBElement<java.lang.String> createGetSettingHostName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingHostName_QNAME, java.lang.String.class, GetSetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Key", scope = GetSetting.class)
    public JAXBElement<java.lang.String> createGetSettingKey(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingKey_QNAME, java.lang.String.class, GetSetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrontendList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetFrontendsResult", scope = GetFrontendsResponse.class)
    public JAXBElement<FrontendList> createGetFrontendsResponseGetFrontendsResult(FrontendList value) {
        return new JAXBElement<FrontendList>(_GetFrontendsResponseGetFrontendsResult_QNAME, FrontendList.class, GetFrontendsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeZoneInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetTimeZoneResult", scope = GetTimeZoneResponse.class)
    public JAXBElement<TimeZoneInfo> createGetTimeZoneResponseGetTimeZoneResult(TimeZoneInfo value) {
        return new JAXBElement<TimeZoneInfo>(_GetTimeZoneResponseGetTimeZoneResult_QNAME, TimeZoneInfo.class, GetTimeZoneResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetHostNameResult", scope = GetHostNameResponse.class)
    public JAXBElement<java.lang.String> createGetHostNameResponseGetHostNameResult(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetHostNameResponseGetHostNameResult_QNAME, java.lang.String.class, GetHostNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetKeysResult", scope = GetKeysResponse.class)
    public JAXBElement<ArrayOfString> createGetKeysResponseGetKeysResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetKeysResponseGetKeysResult_QNAME, ArrayOfString.class, GetKeysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SendMessageResult", scope = SendMessageResponse.class)
    public JAXBElement<Boolean> createSendMessageResponseSendMessageResult(Boolean value) {
        return new JAXBElement<Boolean>(_SendMessageResponseSendMessageResult_QNAME, Boolean.class, SendMessageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PutSettingResult", scope = PutSettingResponse.class)
    public JAXBElement<Boolean> createPutSettingResponsePutSettingResult(Boolean value) {
        return new JAXBElement<Boolean>(_PutSettingResponsePutSettingResult_QNAME, Boolean.class, PutSettingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChangePasswordResult", scope = ChangePasswordResponse.class)
    public JAXBElement<Boolean> createChangePasswordResponseChangePasswordResult(Boolean value) {
        return new JAXBElement<Boolean>(_ChangePasswordResponseChangePasswordResult_QNAME, Boolean.class, ChangePasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DateTime", scope = ParseISODateString.class)
    public JAXBElement<java.lang.String> createParseISODateStringDateTime(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetFormatDateTimeDateTime_QNAME, java.lang.String.class, ParseISODateString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetConnectionInfoResult", scope = GetConnectionInfoResponse.class)
    public JAXBElement<ConnectionInfo> createGetConnectionInfoResponseGetConnectionInfoResult(ConnectionInfo value) {
        return new JAXBElement<ConnectionInfo>(_GetConnectionInfoResponseGetConnectionInfoResult_QNAME, ConnectionInfo.class, GetConnectionInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Repair", scope = CheckDatabase.class)
    public JAXBElement<Boolean> createCheckDatabaseRepair(Boolean value) {
        return new JAXBElement<Boolean>(_CheckDatabaseRepair_QNAME, Boolean.class, CheckDatabase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CurrentDateTime", scope = TimeZoneInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTimeZoneInfoCurrentDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimeZoneInfoCurrentDateTime_QNAME, XMLGregorianCalendar.class, TimeZoneInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetFormatDateResult", scope = GetFormatDateResponse.class)
    public JAXBElement<java.lang.String> createGetFormatDateResponseGetFormatDateResult(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetFormatDateResponseGetFormatDateResult_QNAME, java.lang.String.class, GetFormatDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProfileUpdatedResult", scope = ProfileUpdatedResponse.class)
    public JAXBElement<java.lang.String> createProfileUpdatedResponseProfileUpdatedResult(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_ProfileUpdatedResponseProfileUpdatedResult_QNAME, java.lang.String.class, ProfileUpdatedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetSettingListResult", scope = GetSettingListResponse.class)
    public JAXBElement<SettingList> createGetSettingListResponseGetSettingListResult(SettingList value) {
        return new JAXBElement<SettingList>(_GetSettingListResponseGetSettingListResult_QNAME, SettingList.class, GetSettingListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ParseISODateStringResult", scope = ParseISODateStringResponse.class)
    public JAXBElement<XMLGregorianCalendar> createParseISODateStringResponseParseISODateStringResult(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ParseISODateStringResponseParseISODateStringResult_QNAME, XMLGregorianCalendar.class, ParseISODateStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Version", scope = ConnectionInfo.class)
    public JAXBElement<VersionInfo> createConnectionInfoVersion(VersionInfo value) {
        return new JAXBElement<VersionInfo>(_ConnectionInfoVersion_QNAME, VersionInfo.class, ConnectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WOLInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "WOL", scope = ConnectionInfo.class)
    public JAXBElement<WOLInfo> createConnectionInfoWOL(WOLInfo value) {
        return new JAXBElement<WOLInfo>(_ConnectionInfoWOL_QNAME, WOLInfo.class, ConnectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Database", scope = ConnectionInfo.class)
    public JAXBElement<DatabaseInfo> createConnectionInfoDatabase(DatabaseInfo value) {
        return new JAXBElement<DatabaseInfo>(_ConnectionInfoDatabase_QNAME, DatabaseInfo.class, ConnectionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProfileURLResult", scope = ProfileURLResponse.class)
    public JAXBElement<java.lang.String> createProfileURLResponseProfileURLResult(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_ProfileURLResponseProfileURLResult_QNAME, java.lang.String.class, ProfileURLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageGroupDirList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetStorageGroupDirsResult", scope = GetStorageGroupDirsResponse.class)
    public JAXBElement<StorageGroupDirList> createGetStorageGroupDirsResponseGetStorageGroupDirsResult(StorageGroupDirList value) {
        return new JAXBElement<StorageGroupDirList>(_GetStorageGroupDirsResponseGetStorageGroupDirsResult_QNAME, StorageGroupDirList.class, GetStorageGroupDirsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SendNotificationResult", scope = SendNotificationResponse.class)
    public JAXBElement<Boolean> createSendNotificationResponseSendNotificationResult(Boolean value) {
        return new JAXBElement<Boolean>(_SendNotificationResponseSendNotificationResult_QNAME, Boolean.class, SendNotificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = GetSettingList.class)
    public JAXBElement<java.lang.String> createGetSettingListHostName(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PutSettingHostName_QNAME, java.lang.String.class, GetSettingList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "TestDBSettingsResult", scope = TestDBSettingsResponse.class)
    public JAXBElement<Boolean> createTestDBSettingsResponseTestDBSettingsResult(Boolean value) {
        return new JAXBElement<Boolean>(_TestDBSettingsResponseTestDBSettingsResult_QNAME, Boolean.class, TestDBSettingsResponse.class, value);
    }

}
