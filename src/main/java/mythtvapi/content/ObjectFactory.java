
package mythtvapi.content;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mythtvapi.content package. 
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

    private final static QName _ArtworkInfo_QNAME = new QName("http://mythtv.org", "ArtworkInfo");
    private final static QName _ArtworkInfoList_QNAME = new QName("http://mythtv.org", "ArtworkInfoList");
    private final static QName _LiveStreamInfoList_QNAME = new QName("http://mythtv.org", "LiveStreamInfoList");
    private final static QName _ArrayOfString_QNAME = new QName("http://mythtv.org", "ArrayOfString");
    private final static QName _LiveStreamInfo_QNAME = new QName("http://mythtv.org", "LiveStreamInfo");
    private final static QName _ArrayOfLiveStreamInfo_QNAME = new QName("http://mythtv.org", "ArrayOfLiveStreamInfo");
    private final static QName _ArrayOfArtworkInfo_QNAME = new QName("http://mythtv.org", "ArrayOfArtworkInfo");
    private final static QName _AddVideoLiveStreamAudioBitrate_QNAME = new QName("http://mythtv.org", "AudioBitrate");
    private final static QName _AddVideoLiveStreamSampleRate_QNAME = new QName("http://mythtv.org", "SampleRate");
    private final static QName _AddVideoLiveStreamWidth_QNAME = new QName("http://mythtv.org", "Width");
    private final static QName _AddVideoLiveStreamBitrate_QNAME = new QName("http://mythtv.org", "Bitrate");
    private final static QName _AddVideoLiveStreamMaxSegments_QNAME = new QName("http://mythtv.org", "MaxSegments");
    private final static QName _AddVideoLiveStreamHeight_QNAME = new QName("http://mythtv.org", "Height");
    private final static QName _AddVideoLiveStreamId_QNAME = new QName("http://mythtv.org", "Id");
    private final static QName _AddRecordingLiveStreamResponseAddRecordingLiveStreamResult_QNAME = new QName("http://mythtv.org", "AddRecordingLiveStreamResult");
    private final static QName _GetDirListResponseGetDirListResult_QNAME = new QName("http://mythtv.org", "GetDirListResult");
    private final static QName _GetLiveStreamResponseGetLiveStreamResult_QNAME = new QName("http://mythtv.org", "GetLiveStreamResult");
    private final static QName _RemoveLiveStreamResponseRemoveLiveStreamResult_QNAME = new QName("http://mythtv.org", "RemoveLiveStreamResult");
    private final static QName _GetVideoResponseGetVideoResult_QNAME = new QName("http://mythtv.org", "GetVideoResult");
    private final static QName _GetRecordingArtworkResponseGetRecordingArtworkResult_QNAME = new QName("http://mythtv.org", "GetRecordingArtworkResult");
    private final static QName _GetRecordingResponseGetRecordingResult_QNAME = new QName("http://mythtv.org", "GetRecordingResult");
    private final static QName _AddRecordingLiveStreamChanId_QNAME = new QName("http://mythtv.org", "ChanId");
    private final static QName _AddRecordingLiveStreamRecordedId_QNAME = new QName("http://mythtv.org", "RecordedId");
    private final static QName _AddRecordingLiveStreamStartTime_QNAME = new QName("http://mythtv.org", "StartTime");
    private final static QName _GetRecordingArtworkType_QNAME = new QName("http://mythtv.org", "Type");
    private final static QName _GetRecordingArtworkSeason_QNAME = new QName("http://mythtv.org", "Season");
    private final static QName _GetRecordingArtworkInetref_QNAME = new QName("http://mythtv.org", "Inetref");
    private final static QName _GetPreviewImageSecsIn_QNAME = new QName("http://mythtv.org", "SecsIn");
    private final static QName _GetPreviewImageFormat_QNAME = new QName("http://mythtv.org", "Format");
    private final static QName _StopLiveStreamResponseStopLiveStreamResult_QNAME = new QName("http://mythtv.org", "StopLiveStreamResult");
    private final static QName _GetImageFileFileName_QNAME = new QName("http://mythtv.org", "FileName");
    private final static QName _GetImageFileStorageGroup_QNAME = new QName("http://mythtv.org", "StorageGroup");
    private final static QName _GetMusicResponseGetMusicResult_QNAME = new QName("http://mythtv.org", "GetMusicResult");
    private final static QName _DownloadFileResponseDownloadFileResult_QNAME = new QName("http://mythtv.org", "DownloadFileResult");
    private final static QName _GetHashResponseGetHashResult_QNAME = new QName("http://mythtv.org", "GetHashResult");
    private final static QName _GetAlbumArtResponseGetAlbumArtResult_QNAME = new QName("http://mythtv.org", "GetAlbumArtResult");
    private final static QName _GetFileListResponseGetFileListResult_QNAME = new QName("http://mythtv.org", "GetFileListResult");
    private final static QName _LiveStreamInfoLastModified_QNAME = new QName("http://mythtv.org", "LastModified");
    private final static QName _LiveStreamInfoCreated_QNAME = new QName("http://mythtv.org", "Created");
    private final static QName _GetProgramArtworkListResponseGetProgramArtworkListResult_QNAME = new QName("http://mythtv.org", "GetProgramArtworkListResult");
    private final static QName _GetPreviewImageResponseGetPreviewImageResult_QNAME = new QName("http://mythtv.org", "GetPreviewImageResult");
    private final static QName _GetVideoArtworkResponseGetVideoArtworkResult_QNAME = new QName("http://mythtv.org", "GetVideoArtworkResult");
    private final static QName _AddLiveStreamHostName_QNAME = new QName("http://mythtv.org", "HostName");
    private final static QName _AddVideoLiveStreamResponseAddVideoLiveStreamResult_QNAME = new QName("http://mythtv.org", "AddVideoLiveStreamResult");
    private final static QName _GetFileResponseGetFileResult_QNAME = new QName("http://mythtv.org", "GetFileResult");
    private final static QName _GetLiveStreamListResponseGetLiveStreamListResult_QNAME = new QName("http://mythtv.org", "GetLiveStreamListResult");
    private final static QName _GetImageFileResponseGetImageFileResult_QNAME = new QName("http://mythtv.org", "GetImageFileResult");
    private final static QName _DownloadFileURL_QNAME = new QName("http://mythtv.org", "URL");
    private final static QName _GetRecordingArtworkListResponseGetRecordingArtworkListResult_QNAME = new QName("http://mythtv.org", "GetRecordingArtworkListResult");
    private final static QName _AddLiveStreamResponseAddLiveStreamResult_QNAME = new QName("http://mythtv.org", "AddLiveStreamResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mythtvapi.content
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAlbumArtResponse }
     * 
     */
    public GetAlbumArtResponse createGetAlbumArtResponse() {
        return new GetAlbumArtResponse();
    }

    /**
     * Create an instance of {@link RemoveLiveStream }
     * 
     */
    public RemoveLiveStream createRemoveLiveStream() {
        return new RemoveLiveStream();
    }

    /**
     * Create an instance of {@link GetDirList }
     * 
     */
    public GetDirList createGetDirList() {
        return new GetDirList();
    }

    /**
     * Create an instance of {@link AddVideoLiveStream }
     * 
     */
    public AddVideoLiveStream createAddVideoLiveStream() {
        return new AddVideoLiveStream();
    }

    /**
     * Create an instance of {@link AddVideoLiveStreamResponse }
     * 
     */
    public AddVideoLiveStreamResponse createAddVideoLiveStreamResponse() {
        return new AddVideoLiveStreamResponse();
    }

    /**
     * Create an instance of {@link LiveStreamInfo }
     * 
     */
    public LiveStreamInfo createLiveStreamInfo() {
        return new LiveStreamInfo();
    }

    /**
     * Create an instance of {@link GetFileResponse }
     * 
     */
    public GetFileResponse createGetFileResponse() {
        return new GetFileResponse();
    }

    /**
     * Create an instance of {@link ArrayOfArtworkInfo }
     * 
     */
    public ArrayOfArtworkInfo createArrayOfArtworkInfo() {
        return new ArrayOfArtworkInfo();
    }

    /**
     * Create an instance of {@link GetMusic }
     * 
     */
    public GetMusic createGetMusic() {
        return new GetMusic();
    }

    /**
     * Create an instance of {@link RemoveLiveStreamResponse }
     * 
     */
    public RemoveLiveStreamResponse createRemoveLiveStreamResponse() {
        return new RemoveLiveStreamResponse();
    }

    /**
     * Create an instance of {@link AddRecordingLiveStreamResponse }
     * 
     */
    public AddRecordingLiveStreamResponse createAddRecordingLiveStreamResponse() {
        return new AddRecordingLiveStreamResponse();
    }

    /**
     * Create an instance of {@link DownloadFile }
     * 
     */
    public DownloadFile createDownloadFile() {
        return new DownloadFile();
    }

    /**
     * Create an instance of {@link GetLiveStream }
     * 
     */
    public GetLiveStream createGetLiveStream() {
        return new GetLiveStream();
    }

    /**
     * Create an instance of {@link GetRecording }
     * 
     */
    public GetRecording createGetRecording() {
        return new GetRecording();
    }

    /**
     * Create an instance of {@link GetRecordingArtworkResponse }
     * 
     */
    public GetRecordingArtworkResponse createGetRecordingArtworkResponse() {
        return new GetRecordingArtworkResponse();
    }

    /**
     * Create an instance of {@link GetLiveStreamResponse }
     * 
     */
    public GetLiveStreamResponse createGetLiveStreamResponse() {
        return new GetLiveStreamResponse();
    }

    /**
     * Create an instance of {@link GetVideoResponse }
     * 
     */
    public GetVideoResponse createGetVideoResponse() {
        return new GetVideoResponse();
    }

    /**
     * Create an instance of {@link ArtworkInfoList }
     * 
     */
    public ArtworkInfoList createArtworkInfoList() {
        return new ArtworkInfoList();
    }

    /**
     * Create an instance of {@link AddRecordingLiveStream }
     * 
     */
    public AddRecordingLiveStream createAddRecordingLiveStream() {
        return new AddRecordingLiveStream();
    }

    /**
     * Create an instance of {@link GetImageFile }
     * 
     */
    public GetImageFile createGetImageFile() {
        return new GetImageFile();
    }

    /**
     * Create an instance of {@link AddLiveStreamResponse }
     * 
     */
    public AddLiveStreamResponse createAddLiveStreamResponse() {
        return new AddLiveStreamResponse();
    }

    /**
     * Create an instance of {@link GetProgramArtworkList }
     * 
     */
    public GetProgramArtworkList createGetProgramArtworkList() {
        return new GetProgramArtworkList();
    }

    /**
     * Create an instance of {@link GetPreviewImageResponse }
     * 
     */
    public GetPreviewImageResponse createGetPreviewImageResponse() {
        return new GetPreviewImageResponse();
    }

    /**
     * Create an instance of {@link GetRecordingArtwork }
     * 
     */
    public GetRecordingArtwork createGetRecordingArtwork() {
        return new GetRecordingArtwork();
    }

    /**
     * Create an instance of {@link GetVideo }
     * 
     */
    public GetVideo createGetVideo() {
        return new GetVideo();
    }

    /**
     * Create an instance of {@link GetVideoArtwork }
     * 
     */
    public GetVideoArtwork createGetVideoArtwork() {
        return new GetVideoArtwork();
    }

    /**
     * Create an instance of {@link GetDirListResponse }
     * 
     */
    public GetDirListResponse createGetDirListResponse() {
        return new GetDirListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link AddLiveStream }
     * 
     */
    public AddLiveStream createAddLiveStream() {
        return new AddLiveStream();
    }

    /**
     * Create an instance of {@link DownloadFileResponse }
     * 
     */
    public DownloadFileResponse createDownloadFileResponse() {
        return new DownloadFileResponse();
    }

    /**
     * Create an instance of {@link GetPreviewImage }
     * 
     */
    public GetPreviewImage createGetPreviewImage() {
        return new GetPreviewImage();
    }

    /**
     * Create an instance of {@link StopLiveStream }
     * 
     */
    public StopLiveStream createStopLiveStream() {
        return new StopLiveStream();
    }

    /**
     * Create an instance of {@link GetHash }
     * 
     */
    public GetHash createGetHash() {
        return new GetHash();
    }

    /**
     * Create an instance of {@link GetAlbumArt }
     * 
     */
    public GetAlbumArt createGetAlbumArt() {
        return new GetAlbumArt();
    }

    /**
     * Create an instance of {@link GetProgramArtworkListResponse }
     * 
     */
    public GetProgramArtworkListResponse createGetProgramArtworkListResponse() {
        return new GetProgramArtworkListResponse();
    }

    /**
     * Create an instance of {@link GetRecordingResponse }
     * 
     */
    public GetRecordingResponse createGetRecordingResponse() {
        return new GetRecordingResponse();
    }

    /**
     * Create an instance of {@link StopLiveStreamResponse }
     * 
     */
    public StopLiveStreamResponse createStopLiveStreamResponse() {
        return new StopLiveStreamResponse();
    }

    /**
     * Create an instance of {@link GetRecordingArtworkList }
     * 
     */
    public GetRecordingArtworkList createGetRecordingArtworkList() {
        return new GetRecordingArtworkList();
    }

    /**
     * Create an instance of {@link GetFile }
     * 
     */
    public GetFile createGetFile() {
        return new GetFile();
    }

    /**
     * Create an instance of {@link GetRecordingArtworkListResponse }
     * 
     */
    public GetRecordingArtworkListResponse createGetRecordingArtworkListResponse() {
        return new GetRecordingArtworkListResponse();
    }

    /**
     * Create an instance of {@link GetHashResponse }
     * 
     */
    public GetHashResponse createGetHashResponse() {
        return new GetHashResponse();
    }

    /**
     * Create an instance of {@link GetMusicResponse }
     * 
     */
    public GetMusicResponse createGetMusicResponse() {
        return new GetMusicResponse();
    }

    /**
     * Create an instance of {@link ArtworkInfo }
     * 
     */
    public ArtworkInfo createArtworkInfo() {
        return new ArtworkInfo();
    }

    /**
     * Create an instance of {@link LiveStreamInfoList }
     * 
     */
    public LiveStreamInfoList createLiveStreamInfoList() {
        return new LiveStreamInfoList();
    }

    /**
     * Create an instance of {@link GetFileListResponse }
     * 
     */
    public GetFileListResponse createGetFileListResponse() {
        return new GetFileListResponse();
    }

    /**
     * Create an instance of {@link GetLiveStreamListResponse }
     * 
     */
    public GetLiveStreamListResponse createGetLiveStreamListResponse() {
        return new GetLiveStreamListResponse();
    }

    /**
     * Create an instance of {@link GetFileList }
     * 
     */
    public GetFileList createGetFileList() {
        return new GetFileList();
    }

    /**
     * Create an instance of {@link GetVideoArtworkResponse }
     * 
     */
    public GetVideoArtworkResponse createGetVideoArtworkResponse() {
        return new GetVideoArtworkResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLiveStreamInfo }
     * 
     */
    public ArrayOfLiveStreamInfo createArrayOfLiveStreamInfo() {
        return new ArrayOfLiveStreamInfo();
    }

    /**
     * Create an instance of {@link GetImageFileResponse }
     * 
     */
    public GetImageFileResponse createGetImageFileResponse() {
        return new GetImageFileResponse();
    }

    /**
     * Create an instance of {@link GetLiveStreamList }
     * 
     */
    public GetLiveStreamList createGetLiveStreamList() {
        return new GetLiveStreamList();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArtworkInfoList")
    public JAXBElement<ArtworkInfoList> createArtworkInfoList(ArtworkInfoList value) {
        return new JAXBElement<ArtworkInfoList>(_ArtworkInfoList_QNAME, ArtworkInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveStreamInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LiveStreamInfoList")
    public JAXBElement<LiveStreamInfoList> createLiveStreamInfoList(LiveStreamInfoList value) {
        return new JAXBElement<LiveStreamInfoList>(_LiveStreamInfoList_QNAME, LiveStreamInfoList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LiveStreamInfo")
    public JAXBElement<LiveStreamInfo> createLiveStreamInfo(LiveStreamInfo value) {
        return new JAXBElement<LiveStreamInfo>(_LiveStreamInfo_QNAME, LiveStreamInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiveStreamInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfLiveStreamInfo")
    public JAXBElement<ArrayOfLiveStreamInfo> createArrayOfLiveStreamInfo(ArrayOfLiveStreamInfo value) {
        return new JAXBElement<ArrayOfLiveStreamInfo>(_ArrayOfLiveStreamInfo_QNAME, ArrayOfLiveStreamInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AudioBitrate", scope = AddVideoLiveStream.class)
    public JAXBElement<Integer> createAddVideoLiveStreamAudioBitrate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamAudioBitrate_QNAME, Integer.class, AddVideoLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SampleRate", scope = AddVideoLiveStream.class)
    public JAXBElement<Integer> createAddVideoLiveStreamSampleRate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamSampleRate_QNAME, Integer.class, AddVideoLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = AddVideoLiveStream.class)
    public JAXBElement<Integer> createAddVideoLiveStreamWidth(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamWidth_QNAME, Integer.class, AddVideoLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Bitrate", scope = AddVideoLiveStream.class)
    public JAXBElement<Integer> createAddVideoLiveStreamBitrate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamBitrate_QNAME, Integer.class, AddVideoLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MaxSegments", scope = AddVideoLiveStream.class)
    public JAXBElement<Integer> createAddVideoLiveStreamMaxSegments(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamMaxSegments_QNAME, Integer.class, AddVideoLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = AddVideoLiveStream.class)
    public JAXBElement<Integer> createAddVideoLiveStreamHeight(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamHeight_QNAME, Integer.class, AddVideoLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = AddVideoLiveStream.class)
    public JAXBElement<Integer> createAddVideoLiveStreamId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamId_QNAME, Integer.class, AddVideoLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddRecordingLiveStreamResult", scope = AddRecordingLiveStreamResponse.class)
    public JAXBElement<LiveStreamInfo> createAddRecordingLiveStreamResponseAddRecordingLiveStreamResult(LiveStreamInfo value) {
        return new JAXBElement<LiveStreamInfo>(_AddRecordingLiveStreamResponseAddRecordingLiveStreamResult_QNAME, LiveStreamInfo.class, AddRecordingLiveStreamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetDirListResult", scope = GetDirListResponse.class)
    public JAXBElement<ArrayOfString> createGetDirListResponseGetDirListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetDirListResponseGetDirListResult_QNAME, ArrayOfString.class, GetDirListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetLiveStreamResult", scope = GetLiveStreamResponse.class)
    public JAXBElement<LiveStreamInfo> createGetLiveStreamResponseGetLiveStreamResult(LiveStreamInfo value) {
        return new JAXBElement<LiveStreamInfo>(_GetLiveStreamResponseGetLiveStreamResult_QNAME, LiveStreamInfo.class, GetLiveStreamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveLiveStreamResult", scope = RemoveLiveStreamResponse.class)
    public JAXBElement<Boolean> createRemoveLiveStreamResponseRemoveLiveStreamResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveLiveStreamResponseRemoveLiveStreamResult_QNAME, Boolean.class, RemoveLiveStreamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = GetLiveStream.class)
    public JAXBElement<Integer> createGetLiveStreamId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamId_QNAME, Integer.class, GetLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoResult", scope = GetVideoResponse.class)
    public JAXBElement<String> createGetVideoResponseGetVideoResult(String value) {
        return new JAXBElement<String>(_GetVideoResponseGetVideoResult_QNAME, String.class, GetVideoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordingArtworkResult", scope = GetRecordingArtworkResponse.class)
    public JAXBElement<String> createGetRecordingArtworkResponseGetRecordingArtworkResult(String value) {
        return new JAXBElement<String>(_GetRecordingArtworkResponseGetRecordingArtworkResult_QNAME, String.class, GetRecordingArtworkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordingResult", scope = GetRecordingResponse.class)
    public JAXBElement<String> createGetRecordingResponseGetRecordingResult(String value) {
        return new JAXBElement<String>(_GetRecordingResponseGetRecordingResult_QNAME, String.class, GetRecordingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = AddRecordingLiveStream.class)
    public JAXBElement<Integer> createAddRecordingLiveStreamChanId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordingLiveStreamChanId_QNAME, Integer.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AudioBitrate", scope = AddRecordingLiveStream.class)
    public JAXBElement<Integer> createAddRecordingLiveStreamAudioBitrate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamAudioBitrate_QNAME, Integer.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SampleRate", scope = AddRecordingLiveStream.class)
    public JAXBElement<Integer> createAddRecordingLiveStreamSampleRate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamSampleRate_QNAME, Integer.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = AddRecordingLiveStream.class)
    public JAXBElement<Integer> createAddRecordingLiveStreamRecordedId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordingLiveStreamRecordedId_QNAME, Integer.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = AddRecordingLiveStream.class)
    public JAXBElement<Integer> createAddRecordingLiveStreamWidth(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamWidth_QNAME, Integer.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Bitrate", scope = AddRecordingLiveStream.class)
    public JAXBElement<Integer> createAddRecordingLiveStreamBitrate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamBitrate_QNAME, Integer.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MaxSegments", scope = AddRecordingLiveStream.class)
    public JAXBElement<Integer> createAddRecordingLiveStreamMaxSegments(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamMaxSegments_QNAME, Integer.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = AddRecordingLiveStream.class)
    public JAXBElement<XMLGregorianCalendar> createAddRecordingLiveStreamStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddRecordingLiveStreamStartTime_QNAME, XMLGregorianCalendar.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = AddRecordingLiveStream.class)
    public JAXBElement<Integer> createAddRecordingLiveStreamHeight(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamHeight_QNAME, Integer.class, AddRecordingLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Type", scope = GetRecordingArtwork.class)
    public JAXBElement<String> createGetRecordingArtworkType(String value) {
        return new JAXBElement<String>(_GetRecordingArtworkType_QNAME, String.class, GetRecordingArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Season", scope = GetRecordingArtwork.class)
    public JAXBElement<Integer> createGetRecordingArtworkSeason(Integer value) {
        return new JAXBElement<Integer>(_GetRecordingArtworkSeason_QNAME, Integer.class, GetRecordingArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = GetRecordingArtwork.class)
    public JAXBElement<Integer> createGetRecordingArtworkWidth(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamWidth_QNAME, Integer.class, GetRecordingArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Inetref", scope = GetRecordingArtwork.class)
    public JAXBElement<String> createGetRecordingArtworkInetref(String value) {
        return new JAXBElement<String>(_GetRecordingArtworkInetref_QNAME, String.class, GetRecordingArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = GetRecordingArtwork.class)
    public JAXBElement<Integer> createGetRecordingArtworkHeight(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamHeight_QNAME, Integer.class, GetRecordingArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetPreviewImage.class)
    public JAXBElement<Integer> createGetPreviewImageChanId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordingLiveStreamChanId_QNAME, Integer.class, GetPreviewImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SecsIn", scope = GetPreviewImage.class)
    public JAXBElement<Integer> createGetPreviewImageSecsIn(Integer value) {
        return new JAXBElement<Integer>(_GetPreviewImageSecsIn_QNAME, Integer.class, GetPreviewImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Format", scope = GetPreviewImage.class)
    public JAXBElement<String> createGetPreviewImageFormat(String value) {
        return new JAXBElement<String>(_GetPreviewImageFormat_QNAME, String.class, GetPreviewImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetPreviewImage.class)
    public JAXBElement<Integer> createGetPreviewImageRecordedId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordingLiveStreamRecordedId_QNAME, Integer.class, GetPreviewImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = GetPreviewImage.class)
    public JAXBElement<Integer> createGetPreviewImageWidth(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamWidth_QNAME, Integer.class, GetPreviewImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetPreviewImage.class)
    public JAXBElement<XMLGregorianCalendar> createGetPreviewImageStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddRecordingLiveStreamStartTime_QNAME, XMLGregorianCalendar.class, GetPreviewImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = GetPreviewImage.class)
    public JAXBElement<Integer> createGetPreviewImageHeight(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamHeight_QNAME, Integer.class, GetPreviewImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = RemoveLiveStream.class)
    public JAXBElement<Integer> createRemoveLiveStreamId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamId_QNAME, Integer.class, RemoveLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StopLiveStreamResult", scope = StopLiveStreamResponse.class)
    public JAXBElement<LiveStreamInfo> createStopLiveStreamResponseStopLiveStreamResult(LiveStreamInfo value) {
        return new JAXBElement<LiveStreamInfo>(_StopLiveStreamResponseStopLiveStreamResult_QNAME, LiveStreamInfo.class, StopLiveStreamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FileName", scope = GetImageFile.class)
    public JAXBElement<String> createGetImageFileFileName(String value) {
        return new JAXBElement<String>(_GetImageFileFileName_QNAME, String.class, GetImageFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = GetImageFile.class)
    public JAXBElement<String> createGetImageFileStorageGroup(String value) {
        return new JAXBElement<String>(_GetImageFileStorageGroup_QNAME, String.class, GetImageFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = GetImageFile.class)
    public JAXBElement<Integer> createGetImageFileWidth(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamWidth_QNAME, Integer.class, GetImageFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = GetImageFile.class)
    public JAXBElement<Integer> createGetImageFileHeight(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamHeight_QNAME, Integer.class, GetImageFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetMusicResult", scope = GetMusicResponse.class)
    public JAXBElement<String> createGetMusicResponseGetMusicResult(String value) {
        return new JAXBElement<String>(_GetMusicResponseGetMusicResult_QNAME, String.class, GetMusicResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DownloadFileResult", scope = DownloadFileResponse.class)
    public JAXBElement<Boolean> createDownloadFileResponseDownloadFileResult(Boolean value) {
        return new JAXBElement<Boolean>(_DownloadFileResponseDownloadFileResult_QNAME, Boolean.class, DownloadFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FileName", scope = GetFile.class)
    public JAXBElement<String> createGetFileFileName(String value) {
        return new JAXBElement<String>(_GetImageFileFileName_QNAME, String.class, GetFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = GetFile.class)
    public JAXBElement<String> createGetFileStorageGroup(String value) {
        return new JAXBElement<String>(_GetImageFileStorageGroup_QNAME, String.class, GetFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = StopLiveStream.class)
    public JAXBElement<Integer> createStopLiveStreamId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamId_QNAME, Integer.class, StopLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FileName", scope = GetHash.class)
    public JAXBElement<String> createGetHashFileName(String value) {
        return new JAXBElement<String>(_GetImageFileFileName_QNAME, String.class, GetHash.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = GetHash.class)
    public JAXBElement<String> createGetHashStorageGroup(String value) {
        return new JAXBElement<String>(_GetImageFileStorageGroup_QNAME, String.class, GetHash.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Type", scope = GetVideoArtwork.class)
    public JAXBElement<String> createGetVideoArtworkType(String value) {
        return new JAXBElement<String>(_GetRecordingArtworkType_QNAME, String.class, GetVideoArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = GetVideoArtwork.class)
    public JAXBElement<Integer> createGetVideoArtworkWidth(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamWidth_QNAME, Integer.class, GetVideoArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = GetVideoArtwork.class)
    public JAXBElement<Integer> createGetVideoArtworkHeight(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamHeight_QNAME, Integer.class, GetVideoArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = GetVideoArtwork.class)
    public JAXBElement<Integer> createGetVideoArtworkId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamId_QNAME, Integer.class, GetVideoArtwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = GetMusic.class)
    public JAXBElement<Integer> createGetMusicId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamId_QNAME, Integer.class, GetMusic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetHashResult", scope = GetHashResponse.class)
    public JAXBElement<String> createGetHashResponseGetHashResult(String value) {
        return new JAXBElement<String>(_GetHashResponseGetHashResult_QNAME, String.class, GetHashResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = GetAlbumArt.class)
    public JAXBElement<Integer> createGetAlbumArtWidth(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamWidth_QNAME, Integer.class, GetAlbumArt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = GetAlbumArt.class)
    public JAXBElement<Integer> createGetAlbumArtHeight(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamHeight_QNAME, Integer.class, GetAlbumArt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = GetAlbumArt.class)
    public JAXBElement<Integer> createGetAlbumArtId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamId_QNAME, Integer.class, GetAlbumArt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetAlbumArtResult", scope = GetAlbumArtResponse.class)
    public JAXBElement<String> createGetAlbumArtResponseGetAlbumArtResult(String value) {
        return new JAXBElement<String>(_GetAlbumArtResponseGetAlbumArtResult_QNAME, String.class, GetAlbumArtResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetFileListResult", scope = GetFileListResponse.class)
    public JAXBElement<ArrayOfString> createGetFileListResponseGetFileListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetFileListResponseGetFileListResult_QNAME, ArrayOfString.class, GetFileListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LastModified", scope = LiveStreamInfo.class)
    public JAXBElement<XMLGregorianCalendar> createLiveStreamInfoLastModified(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LiveStreamInfoLastModified_QNAME, XMLGregorianCalendar.class, LiveStreamInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Created", scope = LiveStreamInfo.class)
    public JAXBElement<XMLGregorianCalendar> createLiveStreamInfoCreated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LiveStreamInfoCreated_QNAME, XMLGregorianCalendar.class, LiveStreamInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetRecording.class)
    public JAXBElement<Integer> createGetRecordingChanId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordingLiveStreamChanId_QNAME, Integer.class, GetRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetRecording.class)
    public JAXBElement<Integer> createGetRecordingRecordedId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordingLiveStreamRecordedId_QNAME, Integer.class, GetRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetRecording.class)
    public JAXBElement<XMLGregorianCalendar> createGetRecordingStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddRecordingLiveStreamStartTime_QNAME, XMLGregorianCalendar.class, GetRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetProgramArtworkListResult", scope = GetProgramArtworkListResponse.class)
    public JAXBElement<ArtworkInfoList> createGetProgramArtworkListResponseGetProgramArtworkListResult(ArtworkInfoList value) {
        return new JAXBElement<ArtworkInfoList>(_GetProgramArtworkListResponseGetProgramArtworkListResult_QNAME, ArtworkInfoList.class, GetProgramArtworkListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetPreviewImageResult", scope = GetPreviewImageResponse.class)
    public JAXBElement<String> createGetPreviewImageResponseGetPreviewImageResult(String value) {
        return new JAXBElement<String>(_GetPreviewImageResponseGetPreviewImageResult_QNAME, String.class, GetPreviewImageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetVideoArtworkResult", scope = GetVideoArtworkResponse.class)
    public JAXBElement<String> createGetVideoArtworkResponseGetVideoArtworkResult(String value) {
        return new JAXBElement<String>(_GetVideoArtworkResponseGetVideoArtworkResult_QNAME, String.class, GetVideoArtworkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = GetVideo.class)
    public JAXBElement<Integer> createGetVideoId(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamId_QNAME, Integer.class, GetVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FileName", scope = GetLiveStreamList.class)
    public JAXBElement<String> createGetLiveStreamListFileName(String value) {
        return new JAXBElement<String>(_GetImageFileFileName_QNAME, String.class, GetLiveStreamList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FileName", scope = AddLiveStream.class)
    public JAXBElement<String> createAddLiveStreamFileName(String value) {
        return new JAXBElement<String>(_GetImageFileFileName_QNAME, String.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = AddLiveStream.class)
    public JAXBElement<String> createAddLiveStreamStorageGroup(String value) {
        return new JAXBElement<String>(_GetImageFileStorageGroup_QNAME, String.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AudioBitrate", scope = AddLiveStream.class)
    public JAXBElement<Integer> createAddLiveStreamAudioBitrate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamAudioBitrate_QNAME, Integer.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SampleRate", scope = AddLiveStream.class)
    public JAXBElement<Integer> createAddLiveStreamSampleRate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamSampleRate_QNAME, Integer.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = AddLiveStream.class)
    public JAXBElement<Integer> createAddLiveStreamWidth(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamWidth_QNAME, Integer.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Bitrate", scope = AddLiveStream.class)
    public JAXBElement<Integer> createAddLiveStreamBitrate(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamBitrate_QNAME, Integer.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = AddLiveStream.class)
    public JAXBElement<String> createAddLiveStreamHostName(String value) {
        return new JAXBElement<String>(_AddLiveStreamHostName_QNAME, String.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MaxSegments", scope = AddLiveStream.class)
    public JAXBElement<Integer> createAddLiveStreamMaxSegments(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamMaxSegments_QNAME, Integer.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = AddLiveStream.class)
    public JAXBElement<Integer> createAddLiveStreamHeight(Integer value) {
        return new JAXBElement<Integer>(_AddVideoLiveStreamHeight_QNAME, Integer.class, AddLiveStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddVideoLiveStreamResult", scope = AddVideoLiveStreamResponse.class)
    public JAXBElement<LiveStreamInfo> createAddVideoLiveStreamResponseAddVideoLiveStreamResult(LiveStreamInfo value) {
        return new JAXBElement<LiveStreamInfo>(_AddVideoLiveStreamResponseAddVideoLiveStreamResult_QNAME, LiveStreamInfo.class, AddVideoLiveStreamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Season", scope = GetProgramArtworkList.class)
    public JAXBElement<Integer> createGetProgramArtworkListSeason(Integer value) {
        return new JAXBElement<Integer>(_GetRecordingArtworkSeason_QNAME, Integer.class, GetProgramArtworkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Inetref", scope = GetProgramArtworkList.class)
    public JAXBElement<String> createGetProgramArtworkListInetref(String value) {
        return new JAXBElement<String>(_GetRecordingArtworkInetref_QNAME, String.class, GetProgramArtworkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetFileResult", scope = GetFileResponse.class)
    public JAXBElement<String> createGetFileResponseGetFileResult(String value) {
        return new JAXBElement<String>(_GetFileResponseGetFileResult_QNAME, String.class, GetFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveStreamInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetLiveStreamListResult", scope = GetLiveStreamListResponse.class)
    public JAXBElement<LiveStreamInfoList> createGetLiveStreamListResponseGetLiveStreamListResult(LiveStreamInfoList value) {
        return new JAXBElement<LiveStreamInfoList>(_GetLiveStreamListResponseGetLiveStreamListResult_QNAME, LiveStreamInfoList.class, GetLiveStreamListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetImageFileResult", scope = GetImageFileResponse.class)
    public JAXBElement<String> createGetImageFileResponseGetImageFileResult(String value) {
        return new JAXBElement<String>(_GetImageFileResponseGetImageFileResult_QNAME, String.class, GetImageFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = DownloadFile.class)
    public JAXBElement<String> createDownloadFileStorageGroup(String value) {
        return new JAXBElement<String>(_GetImageFileStorageGroup_QNAME, String.class, DownloadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "URL", scope = DownloadFile.class)
    public JAXBElement<String> createDownloadFileURL(String value) {
        return new JAXBElement<String>(_DownloadFileURL_QNAME, String.class, DownloadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetRecordingArtworkListResult", scope = GetRecordingArtworkListResponse.class)
    public JAXBElement<ArtworkInfoList> createGetRecordingArtworkListResponseGetRecordingArtworkListResult(ArtworkInfoList value) {
        return new JAXBElement<ArtworkInfoList>(_GetRecordingArtworkListResponseGetRecordingArtworkListResult_QNAME, ArtworkInfoList.class, GetRecordingArtworkListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddLiveStreamResult", scope = AddLiveStreamResponse.class)
    public JAXBElement<LiveStreamInfo> createAddLiveStreamResponseAddLiveStreamResult(LiveStreamInfo value) {
        return new JAXBElement<LiveStreamInfo>(_AddLiveStreamResponseAddLiveStreamResult_QNAME, LiveStreamInfo.class, AddLiveStreamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetRecordingArtworkList.class)
    public JAXBElement<Integer> createGetRecordingArtworkListChanId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordingLiveStreamChanId_QNAME, Integer.class, GetRecordingArtworkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = GetRecordingArtworkList.class)
    public JAXBElement<Integer> createGetRecordingArtworkListRecordedId(Integer value) {
        return new JAXBElement<Integer>(_AddRecordingLiveStreamRecordedId_QNAME, Integer.class, GetRecordingArtworkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetRecordingArtworkList.class)
    public JAXBElement<XMLGregorianCalendar> createGetRecordingArtworkListStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddRecordingLiveStreamStartTime_QNAME, XMLGregorianCalendar.class, GetRecordingArtworkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = GetFileList.class)
    public JAXBElement<String> createGetFileListStorageGroup(String value) {
        return new JAXBElement<String>(_GetImageFileStorageGroup_QNAME, String.class, GetFileList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StorageGroup", scope = GetDirList.class)
    public JAXBElement<String> createGetDirListStorageGroup(String value) {
        return new JAXBElement<String>(_GetImageFileStorageGroup_QNAME, String.class, GetDirList.class, value);
    }

}
