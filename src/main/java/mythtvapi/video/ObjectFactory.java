
package mythtvapi.video;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mythtvapi.video package. 
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

    private final static QName _VideoMetadataInfoList_QNAME = new QName("http://mythtv.org", "VideoMetadataInfoList");
    private final static QName _BlurayInfo_QNAME = new QName("http://mythtv.org", "BlurayInfo");
    private final static QName _VideoLookup_QNAME = new QName("http://mythtv.org", "VideoLookup");
    private final static QName _ArrayOfVideoLookup_QNAME = new QName("http://mythtv.org", "ArrayOfVideoLookup");
    private final static QName _CastMemberList_QNAME = new QName("http://mythtv.org", "CastMemberList");
    private final static QName _ArtworkInfo_QNAME = new QName("http://mythtv.org", "ArtworkInfo");
    private final static QName _ArrayOfCastMember_QNAME = new QName("http://mythtv.org", "ArrayOfCastMember");
    private final static QName _ArtworkInfoList_QNAME = new QName("http://mythtv.org", "ArtworkInfoList");
    private final static QName _ArrayOfString_QNAME = new QName("http://mythtv.org", "ArrayOfString");
    private final static QName _ArtworkItem_QNAME = new QName("http://mythtv.org", "ArtworkItem");
    private final static QName _CastMember_QNAME = new QName("http://mythtv.org", "CastMember");
    private final static QName _VideoMetadataInfo_QNAME = new QName("http://mythtv.org", "VideoMetadataInfo");
    private final static QName _ArrayOfArtworkItem_QNAME = new QName("http://mythtv.org", "ArrayOfArtworkItem");
    private final static QName _ArrayOfVideoMetadataInfo_QNAME = new QName("http://mythtv.org", "ArrayOfVideoMetadataInfo");
    private final static QName _VideoLookupList_QNAME = new QName("http://mythtv.org", "VideoLookupList");
    private final static QName _ArrayOfArtworkInfo_QNAME = new QName("http://mythtv.org", "ArrayOfArtworkInfo");
    private final static QName _VideoLookupReleaseDate_QNAME = new QName("http://mythtv.org", "ReleaseDate");
    private final static QName _LookupVideoAllowGeneric_QNAME = new QName("http://mythtv.org", "AllowGeneric");
    private final static QName _LookupVideoGrabberType_QNAME = new QName("http://mythtv.org", "GrabberType");
    private final static QName _LookupVideoSubtitle_QNAME = new QName("http://mythtv.org", "Subtitle");
    private final static QName _LookupVideoEpisode_QNAME = new QName("http://mythtv.org", "Episode");
    private final static QName _LookupVideoSeason_QNAME = new QName("http://mythtv.org", "Season");
    private final static QName _LookupVideoInetref_QNAME = new QName("http://mythtv.org", "Inetref");
    private final static QName _LookupVideoTitle_QNAME = new QName("http://mythtv.org", "Title");
    private final static QName _GetVideoResponseGetVideoResult_QNAME = new QName("http://mythtv.org", "GetVideoResult");
    private final static QName _VideoMetadataInfoAddDate_QNAME = new QName("http://mythtv.org", "AddDate");
    private final static QName _VideoMetadataInfoCast_QNAME = new QName("http://mythtv.org", "Cast");
    private final static QName _VideoMetadataInfoArtwork_QNAME = new QName("http://mythtv.org", "Artwork");
    private final static QName _VideoLookupListAsOf_QNAME = new QName("http://mythtv.org", "AsOf");
    private final static QName _GetVideoListStartIndex_QNAME = new QName("http://mythtv.org", "StartIndex");
    private final static QName _GetVideoListDescending_QNAME = new QName("http://mythtv.org", "Descending");
    private final static QName _GetVideoListFolder_QNAME = new QName("http://mythtv.org", "Folder");
    private final static QName _GetVideoListSort_QNAME = new QName("http://mythtv.org", "Sort");
    private final static QName _GetVideoListCount_QNAME = new QName("http://mythtv.org", "Count");
    private final static QName _AddVideoResponseAddVideoResult_QNAME = new QName("http://mythtv.org", "AddVideoResult");
    private final static QName _GetBlurayPath_QNAME = new QName("http://mythtv.org", "Path");
    private final static QName _GetBlurayResponseGetBlurayResult_QNAME = new QName("http://mythtv.org", "GetBlurayResult");
    private final static QName _RemoveVideoFromDBResponseRemoveVideoFromDBResult_QNAME = new QName("http://mythtv.org", "RemoveVideoFromDBResult");
    private final static QName _UpdateVideoWatchedStatusId_QNAME = new QName("http://mythtv.org", "Id");
    private final static QName _UpdateVideoWatchedStatusWatched_QNAME = new QName("http://mythtv.org", "Watched");
    private final static QName _GetVideoListResponseGetVideoListResult_QNAME = new QName("http://mythtv.org", "GetVideoListResult");
    private final static QName _AddVideoFileName_QNAME = new QName("http://mythtv.org", "FileName");
    private final static QName _AddVideoHostName_QNAME = new QName("http://mythtv.org", "HostName");
    private final static QName _GetVideoByFileNameResponseGetVideoByFileNameResult_QNAME = new QName("http://mythtv.org", "GetVideoByFileNameResult");
    private final static QName _UpdateVideoWatchedStatusResponseUpdateVideoWatchedStatusResult_QNAME = new QName("http://mythtv.org", "UpdateVideoWatchedStatusResult");
    private final static QName _LookupVideoResponseLookupVideoResult_QNAME = new QName("http://mythtv.org", "LookupVideoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mythtvapi.video
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BlurayInfo }
     * 
     */
    public BlurayInfo createBlurayInfo() {
        return new BlurayInfo();
    }

    /**
     * Create an instance of {@link LookupVideo }
     * 
     */
    public LookupVideo createLookupVideo() {
        return new LookupVideo();
    }

    /**
     * Create an instance of {@link GetVideoList }
     * 
     */
    public GetVideoList createGetVideoList() {
        return new GetVideoList();
    }

    /**
     * Create an instance of {@link GetVideo }
     * 
     */
    public GetVideo createGetVideo() {
        return new GetVideo();
    }

    /**
     * Create an instance of {@link LookupVideoResponse }
     * 
     */
    public LookupVideoResponse createLookupVideoResponse() {
        return new LookupVideoResponse();
    }

    /**
     * Create an instance of {@link VideoLookupList }
     * 
     */
    public VideoLookupList createVideoLookupList() {
        return new VideoLookupList();
    }

    /**
     * Create an instance of {@link ArtworkItem }
     * 
     */
    public ArtworkItem createArtworkItem() {
        return new ArtworkItem();
    }

    /**
     * Create an instance of {@link CastMember }
     * 
     */
    public CastMember createCastMember() {
        return new CastMember();
    }

    /**
     * Create an instance of {@link AddVideoResponse }
     * 
     */
    public AddVideoResponse createAddVideoResponse() {
        return new AddVideoResponse();
    }

    /**
     * Create an instance of {@link GetVideoByFileName }
     * 
     */
    public GetVideoByFileName createGetVideoByFileName() {
        return new GetVideoByFileName();
    }

    /**
     * Create an instance of {@link AddVideo }
     * 
     */
    public AddVideo createAddVideo() {
        return new AddVideo();
    }

    /**
     * Create an instance of {@link GetBluray }
     * 
     */
    public GetBluray createGetBluray() {
        return new GetBluray();
    }

    /**
     * Create an instance of {@link GetBlurayResponse }
     * 
     */
    public GetBlurayResponse createGetBlurayResponse() {
        return new GetBlurayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfArtworkInfo }
     * 
     */
    public ArrayOfArtworkInfo createArrayOfArtworkInfo() {
        return new ArrayOfArtworkInfo();
    }

    /**
     * Create an instance of {@link VideoMetadataInfo }
     * 
     */
    public VideoMetadataInfo createVideoMetadataInfo() {
        return new VideoMetadataInfo();
    }

    /**
     * Create an instance of {@link ArrayOfVideoMetadataInfo }
     * 
     */
    public ArrayOfVideoMetadataInfo createArrayOfVideoMetadataInfo() {
        return new ArrayOfVideoMetadataInfo();
    }

    /**
     * Create an instance of {@link RemoveVideoFromDBResponse }
     * 
     */
    public RemoveVideoFromDBResponse createRemoveVideoFromDBResponse() {
        return new RemoveVideoFromDBResponse();
    }

    /**
     * Create an instance of {@link UpdateVideoWatchedStatusResponse }
     * 
     */
    public UpdateVideoWatchedStatusResponse createUpdateVideoWatchedStatusResponse() {
        return new UpdateVideoWatchedStatusResponse();
    }

    /**
     * Create an instance of {@link VideoMetadataInfoList }
     * 
     */
    public VideoMetadataInfoList createVideoMetadataInfoList() {
        return new VideoMetadataInfoList();
    }

    /**
     * Create an instance of {@link ArrayOfVideoLookup }
     * 
     */
    public ArrayOfVideoLookup createArrayOfVideoLookup() {
        return new ArrayOfVideoLookup();
    }

    /**
     * Create an instance of {@link GetVideoByFileNameResponse }
     * 
     */
    public GetVideoByFileNameResponse createGetVideoByFileNameResponse() {
        return new GetVideoByFileNameResponse();
    }

    /**
     * Create an instance of {@link CastMemberList }
     * 
     */
    public CastMemberList createCastMemberList() {
        return new CastMemberList();
    }

    /**
     * Create an instance of {@link VideoLookup }
     * 
     */
    public VideoLookup createVideoLookup() {
        return new VideoLookup();
    }

    /**
     * Create an instance of {@link RemoveVideoFromDB }
     * 
     */
    public RemoveVideoFromDB createRemoveVideoFromDB() {
        return new RemoveVideoFromDB();
    }

    /**
     * Create an instance of {@link UpdateVideoWatchedStatus }
     * 
     */
    public UpdateVideoWatchedStatus createUpdateVideoWatchedStatus() {
        return new UpdateVideoWatchedStatus();
    }

    /**
     * Create an instance of {@link GetVideoResponse }
     * 
     */
    public GetVideoResponse createGetVideoResponse() {
        return new GetVideoResponse();
    }

    /**
     * Create an instance of {@link ArtworkInfo }
     * 
     */
    public ArtworkInfo createArtworkInfo() {
        return new ArtworkInfo();
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
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfArtworkItem }
     * 
     */
    public ArrayOfArtworkItem createArrayOfArtworkItem() {
        return new ArrayOfArtworkItem();
    }

    /**
     * Create an instance of {@link GetVideoListResponse }
     * 
     */
    public GetVideoListResponse createGetVideoListResponse() {
        return new GetVideoListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMetadataInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoMetadataInfoList")
    public JAXBElement<VideoMetadataInfoList> createVideoMetadataInfoList(VideoMetadataInfoList value) {
        return new JAXBElement<VideoMetadataInfoList>(_VideoMetadataInfoList_QNAME, VideoMetadataInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlurayInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "BlurayInfo")
    public JAXBElement<BlurayInfo> createBlurayInfo(BlurayInfo value) {
        return new JAXBElement<BlurayInfo>(_BlurayInfo_QNAME, BlurayInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoLookup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoLookup")
    public JAXBElement<VideoLookup> createVideoLookup(VideoLookup value) {
        return new JAXBElement<VideoLookup>(_VideoLookup_QNAME, VideoLookup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVideoLookup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfVideoLookup")
    public JAXBElement<ArrayOfVideoLookup> createArrayOfVideoLookup(ArrayOfVideoLookup value) {
        return new JAXBElement<ArrayOfVideoLookup>(_ArrayOfVideoLookup_QNAME, ArrayOfVideoLookup.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArtworkItem")
    public JAXBElement<ArtworkItem> createArtworkItem(ArtworkItem value) {
        return new JAXBElement<ArtworkItem>(_ArtworkItem_QNAME, ArtworkItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMetadataInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoMetadataInfo")
    public JAXBElement<VideoMetadataInfo> createVideoMetadataInfo(VideoMetadataInfo value) {
        return new JAXBElement<VideoMetadataInfo>(_VideoMetadataInfo_QNAME, VideoMetadataInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArtworkItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfArtworkItem")
    public JAXBElement<ArrayOfArtworkItem> createArrayOfArtworkItem(ArrayOfArtworkItem value) {
        return new JAXBElement<ArrayOfArtworkItem>(_ArrayOfArtworkItem_QNAME, ArrayOfArtworkItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVideoMetadataInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfVideoMetadataInfo")
    public JAXBElement<ArrayOfVideoMetadataInfo> createArrayOfVideoMetadataInfo(ArrayOfVideoMetadataInfo value) {
        return new JAXBElement<ArrayOfVideoMetadataInfo>(_ArrayOfVideoMetadataInfo_QNAME, ArrayOfVideoMetadataInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoLookupList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoLookupList")
    public JAXBElement<VideoLookupList> createVideoLookupList(VideoLookupList value) {
        return new JAXBElement<VideoLookupList>(_VideoLookupList_QNAME, VideoLookupList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ReleaseDate", scope = VideoLookup.class)
    public JAXBElement<XMLGregorianCalendar> createVideoLookupReleaseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoLookupReleaseDate_QNAME, XMLGregorianCalendar.class, VideoLookup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AllowGeneric", scope = LookupVideo.class)
    public JAXBElement<Boolean> createLookupVideoAllowGeneric(Boolean value) {
        return new JAXBElement<Boolean>(_LookupVideoAllowGeneric_QNAME, Boolean.class, LookupVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GrabberType", scope = LookupVideo.class)
    public JAXBElement<String> createLookupVideoGrabberType(String value) {
        return new JAXBElement<String>(_LookupVideoGrabberType_QNAME, String.class, LookupVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Subtitle", scope = LookupVideo.class)
    public JAXBElement<String> createLookupVideoSubtitle(String value) {
        return new JAXBElement<String>(_LookupVideoSubtitle_QNAME, String.class, LookupVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Episode", scope = LookupVideo.class)
    public JAXBElement<Integer> createLookupVideoEpisode(Integer value) {
        return new JAXBElement<Integer>(_LookupVideoEpisode_QNAME, Integer.class, LookupVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Season", scope = LookupVideo.class)
    public JAXBElement<Integer> createLookupVideoSeason(Integer value) {
        return new JAXBElement<Integer>(_LookupVideoSeason_QNAME, Integer.class, LookupVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Inetref", scope = LookupVideo.class)
    public JAXBElement<String> createLookupVideoInetref(String value) {
        return new JAXBElement<String>(_LookupVideoInetref_QNAME, String.class, LookupVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Title", scope = LookupVideo.class)
    public JAXBElement<String> createLookupVideoTitle(String value) {
        return new JAXBElement<String>(_LookupVideoTitle_QNAME, String.class, LookupVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMetadataInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoResult", scope = GetVideoResponse.class)
    public JAXBElement<VideoMetadataInfo> createGetVideoResponseGetVideoResult(VideoMetadataInfo value) {
        return new JAXBElement<VideoMetadataInfo>(_GetVideoResponseGetVideoResult_QNAME, VideoMetadataInfo.class, GetVideoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddDate", scope = VideoMetadataInfo.class)
    public JAXBElement<XMLGregorianCalendar> createVideoMetadataInfoAddDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoMetadataInfoAddDate_QNAME, XMLGregorianCalendar.class, VideoMetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CastMemberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Cast", scope = VideoMetadataInfo.class)
    public JAXBElement<CastMemberList> createVideoMetadataInfoCast(CastMemberList value) {
        return new JAXBElement<CastMemberList>(_VideoMetadataInfoCast_QNAME, CastMemberList.class, VideoMetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Artwork", scope = VideoMetadataInfo.class)
    public JAXBElement<ArtworkInfoList> createVideoMetadataInfoArtwork(ArtworkInfoList value) {
        return new JAXBElement<ArtworkInfoList>(_VideoMetadataInfoArtwork_QNAME, ArtworkInfoList.class, VideoMetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ReleaseDate", scope = VideoMetadataInfo.class)
    public JAXBElement<XMLGregorianCalendar> createVideoMetadataInfoReleaseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoLookupReleaseDate_QNAME, XMLGregorianCalendar.class, VideoMetadataInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = VideoLookupList.class)
    public JAXBElement<XMLGregorianCalendar> createVideoLookupListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoLookupListAsOf_QNAME, XMLGregorianCalendar.class, VideoLookupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetVideoList.class)
    public JAXBElement<Integer> createGetVideoListStartIndex(Integer value) {
        return new JAXBElement<Integer>(_GetVideoListStartIndex_QNAME, Integer.class, GetVideoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Descending", scope = GetVideoList.class)
    public JAXBElement<Boolean> createGetVideoListDescending(Boolean value) {
        return new JAXBElement<Boolean>(_GetVideoListDescending_QNAME, Boolean.class, GetVideoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Folder", scope = GetVideoList.class)
    public JAXBElement<String> createGetVideoListFolder(String value) {
        return new JAXBElement<String>(_GetVideoListFolder_QNAME, String.class, GetVideoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Sort", scope = GetVideoList.class)
    public JAXBElement<String> createGetVideoListSort(String value) {
        return new JAXBElement<String>(_GetVideoListSort_QNAME, String.class, GetVideoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetVideoList.class)
    public JAXBElement<Integer> createGetVideoListCount(Integer value) {
        return new JAXBElement<Integer>(_GetVideoListCount_QNAME, Integer.class, GetVideoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddVideoResult", scope = AddVideoResponse.class)
    public JAXBElement<Boolean> createAddVideoResponseAddVideoResult(Boolean value) {
        return new JAXBElement<Boolean>(_AddVideoResponseAddVideoResult_QNAME, Boolean.class, AddVideoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Path", scope = GetBluray.class)
    public JAXBElement<String> createGetBlurayPath(String value) {
        return new JAXBElement<String>(_GetBlurayPath_QNAME, String.class, GetBluray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlurayInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetBlurayResult", scope = GetBlurayResponse.class)
    public JAXBElement<BlurayInfo> createGetBlurayResponseGetBlurayResult(BlurayInfo value) {
        return new JAXBElement<BlurayInfo>(_GetBlurayResponseGetBlurayResult_QNAME, BlurayInfo.class, GetBlurayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveVideoFromDBResult", scope = RemoveVideoFromDBResponse.class)
    public JAXBElement<Boolean> createRemoveVideoFromDBResponseRemoveVideoFromDBResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveVideoFromDBResponseRemoveVideoFromDBResult_QNAME, Boolean.class, RemoveVideoFromDBResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = UpdateVideoWatchedStatus.class)
    public JAXBElement<Integer> createUpdateVideoWatchedStatusId(Integer value) {
        return new JAXBElement<Integer>(_UpdateVideoWatchedStatusId_QNAME, Integer.class, UpdateVideoWatchedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Watched", scope = UpdateVideoWatchedStatus.class)
    public JAXBElement<Boolean> createUpdateVideoWatchedStatusWatched(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateVideoWatchedStatusWatched_QNAME, Boolean.class, UpdateVideoWatchedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMetadataInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoListResult", scope = GetVideoListResponse.class)
    public JAXBElement<VideoMetadataInfoList> createGetVideoListResponseGetVideoListResult(VideoMetadataInfoList value) {
        return new JAXBElement<VideoMetadataInfoList>(_GetVideoListResponseGetVideoListResult_QNAME, VideoMetadataInfoList.class, GetVideoListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = VideoMetadataInfoList.class)
    public JAXBElement<XMLGregorianCalendar> createVideoMetadataInfoListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoLookupListAsOf_QNAME, XMLGregorianCalendar.class, VideoMetadataInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FileName", scope = AddVideo.class)
    public JAXBElement<String> createAddVideoFileName(String value) {
        return new JAXBElement<String>(_AddVideoFileName_QNAME, String.class, AddVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = AddVideo.class)
    public JAXBElement<String> createAddVideoHostName(String value) {
        return new JAXBElement<String>(_AddVideoHostName_QNAME, String.class, AddVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoMetadataInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoByFileNameResult", scope = GetVideoByFileNameResponse.class)
    public JAXBElement<VideoMetadataInfo> createGetVideoByFileNameResponseGetVideoByFileNameResult(VideoMetadataInfo value) {
        return new JAXBElement<VideoMetadataInfo>(_GetVideoByFileNameResponseGetVideoByFileNameResult_QNAME, VideoMetadataInfo.class, GetVideoByFileNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UpdateVideoWatchedStatusResult", scope = UpdateVideoWatchedStatusResponse.class)
    public JAXBElement<Boolean> createUpdateVideoWatchedStatusResponseUpdateVideoWatchedStatusResult(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateVideoWatchedStatusResponseUpdateVideoWatchedStatusResult_QNAME, Boolean.class, UpdateVideoWatchedStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = RemoveVideoFromDB.class)
    public JAXBElement<Integer> createRemoveVideoFromDBId(Integer value) {
        return new JAXBElement<Integer>(_UpdateVideoWatchedStatusId_QNAME, Integer.class, RemoveVideoFromDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FileName", scope = GetVideoByFileName.class)
    public JAXBElement<String> createGetVideoByFileNameFileName(String value) {
        return new JAXBElement<String>(_AddVideoFileName_QNAME, String.class, GetVideoByFileName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = GetVideo.class)
    public JAXBElement<Integer> createGetVideoId(Integer value) {
        return new JAXBElement<Integer>(_UpdateVideoWatchedStatusId_QNAME, Integer.class, GetVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoLookupList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LookupVideoResult", scope = LookupVideoResponse.class)
    public JAXBElement<VideoLookupList> createLookupVideoResponseLookupVideoResult(VideoLookupList value) {
        return new JAXBElement<VideoLookupList>(_LookupVideoResponseLookupVideoResult_QNAME, VideoLookupList.class, LookupVideoResponse.class, value);
    }

}
