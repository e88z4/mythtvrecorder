
package mythtvapi.channel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mythtvapi.channel package. 
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

    private final static QName _Lineup_QNAME = new QName("http://mythtv.org", "Lineup");
    private final static QName _VideoMultiplexList_QNAME = new QName("http://mythtv.org", "VideoMultiplexList");
    private final static QName _LineupList_QNAME = new QName("http://mythtv.org", "LineupList");
    private final static QName _RecordingInfo_QNAME = new QName("http://mythtv.org", "RecordingInfo");
    private final static QName _ArrayOfVideoSource_QNAME = new QName("http://mythtv.org", "ArrayOfVideoSource");
    private final static QName _Program_QNAME = new QName("http://mythtv.org", "Program");
    private final static QName _ArrayOfChannelInfo_QNAME = new QName("http://mythtv.org", "ArrayOfChannelInfo");
    private final static QName _VideoMultiplex_QNAME = new QName("http://mythtv.org", "VideoMultiplex");
    private final static QName _ChannelInfo_QNAME = new QName("http://mythtv.org", "ChannelInfo");
    private final static QName _CastMemberList_QNAME = new QName("http://mythtv.org", "CastMemberList");
    private final static QName _ArrayOfProgram_QNAME = new QName("http://mythtv.org", "ArrayOfProgram");
    private final static QName _ArtworkInfo_QNAME = new QName("http://mythtv.org", "ArtworkInfo");
    private final static QName _ArrayOfCastMember_QNAME = new QName("http://mythtv.org", "ArrayOfCastMember");
    private final static QName _ArtworkInfoList_QNAME = new QName("http://mythtv.org", "ArtworkInfoList");
    private final static QName _ArrayOfLineup_QNAME = new QName("http://mythtv.org", "ArrayOfLineup");
    private final static QName _ArrayOfString_QNAME = new QName("http://mythtv.org", "ArrayOfString");
    private final static QName _CastMember_QNAME = new QName("http://mythtv.org", "CastMember");
    private final static QName _ArrayOfVideoMultiplex_QNAME = new QName("http://mythtv.org", "ArrayOfVideoMultiplex");
    private final static QName _VideoSourceList_QNAME = new QName("http://mythtv.org", "VideoSourceList");
    private final static QName _RecStatusType_QNAME = new QName("http://mythtv.org", "RecStatus.Type");
    private final static QName _ChannelInfoList_QNAME = new QName("http://mythtv.org", "ChannelInfoList");
    private final static QName _VideoSource_QNAME = new QName("http://mythtv.org", "VideoSource");
    private final static QName _ArrayOfArtworkInfo_QNAME = new QName("http://mythtv.org", "ArrayOfArtworkInfo");
    private final static QName _GetChannelInfoListResponseGetChannelInfoListResult_QNAME = new QName("http://mythtv.org", "GetChannelInfoListResult");
    private final static QName _GetChannelInfoListStartIndex_QNAME = new QName("http://mythtv.org", "StartIndex");
    private final static QName _GetChannelInfoListSourceID_QNAME = new QName("http://mythtv.org", "SourceID");
    private final static QName _GetChannelInfoListDetails_QNAME = new QName("http://mythtv.org", "Details");
    private final static QName _GetChannelInfoListOnlyVisible_QNAME = new QName("http://mythtv.org", "OnlyVisible");
    private final static QName _GetChannelInfoListCount_QNAME = new QName("http://mythtv.org", "Count");
    private final static QName _RemoveDBChannelResponseRemoveDBChannelResult_QNAME = new QName("http://mythtv.org", "RemoveDBChannelResult");
    private final static QName _UpdateDBChannelChannelNumber_QNAME = new QName("http://mythtv.org", "ChannelNumber");
    private final static QName _UpdateDBChannelUseEIT_QNAME = new QName("http://mythtv.org", "UseEIT");
    private final static QName _UpdateDBChannelFrequencyID_QNAME = new QName("http://mythtv.org", "FrequencyID");
    private final static QName _UpdateDBChannelChannelID_QNAME = new QName("http://mythtv.org", "ChannelID");
    private final static QName _UpdateDBChannelATSCMinorChannel_QNAME = new QName("http://mythtv.org", "ATSCMinorChannel");
    private final static QName _UpdateDBChannelServiceID_QNAME = new QName("http://mythtv.org", "ServiceID");
    private final static QName _UpdateDBChannelDefaultAuthority_QNAME = new QName("http://mythtv.org", "DefaultAuthority");
    private final static QName _UpdateDBChannelXMLTVID_QNAME = new QName("http://mythtv.org", "XMLTVID");
    private final static QName _UpdateDBChannelCallSign_QNAME = new QName("http://mythtv.org", "CallSign");
    private final static QName _UpdateDBChannelMplexID_QNAME = new QName("http://mythtv.org", "MplexID");
    private final static QName _UpdateDBChannelChannelName_QNAME = new QName("http://mythtv.org", "ChannelName");
    private final static QName _UpdateDBChannelFormat_QNAME = new QName("http://mythtv.org", "Format");
    private final static QName _UpdateDBChannelATSCMajorChannel_QNAME = new QName("http://mythtv.org", "ATSCMajorChannel");
    private final static QName _UpdateDBChannelVisible_QNAME = new QName("http://mythtv.org", "Visible");
    private final static QName _UpdateDBChannelIcon_QNAME = new QName("http://mythtv.org", "Icon");
    private final static QName _GetVideoSourceResponseGetVideoSourceResult_QNAME = new QName("http://mythtv.org", "GetVideoSourceResult");
    private final static QName _AddVideoSourceGrabber_QNAME = new QName("http://mythtv.org", "Grabber");
    private final static QName _AddVideoSourceFreqTable_QNAME = new QName("http://mythtv.org", "FreqTable");
    private final static QName _AddVideoSourceUserId_QNAME = new QName("http://mythtv.org", "UserId");
    private final static QName _AddVideoSourcePassword_QNAME = new QName("http://mythtv.org", "Password");
    private final static QName _AddVideoSourceLineupId_QNAME = new QName("http://mythtv.org", "LineupId");
    private final static QName _AddVideoSourceConfigPath_QNAME = new QName("http://mythtv.org", "ConfigPath");
    private final static QName _AddVideoSourceSourceName_QNAME = new QName("http://mythtv.org", "SourceName");
    private final static QName _AddVideoSourceNITId_QNAME = new QName("http://mythtv.org", "NITId");
    private final static QName _AddVideoSourceResponseAddVideoSourceResult_QNAME = new QName("http://mythtv.org", "AddVideoSourceResult");
    private final static QName _ProgramEndTime_QNAME = new QName("http://mythtv.org", "EndTime");
    private final static QName _ProgramChannel_QNAME = new QName("http://mythtv.org", "Channel");
    private final static QName _ProgramLastModified_QNAME = new QName("http://mythtv.org", "LastModified");
    private final static QName _ProgramCast_QNAME = new QName("http://mythtv.org", "Cast");
    private final static QName _ProgramArtwork_QNAME = new QName("http://mythtv.org", "Artwork");
    private final static QName _ProgramAirdate_QNAME = new QName("http://mythtv.org", "Airdate");
    private final static QName _ProgramStartTime_QNAME = new QName("http://mythtv.org", "StartTime");
    private final static QName _ProgramRecording_QNAME = new QName("http://mythtv.org", "Recording");
    private final static QName _GetChannelInfoResponseGetChannelInfoResult_QNAME = new QName("http://mythtv.org", "GetChannelInfoResult");
    private final static QName _VideoSourceListAsOf_QNAME = new QName("http://mythtv.org", "AsOf");
    private final static QName _GetVideoMultiplexResponseGetVideoMultiplexResult_QNAME = new QName("http://mythtv.org", "GetVideoMultiplexResult");
    private final static QName _RemoveVideoSourceResponseRemoveVideoSourceResult_QNAME = new QName("http://mythtv.org", "RemoveVideoSourceResult");
    private final static QName _RecordingInfoEndTs_QNAME = new QName("http://mythtv.org", "EndTs");
    private final static QName _RecordingInfoStartTs_QNAME = new QName("http://mythtv.org", "StartTs");
    private final static QName _VideoMultiplexUpdateTimeStamp_QNAME = new QName("http://mythtv.org", "UpdateTimeStamp");
    private final static QName _GetChannelInfoChanID_QNAME = new QName("http://mythtv.org", "ChanID");
    private final static QName _GetXMLTVIdListResponseGetXMLTVIdListResult_QNAME = new QName("http://mythtv.org", "GetXMLTVIdListResult");
    private final static QName _FetchChannelsFromSourceResponseFetchChannelsFromSourceResult_QNAME = new QName("http://mythtv.org", "FetchChannelsFromSourceResult");
    private final static QName _GetDDLineupListSource_QNAME = new QName("http://mythtv.org", "Source");
    private final static QName _GetVideoMultiplexListResponseGetVideoMultiplexListResult_QNAME = new QName("http://mythtv.org", "GetVideoMultiplexListResult");
    private final static QName _GetDDLineupListResponseGetDDLineupListResult_QNAME = new QName("http://mythtv.org", "GetDDLineupListResult");
    private final static QName _UpdateVideoSourceResponseUpdateVideoSourceResult_QNAME = new QName("http://mythtv.org", "UpdateVideoSourceResult");
    private final static QName _FetchChannelsFromSourceSourceId_QNAME = new QName("http://mythtv.org", "SourceId");
    private final static QName _FetchChannelsFromSourceWaitForFinish_QNAME = new QName("http://mythtv.org", "WaitForFinish");
    private final static QName _FetchChannelsFromSourceCardId_QNAME = new QName("http://mythtv.org", "CardId");
    private final static QName _AddDBChannelResponseAddDBChannelResult_QNAME = new QName("http://mythtv.org", "AddDBChannelResult");
    private final static QName _GetVideoSourceListResponseGetVideoSourceListResult_QNAME = new QName("http://mythtv.org", "GetVideoSourceListResult");
    private final static QName _UpdateDBChannelResponseUpdateDBChannelResult_QNAME = new QName("http://mythtv.org", "UpdateDBChannelResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mythtvapi.channel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddVideoSource }
     * 
     */
    public AddVideoSource createAddVideoSource() {
        return new AddVideoSource();
    }

    /**
     * Create an instance of {@link Lineup }
     * 
     */
    public Lineup createLineup() {
        return new Lineup();
    }

    /**
     * Create an instance of {@link VideoMultiplexList }
     * 
     */
    public VideoMultiplexList createVideoMultiplexList() {
        return new VideoMultiplexList();
    }

    /**
     * Create an instance of {@link UpdateDBChannelResponse }
     * 
     */
    public UpdateDBChannelResponse createUpdateDBChannelResponse() {
        return new UpdateDBChannelResponse();
    }

    /**
     * Create an instance of {@link LineupList }
     * 
     */
    public LineupList createLineupList() {
        return new LineupList();
    }

    /**
     * Create an instance of {@link FetchChannelsFromSource }
     * 
     */
    public FetchChannelsFromSource createFetchChannelsFromSource() {
        return new FetchChannelsFromSource();
    }

    /**
     * Create an instance of {@link VideoMultiplex }
     * 
     */
    public VideoMultiplex createVideoMultiplex() {
        return new VideoMultiplex();
    }

    /**
     * Create an instance of {@link ChannelInfo }
     * 
     */
    public ChannelInfo createChannelInfo() {
        return new ChannelInfo();
    }

    /**
     * Create an instance of {@link RemoveDBChannelResponse }
     * 
     */
    public RemoveDBChannelResponse createRemoveDBChannelResponse() {
        return new RemoveDBChannelResponse();
    }

    /**
     * Create an instance of {@link CastMember }
     * 
     */
    public CastMember createCastMember() {
        return new CastMember();
    }

    /**
     * Create an instance of {@link GetDDLineupListResponse }
     * 
     */
    public GetDDLineupListResponse createGetDDLineupListResponse() {
        return new GetDDLineupListResponse();
    }

    /**
     * Create an instance of {@link GetVideoSourceListResponse }
     * 
     */
    public GetVideoSourceListResponse createGetVideoSourceListResponse() {
        return new GetVideoSourceListResponse();
    }

    /**
     * Create an instance of {@link VideoSourceList }
     * 
     */
    public VideoSourceList createVideoSourceList() {
        return new VideoSourceList();
    }

    /**
     * Create an instance of {@link VideoSource }
     * 
     */
    public VideoSource createVideoSource() {
        return new VideoSource();
    }

    /**
     * Create an instance of {@link ArrayOfArtworkInfo }
     * 
     */
    public ArrayOfArtworkInfo createArrayOfArtworkInfo() {
        return new ArrayOfArtworkInfo();
    }

    /**
     * Create an instance of {@link GetXMLTVIdListResponse }
     * 
     */
    public GetXMLTVIdListResponse createGetXMLTVIdListResponse() {
        return new GetXMLTVIdListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetVideoSourceList }
     * 
     */
    public GetVideoSourceList createGetVideoSourceList() {
        return new GetVideoSourceList();
    }

    /**
     * Create an instance of {@link Program }
     * 
     */
    public Program createProgram() {
        return new Program();
    }

    /**
     * Create an instance of {@link UpdateDBChannel }
     * 
     */
    public UpdateDBChannel createUpdateDBChannel() {
        return new UpdateDBChannel();
    }

    /**
     * Create an instance of {@link RecordingInfo }
     * 
     */
    public RecordingInfo createRecordingInfo() {
        return new RecordingInfo();
    }

    /**
     * Create an instance of {@link AddDBChannelResponse }
     * 
     */
    public AddDBChannelResponse createAddDBChannelResponse() {
        return new AddDBChannelResponse();
    }

    /**
     * Create an instance of {@link ArrayOfVideoMultiplex }
     * 
     */
    public ArrayOfVideoMultiplex createArrayOfVideoMultiplex() {
        return new ArrayOfVideoMultiplex();
    }

    /**
     * Create an instance of {@link ArrayOfProgram }
     * 
     */
    public ArrayOfProgram createArrayOfProgram() {
        return new ArrayOfProgram();
    }

    /**
     * Create an instance of {@link GetChannelInfoListResponse }
     * 
     */
    public GetChannelInfoListResponse createGetChannelInfoListResponse() {
        return new GetChannelInfoListResponse();
    }

    /**
     * Create an instance of {@link ChannelInfoList }
     * 
     */
    public ChannelInfoList createChannelInfoList() {
        return new ChannelInfoList();
    }

    /**
     * Create an instance of {@link ArrayOfCastMember }
     * 
     */
    public ArrayOfCastMember createArrayOfCastMember() {
        return new ArrayOfCastMember();
    }

    /**
     * Create an instance of {@link ArtworkInfoList }
     * 
     */
    public ArtworkInfoList createArtworkInfoList() {
        return new ArtworkInfoList();
    }

    /**
     * Create an instance of {@link GetDDLineupList }
     * 
     */
    public GetDDLineupList createGetDDLineupList() {
        return new GetDDLineupList();
    }

    /**
     * Create an instance of {@link GetChannelInfoResponse }
     * 
     */
    public GetChannelInfoResponse createGetChannelInfoResponse() {
        return new GetChannelInfoResponse();
    }

    /**
     * Create an instance of {@link FetchChannelsFromSourceResponse }
     * 
     */
    public FetchChannelsFromSourceResponse createFetchChannelsFromSourceResponse() {
        return new FetchChannelsFromSourceResponse();
    }

    /**
     * Create an instance of {@link GetVideoMultiplexListResponse }
     * 
     */
    public GetVideoMultiplexListResponse createGetVideoMultiplexListResponse() {
        return new GetVideoMultiplexListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfVideoSource }
     * 
     */
    public ArrayOfVideoSource createArrayOfVideoSource() {
        return new ArrayOfVideoSource();
    }

    /**
     * Create an instance of {@link GetVideoMultiplexList }
     * 
     */
    public GetVideoMultiplexList createGetVideoMultiplexList() {
        return new GetVideoMultiplexList();
    }

    /**
     * Create an instance of {@link ArrayOfChannelInfo }
     * 
     */
    public ArrayOfChannelInfo createArrayOfChannelInfo() {
        return new ArrayOfChannelInfo();
    }

    /**
     * Create an instance of {@link GetChannelInfo }
     * 
     */
    public GetChannelInfo createGetChannelInfo() {
        return new GetChannelInfo();
    }

    /**
     * Create an instance of {@link GetXMLTVIdList }
     * 
     */
    public GetXMLTVIdList createGetXMLTVIdList() {
        return new GetXMLTVIdList();
    }

    /**
     * Create an instance of {@link AddVideoSourceResponse }
     * 
     */
    public AddVideoSourceResponse createAddVideoSourceResponse() {
        return new AddVideoSourceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLineup }
     * 
     */
    public ArrayOfLineup createArrayOfLineup() {
        return new ArrayOfLineup();
    }

    /**
     * Create an instance of {@link GetVideoMultiplex }
     * 
     */
    public GetVideoMultiplex createGetVideoMultiplex() {
        return new GetVideoMultiplex();
    }

    /**
     * Create an instance of {@link GetChannelInfoList }
     * 
     */
    public GetChannelInfoList createGetChannelInfoList() {
        return new GetChannelInfoList();
    }

    /**
     * Create an instance of {@link GetVideoSourceResponse }
     * 
     */
    public GetVideoSourceResponse createGetVideoSourceResponse() {
        return new GetVideoSourceResponse();
    }

    /**
     * Create an instance of {@link GetVideoMultiplexResponse }
     * 
     */
    public GetVideoMultiplexResponse createGetVideoMultiplexResponse() {
        return new GetVideoMultiplexResponse();
    }

    /**
     * Create an instance of {@link GetVideoSource }
     * 
     */
    public GetVideoSource createGetVideoSource() {
        return new GetVideoSource();
    }

    /**
     * Create an instance of {@link AddDBChannel }
     * 
     */
    public AddDBChannel createAddDBChannel() {
        return new AddDBChannel();
    }

    /**
     * Create an instance of {@link RemoveVideoSource }
     * 
     */
    public RemoveVideoSource createRemoveVideoSource() {
        return new RemoveVideoSource();
    }

    /**
     * Create an instance of {@link CastMemberList }
     * 
     */
    public CastMemberList createCastMemberList() {
        return new CastMemberList();
    }

    /**
     * Create an instance of {@link UpdateVideoSourceResponse }
     * 
     */
    public UpdateVideoSourceResponse createUpdateVideoSourceResponse() {
        return new UpdateVideoSourceResponse();
    }

    /**
     * Create an instance of {@link RemoveVideoSourceResponse }
     * 
     */
    public RemoveVideoSourceResponse createRemoveVideoSourceResponse() {
        return new RemoveVideoSourceResponse();
    }

    /**
     * Create an instance of {@link ArtworkInfo }
     * 
     */
    public ArtworkInfo createArtworkInfo() {
        return new ArtworkInfo();
    }

    /**
     * Create an instance of {@link UpdateVideoSource }
     * 
     */
    public UpdateVideoSource createUpdateVideoSource() {
        return new UpdateVideoSource();
    }

    /**
     * Create an instance of {@link RemoveDBChannel }
     * 
     */
    public RemoveDBChannel createRemoveDBChannel() {
        return new RemoveDBChannel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lineup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Lineup")
    public JAXBElement<Lineup> createLineup(Lineup value) {
        return new JAXBElement<Lineup>(_Lineup_QNAME, Lineup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMultiplexList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoMultiplexList")
    public JAXBElement<VideoMultiplexList> createVideoMultiplexList(VideoMultiplexList value) {
        return new JAXBElement<VideoMultiplexList>(_VideoMultiplexList_QNAME, VideoMultiplexList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineupList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LineupList")
    public JAXBElement<LineupList> createLineupList(LineupList value) {
        return new JAXBElement<LineupList>(_LineupList_QNAME, LineupList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVideoSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfVideoSource")
    public JAXBElement<ArrayOfVideoSource> createArrayOfVideoSource(ArrayOfVideoSource value) {
        return new JAXBElement<ArrayOfVideoSource>(_ArrayOfVideoSource_QNAME, ArrayOfVideoSource.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChannelInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfChannelInfo")
    public JAXBElement<ArrayOfChannelInfo> createArrayOfChannelInfo(ArrayOfChannelInfo value) {
        return new JAXBElement<ArrayOfChannelInfo>(_ArrayOfChannelInfo_QNAME, ArrayOfChannelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMultiplex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoMultiplex")
    public JAXBElement<VideoMultiplex> createVideoMultiplex(VideoMultiplex value) {
        return new JAXBElement<VideoMultiplex>(_VideoMultiplex_QNAME, VideoMultiplex.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CastMemberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CastMemberList")
    public JAXBElement<CastMemberList> createCastMemberList(CastMemberList value) {
        return new JAXBElement<CastMemberList>(_CastMemberList_QNAME, CastMemberList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArtworkInfo")
    public JAXBElement<ArtworkInfo> createArtworkInfo(ArtworkInfo value) {
        return new JAXBElement<ArtworkInfo>(_ArtworkInfo_QNAME, ArtworkInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfLineup")
    public JAXBElement<ArrayOfLineup> createArrayOfLineup(ArrayOfLineup value) {
        return new JAXBElement<ArrayOfLineup>(_ArrayOfLineup_QNAME, ArrayOfLineup.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CastMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CastMember")
    public JAXBElement<CastMember> createCastMember(CastMember value) {
        return new JAXBElement<CastMember>(_CastMember_QNAME, CastMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVideoMultiplex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfVideoMultiplex")
    public JAXBElement<ArrayOfVideoMultiplex> createArrayOfVideoMultiplex(ArrayOfVideoMultiplex value) {
        return new JAXBElement<ArrayOfVideoMultiplex>(_ArrayOfVideoMultiplex_QNAME, ArrayOfVideoMultiplex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSourceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoSourceList")
    public JAXBElement<VideoSourceList> createVideoSourceList(VideoSourceList value) {
        return new JAXBElement<VideoSourceList>(_VideoSourceList_QNAME, VideoSourceList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelInfoList")
    public JAXBElement<ChannelInfoList> createChannelInfoList(ChannelInfoList value) {
        return new JAXBElement<ChannelInfoList>(_ChannelInfoList_QNAME, ChannelInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoSource")
    public JAXBElement<VideoSource> createVideoSource(VideoSource value) {
        return new JAXBElement<VideoSource>(_VideoSource_QNAME, VideoSource.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetChannelInfoListResult", scope = GetChannelInfoListResponse.class)
    public JAXBElement<ChannelInfoList> createGetChannelInfoListResponseGetChannelInfoListResult(ChannelInfoList value) {
        return new JAXBElement<ChannelInfoList>(_GetChannelInfoListResponseGetChannelInfoListResult_QNAME, ChannelInfoList.class, GetChannelInfoListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetChannelInfoList.class)
    public JAXBElement<Long> createGetChannelInfoListStartIndex(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListStartIndex_QNAME, Long.class, GetChannelInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceID", scope = GetChannelInfoList.class)
    public JAXBElement<Long> createGetChannelInfoListSourceID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListSourceID_QNAME, Long.class, GetChannelInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Details", scope = GetChannelInfoList.class)
    public JAXBElement<Boolean> createGetChannelInfoListDetails(Boolean value) {
        return new JAXBElement<Boolean>(_GetChannelInfoListDetails_QNAME, Boolean.class, GetChannelInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OnlyVisible", scope = GetChannelInfoList.class)
    public JAXBElement<Boolean> createGetChannelInfoListOnlyVisible(Boolean value) {
        return new JAXBElement<Boolean>(_GetChannelInfoListOnlyVisible_QNAME, Boolean.class, GetChannelInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetChannelInfoList.class)
    public JAXBElement<Long> createGetChannelInfoListCount(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListCount_QNAME, Long.class, GetChannelInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveDBChannelResult", scope = RemoveDBChannelResponse.class)
    public JAXBElement<Boolean> createRemoveDBChannelResponseRemoveDBChannelResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveDBChannelResponseRemoveDBChannelResult_QNAME, Boolean.class, RemoveDBChannelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelNumber", scope = UpdateDBChannel.class)
    public JAXBElement<String> createUpdateDBChannelChannelNumber(String value) {
        return new JAXBElement<String>(_UpdateDBChannelChannelNumber_QNAME, String.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UseEIT", scope = UpdateDBChannel.class)
    public JAXBElement<Boolean> createUpdateDBChannelUseEIT(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateDBChannelUseEIT_QNAME, Boolean.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FrequencyID", scope = UpdateDBChannel.class)
    public JAXBElement<String> createUpdateDBChannelFrequencyID(String value) {
        return new JAXBElement<String>(_UpdateDBChannelFrequencyID_QNAME, String.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceID", scope = UpdateDBChannel.class)
    public JAXBElement<Long> createUpdateDBChannelSourceID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListSourceID_QNAME, Long.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelID", scope = UpdateDBChannel.class)
    public JAXBElement<Long> createUpdateDBChannelChannelID(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelChannelID_QNAME, Long.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ATSCMinorChannel", scope = UpdateDBChannel.class)
    public JAXBElement<Long> createUpdateDBChannelATSCMinorChannel(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelATSCMinorChannel_QNAME, Long.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ServiceID", scope = UpdateDBChannel.class)
    public JAXBElement<Long> createUpdateDBChannelServiceID(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelServiceID_QNAME, Long.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DefaultAuthority", scope = UpdateDBChannel.class)
    public JAXBElement<String> createUpdateDBChannelDefaultAuthority(String value) {
        return new JAXBElement<String>(_UpdateDBChannelDefaultAuthority_QNAME, String.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "XMLTVID", scope = UpdateDBChannel.class)
    public JAXBElement<String> createUpdateDBChannelXMLTVID(String value) {
        return new JAXBElement<String>(_UpdateDBChannelXMLTVID_QNAME, String.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CallSign", scope = UpdateDBChannel.class)
    public JAXBElement<String> createUpdateDBChannelCallSign(String value) {
        return new JAXBElement<String>(_UpdateDBChannelCallSign_QNAME, String.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MplexID", scope = UpdateDBChannel.class)
    public JAXBElement<Long> createUpdateDBChannelMplexID(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelMplexID_QNAME, Long.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelName", scope = UpdateDBChannel.class)
    public JAXBElement<String> createUpdateDBChannelChannelName(String value) {
        return new JAXBElement<String>(_UpdateDBChannelChannelName_QNAME, String.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Format", scope = UpdateDBChannel.class)
    public JAXBElement<String> createUpdateDBChannelFormat(String value) {
        return new JAXBElement<String>(_UpdateDBChannelFormat_QNAME, String.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ATSCMajorChannel", scope = UpdateDBChannel.class)
    public JAXBElement<Long> createUpdateDBChannelATSCMajorChannel(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelATSCMajorChannel_QNAME, Long.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Visible", scope = UpdateDBChannel.class)
    public JAXBElement<Boolean> createUpdateDBChannelVisible(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateDBChannelVisible_QNAME, Boolean.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Icon", scope = UpdateDBChannel.class)
    public JAXBElement<String> createUpdateDBChannelIcon(String value) {
        return new JAXBElement<String>(_UpdateDBChannelIcon_QNAME, String.class, UpdateDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceID", scope = GetXMLTVIdList.class)
    public JAXBElement<Long> createGetXMLTVIdListSourceID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListSourceID_QNAME, Long.class, GetXMLTVIdList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoSourceResult", scope = GetVideoSourceResponse.class)
    public JAXBElement<VideoSource> createGetVideoSourceResponseGetVideoSourceResult(VideoSource value) {
        return new JAXBElement<VideoSource>(_GetVideoSourceResponseGetVideoSourceResult_QNAME, VideoSource.class, GetVideoSourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MplexID", scope = GetVideoMultiplex.class)
    public JAXBElement<Long> createGetVideoMultiplexMplexID(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelMplexID_QNAME, Long.class, GetVideoMultiplex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Grabber", scope = AddVideoSource.class)
    public JAXBElement<String> createAddVideoSourceGrabber(String value) {
        return new JAXBElement<String>(_AddVideoSourceGrabber_QNAME, String.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FreqTable", scope = AddVideoSource.class)
    public JAXBElement<String> createAddVideoSourceFreqTable(String value) {
        return new JAXBElement<String>(_AddVideoSourceFreqTable_QNAME, String.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UserId", scope = AddVideoSource.class)
    public JAXBElement<String> createAddVideoSourceUserId(String value) {
        return new JAXBElement<String>(_AddVideoSourceUserId_QNAME, String.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UseEIT", scope = AddVideoSource.class)
    public JAXBElement<Boolean> createAddVideoSourceUseEIT(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateDBChannelUseEIT_QNAME, Boolean.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Password", scope = AddVideoSource.class)
    public JAXBElement<String> createAddVideoSourcePassword(String value) {
        return new JAXBElement<String>(_AddVideoSourcePassword_QNAME, String.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LineupId", scope = AddVideoSource.class)
    public JAXBElement<String> createAddVideoSourceLineupId(String value) {
        return new JAXBElement<String>(_AddVideoSourceLineupId_QNAME, String.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ConfigPath", scope = AddVideoSource.class)
    public JAXBElement<String> createAddVideoSourceConfigPath(String value) {
        return new JAXBElement<String>(_AddVideoSourceConfigPath_QNAME, String.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceName", scope = AddVideoSource.class)
    public JAXBElement<String> createAddVideoSourceSourceName(String value) {
        return new JAXBElement<String>(_AddVideoSourceSourceName_QNAME, String.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "NITId", scope = AddVideoSource.class)
    public JAXBElement<Integer> createAddVideoSourceNITId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoSourceNITId_QNAME, Integer.class, AddVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddVideoSourceResult", scope = AddVideoSourceResponse.class)
    public JAXBElement<Integer> createAddVideoSourceResponseAddVideoSourceResult(Integer value) {
        return new JAXBElement<Integer>(_AddVideoSourceResponseAddVideoSourceResult_QNAME, Integer.class, AddVideoSourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Grabber", scope = UpdateVideoSource.class)
    public JAXBElement<String> createUpdateVideoSourceGrabber(String value) {
        return new JAXBElement<String>(_AddVideoSourceGrabber_QNAME, String.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FreqTable", scope = UpdateVideoSource.class)
    public JAXBElement<String> createUpdateVideoSourceFreqTable(String value) {
        return new JAXBElement<String>(_AddVideoSourceFreqTable_QNAME, String.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UserId", scope = UpdateVideoSource.class)
    public JAXBElement<String> createUpdateVideoSourceUserId(String value) {
        return new JAXBElement<String>(_AddVideoSourceUserId_QNAME, String.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UseEIT", scope = UpdateVideoSource.class)
    public JAXBElement<Boolean> createUpdateVideoSourceUseEIT(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateDBChannelUseEIT_QNAME, Boolean.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceID", scope = UpdateVideoSource.class)
    public JAXBElement<Long> createUpdateVideoSourceSourceID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListSourceID_QNAME, Long.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Password", scope = UpdateVideoSource.class)
    public JAXBElement<String> createUpdateVideoSourcePassword(String value) {
        return new JAXBElement<String>(_AddVideoSourcePassword_QNAME, String.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LineupId", scope = UpdateVideoSource.class)
    public JAXBElement<String> createUpdateVideoSourceLineupId(String value) {
        return new JAXBElement<String>(_AddVideoSourceLineupId_QNAME, String.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ConfigPath", scope = UpdateVideoSource.class)
    public JAXBElement<String> createUpdateVideoSourceConfigPath(String value) {
        return new JAXBElement<String>(_AddVideoSourceConfigPath_QNAME, String.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceName", scope = UpdateVideoSource.class)
    public JAXBElement<String> createUpdateVideoSourceSourceName(String value) {
        return new JAXBElement<String>(_AddVideoSourceSourceName_QNAME, String.class, UpdateVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "NITId", scope = UpdateVideoSource.class)
    public JAXBElement<Integer> createUpdateVideoSourceNITId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoSourceNITId_QNAME, Integer.class, UpdateVideoSource.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_ProgramStartTime_QNAME, XMLGregorianCalendar.class, Program.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceID", scope = GetVideoSource.class)
    public JAXBElement<Long> createGetVideoSourceSourceID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListSourceID_QNAME, Long.class, GetVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetChannelInfoResult", scope = GetChannelInfoResponse.class)
    public JAXBElement<ChannelInfo> createGetChannelInfoResponseGetChannelInfoResult(ChannelInfo value) {
        return new JAXBElement<ChannelInfo>(_GetChannelInfoResponseGetChannelInfoResult_QNAME, ChannelInfo.class, GetChannelInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = VideoSourceList.class)
    public JAXBElement<XMLGregorianCalendar> createVideoSourceListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoSourceListAsOf_QNAME, XMLGregorianCalendar.class, VideoSourceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMultiplex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoMultiplexResult", scope = GetVideoMultiplexResponse.class)
    public JAXBElement<VideoMultiplex> createGetVideoMultiplexResponseGetVideoMultiplexResult(VideoMultiplex value) {
        return new JAXBElement<VideoMultiplex>(_GetVideoMultiplexResponseGetVideoMultiplexResult_QNAME, VideoMultiplex.class, GetVideoMultiplexResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveVideoSourceResult", scope = RemoveVideoSourceResponse.class)
    public JAXBElement<Boolean> createRemoveVideoSourceResponseRemoveVideoSourceResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveVideoSourceResponseRemoveVideoSourceResult_QNAME, Boolean.class, RemoveVideoSourceResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UpdateTimeStamp", scope = VideoMultiplex.class)
    public JAXBElement<XMLGregorianCalendar> createVideoMultiplexUpdateTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoMultiplexUpdateTimeStamp_QNAME, XMLGregorianCalendar.class, VideoMultiplex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanID", scope = GetChannelInfo.class)
    public JAXBElement<Long> createGetChannelInfoChanID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoChanID_QNAME, Long.class, GetChannelInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceID", scope = RemoveVideoSource.class)
    public JAXBElement<Long> createRemoveVideoSourceSourceID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListSourceID_QNAME, Long.class, RemoveVideoSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetXMLTVIdListResult", scope = GetXMLTVIdListResponse.class)
    public JAXBElement<ArrayOfString> createGetXMLTVIdListResponseGetXMLTVIdListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetXMLTVIdListResponseGetXMLTVIdListResult_QNAME, ArrayOfString.class, GetXMLTVIdListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FetchChannelsFromSourceResult", scope = FetchChannelsFromSourceResponse.class)
    public JAXBElement<Integer> createFetchChannelsFromSourceResponseFetchChannelsFromSourceResult(Integer value) {
        return new JAXBElement<Integer>(_FetchChannelsFromSourceResponseFetchChannelsFromSourceResult_QNAME, Integer.class, FetchChannelsFromSourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UserId", scope = GetDDLineupList.class)
    public JAXBElement<String> createGetDDLineupListUserId(String value) {
        return new JAXBElement<String>(_AddVideoSourceUserId_QNAME, String.class, GetDDLineupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Source", scope = GetDDLineupList.class)
    public JAXBElement<String> createGetDDLineupListSource(String value) {
        return new JAXBElement<String>(_GetDDLineupListSource_QNAME, String.class, GetDDLineupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Password", scope = GetDDLineupList.class)
    public JAXBElement<String> createGetDDLineupListPassword(String value) {
        return new JAXBElement<String>(_AddVideoSourcePassword_QNAME, String.class, GetDDLineupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMultiplexList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoMultiplexListResult", scope = GetVideoMultiplexListResponse.class)
    public JAXBElement<VideoMultiplexList> createGetVideoMultiplexListResponseGetVideoMultiplexListResult(VideoMultiplexList value) {
        return new JAXBElement<VideoMultiplexList>(_GetVideoMultiplexListResponseGetVideoMultiplexListResult_QNAME, VideoMultiplexList.class, GetVideoMultiplexListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = VideoMultiplexList.class)
    public JAXBElement<XMLGregorianCalendar> createVideoMultiplexListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoSourceListAsOf_QNAME, XMLGregorianCalendar.class, VideoMultiplexList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelID", scope = RemoveDBChannel.class)
    public JAXBElement<Long> createRemoveDBChannelChannelID(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelChannelID_QNAME, Long.class, RemoveDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelNumber", scope = AddDBChannel.class)
    public JAXBElement<String> createAddDBChannelChannelNumber(String value) {
        return new JAXBElement<String>(_UpdateDBChannelChannelNumber_QNAME, String.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UseEIT", scope = AddDBChannel.class)
    public JAXBElement<Boolean> createAddDBChannelUseEIT(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateDBChannelUseEIT_QNAME, Boolean.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FrequencyID", scope = AddDBChannel.class)
    public JAXBElement<String> createAddDBChannelFrequencyID(String value) {
        return new JAXBElement<String>(_UpdateDBChannelFrequencyID_QNAME, String.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceID", scope = AddDBChannel.class)
    public JAXBElement<Long> createAddDBChannelSourceID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListSourceID_QNAME, Long.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelID", scope = AddDBChannel.class)
    public JAXBElement<Long> createAddDBChannelChannelID(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelChannelID_QNAME, Long.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ATSCMinorChannel", scope = AddDBChannel.class)
    public JAXBElement<Long> createAddDBChannelATSCMinorChannel(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelATSCMinorChannel_QNAME, Long.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ServiceID", scope = AddDBChannel.class)
    public JAXBElement<Long> createAddDBChannelServiceID(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelServiceID_QNAME, Long.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DefaultAuthority", scope = AddDBChannel.class)
    public JAXBElement<String> createAddDBChannelDefaultAuthority(String value) {
        return new JAXBElement<String>(_UpdateDBChannelDefaultAuthority_QNAME, String.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "XMLTVID", scope = AddDBChannel.class)
    public JAXBElement<String> createAddDBChannelXMLTVID(String value) {
        return new JAXBElement<String>(_UpdateDBChannelXMLTVID_QNAME, String.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CallSign", scope = AddDBChannel.class)
    public JAXBElement<String> createAddDBChannelCallSign(String value) {
        return new JAXBElement<String>(_UpdateDBChannelCallSign_QNAME, String.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MplexID", scope = AddDBChannel.class)
    public JAXBElement<Long> createAddDBChannelMplexID(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelMplexID_QNAME, Long.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelName", scope = AddDBChannel.class)
    public JAXBElement<String> createAddDBChannelChannelName(String value) {
        return new JAXBElement<String>(_UpdateDBChannelChannelName_QNAME, String.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Format", scope = AddDBChannel.class)
    public JAXBElement<String> createAddDBChannelFormat(String value) {
        return new JAXBElement<String>(_UpdateDBChannelFormat_QNAME, String.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ATSCMajorChannel", scope = AddDBChannel.class)
    public JAXBElement<Long> createAddDBChannelATSCMajorChannel(Long value) {
        return new JAXBElement<Long>(_UpdateDBChannelATSCMajorChannel_QNAME, Long.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Visible", scope = AddDBChannel.class)
    public JAXBElement<Boolean> createAddDBChannelVisible(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateDBChannelVisible_QNAME, Boolean.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Icon", scope = AddDBChannel.class)
    public JAXBElement<String> createAddDBChannelIcon(String value) {
        return new JAXBElement<String>(_UpdateDBChannelIcon_QNAME, String.class, AddDBChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineupList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetDDLineupListResult", scope = GetDDLineupListResponse.class)
    public JAXBElement<LineupList> createGetDDLineupListResponseGetDDLineupListResult(LineupList value) {
        return new JAXBElement<LineupList>(_GetDDLineupListResponseGetDDLineupListResult_QNAME, LineupList.class, GetDDLineupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UpdateVideoSourceResult", scope = UpdateVideoSourceResponse.class)
    public JAXBElement<Boolean> createUpdateVideoSourceResponseUpdateVideoSourceResult(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateVideoSourceResponseUpdateVideoSourceResult_QNAME, Boolean.class, UpdateVideoSourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceId", scope = FetchChannelsFromSource.class)
    public JAXBElement<Long> createFetchChannelsFromSourceSourceId(Long value) {
        return new JAXBElement<Long>(_FetchChannelsFromSourceSourceId_QNAME, Long.class, FetchChannelsFromSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "WaitForFinish", scope = FetchChannelsFromSource.class)
    public JAXBElement<Boolean> createFetchChannelsFromSourceWaitForFinish(Boolean value) {
        return new JAXBElement<Boolean>(_FetchChannelsFromSourceWaitForFinish_QNAME, Boolean.class, FetchChannelsFromSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardId", scope = FetchChannelsFromSource.class)
    public JAXBElement<Long> createFetchChannelsFromSourceCardId(Long value) {
        return new JAXBElement<Long>(_FetchChannelsFromSourceCardId_QNAME, Long.class, FetchChannelsFromSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddDBChannelResult", scope = AddDBChannelResponse.class)
    public JAXBElement<Boolean> createAddDBChannelResponseAddDBChannelResult(Boolean value) {
        return new JAXBElement<Boolean>(_AddDBChannelResponseAddDBChannelResult_QNAME, Boolean.class, AddDBChannelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = ChannelInfoList.class)
    public JAXBElement<XMLGregorianCalendar> createChannelInfoListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoSourceListAsOf_QNAME, XMLGregorianCalendar.class, ChannelInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetVideoMultiplexList.class)
    public JAXBElement<Long> createGetVideoMultiplexListStartIndex(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListStartIndex_QNAME, Long.class, GetVideoMultiplexList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceID", scope = GetVideoMultiplexList.class)
    public JAXBElement<Long> createGetVideoMultiplexListSourceID(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListSourceID_QNAME, Long.class, GetVideoMultiplexList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetVideoMultiplexList.class)
    public JAXBElement<Long> createGetVideoMultiplexListCount(Long value) {
        return new JAXBElement<Long>(_GetChannelInfoListCount_QNAME, Long.class, GetVideoMultiplexList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSourceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoSourceListResult", scope = GetVideoSourceListResponse.class)
    public JAXBElement<VideoSourceList> createGetVideoSourceListResponseGetVideoSourceListResult(VideoSourceList value) {
        return new JAXBElement<VideoSourceList>(_GetVideoSourceListResponseGetVideoSourceListResult_QNAME, VideoSourceList.class, GetVideoSourceListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UpdateDBChannelResult", scope = UpdateDBChannelResponse.class)
    public JAXBElement<Boolean> createUpdateDBChannelResponseUpdateDBChannelResult(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateDBChannelResponseUpdateDBChannelResult_QNAME, Boolean.class, UpdateDBChannelResponse.class, value);
    }

}
