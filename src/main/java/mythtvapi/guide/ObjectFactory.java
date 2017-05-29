
package mythtvapi.guide;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mythtvapi.guide package. 
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

    private final static QName _ProgramGuide_QNAME = new QName("http://mythtv.org", "ProgramGuide");
    private final static QName _RecordingInfo_QNAME = new QName("http://mythtv.org", "RecordingInfo");
    private final static QName _ProgramList_QNAME = new QName("http://mythtv.org", "ProgramList");
    private final static QName _ChannelGroupList_QNAME = new QName("http://mythtv.org", "ChannelGroupList");
    private final static QName _Program_QNAME = new QName("http://mythtv.org", "Program");
    private final static QName _ArrayOfChannelGroup_QNAME = new QName("http://mythtv.org", "ArrayOfChannelGroup");
    private final static QName _ArrayOfChannelInfo_QNAME = new QName("http://mythtv.org", "ArrayOfChannelInfo");
    private final static QName _ChannelInfo_QNAME = new QName("http://mythtv.org", "ChannelInfo");
    private final static QName _CastMemberList_QNAME = new QName("http://mythtv.org", "CastMemberList");
    private final static QName _ArtworkInfo_QNAME = new QName("http://mythtv.org", "ArtworkInfo");
    private final static QName _ArrayOfProgram_QNAME = new QName("http://mythtv.org", "ArrayOfProgram");
    private final static QName _ArrayOfCastMember_QNAME = new QName("http://mythtv.org", "ArrayOfCastMember");
    private final static QName _ArtworkInfoList_QNAME = new QName("http://mythtv.org", "ArtworkInfoList");
    private final static QName _ArrayOfString_QNAME = new QName("http://mythtv.org", "ArrayOfString");
    private final static QName _CastMember_QNAME = new QName("http://mythtv.org", "CastMember");
    private final static QName _ChannelGroup_QNAME = new QName("http://mythtv.org", "ChannelGroup");
    private final static QName _RecStatusType_QNAME = new QName("http://mythtv.org", "RecStatus.Type");
    private final static QName _ArrayOfArtworkInfo_QNAME = new QName("http://mythtv.org", "ArrayOfArtworkInfo");
    private final static QName _GetStoredSearchesResponseGetStoredSearchesResult_QNAME = new QName("http://mythtv.org", "GetStoredSearchesResult");
    private final static QName _ProgramListAsOf_QNAME = new QName("http://mythtv.org", "AsOf");
    private final static QName _GetChannelGroupListResponseGetChannelGroupListResult_QNAME = new QName("http://mythtv.org", "GetChannelGroupListResult");
    private final static QName _GetProgramGuideResponseGetProgramGuideResult_QNAME = new QName("http://mythtv.org", "GetProgramGuideResult");
    private final static QName _GetCategoryListResponseGetCategoryListResult_QNAME = new QName("http://mythtv.org", "GetCategoryListResult");
    private final static QName _GetStoredSearchesType_QNAME = new QName("http://mythtv.org", "Type");
    private final static QName _RecordingInfoEndTs_QNAME = new QName("http://mythtv.org", "EndTs");
    private final static QName _RecordingInfoLastModified_QNAME = new QName("http://mythtv.org", "LastModified");
    private final static QName _RecordingInfoStartTs_QNAME = new QName("http://mythtv.org", "StartTs");
    private final static QName _GetProgramDetailsResponseGetProgramDetailsResult_QNAME = new QName("http://mythtv.org", "GetProgramDetailsResult");
    private final static QName _GetChannelGroupListIncludeEmpty_QNAME = new QName("http://mythtv.org", "IncludeEmpty");
    private final static QName _GetProgramDetailsChanId_QNAME = new QName("http://mythtv.org", "ChanId");
    private final static QName _GetProgramDetailsStartTime_QNAME = new QName("http://mythtv.org", "StartTime");
    private final static QName _GetProgramListResponseGetProgramListResult_QNAME = new QName("http://mythtv.org", "GetProgramListResult");
    private final static QName _GetProgramListStartIndex_QNAME = new QName("http://mythtv.org", "StartIndex");
    private final static QName _GetProgramListEndTime_QNAME = new QName("http://mythtv.org", "EndTime");
    private final static QName _GetProgramListKeywordFilter_QNAME = new QName("http://mythtv.org", "KeywordFilter");
    private final static QName _GetProgramListPersonFilter_QNAME = new QName("http://mythtv.org", "PersonFilter");
    private final static QName _GetProgramListCount_QNAME = new QName("http://mythtv.org", "Count");
    private final static QName _GetProgramListDescending_QNAME = new QName("http://mythtv.org", "Descending");
    private final static QName _GetProgramListDetails_QNAME = new QName("http://mythtv.org", "Details");
    private final static QName _GetProgramListTitleFilter_QNAME = new QName("http://mythtv.org", "TitleFilter");
    private final static QName _GetProgramListCategoryFilter_QNAME = new QName("http://mythtv.org", "CategoryFilter");
    private final static QName _GetProgramListOnlyNew_QNAME = new QName("http://mythtv.org", "OnlyNew");
    private final static QName _GetProgramListSort_QNAME = new QName("http://mythtv.org", "Sort");
    private final static QName _GetChannelIconWidth_QNAME = new QName("http://mythtv.org", "Width");
    private final static QName _GetChannelIconHeight_QNAME = new QName("http://mythtv.org", "Height");
    private final static QName _GetChannelIconResponseGetChannelIconResult_QNAME = new QName("http://mythtv.org", "GetChannelIconResult");
    private final static QName _GetProgramGuideChannelGroupId_QNAME = new QName("http://mythtv.org", "ChannelGroupId");
    private final static QName _ProgramChannel_QNAME = new QName("http://mythtv.org", "Channel");
    private final static QName _ProgramCast_QNAME = new QName("http://mythtv.org", "Cast");
    private final static QName _ProgramArtwork_QNAME = new QName("http://mythtv.org", "Artwork");
    private final static QName _ProgramAirdate_QNAME = new QName("http://mythtv.org", "Airdate");
    private final static QName _ProgramRecording_QNAME = new QName("http://mythtv.org", "Recording");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mythtvapi.guide
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramList }
     * 
     */
    public ProgramList createProgramList() {
        return new ProgramList();
    }

    /**
     * Create an instance of {@link GetChannelIconResponse }
     * 
     */
    public GetChannelIconResponse createGetChannelIconResponse() {
        return new GetChannelIconResponse();
    }

    /**
     * Create an instance of {@link GetProgramDetailsResponse }
     * 
     */
    public GetProgramDetailsResponse createGetProgramDetailsResponse() {
        return new GetProgramDetailsResponse();
    }

    /**
     * Create an instance of {@link Program }
     * 
     */
    public Program createProgram() {
        return new Program();
    }

    /**
     * Create an instance of {@link ChannelInfo }
     * 
     */
    public ChannelInfo createChannelInfo() {
        return new ChannelInfo();
    }

    /**
     * Create an instance of {@link GetCategoryListResponse }
     * 
     */
    public GetCategoryListResponse createGetCategoryListResponse() {
        return new GetCategoryListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfChannelInfo }
     * 
     */
    public ArrayOfChannelInfo createArrayOfChannelInfo() {
        return new ArrayOfChannelInfo();
    }

    /**
     * Create an instance of {@link CastMember }
     * 
     */
    public CastMember createCastMember() {
        return new CastMember();
    }

    /**
     * Create an instance of {@link GetChannelGroupList }
     * 
     */
    public GetChannelGroupList createGetChannelGroupList() {
        return new GetChannelGroupList();
    }

    /**
     * Create an instance of {@link ArrayOfArtworkInfo }
     * 
     */
    public ArrayOfArtworkInfo createArrayOfArtworkInfo() {
        return new ArrayOfArtworkInfo();
    }

    /**
     * Create an instance of {@link ChannelGroupList }
     * 
     */
    public ChannelGroupList createChannelGroupList() {
        return new ChannelGroupList();
    }

    /**
     * Create an instance of {@link ProgramGuide }
     * 
     */
    public ProgramGuide createProgramGuide() {
        return new ProgramGuide();
    }

    /**
     * Create an instance of {@link RecordingInfo }
     * 
     */
    public RecordingInfo createRecordingInfo() {
        return new RecordingInfo();
    }

    /**
     * Create an instance of {@link GetChannelIcon }
     * 
     */
    public GetChannelIcon createGetChannelIcon() {
        return new GetChannelIcon();
    }

    /**
     * Create an instance of {@link CastMemberList }
     * 
     */
    public CastMemberList createCastMemberList() {
        return new CastMemberList();
    }

    /**
     * Create an instance of {@link ArrayOfChannelGroup }
     * 
     */
    public ArrayOfChannelGroup createArrayOfChannelGroup() {
        return new ArrayOfChannelGroup();
    }

    /**
     * Create an instance of {@link GetStoredSearches }
     * 
     */
    public GetStoredSearches createGetStoredSearches() {
        return new GetStoredSearches();
    }

    /**
     * Create an instance of {@link GetStoredSearchesResponse }
     * 
     */
    public GetStoredSearchesResponse createGetStoredSearchesResponse() {
        return new GetStoredSearchesResponse();
    }

    /**
     * Create an instance of {@link GetChannelGroupListResponse }
     * 
     */
    public GetChannelGroupListResponse createGetChannelGroupListResponse() {
        return new GetChannelGroupListResponse();
    }

    /**
     * Create an instance of {@link GetProgramDetails }
     * 
     */
    public GetProgramDetails createGetProgramDetails() {
        return new GetProgramDetails();
    }

    /**
     * Create an instance of {@link GetProgramGuideResponse }
     * 
     */
    public GetProgramGuideResponse createGetProgramGuideResponse() {
        return new GetProgramGuideResponse();
    }

    /**
     * Create an instance of {@link ArtworkInfo }
     * 
     */
    public ArtworkInfo createArtworkInfo() {
        return new ArtworkInfo();
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
     * Create an instance of {@link ArtworkInfoList }
     * 
     */
    public ArtworkInfoList createArtworkInfoList() {
        return new ArtworkInfoList();
    }

    /**
     * Create an instance of {@link GetProgramGuide }
     * 
     */
    public GetProgramGuide createGetProgramGuide() {
        return new GetProgramGuide();
    }

    /**
     * Create an instance of {@link GetProgramList }
     * 
     */
    public GetProgramList createGetProgramList() {
        return new GetProgramList();
    }

    /**
     * Create an instance of {@link GetCategoryList }
     * 
     */
    public GetCategoryList createGetCategoryList() {
        return new GetCategoryList();
    }

    /**
     * Create an instance of {@link GetProgramListResponse }
     * 
     */
    public GetProgramListResponse createGetProgramListResponse() {
        return new GetProgramListResponse();
    }

    /**
     * Create an instance of {@link ChannelGroup }
     * 
     */
    public ChannelGroup createChannelGroup() {
        return new ChannelGroup();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramGuide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProgramGuide")
    public JAXBElement<ProgramGuide> createProgramGuide(ProgramGuide value) {
        return new JAXBElement<ProgramGuide>(_ProgramGuide_QNAME, ProgramGuide.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProgramList")
    public JAXBElement<ProgramList> createProgramList(ProgramList value) {
        return new JAXBElement<ProgramList>(_ProgramList_QNAME, ProgramList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelGroupList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelGroupList")
    public JAXBElement<ChannelGroupList> createChannelGroupList(ChannelGroupList value) {
        return new JAXBElement<ChannelGroupList>(_ChannelGroupList_QNAME, ChannelGroupList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChannelGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfChannelGroup")
    public JAXBElement<ArrayOfChannelGroup> createArrayOfChannelGroup(ArrayOfChannelGroup value) {
        return new JAXBElement<ArrayOfChannelGroup>(_ArrayOfChannelGroup_QNAME, ArrayOfChannelGroup.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelGroup")
    public JAXBElement<ChannelGroup> createChannelGroup(ChannelGroup value) {
        return new JAXBElement<ChannelGroup>(_ChannelGroup_QNAME, ChannelGroup.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArtworkInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfArtworkInfo")
    public JAXBElement<ArrayOfArtworkInfo> createArrayOfArtworkInfo(ArrayOfArtworkInfo value) {
        return new JAXBElement<ArrayOfArtworkInfo>(_ArrayOfArtworkInfo_QNAME, ArrayOfArtworkInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetStoredSearchesResult", scope = GetStoredSearchesResponse.class)
    public JAXBElement<ArrayOfString> createGetStoredSearchesResponseGetStoredSearchesResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetStoredSearchesResponseGetStoredSearchesResult_QNAME, ArrayOfString.class, GetStoredSearchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = ProgramList.class)
    public JAXBElement<XMLGregorianCalendar> createProgramListAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramListAsOf_QNAME, XMLGregorianCalendar.class, ProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelGroupList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetChannelGroupListResult", scope = GetChannelGroupListResponse.class)
    public JAXBElement<ChannelGroupList> createGetChannelGroupListResponseGetChannelGroupListResult(ChannelGroupList value) {
        return new JAXBElement<ChannelGroupList>(_GetChannelGroupListResponseGetChannelGroupListResult_QNAME, ChannelGroupList.class, GetChannelGroupListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramGuide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetProgramGuideResult", scope = GetProgramGuideResponse.class)
    public JAXBElement<ProgramGuide> createGetProgramGuideResponseGetProgramGuideResult(ProgramGuide value) {
        return new JAXBElement<ProgramGuide>(_GetProgramGuideResponseGetProgramGuideResult_QNAME, ProgramGuide.class, GetProgramGuideResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetCategoryListResult", scope = GetCategoryListResponse.class)
    public JAXBElement<ArrayOfString> createGetCategoryListResponseGetCategoryListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetCategoryListResponseGetCategoryListResult_QNAME, ArrayOfString.class, GetCategoryListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Type", scope = GetStoredSearches.class)
    public JAXBElement<String> createGetStoredSearchesType(String value) {
        return new JAXBElement<String>(_GetStoredSearchesType_QNAME, String.class, GetStoredSearches.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_RecordingInfoLastModified_QNAME, XMLGregorianCalendar.class, RecordingInfo.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Program }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetProgramDetailsResult", scope = GetProgramDetailsResponse.class)
    public JAXBElement<Program> createGetProgramDetailsResponseGetProgramDetailsResult(Program value) {
        return new JAXBElement<Program>(_GetProgramDetailsResponseGetProgramDetailsResult_QNAME, Program.class, GetProgramDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "IncludeEmpty", scope = GetChannelGroupList.class)
    public JAXBElement<Boolean> createGetChannelGroupListIncludeEmpty(Boolean value) {
        return new JAXBElement<Boolean>(_GetChannelGroupListIncludeEmpty_QNAME, Boolean.class, GetChannelGroupList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetProgramDetails.class)
    public JAXBElement<Integer> createGetProgramDetailsChanId(Integer value) {
        return new JAXBElement<Integer>(_GetProgramDetailsChanId_QNAME, Integer.class, GetProgramDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetProgramDetails.class)
    public JAXBElement<XMLGregorianCalendar> createGetProgramDetailsStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramDetailsStartTime_QNAME, XMLGregorianCalendar.class, GetProgramDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetProgramListResult", scope = GetProgramListResponse.class)
    public JAXBElement<ProgramList> createGetProgramListResponseGetProgramListResult(ProgramList value) {
        return new JAXBElement<ProgramList>(_GetProgramListResponseGetProgramListResult_QNAME, ProgramList.class, GetProgramListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetProgramList.class)
    public JAXBElement<Integer> createGetProgramListStartIndex(Integer value) {
        return new JAXBElement<Integer>(_GetProgramListStartIndex_QNAME, Integer.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTime", scope = GetProgramList.class)
    public JAXBElement<XMLGregorianCalendar> createGetProgramListEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramListEndTime_QNAME, XMLGregorianCalendar.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "KeywordFilter", scope = GetProgramList.class)
    public JAXBElement<String> createGetProgramListKeywordFilter(String value) {
        return new JAXBElement<String>(_GetProgramListKeywordFilter_QNAME, String.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PersonFilter", scope = GetProgramList.class)
    public JAXBElement<String> createGetProgramListPersonFilter(String value) {
        return new JAXBElement<String>(_GetProgramListPersonFilter_QNAME, String.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetProgramList.class)
    public JAXBElement<XMLGregorianCalendar> createGetProgramListStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramDetailsStartTime_QNAME, XMLGregorianCalendar.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetProgramList.class)
    public JAXBElement<Integer> createGetProgramListCount(Integer value) {
        return new JAXBElement<Integer>(_GetProgramListCount_QNAME, Integer.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetProgramList.class)
    public JAXBElement<Integer> createGetProgramListChanId(Integer value) {
        return new JAXBElement<Integer>(_GetProgramDetailsChanId_QNAME, Integer.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Descending", scope = GetProgramList.class)
    public JAXBElement<Boolean> createGetProgramListDescending(Boolean value) {
        return new JAXBElement<Boolean>(_GetProgramListDescending_QNAME, Boolean.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Details", scope = GetProgramList.class)
    public JAXBElement<Boolean> createGetProgramListDetails(Boolean value) {
        return new JAXBElement<Boolean>(_GetProgramListDetails_QNAME, Boolean.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "TitleFilter", scope = GetProgramList.class)
    public JAXBElement<String> createGetProgramListTitleFilter(String value) {
        return new JAXBElement<String>(_GetProgramListTitleFilter_QNAME, String.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CategoryFilter", scope = GetProgramList.class)
    public JAXBElement<String> createGetProgramListCategoryFilter(String value) {
        return new JAXBElement<String>(_GetProgramListCategoryFilter_QNAME, String.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "OnlyNew", scope = GetProgramList.class)
    public JAXBElement<Boolean> createGetProgramListOnlyNew(Boolean value) {
        return new JAXBElement<Boolean>(_GetProgramListOnlyNew_QNAME, Boolean.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Sort", scope = GetProgramList.class)
    public JAXBElement<String> createGetProgramListSort(String value) {
        return new JAXBElement<String>(_GetProgramListSort_QNAME, String.class, GetProgramList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = GetChannelIcon.class)
    public JAXBElement<Integer> createGetChannelIconChanId(Integer value) {
        return new JAXBElement<Integer>(_GetProgramDetailsChanId_QNAME, Integer.class, GetChannelIcon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = GetChannelIcon.class)
    public JAXBElement<Integer> createGetChannelIconWidth(Integer value) {
        return new JAXBElement<Integer>(_GetChannelIconWidth_QNAME, Integer.class, GetChannelIcon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = GetChannelIcon.class)
    public JAXBElement<Integer> createGetChannelIconHeight(Integer value) {
        return new JAXBElement<Integer>(_GetChannelIconHeight_QNAME, Integer.class, GetChannelIcon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetChannelIconResult", scope = GetChannelIconResponse.class)
    public JAXBElement<String> createGetChannelIconResponseGetChannelIconResult(String value) {
        return new JAXBElement<String>(_GetChannelIconResponseGetChannelIconResult_QNAME, String.class, GetChannelIconResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTime", scope = GetProgramGuide.class)
    public JAXBElement<XMLGregorianCalendar> createGetProgramGuideEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramListEndTime_QNAME, XMLGregorianCalendar.class, GetProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartIndex", scope = GetProgramGuide.class)
    public JAXBElement<Integer> createGetProgramGuideStartIndex(Integer value) {
        return new JAXBElement<Integer>(_GetProgramListStartIndex_QNAME, Integer.class, GetProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Details", scope = GetProgramGuide.class)
    public JAXBElement<Boolean> createGetProgramGuideDetails(Boolean value) {
        return new JAXBElement<Boolean>(_GetProgramListDetails_QNAME, Boolean.class, GetProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = GetProgramGuide.class)
    public JAXBElement<XMLGregorianCalendar> createGetProgramGuideStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramDetailsStartTime_QNAME, XMLGregorianCalendar.class, GetProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelGroupId", scope = GetProgramGuide.class)
    public JAXBElement<Integer> createGetProgramGuideChannelGroupId(Integer value) {
        return new JAXBElement<Integer>(_GetProgramGuideChannelGroupId_QNAME, Integer.class, GetProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Count", scope = GetProgramGuide.class)
    public JAXBElement<Integer> createGetProgramGuideCount(Integer value) {
        return new JAXBElement<Integer>(_GetProgramListCount_QNAME, Integer.class, GetProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTime", scope = ProgramGuide.class)
    public JAXBElement<XMLGregorianCalendar> createProgramGuideEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramListEndTime_QNAME, XMLGregorianCalendar.class, ProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AsOf", scope = ProgramGuide.class)
    public JAXBElement<XMLGregorianCalendar> createProgramGuideAsOf(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProgramListAsOf_QNAME, XMLGregorianCalendar.class, ProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = ProgramGuide.class)
    public JAXBElement<XMLGregorianCalendar> createProgramGuideStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramDetailsStartTime_QNAME, XMLGregorianCalendar.class, ProgramGuide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "EndTime", scope = Program.class)
    public JAXBElement<XMLGregorianCalendar> createProgramEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramListEndTime_QNAME, XMLGregorianCalendar.class, Program.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_RecordingInfoLastModified_QNAME, XMLGregorianCalendar.class, Program.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_GetProgramDetailsStartTime_QNAME, XMLGregorianCalendar.class, Program.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Recording", scope = Program.class)
    public JAXBElement<RecordingInfo> createProgramRecording(RecordingInfo value) {
        return new JAXBElement<RecordingInfo>(_ProgramRecording_QNAME, RecordingInfo.class, Program.class, value);
    }

}
