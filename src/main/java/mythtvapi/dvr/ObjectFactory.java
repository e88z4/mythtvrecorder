
package mythtvapi.dvr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mythtvapi.dvr package. 
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

    private final static QName _TitleInfo_QNAME = new QName("http://mythtv.org", "TitleInfo");
    private final static QName _RecordingInfo_QNAME = new QName("http://mythtv.org", "RecordingInfo");
    private final static QName _Program_QNAME = new QName("http://mythtv.org", "Program");
    private final static QName _ArrayOfInput_QNAME = new QName("http://mythtv.org", "ArrayOfInput");
    private final static QName _TitleInfoList_QNAME = new QName("http://mythtv.org", "TitleInfoList");
    private final static QName _ArrayOfEncoder_QNAME = new QName("http://mythtv.org", "ArrayOfEncoder");
    private final static QName _RecRuleFilter_QNAME = new QName("http://mythtv.org", "RecRuleFilter");
    private final static QName _CastMemberList_QNAME = new QName("http://mythtv.org", "CastMemberList");
    private final static QName _ArrayOfRecRuleFilter_QNAME = new QName("http://mythtv.org", "ArrayOfRecRuleFilter");
    private final static QName _ArtworkInfo_QNAME = new QName("http://mythtv.org", "ArtworkInfo");
    private final static QName _ArrayOfProgram_QNAME = new QName("http://mythtv.org", "ArrayOfProgram");
    private final static QName _ArrayOfCastMember_QNAME = new QName("http://mythtv.org", "ArrayOfCastMember");
    private final static QName _ArtworkInfoList_QNAME = new QName("http://mythtv.org", "ArtworkInfoList");
    private final static QName _ArrayOfRecRule_QNAME = new QName("http://mythtv.org", "ArrayOfRecRule");
    private final static QName _ArrayOfString_QNAME = new QName("http://mythtv.org", "ArrayOfString");
    private final static QName _RecRule_QNAME = new QName("http://mythtv.org", "RecRule");
    private final static QName _RecStatusType_QNAME = new QName("http://mythtv.org", "RecStatus.Type");
    private final static QName _InputList_QNAME = new QName("http://mythtv.org", "InputList");
    private final static QName _EncoderList_QNAME = new QName("http://mythtv.org", "EncoderList");
    private final static QName _RecRuleFilterList_QNAME = new QName("http://mythtv.org", "RecRuleFilterList");
    private final static QName _RecRuleList_QNAME = new QName("http://mythtv.org", "RecRuleList");
    private final static QName _ProgramList_QNAME = new QName("http://mythtv.org", "ProgramList");
    private final static QName _ArrayOfTitleInfo_QNAME = new QName("http://mythtv.org", "ArrayOfTitleInfo");
    private final static QName _CutList_QNAME = new QName("http://mythtv.org", "CutList");
    private final static QName _ChannelInfo_QNAME = new QName("http://mythtv.org", "ChannelInfo");
    private final static QName _Encoder_QNAME = new QName("http://mythtv.org", "Encoder");
    private final static QName _CastMember_QNAME = new QName("http://mythtv.org", "CastMember");
    private final static QName _Cutting_QNAME = new QName("http://mythtv.org", "Cutting");
    private final static QName _Input_QNAME = new QName("http://mythtv.org", "Input");
    private final static QName _ArrayOfCutting_QNAME = new QName("http://mythtv.org", "ArrayOfCutting");
    private final static QName _ArrayOfArtworkInfo_QNAME = new QName("http://mythtv.org", "ArrayOfArtworkInfo");
    private final static QName _GetTitleInfoListResponseGetTitleInfoListResult_QNAME = new QName("http://mythtv.org", "GetTitleInfoListResult");
    private final static QName _GetExpiringListResponseGetExpiringListResult_QNAME = new QName("http://mythtv.org", "GetExpiringListResult");
    private final static QName _UnDeleteRecordingResponseUnDeleteRecordingResult_QNAME = new QName("http://mythtv.org", "UnDeleteRecordingResult");
    private final static QName _UnDeleteRecordingChanId_QNAME = new QName("http://mythtv.org", "ChanId");
    private final static QName _UnDeleteRecordingRecordedId_QNAME = new QName("http://mythtv.org", "RecordedId");
    private final static QName _UnDeleteRecordingStartTime_QNAME = new QName("http://mythtv.org", "StartTime");
    private final static QName _GetRecordedCutListOffsetType_QNAME = new QName("http://mythtv.org", "OffsetType");
    private final static QName _DupMethodToStringResponseDupMethodToStringResult_QNAME = new QName("http://mythtv.org", "DupMethodToStringResult");
    private final static QName _RecRuleListAsOf_QNAME = new QName("http://mythtv.org", "AsOf");
    private final static QName _GetRecordedSeekResponseGetRecordedSeekResult_QNAME = new QName("http://mythtv.org", "GetRecordedSeekResult");
    private final static QName _RecTypeToDescriptionResponseRecTypeToDescriptionResult_QNAME = new QName("http://mythtv.org", "RecTypeToDescriptionResult");
    private final static QName _GetRecRuleFilterListResponseGetRecRuleFilterListResult_QNAME = new QName("http://mythtv.org", "GetRecRuleFilterListResult");
    private final static QName _UpdateRecordScheduleResponseUpdateRecordScheduleResult_QNAME = new QName("http://mythtv.org", "UpdateRecordScheduleResult");
    private final static QName _ProgramEndTime_QNAME = new QName("http://mythtv.org", "EndTime");
    private final static QName _ProgramChannel_QNAME = new QName("http://mythtv.org", "Channel");
    private final static QName _ProgramLastModified_QNAME = new QName("http://mythtv.org", "LastModified");
    private final static QName _ProgramCast_QNAME = new QName("http://mythtv.org", "Cast");
    private final static QName _ProgramArtwork_QNAME = new QName("http://mythtv.org", "Artwork");
    private final static QName _ProgramAirdate_QNAME = new QName("http://mythtv.org", "Airdate");
    private final static QName _ProgramRecording_QNAME = new QName("http://mythtv.org", "Recording");
    private final static QName _RemoveRecordedResponseRemoveRecordedResult_QNAME = new QName("http://mythtv.org", "RemoveRecordedResult");
    private final static QName _DupInToStringResponseDupInToStringResult_QNAME = new QName("http://mythtv.org", "DupInToStringResult");
    private final static QName _SetSavedBookmarkOffset_QNAME = new QName("http://mythtv.org", "Offset");
    private final static QName _DisableRecordScheduleResponseDisableRecordScheduleResult_QNAME = new QName("http://mythtv.org", "DisableRecordScheduleResult");
    private final static QName _GetConflictListResponseGetConflictListResult_QNAME = new QName("http://mythtv.org", "GetConflictListResult");
    private final static QName _RemoveRecordedAllowRerecord_QNAME = new QName("http://mythtv.org", "AllowRerecord");
    private final static QName _RemoveRecordedForceDelete_QNAME = new QName("http://mythtv.org", "ForceDelete");
    private final static QName _DeleteRecordingResponseDeleteRecordingResult_QNAME = new QName("http://mythtv.org", "DeleteRecordingResult");
    private final static QName _GetConflictListStartIndex_QNAME = new QName("http://mythtv.org", "StartIndex");
    private final static QName _GetConflictListCount_QNAME = new QName("http://mythtv.org", "Count");
    private final static QName _GetConflictListRecordId_QNAME = new QName("http://mythtv.org", "RecordId");
    private final static QName _DupMethodToDescriptionResponseDupMethodToDescriptionResult_QNAME = new QName("http://mythtv.org", "DupMethodToDescriptionResult");
    private final static QName _UpdateRecordScheduleStartOffset_QNAME = new QName("http://mythtv.org", "StartOffset");
    private final static QName _UpdateRecordScheduleRecPriority_QNAME = new QName("http://mythtv.org", "RecPriority");
    private final static QName _UpdateRecordSchedulePreferredInput_QNAME = new QName("http://mythtv.org", "PreferredInput");
    private final static QName _UpdateRecordScheduleAutoCommflag_QNAME = new QName("http://mythtv.org", "AutoCommflag");
    private final static QName _UpdateRecordScheduleProgramId_QNAME = new QName("http://mythtv.org", "ProgramId");
    private final static QName _UpdateRecordScheduleRecGroup_QNAME = new QName("http://mythtv.org", "RecGroup");
    private final static QName _UpdateRecordScheduleMaxEpisodes_QNAME = new QName("http://mythtv.org", "MaxEpisodes");
    private final static QName _UpdateRecordScheduleAutoUserJob2_QNAME = new QName("http://mythtv.org", "AutoUserJob2");
    private final static QName _UpdateRecordScheduleTitle_QNAME = new QName("http://mythtv.org", "Title");
    private final static QName _UpdateRecordScheduleAutoUserJob1_QNAME = new QName("http://mythtv.org", "AutoUserJob1");
    private final static QName _UpdateRecordScheduleTranscoder_QNAME = new QName("http://mythtv.org", "Transcoder");
    private final static QName _UpdateRecordScheduleFilter_QNAME = new QName("http://mythtv.org", "Filter");
    private final static QName _UpdateRecordScheduleAutoUserJob4_QNAME = new QName("http://mythtv.org", "AutoUserJob4");
    private final static QName _UpdateRecordScheduleAutoUserJob3_QNAME = new QName("http://mythtv.org", "AutoUserJob3");
    private final static QName _UpdateRecordScheduleStation_QNAME = new QName("http://mythtv.org", "Station");
    private final static QName _UpdateRecordScheduleSubtitle_QNAME = new QName("http://mythtv.org", "Subtitle");
    private final static QName _UpdateRecordScheduleEpisode_QNAME = new QName("http://mythtv.org", "Episode");
    private final static QName _UpdateRecordScheduleType_QNAME = new QName("http://mythtv.org", "Type");
    private final static QName _UpdateRecordSchedulePlayGroup_QNAME = new QName("http://mythtv.org", "PlayGroup");
    private final static QName _UpdateRecordScheduleInetref_QNAME = new QName("http://mythtv.org", "Inetref");
    private final static QName _UpdateRecordScheduleMaxNewest_QNAME = new QName("http://mythtv.org", "MaxNewest");
    private final static QName _UpdateRecordScheduleRecProfile_QNAME = new QName("http://mythtv.org", "RecProfile");
    private final static QName _UpdateRecordScheduleAutoMetaLookup_QNAME = new QName("http://mythtv.org", "AutoMetaLookup");
    private final static QName _UpdateRecordScheduleSeriesId_QNAME = new QName("http://mythtv.org", "SeriesId");
    private final static QName _UpdateRecordScheduleDescription_QNAME = new QName("http://mythtv.org", "Description");
    private final static QName _UpdateRecordScheduleCategory_QNAME = new QName("http://mythtv.org", "Category");
    private final static QName _UpdateRecordScheduleEndOffset_QNAME = new QName("http://mythtv.org", "EndOffset");
    private final static QName _UpdateRecordScheduleDupIn_QNAME = new QName("http://mythtv.org", "DupIn");
    private final static QName _UpdateRecordScheduleStorageGroup_QNAME = new QName("http://mythtv.org", "StorageGroup");
    private final static QName _UpdateRecordScheduleSeason_QNAME = new QName("http://mythtv.org", "Season");
    private final static QName _UpdateRecordScheduleFindDay_QNAME = new QName("http://mythtv.org", "FindDay");
    private final static QName _UpdateRecordScheduleFindTime_QNAME = new QName("http://mythtv.org", "FindTime");
    private final static QName _UpdateRecordScheduleAutoExpire_QNAME = new QName("http://mythtv.org", "AutoExpire");
    private final static QName _UpdateRecordScheduleInactive_QNAME = new QName("http://mythtv.org", "Inactive");
    private final static QName _UpdateRecordScheduleSearchType_QNAME = new QName("http://mythtv.org", "SearchType");
    private final static QName _UpdateRecordScheduleDupMethod_QNAME = new QName("http://mythtv.org", "DupMethod");
    private final static QName _UpdateRecordScheduleAutoTranscode_QNAME = new QName("http://mythtv.org", "AutoTranscode");
    private final static QName _GetInputListResponseGetInputListResult_QNAME = new QName("http://mythtv.org", "GetInputListResult");
    private final static QName _GetEncoderListResponseGetEncoderListResult_QNAME = new QName("http://mythtv.org", "GetEncoderListResult");
    private final static QName _GetRecGroupListResponseGetRecGroupListResult_QNAME = new QName("http://mythtv.org", "GetRecGroupListResult");
    private final static QName _RecStatusToDescriptionRecStatus_QNAME = new QName("http://mythtv.org", "RecStatus");
    private final static QName _RecStatusToDescriptionRecType_QNAME = new QName("http://mythtv.org", "RecType");
    private final static QName _GetRecordedListDescending_QNAME = new QName("http://mythtv.org", "Descending");
    private final static QName _GetRecordedListTitleRegEx_QNAME = new QName("http://mythtv.org", "TitleRegEx");
    private final static QName _ReactivateRecordingResponseReactivateRecordingResult_QNAME = new QName("http://mythtv.org", "ReactivateRecordingResult");
    private final static QName _GetRecordScheduleMakeOverride_QNAME = new QName("http://mythtv.org", "MakeOverride");
    private final static QName _GetRecordScheduleTemplate_QNAME = new QName("http://mythtv.org", "Template");
    private final static QName _RemoveRecordScheduleResponseRemoveRecordScheduleResult_QNAME = new QName("http://mythtv.org", "RemoveRecordScheduleResult");
    private final static QName _GetTitleListResponseGetTitleListResult_QNAME = new QName("http://mythtv.org", "GetTitleListResult");
    private final static QName _GetPlayGroupListResponseGetPlayGroupListResult_QNAME = new QName("http://mythtv.org", "GetPlayGroupListResult");
    private final static QName _GetRecordedCutListResponseGetRecordedCutListResult_QNAME = new QName("http://mythtv.org", "GetRecordedCutListResult");
    private final static QName _GetSavedBookmarkResponseGetSavedBookmarkResult_QNAME = new QName("http://mythtv.org", "GetSavedBookmarkResult");
    private final static QName _RecRuleLastDeleted_QNAME = new QName("http://mythtv.org", "LastDeleted");
    private final static QName _RecRuleLastRecorded_QNAME = new QName("http://mythtv.org", "LastRecorded");
    private final static QName _RecRuleNextRecording_QNAME = new QName("http://mythtv.org", "NextRecording");
    private final static QName _SetSavedBookmarkResponseSetSavedBookmarkResult_QNAME = new QName("http://mythtv.org", "SetSavedBookmarkResult");
    private final static QName _GetRecordScheduleResponseGetRecordScheduleResult_QNAME = new QName("http://mythtv.org", "GetRecordScheduleResult");
    private final static QName _GetRecordedResponseGetRecordedResult_QNAME = new QName("http://mythtv.org", "GetRecordedResult");
    private final static QName _DupInToDescriptionResponseDupInToDescriptionResult_QNAME = new QName("http://mythtv.org", "DupInToDescriptionResult");
    private final static QName _RecStatusToStringResponseRecStatusToStringResult_QNAME = new QName("http://mythtv.org", "RecStatusToStringResult");
    private final static QName _RecordedIdForPathnameResponseRecordedIdForPathnameResult_QNAME = new QName("http://mythtv.org", "RecordedIdForPathnameResult");
    private final static QName _RecStatusToDescriptionResponseRecStatusToDescriptionResult_QNAME = new QName("http://mythtv.org", "RecStatusToDescriptionResult");
    private final static QName _RescheduleRecordingsResponseRescheduleRecordingsResult_QNAME = new QName("http://mythtv.org", "RescheduleRecordingsResult");
    private final static QName _UpdateRecordedWatchedStatusResponseUpdateRecordedWatchedStatusResult_QNAME = new QName("http://mythtv.org", "UpdateRecordedWatchedStatusResult");
    private final static QName _GetUpcomingListResponseGetUpcomingListResult_QNAME = new QName("http://mythtv.org", "GetUpcomingListResult");
    private final static QName _GetRecordScheduleListSort_QNAME = new QName("http://mythtv.org", "Sort");
    private final static QName _AddDontRecordScheduleNeverRecord_QNAME = new QName("http://mythtv.org", "NeverRecord");
    private final static QName _GetRecStorageGroupListResponseGetRecStorageGroupListResult_QNAME = new QName("http://mythtv.org", "GetRecStorageGroupListResult");
    private final static QName _EnableRecordScheduleResponseEnableRecordScheduleResult_QNAME = new QName("http://mythtv.org", "EnableRecordScheduleResult");
    private final static QName _AddRecordScheduleResponseAddRecordScheduleResult_QNAME = new QName("http://mythtv.org", "AddRecordScheduleResult");
    private final static QName _AddRecordScheduleParentId_QNAME = new QName("http://mythtv.org", "ParentId");
    private final static QName _GetRecordedCommBreakResponseGetRecordedCommBreakResult_QNAME = new QName("http://mythtv.org", "GetRecordedCommBreakResult");
    private final static QName _GetRecordScheduleListResponseGetRecordScheduleListResult_QNAME = new QName("http://mythtv.org", "GetRecordScheduleListResult");
    private final static QName _GetRecordedListResponseGetRecordedListResult_QNAME = new QName("http://mythtv.org", "GetRecordedListResult");
    private final static QName _RecordedIdForPathnamePathname_QNAME = new QName("http://mythtv.org", "Pathname");
    private final static QName _RecTypeToStringResponseRecTypeToStringResult_QNAME = new QName("http://mythtv.org", "RecTypeToStringResult");
    private final static QName _GetUpcomingListShowAll_QNAME = new QName("http://mythtv.org", "ShowAll");
    private final static QName _RecordingInfoEndTs_QNAME = new QName("http://mythtv.org", "EndTs");
    private final static QName _RecordingInfoStartTs_QNAME = new QName("http://mythtv.org", "StartTs");
    private final static QName _AddDontRecordScheduleResponseAddDontRecordScheduleResult_QNAME = new QName("http://mythtv.org", "AddDontRecordScheduleResult");
    private final static QName _UpdateRecordedWatchedStatusWatched_QNAME = new QName("http://mythtv.org", "Watched");
    private final static QName _StopRecordingResponseStopRecordingResult_QNAME = new QName("http://mythtv.org", "StopRecordingResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mythtvapi.dvr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecStatusToDescription }
     * 
     */
    public RecStatusToDescription createRecStatusToDescription() {
        return new RecStatusToDescription();
    }

    /**
     * Create an instance of {@link StopRecording }
     * 
     */
    public StopRecording createStopRecording() {
        return new StopRecording();
    }

    /**
     * Create an instance of {@link GetInputList }
     * 
     */
    public GetInputList createGetInputList() {
        return new GetInputList();
    }

    /**
     * Create an instance of {@link ArrayOfTitleInfo }
     * 
     */
    public ArrayOfTitleInfo createArrayOfTitleInfo() {
        return new ArrayOfTitleInfo();
    }

    /**
     * Create an instance of {@link RemoveRecordedResponse }
     * 
     */
    public RemoveRecordedResponse createRemoveRecordedResponse() {
        return new RemoveRecordedResponse();
    }

    /**
     * Create an instance of {@link UpdateRecordScheduleResponse }
     * 
     */
    public UpdateRecordScheduleResponse createUpdateRecordScheduleResponse() {
        return new UpdateRecordScheduleResponse();
    }

    /**
     * Create an instance of {@link GetExpiringList }
     * 
     */
    public GetExpiringList createGetExpiringList() {
        return new GetExpiringList();
    }

    /**
     * Create an instance of {@link DeleteRecording }
     * 
     */
    public DeleteRecording createDeleteRecording() {
        return new DeleteRecording();
    }

    /**
     * Create an instance of {@link EnableRecordSchedule }
     * 
     */
    public EnableRecordSchedule createEnableRecordSchedule() {
        return new EnableRecordSchedule();
    }

    /**
     * Create an instance of {@link ReactivateRecording }
     * 
     */
    public ReactivateRecording createReactivateRecording() {
        return new ReactivateRecording();
    }

    /**
     * Create an instance of {@link CastMember }
     * 
     */
    public CastMember createCastMember() {
        return new CastMember();
    }

    /**
     * Create an instance of {@link DupMethodToDescriptionResponse }
     * 
     */
    public DupMethodToDescriptionResponse createDupMethodToDescriptionResponse() {
        return new DupMethodToDescriptionResponse();
    }

    /**
     * Create an instance of {@link UnDeleteRecordingResponse }
     * 
     */
    public UnDeleteRecordingResponse createUnDeleteRecordingResponse() {
        return new UnDeleteRecordingResponse();
    }

    /**
     * Create an instance of {@link ArrayOfArtworkInfo }
     * 
     */
    public ArrayOfArtworkInfo createArrayOfArtworkInfo() {
        return new ArrayOfArtworkInfo();
    }

    /**
     * Create an instance of {@link SetSavedBookmark }
     * 
     */
    public SetSavedBookmark createSetSavedBookmark() {
        return new SetSavedBookmark();
    }

    /**
     * Create an instance of {@link ReactivateRecordingResponse }
     * 
     */
    public ReactivateRecordingResponse createReactivateRecordingResponse() {
        return new ReactivateRecordingResponse();
    }

    /**
     * Create an instance of {@link GetTitleInfoList }
     * 
     */
    public GetTitleInfoList createGetTitleInfoList() {
        return new GetTitleInfoList();
    }

    /**
     * Create an instance of {@link UpdateRecordedWatchedStatus }
     * 
     */
    public UpdateRecordedWatchedStatus createUpdateRecordedWatchedStatus() {
        return new UpdateRecordedWatchedStatus();
    }

    /**
     * Create an instance of {@link RecStatusToStringResponse }
     * 
     */
    public RecStatusToStringResponse createRecStatusToStringResponse() {
        return new RecStatusToStringResponse();
    }

    /**
     * Create an instance of {@link RemoveRecordSchedule }
     * 
     */
    public RemoveRecordSchedule createRemoveRecordSchedule() {
        return new RemoveRecordSchedule();
    }

    /**
     * Create an instance of {@link TitleInfo }
     * 
     */
    public TitleInfo createTitleInfo() {
        return new TitleInfo();
    }

    /**
     * Create an instance of {@link TitleInfoList }
     * 
     */
    public TitleInfoList createTitleInfoList() {
        return new TitleInfoList();
    }

    /**
     * Create an instance of {@link GetRecGroupList }
     * 
     */
    public GetRecGroupList createGetRecGroupList() {
        return new GetRecGroupList();
    }

    /**
     * Create an instance of {@link RecTypeToDescriptionResponse }
     * 
     */
    public RecTypeToDescriptionResponse createRecTypeToDescriptionResponse() {
        return new RecTypeToDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetRecStorageGroupList }
     * 
     */
    public GetRecStorageGroupList createGetRecStorageGroupList() {
        return new GetRecStorageGroupList();
    }

    /**
     * Create an instance of {@link DupMethodToString }
     * 
     */
    public DupMethodToString createDupMethodToString() {
        return new DupMethodToString();
    }

    /**
     * Create an instance of {@link GetRecRuleFilterList }
     * 
     */
    public GetRecRuleFilterList createGetRecRuleFilterList() {
        return new GetRecRuleFilterList();
    }

    /**
     * Create an instance of {@link ArtworkInfoList }
     * 
     */
    public ArtworkInfoList createArtworkInfoList() {
        return new ArtworkInfoList();
    }

    /**
     * Create an instance of {@link ArrayOfRecRule }
     * 
     */
    public ArrayOfRecRule createArrayOfRecRule() {
        return new ArrayOfRecRule();
    }

    /**
     * Create an instance of {@link GetRecordedResponse }
     * 
     */
    public GetRecordedResponse createGetRecordedResponse() {
        return new GetRecordedResponse();
    }

    /**
     * Create an instance of {@link Program }
     * 
     */
    public Program createProgram() {
        return new Program();
    }

    /**
     * Create an instance of {@link AddDontRecordSchedule }
     * 
     */
    public AddDontRecordSchedule createAddDontRecordSchedule() {
        return new AddDontRecordSchedule();
    }

    /**
     * Create an instance of {@link RemoveRecordScheduleResponse }
     * 
     */
    public RemoveRecordScheduleResponse createRemoveRecordScheduleResponse() {
        return new RemoveRecordScheduleResponse();
    }

    /**
     * Create an instance of {@link RecRule }
     * 
     */
    public RecRule createRecRule() {
        return new RecRule();
    }

    /**
     * Create an instance of {@link RecRuleList }
     * 
     */
    public RecRuleList createRecRuleList() {
        return new RecRuleList();
    }

    /**
     * Create an instance of {@link InputList }
     * 
     */
    public InputList createInputList() {
        return new InputList();
    }

    /**
     * Create an instance of {@link EncoderList }
     * 
     */
    public EncoderList createEncoderList() {
        return new EncoderList();
    }

    /**
     * Create an instance of {@link RecordedIdForPathnameResponse }
     * 
     */
    public RecordedIdForPathnameResponse createRecordedIdForPathnameResponse() {
        return new RecordedIdForPathnameResponse();
    }

    /**
     * Create an instance of {@link GetRecordScheduleListResponse }
     * 
     */
    public GetRecordScheduleListResponse createGetRecordScheduleListResponse() {
        return new GetRecordScheduleListResponse();
    }

    /**
     * Create an instance of {@link RecStatusToString }
     * 
     */
    public RecStatusToString createRecStatusToString() {
        return new RecStatusToString();
    }

    /**
     * Create an instance of {@link GetRecordedListResponse }
     * 
     */
    public GetRecordedListResponse createGetRecordedListResponse() {
        return new GetRecordedListResponse();
    }

    /**
     * Create an instance of {@link ProgramList }
     * 
     */
    public ProgramList createProgramList() {
        return new ProgramList();
    }

    /**
     * Create an instance of {@link GetRecordScheduleList }
     * 
     */
    public GetRecordScheduleList createGetRecordScheduleList() {
        return new GetRecordScheduleList();
    }

    /**
     * Create an instance of {@link RescheduleRecordings }
     * 
     */
    public RescheduleRecordings createRescheduleRecordings() {
        return new RescheduleRecordings();
    }

    /**
     * Create an instance of {@link GetRecordedCutListResponse }
     * 
     */
    public GetRecordedCutListResponse createGetRecordedCutListResponse() {
        return new GetRecordedCutListResponse();
    }

    /**
     * Create an instance of {@link CutList }
     * 
     */
    public CutList createCutList() {
        return new CutList();
    }

    /**
     * Create an instance of {@link ArrayOfCutting }
     * 
     */
    public ArrayOfCutting createArrayOfCutting() {
        return new ArrayOfCutting();
    }

    /**
     * Create an instance of {@link DupMethodToStringResponse }
     * 
     */
    public DupMethodToStringResponse createDupMethodToStringResponse() {
        return new DupMethodToStringResponse();
    }

    /**
     * Create an instance of {@link GetSavedBookmarkResponse }
     * 
     */
    public GetSavedBookmarkResponse createGetSavedBookmarkResponse() {
        return new GetSavedBookmarkResponse();
    }

    /**
     * Create an instance of {@link GetTitleList }
     * 
     */
    public GetTitleList createGetTitleList() {
        return new GetTitleList();
    }

    /**
     * Create an instance of {@link DupMethodToDescription }
     * 
     */
    public DupMethodToDescription createDupMethodToDescription() {
        return new DupMethodToDescription();
    }

    /**
     * Create an instance of {@link ArrayOfEncoder }
     * 
     */
    public ArrayOfEncoder createArrayOfEncoder() {
        return new ArrayOfEncoder();
    }

    /**
     * Create an instance of {@link GetTitleListResponse }
     * 
     */
    public GetTitleListResponse createGetTitleListResponse() {
        return new GetTitleListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link AddDontRecordScheduleResponse }
     * 
     */
    public AddDontRecordScheduleResponse createAddDontRecordScheduleResponse() {
        return new AddDontRecordScheduleResponse();
    }

    /**
     * Create an instance of {@link GetConflictListResponse }
     * 
     */
    public GetConflictListResponse createGetConflictListResponse() {
        return new GetConflictListResponse();
    }

    /**
     * Create an instance of {@link GetExpiringListResponse }
     * 
     */
    public GetExpiringListResponse createGetExpiringListResponse() {
        return new GetExpiringListResponse();
    }

    /**
     * Create an instance of {@link ArtworkInfo }
     * 
     */
    public ArtworkInfo createArtworkInfo() {
        return new ArtworkInfo();
    }

    /**
     * Create an instance of {@link EnableRecordScheduleResponse }
     * 
     */
    public EnableRecordScheduleResponse createEnableRecordScheduleResponse() {
        return new EnableRecordScheduleResponse();
    }

    /**
     * Create an instance of {@link GetEncoderList }
     * 
     */
    public GetEncoderList createGetEncoderList() {
        return new GetEncoderList();
    }

    /**
     * Create an instance of {@link GetRecStorageGroupListResponse }
     * 
     */
    public GetRecStorageGroupListResponse createGetRecStorageGroupListResponse() {
        return new GetRecStorageGroupListResponse();
    }

    /**
     * Create an instance of {@link GetInputListResponse }
     * 
     */
    public GetInputListResponse createGetInputListResponse() {
        return new GetInputListResponse();
    }

    /**
     * Create an instance of {@link GetRecordSchedule }
     * 
     */
    public GetRecordSchedule createGetRecordSchedule() {
        return new GetRecordSchedule();
    }

    /**
     * Create an instance of {@link GetPlayGroupList }
     * 
     */
    public GetPlayGroupList createGetPlayGroupList() {
        return new GetPlayGroupList();
    }

    /**
     * Create an instance of {@link DeleteRecordingResponse }
     * 
     */
    public DeleteRecordingResponse createDeleteRecordingResponse() {
        return new DeleteRecordingResponse();
    }

    /**
     * Create an instance of {@link GetRecGroupListResponse }
     * 
     */
    public GetRecGroupListResponse createGetRecGroupListResponse() {
        return new GetRecGroupListResponse();
    }

    /**
     * Create an instance of {@link ChannelInfo }
     * 
     */
    public ChannelInfo createChannelInfo() {
        return new ChannelInfo();
    }

    /**
     * Create an instance of {@link Cutting }
     * 
     */
    public Cutting createCutting() {
        return new Cutting();
    }

    /**
     * Create an instance of {@link Input }
     * 
     */
    public Input createInput() {
        return new Input();
    }

    /**
     * Create an instance of {@link GetSavedBookmark }
     * 
     */
    public GetSavedBookmark createGetSavedBookmark() {
        return new GetSavedBookmark();
    }

    /**
     * Create an instance of {@link Encoder }
     * 
     */
    public Encoder createEncoder() {
        return new Encoder();
    }

    /**
     * Create an instance of {@link GetUpcomingList }
     * 
     */
    public GetUpcomingList createGetUpcomingList() {
        return new GetUpcomingList();
    }

    /**
     * Create an instance of {@link GetPlayGroupListResponse }
     * 
     */
    public GetPlayGroupListResponse createGetPlayGroupListResponse() {
        return new GetPlayGroupListResponse();
    }

    /**
     * Create an instance of {@link DisableRecordScheduleResponse }
     * 
     */
    public DisableRecordScheduleResponse createDisableRecordScheduleResponse() {
        return new DisableRecordScheduleResponse();
    }

    /**
     * Create an instance of {@link RecTypeToDescription }
     * 
     */
    public RecTypeToDescription createRecTypeToDescription() {
        return new RecTypeToDescription();
    }

    /**
     * Create an instance of {@link StopRecordingResponse }
     * 
     */
    public StopRecordingResponse createStopRecordingResponse() {
        return new StopRecordingResponse();
    }

    /**
     * Create an instance of {@link DupInToString }
     * 
     */
    public DupInToString createDupInToString() {
        return new DupInToString();
    }

    /**
     * Create an instance of {@link GetRecorded }
     * 
     */
    public GetRecorded createGetRecorded() {
        return new GetRecorded();
    }

    /**
     * Create an instance of {@link GetRecRuleFilterListResponse }
     * 
     */
    public GetRecRuleFilterListResponse createGetRecRuleFilterListResponse() {
        return new GetRecRuleFilterListResponse();
    }

    /**
     * Create an instance of {@link RecRuleFilterList }
     * 
     */
    public RecRuleFilterList createRecRuleFilterList() {
        return new RecRuleFilterList();
    }

    /**
     * Create an instance of {@link RecordingInfo }
     * 
     */
    public RecordingInfo createRecordingInfo() {
        return new RecordingInfo();
    }

    /**
     * Create an instance of {@link RecTypeToStringResponse }
     * 
     */
    public RecTypeToStringResponse createRecTypeToStringResponse() {
        return new RecTypeToStringResponse();
    }

    /**
     * Create an instance of {@link RecRuleFilter }
     * 
     */
    public RecRuleFilter createRecRuleFilter() {
        return new RecRuleFilter();
    }

    /**
     * Create an instance of {@link GetRecordedCommBreakResponse }
     * 
     */
    public GetRecordedCommBreakResponse createGetRecordedCommBreakResponse() {
        return new GetRecordedCommBreakResponse();
    }

    /**
     * Create an instance of {@link RecStatusToDescriptionResponse }
     * 
     */
    public RecStatusToDescriptionResponse createRecStatusToDescriptionResponse() {
        return new RecStatusToDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetRecordedCommBreak }
     * 
     */
    public GetRecordedCommBreak createGetRecordedCommBreak() {
        return new GetRecordedCommBreak();
    }

    /**
     * Create an instance of {@link ArrayOfProgram }
     * 
     */
    public ArrayOfProgram createArrayOfProgram() {
        return new ArrayOfProgram();
    }

    /**
     * Create an instance of {@link ArrayOfCastMember }
     * 
     */
    public ArrayOfCastMember createArrayOfCastMember() {
        return new ArrayOfCastMember();
    }

    /**
     * Create an instance of {@link UpdateRecordedWatchedStatusResponse }
     * 
     */
    public UpdateRecordedWatchedStatusResponse createUpdateRecordedWatchedStatusResponse() {
        return new UpdateRecordedWatchedStatusResponse();
    }

    /**
     * Create an instance of {@link GetTitleInfoListResponse }
     * 
     */
    public GetTitleInfoListResponse createGetTitleInfoListResponse() {
        return new GetTitleInfoListResponse();
    }

    /**
     * Create an instance of {@link GetRecordedSeekResponse }
     * 
     */
    public GetRecordedSeekResponse createGetRecordedSeekResponse() {
        return new GetRecordedSeekResponse();
    }

    /**
     * Create an instance of {@link GetRecordedSeek }
     * 
     */
    public GetRecordedSeek createGetRecordedSeek() {
        return new GetRecordedSeek();
    }

    /**
     * Create an instance of {@link RecTypeToString }
     * 
     */
    public RecTypeToString createRecTypeToString() {
        return new RecTypeToString();
    }

    /**
     * Create an instance of {@link SetSavedBookmarkResponse }
     * 
     */
    public SetSavedBookmarkResponse createSetSavedBookmarkResponse() {
        return new SetSavedBookmarkResponse();
    }

    /**
     * Create an instance of {@link UpdateRecordSchedule }
     * 
     */
    public UpdateRecordSchedule createUpdateRecordSchedule() {
        return new UpdateRecordSchedule();
    }

    /**
     * Create an instance of {@link DupInToStringResponse }
     * 
     */
    public DupInToStringResponse createDupInToStringResponse() {
        return new DupInToStringResponse();
    }

    /**
     * Create an instance of {@link DupInToDescriptionResponse }
     * 
     */
    public DupInToDescriptionResponse createDupInToDescriptionResponse() {
        return new DupInToDescriptionResponse();
    }

    /**
     * Create an instance of {@link DupInToDescription }
     * 
     */
    public DupInToDescription createDupInToDescription() {
        return new DupInToDescription();
    }

    /**
     * Create an instance of {@link DisableRecordSchedule }
     * 
     */
    public DisableRecordSchedule createDisableRecordSchedule() {
        return new DisableRecordSchedule();
    }

    /**
     * Create an instance of {@link AddRecordScheduleResponse }
     * 
     */
    public AddRecordScheduleResponse createAddRecordScheduleResponse() {
        return new AddRecordScheduleResponse();
    }

    /**
     * Create an instance of {@link RescheduleRecordingsResponse }
     * 
     */
    public RescheduleRecordingsResponse createRescheduleRecordingsResponse() {
        return new RescheduleRecordingsResponse();
    }

    /**
     * Create an instance of {@link GetEncoderListResponse }
     * 
     */
    public GetEncoderListResponse createGetEncoderListResponse() {
        return new GetEncoderListResponse();
    }

    /**
     * Create an instance of {@link GetRecordedCutList }
     * 
     */
    public GetRecordedCutList createGetRecordedCutList() {
        return new GetRecordedCutList();
    }

    /**
     * Create an instance of {@link GetRecordScheduleResponse }
     * 
     */
    public GetRecordScheduleResponse createGetRecordScheduleResponse() {
        return new GetRecordScheduleResponse();
    }

    /**
     * Create an instance of {@link GetRecordedList }
     * 
     */
    public GetRecordedList createGetRecordedList() {
        return new GetRecordedList();
    }

    /**
     * Create an instance of {@link CastMemberList }
     * 
     */
    public CastMemberList createCastMemberList() {
        return new CastMemberList();
    }

    /**
     * Create an instance of {@link RecordedIdForPathname }
     * 
     */
    public RecordedIdForPathname createRecordedIdForPathname() {
        return new RecordedIdForPathname();
    }

    /**
     * Create an instance of {@link ArrayOfRecRuleFilter }
     * 
     */
    public ArrayOfRecRuleFilter createArrayOfRecRuleFilter() {
        return new ArrayOfRecRuleFilter();
    }

    /**
     * Create an instance of {@link ArrayOfInput }
     * 
     */
    public ArrayOfInput createArrayOfInput() {
        return new ArrayOfInput();
    }

    /**
     * Create an instance of {@link RemoveRecorded }
     * 
     */
    public RemoveRecorded createRemoveRecorded() {
        return new RemoveRecorded();
    }

    /**
     * Create an instance of {@link UnDeleteRecording }
     * 
     */
    public UnDeleteRecording createUnDeleteRecording() {
        return new UnDeleteRecording();
    }

    /**
     * Create an instance of {@link AddRecordSchedule }
     * 
     */
    public AddRecordSchedule createAddRecordSchedule() {
        return new AddRecordSchedule();
    }

    /**
     * Create an instance of {@link GetUpcomingListResponse }
     * 
     */
    public GetUpcomingListResponse createGetUpcomingListResponse() {
        return new GetUpcomingListResponse();
    }

    /**
     * Create an instance of {@link GetConflictList }
     * 
     */
    public GetConflictList createGetConflictList() {
        return new GetConflictList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "TitleInfo")
    public JAXBElement<TitleInfo> createTitleInfo(TitleInfo value) {
        return new JAXBElement<TitleInfo>(_TitleInfo_QNAME, TitleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordingInfo")
    public JAXBElement<RecordingInfo> createRecordingInfo(RecordingInfo value) {
        return new JAXBElement<RecordingInfo>(_RecordingInfo_QNAME, RecordingInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Program }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Program")
    public JAXBElement<Program> createProgram(Program value) {
        return new JAXBElement<Program>(_Program_QNAME, Program.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfInput")
    public JAXBElement<ArrayOfInput> createArrayOfInput(ArrayOfInput value) {
        return new JAXBElement<ArrayOfInput>(_ArrayOfInput_QNAME, ArrayOfInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitleInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "TitleInfoList")
    public JAXBElement<TitleInfoList> createTitleInfoList(TitleInfoList value) {
        return new JAXBElement<TitleInfoList>(_TitleInfoList_QNAME, TitleInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEncoder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfEncoder")
    public JAXBElement<ArrayOfEncoder> createArrayOfEncoder(ArrayOfEncoder value) {
        return new JAXBElement<ArrayOfEncoder>(_ArrayOfEncoder_QNAME, ArrayOfEncoder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecRuleFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecRuleFilter")
    public JAXBElement<RecRuleFilter> createRecRuleFilter(RecRuleFilter value) {
        return new JAXBElement<RecRuleFilter>(_RecRuleFilter_QNAME, RecRuleFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CastMemberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CastMemberList")
    public JAXBElement<CastMemberList> createCastMemberList(CastMemberList value) {
        return new JAXBElement<CastMemberList>(_CastMemberList_QNAME, CastMemberList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecRuleFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfRecRuleFilter")
    public JAXBElement<ArrayOfRecRuleFilter> createArrayOfRecRuleFilter(ArrayOfRecRuleFilter value) {
        return new JAXBElement<ArrayOfRecRuleFilter>(_ArrayOfRecRuleFilter_QNAME, ArrayOfRecRuleFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArtworkInfo")
    public JAXBElement<ArtworkInfo> createArtworkInfo(ArtworkInfo value) {
        return new JAXBElement<ArtworkInfo>(_ArtworkInfo_QNAME, ArtworkInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProgram }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfProgram")
    public JAXBElement<ArrayOfProgram> createArrayOfProgram(ArrayOfProgram value) {
        return new JAXBElement<ArrayOfProgram>(_ArrayOfProgram_QNAME, ArrayOfProgram.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCastMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfCastMember")
    public JAXBElement<ArrayOfCastMember> createArrayOfCastMember(ArrayOfCastMember value) {
        return new JAXBElement<ArrayOfCastMember>(_ArrayOfCastMember_QNAME, ArrayOfCastMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArtworkInfoList")
    public JAXBElement<ArtworkInfoList> createArtworkInfoList(ArtworkInfoList value) {
        return new JAXBElement<ArtworkInfoList>(_ArtworkInfoList_QNAME, ArtworkInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfRecRule")
    public JAXBElement<ArrayOfRecRule> createArrayOfRecRule(ArrayOfRecRule value) {
        return new JAXBElement<ArrayOfRecRule>(_ArrayOfRecRule_QNAME, ArrayOfRecRule.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RecRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecRule")
    public JAXBElement<RecRule> createRecRule(RecRule value) {
        return new JAXBElement<RecRule>(_RecRule_QNAME, RecRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecStatus.Type")
    public JAXBElement<RecStatusType> createRecStatusType(RecStatusType value) {
        return new JAXBElement<RecStatusType>(_RecStatusType_QNAME, RecStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "InputList")
    public JAXBElement<InputList> createInputList(InputList value) {
        return new JAXBElement<InputList>(_InputList_QNAME, InputList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncoderList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EncoderList")
    public JAXBElement<EncoderList> createEncoderList(EncoderList value) {
        return new JAXBElement<EncoderList>(_EncoderList_QNAME, EncoderList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecRuleFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecRuleFilterList")
    public JAXBElement<RecRuleFilterList> createRecRuleFilterList(RecRuleFilterList value) {
        return new JAXBElement<RecRuleFilterList>(_RecRuleFilterList_QNAME, RecRuleFilterList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecRuleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecRuleList")
    public JAXBElement<RecRuleList> createRecRuleList(RecRuleList value) {
        return new JAXBElement<RecRuleList>(_RecRuleList_QNAME, RecRuleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProgramList")
    public JAXBElement<ProgramList> createProgramList(ProgramList value) {
        return new JAXBElement<ProgramList>(_ProgramList_QNAME, ProgramList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfTitleInfo")
    public JAXBElement<ArrayOfTitleInfo> createArrayOfTitleInfo(ArrayOfTitleInfo value) {
        return new JAXBElement<ArrayOfTitleInfo>(_ArrayOfTitleInfo_QNAME, ArrayOfTitleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CutList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CutList")
    public JAXBElement<CutList> createCutList(CutList value) {
        return new JAXBElement<CutList>(_CutList_QNAME, CutList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelInfo")
    public JAXBElement<ChannelInfo> createChannelInfo(ChannelInfo value) {
        return new JAXBElement<ChannelInfo>(_ChannelInfo_QNAME, ChannelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Encoder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Encoder")
    public JAXBElement<Encoder> createEncoder(Encoder value) {
        return new JAXBElement<Encoder>(_Encoder_QNAME, Encoder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CastMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CastMember")
    public JAXBElement<CastMember> createCastMember(CastMember value) {
        return new JAXBElement<CastMember>(_CastMember_QNAME, CastMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cutting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Cutting")
    public JAXBElement<Cutting> createCutting(Cutting value) {
        return new JAXBElement<Cutting>(_Cutting_QNAME, Cutting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Input }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Input")
    public JAXBElement<Input> createInput(Input value) {
        return new JAXBElement<Input>(_Input_QNAME, Input.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCutting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfCutting")
    public JAXBElement<ArrayOfCutting> createArrayOfCutting(ArrayOfCutting value) {
        return new JAXBElement<ArrayOfCutting>(_ArrayOfCutting_QNAME, ArrayOfCutting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArtworkInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfArtworkInfo")
    public JAXBElement<ArrayOfArtworkInfo> createArrayOfArtworkInfo(ArrayOfArtworkInfo value) {
        return new JAXBElement<ArrayOfArtworkInfo>(_ArrayOfArtworkInfo_QNAME, ArrayOfArtworkInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitleInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetTitleInfoListResult", scope = GetTitleInfoListResponse.class)
    public JAXBElement<TitleInfoList> createGetTitleInfoListResponseGetTitleInfoListResult(TitleInfoList value) {
        return new JAXBElement<TitleInfoList>(_GetTitleInfoListResponseGetTitleInfoListResult_QNAME, TitleInfoList.class, GetTitleInfoListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetExpiringListResult", scope = GetExpiringListResponse.class)
    public JAXBElement<ProgramList> createGetExpiringListResponseGetExpiringListResult(ProgramList value) {
        return new JAXBElement<ProgramList>(_GetExpiringListResponseGetExpiringListResult_QNAME, ProgramList.class, GetExpiringListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UnDeleteRecordingResult", scope = UnDeleteRecordingResponse.class)
    public JAXBElement<Boolean> createUnDeleteRecordingResponseUnDeleteRecordingResult(Boolean value) {
        return new JAXBElement<Boolean>(_UnDeleteRecordingResponseUnDeleteRecordingResult_QNAME, Boolean.class, UnDeleteRecordingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = UnDeleteRecording.class)
    public JAXBElement<Integer> createUnDeleteRecordingChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, UnDeleteRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = UnDeleteRecording.class)
    public JAXBElement<Integer> createUnDeleteRecordingRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, UnDeleteRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = UnDeleteRecording.class)
    public JAXBElement<XMLGregorianCalendar> createUnDeleteRecordingStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, UnDeleteRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetRecordedCutList.class)
    public JAXBElement<Integer> createGetRecordedCutListChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, GetRecordedCutList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetRecordedCutList.class)
    public JAXBElement<Integer> createGetRecordedCutListRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, GetRecordedCutList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetRecordedCutList.class)
    public JAXBElement<XMLGregorianCalendar> createGetRecordedCutListStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, GetRecordedCutList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OffsetType", scope = GetRecordedCutList.class)
    public JAXBElement<String> createGetRecordedCutListOffsetType(String value) {
        return new JAXBElement<String>(_GetRecordedCutListOffsetType_QNAME, String.class, GetRecordedCutList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupMethodToStringResult", scope = DupMethodToStringResponse.class)
    public JAXBElement<String> createDupMethodToStringResponseDupMethodToStringResult(String value) {
        return new JAXBElement<String>(_DupMethodToStringResponseDupMethodToStringResult_QNAME, String.class, DupMethodToStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = RecRuleList.class)
    public JAXBElement<XMLGregorianCalendar> createRecRuleListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecRuleListAsOf_QNAME, XMLGregorianCalendar.class, RecRuleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CutList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordedSeekResult", scope = GetRecordedSeekResponse.class)
    public JAXBElement<CutList> createGetRecordedSeekResponseGetRecordedSeekResult(CutList value) {
        return new JAXBElement<CutList>(_GetRecordedSeekResponseGetRecordedSeekResult_QNAME, CutList.class, GetRecordedSeekResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecTypeToDescriptionResult", scope = RecTypeToDescriptionResponse.class)
    public JAXBElement<String> createRecTypeToDescriptionResponseRecTypeToDescriptionResult(String value) {
        return new JAXBElement<String>(_RecTypeToDescriptionResponseRecTypeToDescriptionResult_QNAME, String.class, RecTypeToDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecRuleFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecRuleFilterListResult", scope = GetRecRuleFilterListResponse.class)
    public JAXBElement<RecRuleFilterList> createGetRecRuleFilterListResponseGetRecRuleFilterListResult(RecRuleFilterList value) {
        return new JAXBElement<RecRuleFilterList>(_GetRecRuleFilterListResponseGetRecRuleFilterListResult_QNAME, RecRuleFilterList.class, GetRecRuleFilterListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UpdateRecordScheduleResult", scope = UpdateRecordScheduleResponse.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleResponseUpdateRecordScheduleResult(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleResponseUpdateRecordScheduleResult_QNAME, Boolean.class, UpdateRecordScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = RecRuleFilterList.class)
    public JAXBElement<XMLGregorianCalendar> createRecRuleFilterListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecRuleListAsOf_QNAME, XMLGregorianCalendar.class, RecRuleFilterList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTime", scope = Program.class)
    public JAXBElement<XMLGregorianCalendar> createProgramEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramEndTime_QNAME, XMLGregorianCalendar.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Channel", scope = Program.class)
    public JAXBElement<ChannelInfo> createProgramChannel(ChannelInfo value) {
        return new JAXBElement<ChannelInfo>(_ProgramChannel_QNAME, ChannelInfo.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LastModified", scope = Program.class)
    public JAXBElement<XMLGregorianCalendar> createProgramLastModified(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramLastModified_QNAME, XMLGregorianCalendar.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CastMemberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Cast", scope = Program.class)
    public JAXBElement<CastMemberList> createProgramCast(CastMemberList value) {
        return new JAXBElement<CastMemberList>(_ProgramCast_QNAME, CastMemberList.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Artwork", scope = Program.class)
    public JAXBElement<ArtworkInfoList> createProgramArtwork(ArtworkInfoList value) {
        return new JAXBElement<ArtworkInfoList>(_ProgramArtwork_QNAME, ArtworkInfoList.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Airdate", scope = Program.class)
    public JAXBElement<XMLGregorianCalendar> createProgramAirdate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramAirdate_QNAME, XMLGregorianCalendar.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = Program.class)
    public JAXBElement<XMLGregorianCalendar> createProgramStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Recording", scope = Program.class)
    public JAXBElement<RecordingInfo> createProgramRecording(RecordingInfo value) {
        return new JAXBElement<RecordingInfo>(_ProgramRecording_QNAME, RecordingInfo.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = ProgramList.class)
    public JAXBElement<XMLGregorianCalendar> createProgramListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecRuleListAsOf_QNAME, XMLGregorianCalendar.class, ProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveRecordedResult", scope = RemoveRecordedResponse.class)
    public JAXBElement<Boolean> createRemoveRecordedResponseRemoveRecordedResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveRecordedResponseRemoveRecordedResult_QNAME, Boolean.class, RemoveRecordedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupInToStringResult", scope = DupInToStringResponse.class)
    public JAXBElement<String> createDupInToStringResponseDupInToStringResult(String value) {
        return new JAXBElement<String>(_DupInToStringResponseDupInToStringResult_QNAME, String.class, DupInToStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = SetSavedBookmark.class)
    public JAXBElement<Integer> createSetSavedBookmarkChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, SetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = SetSavedBookmark.class)
    public JAXBElement<Integer> createSetSavedBookmarkRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, SetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Offset", scope = SetSavedBookmark.class)
    public JAXBElement<Long> createSetSavedBookmarkOffset(Long value) {
        return new JAXBElement<Long>(_SetSavedBookmarkOffset_QNAME, Long.class, SetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = SetSavedBookmark.class)
    public JAXBElement<XMLGregorianCalendar> createSetSavedBookmarkStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, SetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OffsetType", scope = SetSavedBookmark.class)
    public JAXBElement<String> createSetSavedBookmarkOffsetType(String value) {
        return new JAXBElement<String>(_GetRecordedCutListOffsetType_QNAME, String.class, SetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DisableRecordScheduleResult", scope = DisableRecordScheduleResponse.class)
    public JAXBElement<Boolean> createDisableRecordScheduleResponseDisableRecordScheduleResult(Boolean value) {
        return new JAXBElement<Boolean>(_DisableRecordScheduleResponseDisableRecordScheduleResult_QNAME, Boolean.class, DisableRecordScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = ReactivateRecording.class)
    public JAXBElement<Integer> createReactivateRecordingRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, ReactivateRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetRecorded.class)
    public JAXBElement<Integer> createGetRecordedChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, GetRecorded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetRecorded.class)
    public JAXBElement<Integer> createGetRecordedRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, GetRecorded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetRecorded.class)
    public JAXBElement<XMLGregorianCalendar> createGetRecordedStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, GetRecorded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetConflictListResult", scope = GetConflictListResponse.class)
    public JAXBElement<ProgramList> createGetConflictListResponseGetConflictListResult(ProgramList value) {
        return new JAXBElement<ProgramList>(_GetConflictListResponseGetConflictListResult_QNAME, ProgramList.class, GetConflictListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = RemoveRecorded.class)
    public JAXBElement<Integer> createRemoveRecordedChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, RemoveRecorded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = RemoveRecorded.class)
    public JAXBElement<Integer> createRemoveRecordedRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, RemoveRecorded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = RemoveRecorded.class)
    public JAXBElement<XMLGregorianCalendar> createRemoveRecordedStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, RemoveRecorded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AllowRerecord", scope = RemoveRecorded.class)
    public JAXBElement<Boolean> createRemoveRecordedAllowRerecord(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveRecordedAllowRerecord_QNAME, Boolean.class, RemoveRecorded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ForceDelete", scope = RemoveRecorded.class)
    public JAXBElement<Boolean> createRemoveRecordedForceDelete(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveRecordedForceDelete_QNAME, Boolean.class, RemoveRecorded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DeleteRecordingResult", scope = DeleteRecordingResponse.class)
    public JAXBElement<Boolean> createDeleteRecordingResponseDeleteRecordingResult(Boolean value) {
        return new JAXBElement<Boolean>(_DeleteRecordingResponseDeleteRecordingResult_QNAME, Boolean.class, DeleteRecordingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetConflictList.class)
    public JAXBElement<Integer> createGetConflictListStartIndex(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListStartIndex_QNAME, Integer.class, GetConflictList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetConflictList.class)
    public JAXBElement<Integer> createGetConflictListCount(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListCount_QNAME, Integer.class, GetConflictList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordId", scope = GetConflictList.class)
    public JAXBElement<Integer> createGetConflictListRecordId(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListRecordId_QNAME, Integer.class, GetConflictList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupMethodToDescriptionResult", scope = DupMethodToDescriptionResponse.class)
    public JAXBElement<String> createDupMethodToDescriptionResponseDupMethodToDescriptionResult(String value) {
        return new JAXBElement<String>(_DupMethodToDescriptionResponseDupMethodToDescriptionResult_QNAME, String.class, DupMethodToDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartOffset", scope = UpdateRecordSchedule.class)
    public JAXBElement<Integer> createUpdateRecordScheduleStartOffset(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleStartOffset_QNAME, Integer.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecPriority", scope = UpdateRecordSchedule.class)
    public JAXBElement<Integer> createUpdateRecordScheduleRecPriority(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleRecPriority_QNAME, Integer.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PreferredInput", scope = UpdateRecordSchedule.class)
    public JAXBElement<Long> createUpdateRecordSchedulePreferredInput(Long value) {
        return new JAXBElement<Long>(_UpdateRecordSchedulePreferredInput_QNAME, Long.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoCommflag", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleAutoCommflag(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoCommflag_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProgramId", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleProgramId(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleProgramId_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecGroup", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleRecGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleRecGroup_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MaxEpisodes", scope = UpdateRecordSchedule.class)
    public JAXBElement<Integer> createUpdateRecordScheduleMaxEpisodes(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleMaxEpisodes_QNAME, Integer.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = UpdateRecordSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateRecordScheduleStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoUserJob2", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleAutoUserJob2(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoUserJob2_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Title", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleTitle(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleTitle_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoUserJob1", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleAutoUserJob1(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoUserJob1_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Transcoder", scope = UpdateRecordSchedule.class)
    public JAXBElement<Integer> createUpdateRecordScheduleTranscoder(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleTranscoder_QNAME, Integer.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Filter", scope = UpdateRecordSchedule.class)
    public JAXBElement<Long> createUpdateRecordScheduleFilter(Long value) {
        return new JAXBElement<Long>(_UpdateRecordScheduleFilter_QNAME, Long.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoUserJob4", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleAutoUserJob4(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoUserJob4_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoUserJob3", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleAutoUserJob3(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoUserJob3_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Station", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleStation(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleStation_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Subtitle", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleSubtitle(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleSubtitle_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Episode", scope = UpdateRecordSchedule.class)
    public JAXBElement<Long> createUpdateRecordScheduleEpisode(Long value) {
        return new JAXBElement<Long>(_UpdateRecordScheduleEpisode_QNAME, Long.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Type", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleType(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleType_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PlayGroup", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordSchedulePlayGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordSchedulePlayGroup_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Inetref", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleInetref(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleInetref_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MaxNewest", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleMaxNewest(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleMaxNewest_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecProfile", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleRecProfile(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleRecProfile_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoMetaLookup", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleAutoMetaLookup(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoMetaLookup_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTime", scope = UpdateRecordSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateRecordScheduleEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramEndTime_QNAME, XMLGregorianCalendar.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SeriesId", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleSeriesId(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleSeriesId_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Description", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleDescription(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDescription_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Category", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleCategory(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleCategory_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = UpdateRecordSchedule.class)
    public JAXBElement<Integer> createUpdateRecordScheduleChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndOffset", scope = UpdateRecordSchedule.class)
    public JAXBElement<Integer> createUpdateRecordScheduleEndOffset(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleEndOffset_QNAME, Integer.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupIn", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleDupIn(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDupIn_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleStorageGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleStorageGroup_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Season", scope = UpdateRecordSchedule.class)
    public JAXBElement<Long> createUpdateRecordScheduleSeason(Long value) {
        return new JAXBElement<Long>(_UpdateRecordScheduleSeason_QNAME, Long.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FindDay", scope = UpdateRecordSchedule.class)
    public JAXBElement<Integer> createUpdateRecordScheduleFindDay(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleFindDay_QNAME, Integer.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FindTime", scope = UpdateRecordSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateRecordScheduleFindTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateRecordScheduleFindTime_QNAME, XMLGregorianCalendar.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoExpire", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleAutoExpire(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoExpire_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Inactive", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleInactive(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleInactive_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordId", scope = UpdateRecordSchedule.class)
    public JAXBElement<Long> createUpdateRecordScheduleRecordId(Long value) {
        return new JAXBElement<Long>(_GetConflictListRecordId_QNAME, Long.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SearchType", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleSearchType(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleSearchType_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupMethod", scope = UpdateRecordSchedule.class)
    public JAXBElement<String> createUpdateRecordScheduleDupMethod(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDupMethod_QNAME, String.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoTranscode", scope = UpdateRecordSchedule.class)
    public JAXBElement<Boolean> createUpdateRecordScheduleAutoTranscode(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoTranscode_QNAME, Boolean.class, UpdateRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetInputListResult", scope = GetInputListResponse.class)
    public JAXBElement<InputList> createGetInputListResponseGetInputListResult(InputList value) {
        return new JAXBElement<InputList>(_GetInputListResponseGetInputListResult_QNAME, InputList.class, GetInputListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncoderList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetEncoderListResult", scope = GetEncoderListResponse.class)
    public JAXBElement<EncoderList> createGetEncoderListResponseGetEncoderListResult(EncoderList value) {
        return new JAXBElement<EncoderList>(_GetEncoderListResponseGetEncoderListResult_QNAME, EncoderList.class, GetEncoderListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecGroupListResult", scope = GetRecGroupListResponse.class)
    public JAXBElement<ArrayOfString> createGetRecGroupListResponseGetRecGroupListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetRecGroupListResponseGetRecGroupListResult_QNAME, ArrayOfString.class, GetRecGroupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecStatus", scope = RecStatusToDescription.class)
    public JAXBElement<Integer> createRecStatusToDescriptionRecStatus(Integer value) {
        return new JAXBElement<Integer>(_RecStatusToDescriptionRecStatus_QNAME, Integer.class, RecStatusToDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = RecStatusToDescription.class)
    public JAXBElement<XMLGregorianCalendar> createRecStatusToDescriptionStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, RecStatusToDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecType", scope = RecStatusToDescription.class)
    public JAXBElement<Integer> createRecStatusToDescriptionRecType(Integer value) {
        return new JAXBElement<Integer>(_RecStatusToDescriptionRecType_QNAME, Integer.class, RecStatusToDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetRecordedList.class)
    public JAXBElement<Integer> createGetRecordedListStartIndex(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListStartIndex_QNAME, Integer.class, GetRecordedList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Descending", scope = GetRecordedList.class)
    public JAXBElement<Boolean> createGetRecordedListDescending(Boolean value) {
        return new JAXBElement<Boolean>(_GetRecordedListDescending_QNAME, Boolean.class, GetRecordedList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = GetRecordedList.class)
    public JAXBElement<String> createGetRecordedListStorageGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleStorageGroup_QNAME, String.class, GetRecordedList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecGroup", scope = GetRecordedList.class)
    public JAXBElement<String> createGetRecordedListRecGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleRecGroup_QNAME, String.class, GetRecordedList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "TitleRegEx", scope = GetRecordedList.class)
    public JAXBElement<String> createGetRecordedListTitleRegEx(String value) {
        return new JAXBElement<String>(_GetRecordedListTitleRegEx_QNAME, String.class, GetRecordedList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetRecordedList.class)
    public JAXBElement<Integer> createGetRecordedListCount(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListCount_QNAME, Integer.class, GetRecordedList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ReactivateRecordingResult", scope = ReactivateRecordingResponse.class)
    public JAXBElement<Boolean> createReactivateRecordingResponseReactivateRecordingResult(Boolean value) {
        return new JAXBElement<Boolean>(_ReactivateRecordingResponseReactivateRecordingResult_QNAME, Boolean.class, ReactivateRecordingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetRecordSchedule.class)
    public JAXBElement<Integer> createGetRecordScheduleChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, GetRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MakeOverride", scope = GetRecordSchedule.class)
    public JAXBElement<Boolean> createGetRecordScheduleMakeOverride(Boolean value) {
        return new JAXBElement<Boolean>(_GetRecordScheduleMakeOverride_QNAME, Boolean.class, GetRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetRecordSchedule.class)
    public JAXBElement<Integer> createGetRecordScheduleRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, GetRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Template", scope = GetRecordSchedule.class)
    public JAXBElement<String> createGetRecordScheduleTemplate(String value) {
        return new JAXBElement<String>(_GetRecordScheduleTemplate_QNAME, String.class, GetRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetRecordSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createGetRecordScheduleStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, GetRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordId", scope = GetRecordSchedule.class)
    public JAXBElement<Long> createGetRecordScheduleRecordId(Long value) {
        return new JAXBElement<Long>(_GetConflictListRecordId_QNAME, Long.class, GetRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetRecordedCommBreak.class)
    public JAXBElement<Integer> createGetRecordedCommBreakChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, GetRecordedCommBreak.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetRecordedCommBreak.class)
    public JAXBElement<Integer> createGetRecordedCommBreakRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, GetRecordedCommBreak.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetRecordedCommBreak.class)
    public JAXBElement<XMLGregorianCalendar> createGetRecordedCommBreakStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, GetRecordedCommBreak.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OffsetType", scope = GetRecordedCommBreak.class)
    public JAXBElement<String> createGetRecordedCommBreakOffsetType(String value) {
        return new JAXBElement<String>(_GetRecordedCutListOffsetType_QNAME, String.class, GetRecordedCommBreak.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveRecordScheduleResult", scope = RemoveRecordScheduleResponse.class)
    public JAXBElement<Boolean> createRemoveRecordScheduleResponseRemoveRecordScheduleResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveRecordScheduleResponseRemoveRecordScheduleResult_QNAME, Boolean.class, RemoveRecordScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetTitleListResult", scope = GetTitleListResponse.class)
    public JAXBElement<ArrayOfString> createGetTitleListResponseGetTitleListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetTitleListResponseGetTitleListResult_QNAME, ArrayOfString.class, GetTitleListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetPlayGroupListResult", scope = GetPlayGroupListResponse.class)
    public JAXBElement<ArrayOfString> createGetPlayGroupListResponseGetPlayGroupListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetPlayGroupListResponseGetPlayGroupListResult_QNAME, ArrayOfString.class, GetPlayGroupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CutList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordedCutListResult", scope = GetRecordedCutListResponse.class)
    public JAXBElement<CutList> createGetRecordedCutListResponseGetRecordedCutListResult(CutList value) {
        return new JAXBElement<CutList>(_GetRecordedCutListResponseGetRecordedCutListResult_QNAME, CutList.class, GetRecordedCutListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetSavedBookmarkResult", scope = GetSavedBookmarkResponse.class)
    public JAXBElement<Long> createGetSavedBookmarkResponseGetSavedBookmarkResult(Long value) {
        return new JAXBElement<Long>(_GetSavedBookmarkResponseGetSavedBookmarkResult_QNAME, Long.class, GetSavedBookmarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTime", scope = RecRule.class)
    public JAXBElement<XMLGregorianCalendar> createRecRuleEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramEndTime_QNAME, XMLGregorianCalendar.class, RecRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LastDeleted", scope = RecRule.class)
    public JAXBElement<XMLGregorianCalendar> createRecRuleLastDeleted(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecRuleLastDeleted_QNAME, XMLGregorianCalendar.class, RecRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LastRecorded", scope = RecRule.class)
    public JAXBElement<XMLGregorianCalendar> createRecRuleLastRecorded(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecRuleLastRecorded_QNAME, XMLGregorianCalendar.class, RecRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = RecRule.class)
    public JAXBElement<XMLGregorianCalendar> createRecRuleStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, RecRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FindTime", scope = RecRule.class)
    public JAXBElement<XMLGregorianCalendar> createRecRuleFindTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateRecordScheduleFindTime_QNAME, XMLGregorianCalendar.class, RecRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "NextRecording", scope = RecRule.class)
    public JAXBElement<XMLGregorianCalendar> createRecRuleNextRecording(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecRuleNextRecording_QNAME, XMLGregorianCalendar.class, RecRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SetSavedBookmarkResult", scope = SetSavedBookmarkResponse.class)
    public JAXBElement<Boolean> createSetSavedBookmarkResponseSetSavedBookmarkResult(Boolean value) {
        return new JAXBElement<Boolean>(_SetSavedBookmarkResponseSetSavedBookmarkResult_QNAME, Boolean.class, SetSavedBookmarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecStatus", scope = RecStatusToString.class)
    public JAXBElement<Integer> createRecStatusToStringRecStatus(Integer value) {
        return new JAXBElement<Integer>(_RecStatusToDescriptionRecStatus_QNAME, Integer.class, RecStatusToString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupMethod", scope = DupMethodToDescription.class)
    public JAXBElement<String> createDupMethodToDescriptionDupMethod(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDupMethod_QNAME, String.class, DupMethodToDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordId", scope = DisableRecordSchedule.class)
    public JAXBElement<Long> createDisableRecordScheduleRecordId(Long value) {
        return new JAXBElement<Long>(_GetConflictListRecordId_QNAME, Long.class, DisableRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordScheduleResult", scope = GetRecordScheduleResponse.class)
    public JAXBElement<RecRule> createGetRecordScheduleResponseGetRecordScheduleResult(RecRule value) {
        return new JAXBElement<RecRule>(_GetRecordScheduleResponseGetRecordScheduleResult_QNAME, RecRule.class, GetRecordScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Program }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordedResult", scope = GetRecordedResponse.class)
    public JAXBElement<Program> createGetRecordedResponseGetRecordedResult(Program value) {
        return new JAXBElement<Program>(_GetRecordedResponseGetRecordedResult_QNAME, Program.class, GetRecordedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupInToDescriptionResult", scope = DupInToDescriptionResponse.class)
    public JAXBElement<String> createDupInToDescriptionResponseDupInToDescriptionResult(String value) {
        return new JAXBElement<String>(_DupInToDescriptionResponseDupInToDescriptionResult_QNAME, String.class, DupInToDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecStatusToStringResult", scope = RecStatusToStringResponse.class)
    public JAXBElement<String> createRecStatusToStringResponseRecStatusToStringResult(String value) {
        return new JAXBElement<String>(_RecStatusToStringResponseRecStatusToStringResult_QNAME, String.class, RecStatusToStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedIdForPathnameResult", scope = RecordedIdForPathnameResponse.class)
    public JAXBElement<Integer> createRecordedIdForPathnameResponseRecordedIdForPathnameResult(Integer value) {
        return new JAXBElement<Integer>(_RecordedIdForPathnameResponseRecordedIdForPathnameResult_QNAME, Integer.class, RecordedIdForPathnameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecStatusToDescriptionResult", scope = RecStatusToDescriptionResponse.class)
    public JAXBElement<String> createRecStatusToDescriptionResponseRecStatusToDescriptionResult(String value) {
        return new JAXBElement<String>(_RecStatusToDescriptionResponseRecStatusToDescriptionResult_QNAME, String.class, RecStatusToDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RescheduleRecordingsResult", scope = RescheduleRecordingsResponse.class)
    public JAXBElement<Boolean> createRescheduleRecordingsResponseRescheduleRecordingsResult(Boolean value) {
        return new JAXBElement<Boolean>(_RescheduleRecordingsResponseRescheduleRecordingsResult_QNAME, Boolean.class, RescheduleRecordingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UpdateRecordedWatchedStatusResult", scope = UpdateRecordedWatchedStatusResponse.class)
    public JAXBElement<Boolean> createUpdateRecordedWatchedStatusResponseUpdateRecordedWatchedStatusResult(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordedWatchedStatusResponseUpdateRecordedWatchedStatusResult_QNAME, Boolean.class, UpdateRecordedWatchedStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetUpcomingListResult", scope = GetUpcomingListResponse.class)
    public JAXBElement<ProgramList> createGetUpcomingListResponseGetUpcomingListResult(ProgramList value) {
        return new JAXBElement<ProgramList>(_GetUpcomingListResponseGetUpcomingListResult_QNAME, ProgramList.class, GetUpcomingListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetRecordScheduleList.class)
    public JAXBElement<Integer> createGetRecordScheduleListStartIndex(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListStartIndex_QNAME, Integer.class, GetRecordScheduleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Descending", scope = GetRecordScheduleList.class)
    public JAXBElement<Boolean> createGetRecordScheduleListDescending(Boolean value) {
        return new JAXBElement<Boolean>(_GetRecordedListDescending_QNAME, Boolean.class, GetRecordScheduleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Sort", scope = GetRecordScheduleList.class)
    public JAXBElement<String> createGetRecordScheduleListSort(String value) {
        return new JAXBElement<String>(_GetRecordScheduleListSort_QNAME, String.class, GetRecordScheduleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetRecordScheduleList.class)
    public JAXBElement<Integer> createGetRecordScheduleListCount(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListCount_QNAME, Integer.class, GetRecordScheduleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupIn", scope = DupInToDescription.class)
    public JAXBElement<String> createDupInToDescriptionDupIn(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDupIn_QNAME, String.class, DupInToDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupMethod", scope = DupMethodToString.class)
    public JAXBElement<String> createDupMethodToStringDupMethod(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDupMethod_QNAME, String.class, DupMethodToString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = AddDontRecordSchedule.class)
    public JAXBElement<Integer> createAddDontRecordScheduleChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, AddDontRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "NeverRecord", scope = AddDontRecordSchedule.class)
    public JAXBElement<Boolean> createAddDontRecordScheduleNeverRecord(Boolean value) {
        return new JAXBElement<Boolean>(_AddDontRecordScheduleNeverRecord_QNAME, Boolean.class, AddDontRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = AddDontRecordSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createAddDontRecordScheduleStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, AddDontRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecStorageGroupListResult", scope = GetRecStorageGroupListResponse.class)
    public JAXBElement<ArrayOfString> createGetRecStorageGroupListResponseGetRecStorageGroupListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetRecStorageGroupListResponseGetRecStorageGroupListResult_QNAME, ArrayOfString.class, GetRecStorageGroupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EnableRecordScheduleResult", scope = EnableRecordScheduleResponse.class)
    public JAXBElement<Boolean> createEnableRecordScheduleResponseEnableRecordScheduleResult(Boolean value) {
        return new JAXBElement<Boolean>(_EnableRecordScheduleResponseEnableRecordScheduleResult_QNAME, Boolean.class, EnableRecordScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupIn", scope = DupInToString.class)
    public JAXBElement<String> createDupInToStringDupIn(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDupIn_QNAME, String.class, DupInToString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddRecordScheduleResult", scope = AddRecordScheduleResponse.class)
    public JAXBElement<Long> createAddRecordScheduleResponseAddRecordScheduleResult(Long value) {
        return new JAXBElement<Long>(_AddRecordScheduleResponseAddRecordScheduleResult_QNAME, Long.class, AddRecordScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartOffset", scope = AddRecordSchedule.class)
    public JAXBElement<Integer> createAddRecordScheduleStartOffset(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleStartOffset_QNAME, Integer.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ParentId", scope = AddRecordSchedule.class)
    public JAXBElement<Integer> createAddRecordScheduleParentId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordScheduleParentId_QNAME, Integer.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecPriority", scope = AddRecordSchedule.class)
    public JAXBElement<Integer> createAddRecordScheduleRecPriority(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleRecPriority_QNAME, Integer.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PreferredInput", scope = AddRecordSchedule.class)
    public JAXBElement<Long> createAddRecordSchedulePreferredInput(Long value) {
        return new JAXBElement<Long>(_UpdateRecordSchedulePreferredInput_QNAME, Long.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoCommflag", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleAutoCommflag(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoCommflag_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProgramId", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleProgramId(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleProgramId_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecGroup", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleRecGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleRecGroup_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MaxEpisodes", scope = AddRecordSchedule.class)
    public JAXBElement<Integer> createAddRecordScheduleMaxEpisodes(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleMaxEpisodes_QNAME, Integer.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = AddRecordSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createAddRecordScheduleStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoUserJob2", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleAutoUserJob2(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoUserJob2_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Title", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleTitle(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleTitle_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoUserJob1", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleAutoUserJob1(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoUserJob1_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Transcoder", scope = AddRecordSchedule.class)
    public JAXBElement<Integer> createAddRecordScheduleTranscoder(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleTranscoder_QNAME, Integer.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Filter", scope = AddRecordSchedule.class)
    public JAXBElement<Long> createAddRecordScheduleFilter(Long value) {
        return new JAXBElement<Long>(_UpdateRecordScheduleFilter_QNAME, Long.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoUserJob4", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleAutoUserJob4(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoUserJob4_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoUserJob3", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleAutoUserJob3(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoUserJob3_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Station", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleStation(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleStation_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Subtitle", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleSubtitle(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleSubtitle_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Episode", scope = AddRecordSchedule.class)
    public JAXBElement<Long> createAddRecordScheduleEpisode(Long value) {
        return new JAXBElement<Long>(_UpdateRecordScheduleEpisode_QNAME, Long.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Type", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleType(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleType_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PlayGroup", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordSchedulePlayGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordSchedulePlayGroup_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Inetref", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleInetref(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleInetref_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MaxNewest", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleMaxNewest(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleMaxNewest_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecProfile", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleRecProfile(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleRecProfile_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoMetaLookup", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleAutoMetaLookup(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoMetaLookup_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTime", scope = AddRecordSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createAddRecordScheduleEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramEndTime_QNAME, XMLGregorianCalendar.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SeriesId", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleSeriesId(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleSeriesId_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Description", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleDescription(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDescription_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Category", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleCategory(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleCategory_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = AddRecordSchedule.class)
    public JAXBElement<Integer> createAddRecordScheduleChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndOffset", scope = AddRecordSchedule.class)
    public JAXBElement<Integer> createAddRecordScheduleEndOffset(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleEndOffset_QNAME, Integer.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupIn", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleDupIn(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDupIn_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleStorageGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleStorageGroup_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Season", scope = AddRecordSchedule.class)
    public JAXBElement<Long> createAddRecordScheduleSeason(Long value) {
        return new JAXBElement<Long>(_UpdateRecordScheduleSeason_QNAME, Long.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FindDay", scope = AddRecordSchedule.class)
    public JAXBElement<Integer> createAddRecordScheduleFindDay(Integer value) {
        return new JAXBElement<Integer>(_UpdateRecordScheduleFindDay_QNAME, Integer.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FindTime", scope = AddRecordSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createAddRecordScheduleFindTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateRecordScheduleFindTime_QNAME, XMLGregorianCalendar.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoExpire", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleAutoExpire(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoExpire_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Inactive", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleInactive(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleInactive_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SearchType", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleSearchType(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleSearchType_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DupMethod", scope = AddRecordSchedule.class)
    public JAXBElement<String> createAddRecordScheduleDupMethod(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleDupMethod_QNAME, String.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AutoTranscode", scope = AddRecordSchedule.class)
    public JAXBElement<Boolean> createAddRecordScheduleAutoTranscode(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordScheduleAutoTranscode_QNAME, Boolean.class, AddRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CutList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordedCommBreakResult", scope = GetRecordedCommBreakResponse.class)
    public JAXBElement<CutList> createGetRecordedCommBreakResponseGetRecordedCommBreakResult(CutList value) {
        return new JAXBElement<CutList>(_GetRecordedCommBreakResponseGetRecordedCommBreakResult_QNAME, CutList.class, GetRecordedCommBreakResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecRuleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordScheduleListResult", scope = GetRecordScheduleListResponse.class)
    public JAXBElement<RecRuleList> createGetRecordScheduleListResponseGetRecordScheduleListResult(RecRuleList value) {
        return new JAXBElement<RecRuleList>(_GetRecordScheduleListResponseGetRecordScheduleListResult_QNAME, RecRuleList.class, GetRecordScheduleListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = StopRecording.class)
    public JAXBElement<Integer> createStopRecordingRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, StopRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordedListResult", scope = GetRecordedListResponse.class)
    public JAXBElement<ProgramList> createGetRecordedListResponseGetRecordedListResult(ProgramList value) {
        return new JAXBElement<ProgramList>(_GetRecordedListResponseGetRecordedListResult_QNAME, ProgramList.class, GetRecordedListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordId", scope = EnableRecordSchedule.class)
    public JAXBElement<Long> createEnableRecordScheduleRecordId(Long value) {
        return new JAXBElement<Long>(_GetConflictListRecordId_QNAME, Long.class, EnableRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Pathname", scope = RecordedIdForPathname.class)
    public JAXBElement<String> createRecordedIdForPathnamePathname(String value) {
        return new JAXBElement<String>(_RecordedIdForPathnamePathname_QNAME, String.class, RecordedIdForPathname.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecTypeToStringResult", scope = RecTypeToStringResponse.class)
    public JAXBElement<String> createRecTypeToStringResponseRecTypeToStringResult(String value) {
        return new JAXBElement<String>(_RecTypeToStringResponseRecTypeToStringResult_QNAME, String.class, RecTypeToStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecType", scope = RecTypeToString.class)
    public JAXBElement<String> createRecTypeToStringRecType(String value) {
        return new JAXBElement<String>(_RecStatusToDescriptionRecType_QNAME, String.class, RecTypeToString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetSavedBookmark.class)
    public JAXBElement<Integer> createGetSavedBookmarkChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, GetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetSavedBookmark.class)
    public JAXBElement<Integer> createGetSavedBookmarkRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, GetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetSavedBookmark.class)
    public JAXBElement<XMLGregorianCalendar> createGetSavedBookmarkStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, GetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OffsetType", scope = GetSavedBookmark.class)
    public JAXBElement<String> createGetSavedBookmarkOffsetType(String value) {
        return new JAXBElement<String>(_GetRecordedCutListOffsetType_QNAME, String.class, GetSavedBookmark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetExpiringList.class)
    public JAXBElement<Integer> createGetExpiringListStartIndex(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListStartIndex_QNAME, Integer.class, GetExpiringList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetExpiringList.class)
    public JAXBElement<Integer> createGetExpiringListCount(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListCount_QNAME, Integer.class, GetExpiringList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecType", scope = RecTypeToDescription.class)
    public JAXBElement<String> createRecTypeToDescriptionRecType(String value) {
        return new JAXBElement<String>(_RecStatusToDescriptionRecType_QNAME, String.class, RecTypeToDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Program }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Recording", scope = Encoder.class)
    public JAXBElement<Program> createEncoderRecording(Program value) {
        return new JAXBElement<Program>(_ProgramRecording_QNAME, Program.class, Encoder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = DeleteRecording.class)
    public JAXBElement<Integer> createDeleteRecordingChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, DeleteRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = DeleteRecording.class)
    public JAXBElement<Integer> createDeleteRecordingRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, DeleteRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = DeleteRecording.class)
    public JAXBElement<XMLGregorianCalendar> createDeleteRecordingStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, DeleteRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AllowRerecord", scope = DeleteRecording.class)
    public JAXBElement<Boolean> createDeleteRecordingAllowRerecord(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveRecordedAllowRerecord_QNAME, Boolean.class, DeleteRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ForceDelete", scope = DeleteRecording.class)
    public JAXBElement<Boolean> createDeleteRecordingForceDelete(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveRecordedForceDelete_QNAME, Boolean.class, DeleteRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetRecordedSeek.class)
    public JAXBElement<Integer> createGetRecordedSeekRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, GetRecordedSeek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OffsetType", scope = GetRecordedSeek.class)
    public JAXBElement<String> createGetRecordedSeekOffsetType(String value) {
        return new JAXBElement<String>(_GetRecordedCutListOffsetType_QNAME, String.class, GetRecordedSeek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetUpcomingList.class)
    public JAXBElement<Integer> createGetUpcomingListStartIndex(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListStartIndex_QNAME, Integer.class, GetUpcomingList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ShowAll", scope = GetUpcomingList.class)
    public JAXBElement<Boolean> createGetUpcomingListShowAll(Boolean value) {
        return new JAXBElement<Boolean>(_GetUpcomingListShowAll_QNAME, Boolean.class, GetUpcomingList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecStatus", scope = GetUpcomingList.class)
    public JAXBElement<Integer> createGetUpcomingListRecStatus(Integer value) {
        return new JAXBElement<Integer>(_RecStatusToDescriptionRecStatus_QNAME, Integer.class, GetUpcomingList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetUpcomingList.class)
    public JAXBElement<Integer> createGetUpcomingListCount(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListCount_QNAME, Integer.class, GetUpcomingList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordId", scope = GetUpcomingList.class)
    public JAXBElement<Integer> createGetUpcomingListRecordId(Integer value) {
        return new JAXBElement<Integer>(_GetConflictListRecordId_QNAME, Integer.class, GetUpcomingList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTs", scope = RecordingInfo.class)
    public JAXBElement<XMLGregorianCalendar> createRecordingInfoEndTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecordingInfoEndTs_QNAME, XMLGregorianCalendar.class, RecordingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LastModified", scope = RecordingInfo.class)
    public JAXBElement<XMLGregorianCalendar> createRecordingInfoLastModified(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramLastModified_QNAME, XMLGregorianCalendar.class, RecordingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTs", scope = RecordingInfo.class)
    public JAXBElement<XMLGregorianCalendar> createRecordingInfoStartTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecordingInfoStartTs_QNAME, XMLGregorianCalendar.class, RecordingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddDontRecordScheduleResult", scope = AddDontRecordScheduleResponse.class)
    public JAXBElement<Boolean> createAddDontRecordScheduleResponseAddDontRecordScheduleResult(Boolean value) {
        return new JAXBElement<Boolean>(_AddDontRecordScheduleResponseAddDontRecordScheduleResult_QNAME, Boolean.class, AddDontRecordScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordId", scope = RemoveRecordSchedule.class)
    public JAXBElement<Long> createRemoveRecordScheduleRecordId(Long value) {
        return new JAXBElement<Long>(_GetConflictListRecordId_QNAME, Long.class, RemoveRecordSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = UpdateRecordedWatchedStatus.class)
    public JAXBElement<Integer> createUpdateRecordedWatchedStatusChanId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingChanId_QNAME, Integer.class, UpdateRecordedWatchedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = UpdateRecordedWatchedStatus.class)
    public JAXBElement<Integer> createUpdateRecordedWatchedStatusRecordedId(Integer value) {
        return new JAXBElement<Integer>(_UnDeleteRecordingRecordedId_QNAME, Integer.class, UpdateRecordedWatchedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = UpdateRecordedWatchedStatus.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateRecordedWatchedStatusStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UnDeleteRecordingStartTime_QNAME, XMLGregorianCalendar.class, UpdateRecordedWatchedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Watched", scope = UpdateRecordedWatchedStatus.class)
    public JAXBElement<Boolean> createUpdateRecordedWatchedStatusWatched(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateRecordedWatchedStatusWatched_QNAME, Boolean.class, UpdateRecordedWatchedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecGroup", scope = GetTitleList.class)
    public JAXBElement<String> createGetTitleListRecGroup(String value) {
        return new JAXBElement<String>(_UpdateRecordScheduleRecGroup_QNAME, String.class, GetTitleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StopRecordingResult", scope = StopRecordingResponse.class)
    public JAXBElement<Boolean> createStopRecordingResponseStopRecordingResult(Boolean value) {
        return new JAXBElement<Boolean>(_StopRecordingResponseStopRecordingResult_QNAME, Boolean.class, StopRecordingResponse.class, value);
    }

}
