
package mythtvapi.capture;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mythtvapi.capture package. 
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

    private final static QName _ArrayOfCaptureCard_QNAME = new QName("http://mythtv.org", "ArrayOfCaptureCard");
    private final static QName _CaptureCard_QNAME = new QName("http://mythtv.org", "CaptureCard");
    private final static QName _CaptureCardList_QNAME = new QName("http://mythtv.org", "CaptureCardList");
    private final static QName _RemoveCaptureCardResponseRemoveCaptureCardResult_QNAME = new QName("http://mythtv.org", "RemoveCaptureCardResult");
    private final static QName _GetCaptureCardListResponseGetCaptureCardListResult_QNAME = new QName("http://mythtv.org", "GetCaptureCardListResult");
    private final static QName _AddCardInputResponseAddCardInputResult_QNAME = new QName("http://mythtv.org", "AddCardInputResult");
    private final static QName _RemoveCaptureCardCardId_QNAME = new QName("http://mythtv.org", "CardId");
    private final static QName _UpdateCaptureCardSetting_QNAME = new QName("http://mythtv.org", "Setting");
    private final static QName _UpdateCaptureCardValue_QNAME = new QName("http://mythtv.org", "Value");
    private final static QName _RemoveCardInputResponseRemoveCardInputResult_QNAME = new QName("http://mythtv.org", "RemoveCardInputResult");
    private final static QName _AddCardInputSourceId_QNAME = new QName("http://mythtv.org", "SourceId");
    private final static QName _AddCardInputRecPriority_QNAME = new QName("http://mythtv.org", "RecPriority");
    private final static QName _AddCardInputExternalCommand_QNAME = new QName("http://mythtv.org", "ExternalCommand");
    private final static QName _AddCardInputLiveTVOrder_QNAME = new QName("http://mythtv.org", "LiveTVOrder");
    private final static QName _AddCardInputQuicktune_QNAME = new QName("http://mythtv.org", "Quicktune");
    private final static QName _AddCardInputChangerModel_QNAME = new QName("http://mythtv.org", "ChangerModel");
    private final static QName _AddCardInputTuneChan_QNAME = new QName("http://mythtv.org", "TuneChan");
    private final static QName _AddCardInputStartChan_QNAME = new QName("http://mythtv.org", "StartChan");
    private final static QName _AddCardInputDishnetEIT_QNAME = new QName("http://mythtv.org", "DishnetEIT");
    private final static QName _AddCardInputHostName_QNAME = new QName("http://mythtv.org", "HostName");
    private final static QName _AddCardInputSchedOrder_QNAME = new QName("http://mythtv.org", "SchedOrder");
    private final static QName _AddCardInputInputName_QNAME = new QName("http://mythtv.org", "InputName");
    private final static QName _AddCardInputDisplayName_QNAME = new QName("http://mythtv.org", "DisplayName");
    private final static QName _AddCardInputChangerDevice_QNAME = new QName("http://mythtv.org", "ChangerDevice");
    private final static QName _RemoveCardInputCardInputId_QNAME = new QName("http://mythtv.org", "CardInputId");
    private final static QName _AddCaptureCardBrightness_QNAME = new QName("http://mythtv.org", "Brightness");
    private final static QName _AddCaptureCardDiSEqCId_QNAME = new QName("http://mythtv.org", "DiSEqCId");
    private final static QName _AddCaptureCardSignalTimeout_QNAME = new QName("http://mythtv.org", "SignalTimeout");
    private final static QName _AddCaptureCardFirewireConnection_QNAME = new QName("http://mythtv.org", "FirewireConnection");
    private final static QName _AddCaptureCardAudioRateLimit_QNAME = new QName("http://mythtv.org", "AudioRateLimit");
    private final static QName _AddCaptureCardContrast_QNAME = new QName("http://mythtv.org", "Contrast");
    private final static QName _AddCaptureCardChannelTimeout_QNAME = new QName("http://mythtv.org", "ChannelTimeout");
    private final static QName _AddCaptureCardDVBEITScan_QNAME = new QName("http://mythtv.org", "DVBEITScan");
    private final static QName _AddCaptureCardSkipBTAudio_QNAME = new QName("http://mythtv.org", "SkipBTAudio");
    private final static QName _AddCaptureCardColour_QNAME = new QName("http://mythtv.org", "Colour");
    private final static QName _AddCaptureCardDVBWaitForSeqStart_QNAME = new QName("http://mythtv.org", "DVBWaitForSeqStart");
    private final static QName _AddCaptureCardDVBTuningDelay_QNAME = new QName("http://mythtv.org", "DVBTuningDelay");
    private final static QName _AddCaptureCardCardType_QNAME = new QName("http://mythtv.org", "CardType");
    private final static QName _AddCaptureCardAudioDevice_QNAME = new QName("http://mythtv.org", "AudioDevice");
    private final static QName _AddCaptureCardDVBSWFilter_QNAME = new QName("http://mythtv.org", "DVBSWFilter");
    private final static QName _AddCaptureCardVBIDevice_QNAME = new QName("http://mythtv.org", "VBIDevice");
    private final static QName _AddCaptureCardDVBSatType_QNAME = new QName("http://mythtv.org", "DVBSatType");
    private final static QName _AddCaptureCardDVBDiSEqCType_QNAME = new QName("http://mythtv.org", "DVBDiSEqCType");
    private final static QName _AddCaptureCardFirewireModel_QNAME = new QName("http://mythtv.org", "FirewireModel");
    private final static QName _AddCaptureCardDVBOnDemand_QNAME = new QName("http://mythtv.org", "DVBOnDemand");
    private final static QName _AddCaptureCardFirewireSpeed_QNAME = new QName("http://mythtv.org", "FirewireSpeed");
    private final static QName _AddCaptureCardVideoDevice_QNAME = new QName("http://mythtv.org", "VideoDevice");
    private final static QName _AddCaptureCardHue_QNAME = new QName("http://mythtv.org", "Hue");
    private final static QName _AddCaptureCardResponseAddCaptureCardResult_QNAME = new QName("http://mythtv.org", "AddCaptureCardResult");
    private final static QName _GetCaptureCardResponseGetCaptureCardResult_QNAME = new QName("http://mythtv.org", "GetCaptureCardResult");
    private final static QName _UpdateCardInputResponseUpdateCardInputResult_QNAME = new QName("http://mythtv.org", "UpdateCardInputResult");
    private final static QName _UpdateCaptureCardResponseUpdateCaptureCardResult_QNAME = new QName("http://mythtv.org", "UpdateCaptureCardResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mythtvapi.capture
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCardInputResponse }
     * 
     */
    public AddCardInputResponse createAddCardInputResponse() {
        return new AddCardInputResponse();
    }

    /**
     * Create an instance of {@link RemoveCaptureCardResponse }
     * 
     */
    public RemoveCaptureCardResponse createRemoveCaptureCardResponse() {
        return new RemoveCaptureCardResponse();
    }

    /**
     * Create an instance of {@link AddCardInput }
     * 
     */
    public AddCardInput createAddCardInput() {
        return new AddCardInput();
    }

    /**
     * Create an instance of {@link UpdateCardInput }
     * 
     */
    public UpdateCardInput createUpdateCardInput() {
        return new UpdateCardInput();
    }

    /**
     * Create an instance of {@link UpdateCaptureCard }
     * 
     */
    public UpdateCaptureCard createUpdateCaptureCard() {
        return new UpdateCaptureCard();
    }

    /**
     * Create an instance of {@link GetCaptureCard }
     * 
     */
    public GetCaptureCard createGetCaptureCard() {
        return new GetCaptureCard();
    }

    /**
     * Create an instance of {@link ArrayOfCaptureCard }
     * 
     */
    public ArrayOfCaptureCard createArrayOfCaptureCard() {
        return new ArrayOfCaptureCard();
    }

    /**
     * Create an instance of {@link RemoveCaptureCard }
     * 
     */
    public RemoveCaptureCard createRemoveCaptureCard() {
        return new RemoveCaptureCard();
    }

    /**
     * Create an instance of {@link RemoveCardInput }
     * 
     */
    public RemoveCardInput createRemoveCardInput() {
        return new RemoveCardInput();
    }

    /**
     * Create an instance of {@link CaptureCard }
     * 
     */
    public CaptureCard createCaptureCard() {
        return new CaptureCard();
    }

    /**
     * Create an instance of {@link CaptureCardList }
     * 
     */
    public CaptureCardList createCaptureCardList() {
        return new CaptureCardList();
    }

    /**
     * Create an instance of {@link AddCaptureCard }
     * 
     */
    public AddCaptureCard createAddCaptureCard() {
        return new AddCaptureCard();
    }

    /**
     * Create an instance of {@link AddCaptureCardResponse }
     * 
     */
    public AddCaptureCardResponse createAddCaptureCardResponse() {
        return new AddCaptureCardResponse();
    }

    /**
     * Create an instance of {@link GetCaptureCardResponse }
     * 
     */
    public GetCaptureCardResponse createGetCaptureCardResponse() {
        return new GetCaptureCardResponse();
    }

    /**
     * Create an instance of {@link GetCaptureCardList }
     * 
     */
    public GetCaptureCardList createGetCaptureCardList() {
        return new GetCaptureCardList();
    }

    /**
     * Create an instance of {@link GetCaptureCardListResponse }
     * 
     */
    public GetCaptureCardListResponse createGetCaptureCardListResponse() {
        return new GetCaptureCardListResponse();
    }

    /**
     * Create an instance of {@link UpdateCaptureCardResponse }
     * 
     */
    public UpdateCaptureCardResponse createUpdateCaptureCardResponse() {
        return new UpdateCaptureCardResponse();
    }

    /**
     * Create an instance of {@link UpdateCardInputResponse }
     * 
     */
    public UpdateCardInputResponse createUpdateCardInputResponse() {
        return new UpdateCardInputResponse();
    }

    /**
     * Create an instance of {@link RemoveCardInputResponse }
     * 
     */
    public RemoveCardInputResponse createRemoveCardInputResponse() {
        return new RemoveCardInputResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCaptureCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfCaptureCard")
    public JAXBElement<ArrayOfCaptureCard> createArrayOfCaptureCard(ArrayOfCaptureCard value) {
        return new JAXBElement<ArrayOfCaptureCard>(_ArrayOfCaptureCard_QNAME, ArrayOfCaptureCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaptureCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CaptureCard")
    public JAXBElement<CaptureCard> createCaptureCard(CaptureCard value) {
        return new JAXBElement<CaptureCard>(_CaptureCard_QNAME, CaptureCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaptureCardList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CaptureCardList")
    public JAXBElement<CaptureCardList> createCaptureCardList(CaptureCardList value) {
        return new JAXBElement<CaptureCardList>(_CaptureCardList_QNAME, CaptureCardList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveCaptureCardResult", scope = RemoveCaptureCardResponse.class)
    public JAXBElement<Boolean> createRemoveCaptureCardResponseRemoveCaptureCardResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveCaptureCardResponseRemoveCaptureCardResult_QNAME, Boolean.class, RemoveCaptureCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaptureCardList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetCaptureCardListResult", scope = GetCaptureCardListResponse.class)
    public JAXBElement<CaptureCardList> createGetCaptureCardListResponseGetCaptureCardListResult(CaptureCardList value) {
        return new JAXBElement<CaptureCardList>(_GetCaptureCardListResponseGetCaptureCardListResult_QNAME, CaptureCardList.class, GetCaptureCardListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddCardInputResult", scope = AddCardInputResponse.class)
    public JAXBElement<Integer> createAddCardInputResponseAddCardInputResult(Integer value) {
        return new JAXBElement<Integer>(_AddCardInputResponseAddCardInputResult_QNAME, Integer.class, AddCardInputResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardId", scope = RemoveCaptureCard.class)
    public JAXBElement<Integer> createRemoveCaptureCardCardId(Integer value) {
        return new JAXBElement<Integer>(_RemoveCaptureCardCardId_QNAME, Integer.class, RemoveCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Setting", scope = UpdateCaptureCard.class)
    public JAXBElement<String> createUpdateCaptureCardSetting(String value) {
        return new JAXBElement<String>(_UpdateCaptureCardSetting_QNAME, String.class, UpdateCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Value", scope = UpdateCaptureCard.class)
    public JAXBElement<String> createUpdateCaptureCardValue(String value) {
        return new JAXBElement<String>(_UpdateCaptureCardValue_QNAME, String.class, UpdateCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardId", scope = UpdateCaptureCard.class)
    public JAXBElement<Integer> createUpdateCaptureCardCardId(Integer value) {
        return new JAXBElement<Integer>(_RemoveCaptureCardCardId_QNAME, Integer.class, UpdateCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RemoveCardInputResult", scope = RemoveCardInputResponse.class)
    public JAXBElement<Boolean> createRemoveCardInputResponseRemoveCardInputResult(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveCardInputResponseRemoveCardInputResult_QNAME, Boolean.class, RemoveCardInputResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SourceId", scope = AddCardInput.class)
    public JAXBElement<Long> createAddCardInputSourceId(Long value) {
        return new JAXBElement<Long>(_AddCardInputSourceId_QNAME, Long.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecPriority", scope = AddCardInput.class)
    public JAXBElement<Long> createAddCardInputRecPriority(Long value) {
        return new JAXBElement<Long>(_AddCardInputRecPriority_QNAME, Long.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ExternalCommand", scope = AddCardInput.class)
    public JAXBElement<String> createAddCardInputExternalCommand(String value) {
        return new JAXBElement<String>(_AddCardInputExternalCommand_QNAME, String.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "LiveTVOrder", scope = AddCardInput.class)
    public JAXBElement<Long> createAddCardInputLiveTVOrder(Long value) {
        return new JAXBElement<Long>(_AddCardInputLiveTVOrder_QNAME, Long.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Quicktune", scope = AddCardInput.class)
    public JAXBElement<Long> createAddCardInputQuicktune(Long value) {
        return new JAXBElement<Long>(_AddCardInputQuicktune_QNAME, Long.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChangerModel", scope = AddCardInput.class)
    public JAXBElement<String> createAddCardInputChangerModel(String value) {
        return new JAXBElement<String>(_AddCardInputChangerModel_QNAME, String.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "TuneChan", scope = AddCardInput.class)
    public JAXBElement<String> createAddCardInputTuneChan(String value) {
        return new JAXBElement<String>(_AddCardInputTuneChan_QNAME, String.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardId", scope = AddCardInput.class)
    public JAXBElement<Long> createAddCardInputCardId(Long value) {
        return new JAXBElement<Long>(_RemoveCaptureCardCardId_QNAME, Long.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartChan", scope = AddCardInput.class)
    public JAXBElement<String> createAddCardInputStartChan(String value) {
        return new JAXBElement<String>(_AddCardInputStartChan_QNAME, String.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DishnetEIT", scope = AddCardInput.class)
    public JAXBElement<Boolean> createAddCardInputDishnetEIT(Boolean value) {
        return new JAXBElement<Boolean>(_AddCardInputDishnetEIT_QNAME, Boolean.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = AddCardInput.class)
    public JAXBElement<String> createAddCardInputHostName(String value) {
        return new JAXBElement<String>(_AddCardInputHostName_QNAME, String.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SchedOrder", scope = AddCardInput.class)
    public JAXBElement<Long> createAddCardInputSchedOrder(Long value) {
        return new JAXBElement<Long>(_AddCardInputSchedOrder_QNAME, Long.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "InputName", scope = AddCardInput.class)
    public JAXBElement<String> createAddCardInputInputName(String value) {
        return new JAXBElement<String>(_AddCardInputInputName_QNAME, String.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DisplayName", scope = AddCardInput.class)
    public JAXBElement<String> createAddCardInputDisplayName(String value) {
        return new JAXBElement<String>(_AddCardInputDisplayName_QNAME, String.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChangerDevice", scope = AddCardInput.class)
    public JAXBElement<String> createAddCardInputChangerDevice(String value) {
        return new JAXBElement<String>(_AddCardInputChangerDevice_QNAME, String.class, AddCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardId", scope = GetCaptureCard.class)
    public JAXBElement<Integer> createGetCaptureCardCardId(Integer value) {
        return new JAXBElement<Integer>(_RemoveCaptureCardCardId_QNAME, Integer.class, GetCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardInputId", scope = RemoveCardInput.class)
    public JAXBElement<Integer> createRemoveCardInputCardInputId(Integer value) {
        return new JAXBElement<Integer>(_RemoveCardInputCardInputId_QNAME, Integer.class, RemoveCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Brightness", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardBrightness(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardBrightness_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DiSEqCId", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardDiSEqCId(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardDiSEqCId_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SignalTimeout", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardSignalTimeout(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardSignalTimeout_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FirewireConnection", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardFirewireConnection(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardFirewireConnection_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AudioRateLimit", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardAudioRateLimit(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardAudioRateLimit_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Contrast", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardContrast(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardContrast_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChannelTimeout", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardChannelTimeout(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardChannelTimeout_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DVBEITScan", scope = AddCaptureCard.class)
    public JAXBElement<Boolean> createAddCaptureCardDVBEITScan(Boolean value) {
        return new JAXBElement<Boolean>(_AddCaptureCardDVBEITScan_QNAME, Boolean.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SkipBTAudio", scope = AddCaptureCard.class)
    public JAXBElement<Boolean> createAddCaptureCardSkipBTAudio(Boolean value) {
        return new JAXBElement<Boolean>(_AddCaptureCardSkipBTAudio_QNAME, Boolean.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Colour", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardColour(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardColour_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DVBWaitForSeqStart", scope = AddCaptureCard.class)
    public JAXBElement<Boolean> createAddCaptureCardDVBWaitForSeqStart(Boolean value) {
        return new JAXBElement<Boolean>(_AddCaptureCardDVBWaitForSeqStart_QNAME, Boolean.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DVBTuningDelay", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardDVBTuningDelay(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardDVBTuningDelay_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardType", scope = AddCaptureCard.class)
    public JAXBElement<String> createAddCaptureCardCardType(String value) {
        return new JAXBElement<String>(_AddCaptureCardCardType_QNAME, String.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AudioDevice", scope = AddCaptureCard.class)
    public JAXBElement<String> createAddCaptureCardAudioDevice(String value) {
        return new JAXBElement<String>(_AddCaptureCardAudioDevice_QNAME, String.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DVBSWFilter", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardDVBSWFilter(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardDVBSWFilter_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VBIDevice", scope = AddCaptureCard.class)
    public JAXBElement<String> createAddCaptureCardVBIDevice(String value) {
        return new JAXBElement<String>(_AddCaptureCardVBIDevice_QNAME, String.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DVBSatType", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardDVBSatType(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardDVBSatType_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DVBDiSEqCType", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardDVBDiSEqCType(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardDVBDiSEqCType_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FirewireModel", scope = AddCaptureCard.class)
    public JAXBElement<String> createAddCaptureCardFirewireModel(String value) {
        return new JAXBElement<String>(_AddCaptureCardFirewireModel_QNAME, String.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "DVBOnDemand", scope = AddCaptureCard.class)
    public JAXBElement<Boolean> createAddCaptureCardDVBOnDemand(Boolean value) {
        return new JAXBElement<Boolean>(_AddCaptureCardDVBOnDemand_QNAME, Boolean.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = AddCaptureCard.class)
    public JAXBElement<String> createAddCaptureCardHostName(String value) {
        return new JAXBElement<String>(_AddCardInputHostName_QNAME, String.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FirewireSpeed", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardFirewireSpeed(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardFirewireSpeed_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "VideoDevice", scope = AddCaptureCard.class)
    public JAXBElement<String> createAddCaptureCardVideoDevice(String value) {
        return new JAXBElement<String>(_AddCaptureCardVideoDevice_QNAME, String.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Hue", scope = AddCaptureCard.class)
    public JAXBElement<Long> createAddCaptureCardHue(Long value) {
        return new JAXBElement<Long>(_AddCaptureCardHue_QNAME, Long.class, AddCaptureCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "AddCaptureCardResult", scope = AddCaptureCardResponse.class)
    public JAXBElement<Integer> createAddCaptureCardResponseAddCaptureCardResult(Integer value) {
        return new JAXBElement<Integer>(_AddCaptureCardResponseAddCaptureCardResult_QNAME, Integer.class, AddCaptureCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaptureCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetCaptureCardResult", scope = GetCaptureCardResponse.class)
    public JAXBElement<CaptureCard> createGetCaptureCardResponseGetCaptureCardResult(CaptureCard value) {
        return new JAXBElement<CaptureCard>(_GetCaptureCardResponseGetCaptureCardResult_QNAME, CaptureCard.class, GetCaptureCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UpdateCardInputResult", scope = UpdateCardInputResponse.class)
    public JAXBElement<Boolean> createUpdateCardInputResponseUpdateCardInputResult(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateCardInputResponseUpdateCardInputResult_QNAME, Boolean.class, UpdateCardInputResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UpdateCaptureCardResult", scope = UpdateCaptureCardResponse.class)
    public JAXBElement<Boolean> createUpdateCaptureCardResponseUpdateCaptureCardResult(Boolean value) {
        return new JAXBElement<Boolean>(_UpdateCaptureCardResponseUpdateCaptureCardResult_QNAME, Boolean.class, UpdateCaptureCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardType", scope = GetCaptureCardList.class)
    public JAXBElement<String> createGetCaptureCardListCardType(String value) {
        return new JAXBElement<String>(_AddCaptureCardCardType_QNAME, String.class, GetCaptureCardList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "HostName", scope = GetCaptureCardList.class)
    public JAXBElement<String> createGetCaptureCardListHostName(String value) {
        return new JAXBElement<String>(_AddCardInputHostName_QNAME, String.class, GetCaptureCardList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Setting", scope = UpdateCardInput.class)
    public JAXBElement<String> createUpdateCardInputSetting(String value) {
        return new JAXBElement<String>(_UpdateCaptureCardSetting_QNAME, String.class, UpdateCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "CardInputId", scope = UpdateCardInput.class)
    public JAXBElement<Integer> createUpdateCardInputCardInputId(Integer value) {
        return new JAXBElement<Integer>(_RemoveCardInputCardInputId_QNAME, Integer.class, UpdateCardInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Value", scope = UpdateCardInput.class)
    public JAXBElement<String> createUpdateCardInputValue(String value) {
        return new JAXBElement<String>(_UpdateCaptureCardValue_QNAME, String.class, UpdateCardInput.class, value);
    }

}
