
package mythtvapi.content;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Content", targetNamespace = "http://mythtv.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Content {


    /**
     * GET 
     * 
     * @param hostName
     * @param fileName
     * @param maxSegments
     * @param width
     * @param bitrate
     * @param sampleRate
     * @param audioBitrate
     * @param storageGroup
     * @param height
     * @return
     *     returns mythtvapi.content.LiveStreamInfo
     */
    @WebMethod(operationName = "AddLiveStream", action = "http://mythtv.org/Content/AddLiveStream")
    @WebResult(name = "AddLiveStreamResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "AddLiveStream", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.AddLiveStream")
    @ResponseWrapper(localName = "AddLiveStreamResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.AddLiveStreamResponse")
    public LiveStreamInfo addLiveStream(
        @WebParam(name = "StorageGroup", targetNamespace = "http://mythtv.org")
        String storageGroup,
        @WebParam(name = "FileName", targetNamespace = "http://mythtv.org")
        String fileName,
        @WebParam(name = "HostName", targetNamespace = "http://mythtv.org")
        String hostName,
        @WebParam(name = "MaxSegments", targetNamespace = "http://mythtv.org")
        Integer maxSegments,
        @WebParam(name = "Width", targetNamespace = "http://mythtv.org")
        Integer width,
        @WebParam(name = "Height", targetNamespace = "http://mythtv.org")
        Integer height,
        @WebParam(name = "Bitrate", targetNamespace = "http://mythtv.org")
        Integer bitrate,
        @WebParam(name = "AudioBitrate", targetNamespace = "http://mythtv.org")
        Integer audioBitrate,
        @WebParam(name = "SampleRate", targetNamespace = "http://mythtv.org")
        Integer sampleRate);

    /**
     * GET 
     * 
     * @param maxSegments
     * @param width
     * @param chanId
     * @param startTime
     * @param bitrate
     * @param sampleRate
     * @param recordedId
     * @param audioBitrate
     * @param height
     * @return
     *     returns mythtvapi.content.LiveStreamInfo
     */
    @WebMethod(operationName = "AddRecordingLiveStream", action = "http://mythtv.org/Content/AddRecordingLiveStream")
    @WebResult(name = "AddRecordingLiveStreamResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "AddRecordingLiveStream", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.AddRecordingLiveStream")
    @ResponseWrapper(localName = "AddRecordingLiveStreamResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.AddRecordingLiveStreamResponse")
    public LiveStreamInfo addRecordingLiveStream(
        @WebParam(name = "RecordedId", targetNamespace = "http://mythtv.org")
        Integer recordedId,
        @WebParam(name = "ChanId", targetNamespace = "http://mythtv.org")
        Integer chanId,
        @WebParam(name = "StartTime", targetNamespace = "http://mythtv.org")
        XMLGregorianCalendar startTime,
        @WebParam(name = "MaxSegments", targetNamespace = "http://mythtv.org")
        Integer maxSegments,
        @WebParam(name = "Width", targetNamespace = "http://mythtv.org")
        Integer width,
        @WebParam(name = "Height", targetNamespace = "http://mythtv.org")
        Integer height,
        @WebParam(name = "Bitrate", targetNamespace = "http://mythtv.org")
        Integer bitrate,
        @WebParam(name = "AudioBitrate", targetNamespace = "http://mythtv.org")
        Integer audioBitrate,
        @WebParam(name = "SampleRate", targetNamespace = "http://mythtv.org")
        Integer sampleRate);

    /**
     * GET 
     * 
     * @param maxSegments
     * @param width
     * @param bitrate
     * @param id
     * @param sampleRate
     * @param audioBitrate
     * @param height
     * @return
     *     returns mythtvapi.content.LiveStreamInfo
     */
    @WebMethod(operationName = "AddVideoLiveStream", action = "http://mythtv.org/Content/AddVideoLiveStream")
    @WebResult(name = "AddVideoLiveStreamResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "AddVideoLiveStream", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.AddVideoLiveStream")
    @ResponseWrapper(localName = "AddVideoLiveStreamResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.AddVideoLiveStreamResponse")
    public LiveStreamInfo addVideoLiveStream(
        @WebParam(name = "Id", targetNamespace = "http://mythtv.org")
        Integer id,
        @WebParam(name = "MaxSegments", targetNamespace = "http://mythtv.org")
        Integer maxSegments,
        @WebParam(name = "Width", targetNamespace = "http://mythtv.org")
        Integer width,
        @WebParam(name = "Height", targetNamespace = "http://mythtv.org")
        Integer height,
        @WebParam(name = "Bitrate", targetNamespace = "http://mythtv.org")
        Integer bitrate,
        @WebParam(name = "AudioBitrate", targetNamespace = "http://mythtv.org")
        Integer audioBitrate,
        @WebParam(name = "SampleRate", targetNamespace = "http://mythtv.org")
        Integer sampleRate);

    /**
     * POST 
     * 
     * @param url
     * @param storageGroup
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "DownloadFile", action = "http://mythtv.org/Content/DownloadFile")
    @WebResult(name = "DownloadFileResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "DownloadFile", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.DownloadFile")
    @ResponseWrapper(localName = "DownloadFileResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.DownloadFileResponse")
    public Boolean downloadFile(
        @WebParam(name = "URL", targetNamespace = "http://mythtv.org")
        String url,
        @WebParam(name = "StorageGroup", targetNamespace = "http://mythtv.org")
        String storageGroup);

    /**
     * GET 
     * 
     * @param width
     * @param id
     * @param height
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAlbumArt", action = "http://mythtv.org/Content/GetAlbumArt")
    @WebResult(name = "GetAlbumArtResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetAlbumArt", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetAlbumArt")
    @ResponseWrapper(localName = "GetAlbumArtResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetAlbumArtResponse")
    public String getAlbumArt(
        @WebParam(name = "Id", targetNamespace = "http://mythtv.org")
        Integer id,
        @WebParam(name = "Width", targetNamespace = "http://mythtv.org")
        Integer width,
        @WebParam(name = "Height", targetNamespace = "http://mythtv.org")
        Integer height);

    /**
     * GET 
     * 
     * @param storageGroup
     * @return
     *     returns mythtvapi.content.ArrayOfString
     */
    @WebMethod(operationName = "GetDirList", action = "http://mythtv.org/Content/GetDirList")
    @WebResult(name = "GetDirListResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetDirList", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetDirList")
    @ResponseWrapper(localName = "GetDirListResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetDirListResponse")
    public ArrayOfString getDirList(
        @WebParam(name = "StorageGroup", targetNamespace = "http://mythtv.org")
        String storageGroup);

    /**
     * GET 
     * 
     * @param fileName
     * @param storageGroup
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetFile", action = "http://mythtv.org/Content/GetFile")
    @WebResult(name = "GetFileResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetFile", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetFile")
    @ResponseWrapper(localName = "GetFileResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetFileResponse")
    public String getFile(
        @WebParam(name = "StorageGroup", targetNamespace = "http://mythtv.org")
        String storageGroup,
        @WebParam(name = "FileName", targetNamespace = "http://mythtv.org")
        String fileName);

    /**
     * GET 
     * 
     * @param storageGroup
     * @return
     *     returns mythtvapi.content.ArrayOfString
     */
    @WebMethod(operationName = "GetFileList", action = "http://mythtv.org/Content/GetFileList")
    @WebResult(name = "GetFileListResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetFileList", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetFileList")
    @ResponseWrapper(localName = "GetFileListResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetFileListResponse")
    public ArrayOfString getFileList(
        @WebParam(name = "StorageGroup", targetNamespace = "http://mythtv.org")
        String storageGroup);

    /**
     * GET 
     * 
     * @param fileName
     * @param storageGroup
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetHash", action = "http://mythtv.org/Content/GetHash")
    @WebResult(name = "GetHashResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetHash", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetHash")
    @ResponseWrapper(localName = "GetHashResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetHashResponse")
    public String getHash(
        @WebParam(name = "StorageGroup", targetNamespace = "http://mythtv.org")
        String storageGroup,
        @WebParam(name = "FileName", targetNamespace = "http://mythtv.org")
        String fileName);

    /**
     * GET 
     * 
     * @param fileName
     * @param width
     * @param storageGroup
     * @param height
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetImageFile", action = "http://mythtv.org/Content/GetImageFile")
    @WebResult(name = "GetImageFileResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetImageFile", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetImageFile")
    @ResponseWrapper(localName = "GetImageFileResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetImageFileResponse")
    public String getImageFile(
        @WebParam(name = "StorageGroup", targetNamespace = "http://mythtv.org")
        String storageGroup,
        @WebParam(name = "FileName", targetNamespace = "http://mythtv.org")
        String fileName,
        @WebParam(name = "Width", targetNamespace = "http://mythtv.org")
        Integer width,
        @WebParam(name = "Height", targetNamespace = "http://mythtv.org")
        Integer height);

    /**
     * GET 
     * 
     * @param id
     * @return
     *     returns mythtvapi.content.LiveStreamInfo
     */
    @WebMethod(operationName = "GetLiveStream", action = "http://mythtv.org/Content/GetLiveStream")
    @WebResult(name = "GetLiveStreamResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetLiveStream", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetLiveStream")
    @ResponseWrapper(localName = "GetLiveStreamResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetLiveStreamResponse")
    public LiveStreamInfo getLiveStream(
        @WebParam(name = "Id", targetNamespace = "http://mythtv.org")
        Integer id);

    /**
     * GET 
     * 
     * @param fileName
     * @return
     *     returns mythtvapi.content.LiveStreamInfoList
     */
    @WebMethod(operationName = "GetLiveStreamList", action = "http://mythtv.org/Content/GetLiveStreamList")
    @WebResult(name = "GetLiveStreamListResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetLiveStreamList", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetLiveStreamList")
    @ResponseWrapper(localName = "GetLiveStreamListResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetLiveStreamListResponse")
    public LiveStreamInfoList getLiveStreamList(
        @WebParam(name = "FileName", targetNamespace = "http://mythtv.org")
        String fileName);

    /**
     * GET 
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetMusic", action = "http://mythtv.org/Content/GetMusic")
    @WebResult(name = "GetMusicResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetMusic", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetMusic")
    @ResponseWrapper(localName = "GetMusicResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetMusicResponse")
    public String getMusic(
        @WebParam(name = "Id", targetNamespace = "http://mythtv.org")
        Integer id);

    /**
     * GET 
     * 
     * @param width
     * @param format
     * @param chanId
     * @param startTime
     * @param secsIn
     * @param recordedId
     * @param height
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetPreviewImage", action = "http://mythtv.org/Content/GetPreviewImage")
    @WebResult(name = "GetPreviewImageResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetPreviewImage", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetPreviewImage")
    @ResponseWrapper(localName = "GetPreviewImageResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetPreviewImageResponse")
    public String getPreviewImage(
        @WebParam(name = "RecordedId", targetNamespace = "http://mythtv.org")
        Integer recordedId,
        @WebParam(name = "ChanId", targetNamespace = "http://mythtv.org")
        Integer chanId,
        @WebParam(name = "StartTime", targetNamespace = "http://mythtv.org")
        XMLGregorianCalendar startTime,
        @WebParam(name = "Width", targetNamespace = "http://mythtv.org")
        Integer width,
        @WebParam(name = "Height", targetNamespace = "http://mythtv.org")
        Integer height,
        @WebParam(name = "SecsIn", targetNamespace = "http://mythtv.org")
        Integer secsIn,
        @WebParam(name = "Format", targetNamespace = "http://mythtv.org")
        String format);

    /**
     * GET 
     * 
     * @param inetref
     * @param season
     * @return
     *     returns mythtvapi.content.ArtworkInfoList
     */
    @WebMethod(operationName = "GetProgramArtworkList", action = "http://mythtv.org/Content/GetProgramArtworkList")
    @WebResult(name = "GetProgramArtworkListResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetProgramArtworkList", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetProgramArtworkList")
    @ResponseWrapper(localName = "GetProgramArtworkListResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetProgramArtworkListResponse")
    public ArtworkInfoList getProgramArtworkList(
        @WebParam(name = "Inetref", targetNamespace = "http://mythtv.org")
        String inetref,
        @WebParam(name = "Season", targetNamespace = "http://mythtv.org")
        Integer season);

    /**
     * GET 
     * 
     * @param chanId
     * @param startTime
     * @param recordedId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetRecording", action = "http://mythtv.org/Content/GetRecording")
    @WebResult(name = "GetRecordingResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetRecording", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetRecording")
    @ResponseWrapper(localName = "GetRecordingResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetRecordingResponse")
    public String getRecording(
        @WebParam(name = "RecordedId", targetNamespace = "http://mythtv.org")
        Integer recordedId,
        @WebParam(name = "ChanId", targetNamespace = "http://mythtv.org")
        Integer chanId,
        @WebParam(name = "StartTime", targetNamespace = "http://mythtv.org")
        XMLGregorianCalendar startTime);

    /**
     * GET 
     * 
     * @param inetref
     * @param width
     * @param season
     * @param type
     * @param height
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetRecordingArtwork", action = "http://mythtv.org/Content/GetRecordingArtwork")
    @WebResult(name = "GetRecordingArtworkResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetRecordingArtwork", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetRecordingArtwork")
    @ResponseWrapper(localName = "GetRecordingArtworkResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetRecordingArtworkResponse")
    public String getRecordingArtwork(
        @WebParam(name = "Type", targetNamespace = "http://mythtv.org")
        String type,
        @WebParam(name = "Inetref", targetNamespace = "http://mythtv.org")
        String inetref,
        @WebParam(name = "Season", targetNamespace = "http://mythtv.org")
        Integer season,
        @WebParam(name = "Width", targetNamespace = "http://mythtv.org")
        Integer width,
        @WebParam(name = "Height", targetNamespace = "http://mythtv.org")
        Integer height);

    /**
     * GET 
     * 
     * @param chanId
     * @param startTime
     * @param recordedId
     * @return
     *     returns mythtvapi.content.ArtworkInfoList
     */
    @WebMethod(operationName = "GetRecordingArtworkList", action = "http://mythtv.org/Content/GetRecordingArtworkList")
    @WebResult(name = "GetRecordingArtworkListResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetRecordingArtworkList", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetRecordingArtworkList")
    @ResponseWrapper(localName = "GetRecordingArtworkListResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetRecordingArtworkListResponse")
    public ArtworkInfoList getRecordingArtworkList(
        @WebParam(name = "RecordedId", targetNamespace = "http://mythtv.org")
        Integer recordedId,
        @WebParam(name = "ChanId", targetNamespace = "http://mythtv.org")
        Integer chanId,
        @WebParam(name = "StartTime", targetNamespace = "http://mythtv.org")
        XMLGregorianCalendar startTime);

    /**
     * GET 
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetVideo", action = "http://mythtv.org/Content/GetVideo")
    @WebResult(name = "GetVideoResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetVideo", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetVideo")
    @ResponseWrapper(localName = "GetVideoResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetVideoResponse")
    public String getVideo(
        @WebParam(name = "Id", targetNamespace = "http://mythtv.org")
        Integer id);

    /**
     * GET 
     * 
     * @param width
     * @param id
     * @param type
     * @param height
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetVideoArtwork", action = "http://mythtv.org/Content/GetVideoArtwork")
    @WebResult(name = "GetVideoArtworkResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "GetVideoArtwork", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetVideoArtwork")
    @ResponseWrapper(localName = "GetVideoArtworkResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.GetVideoArtworkResponse")
    public String getVideoArtwork(
        @WebParam(name = "Type", targetNamespace = "http://mythtv.org")
        String type,
        @WebParam(name = "Id", targetNamespace = "http://mythtv.org")
        Integer id,
        @WebParam(name = "Width", targetNamespace = "http://mythtv.org")
        Integer width,
        @WebParam(name = "Height", targetNamespace = "http://mythtv.org")
        Integer height);

    /**
     * GET 
     * 
     * @param id
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "RemoveLiveStream", action = "http://mythtv.org/Content/RemoveLiveStream")
    @WebResult(name = "RemoveLiveStreamResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "RemoveLiveStream", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.RemoveLiveStream")
    @ResponseWrapper(localName = "RemoveLiveStreamResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.RemoveLiveStreamResponse")
    public Boolean removeLiveStream(
        @WebParam(name = "Id", targetNamespace = "http://mythtv.org")
        Integer id);

    /**
     * GET 
     * 
     * @param id
     * @return
     *     returns mythtvapi.content.LiveStreamInfo
     */
    @WebMethod(operationName = "StopLiveStream", action = "http://mythtv.org/Content/StopLiveStream")
    @WebResult(name = "StopLiveStreamResult", targetNamespace = "http://mythtv.org")
    @RequestWrapper(localName = "StopLiveStream", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.StopLiveStream")
    @ResponseWrapper(localName = "StopLiveStreamResponse", targetNamespace = "http://mythtv.org", className = "mythtvapi.content.StopLiveStreamResponse")
    public LiveStreamInfo stopLiveStream(
        @WebParam(name = "Id", targetNamespace = "http://mythtv.org")
        Integer id);

}
