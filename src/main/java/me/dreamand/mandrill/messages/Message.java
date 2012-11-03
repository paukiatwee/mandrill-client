/*
 * 
 * 
 */
package me.dreamand.mandrill.messages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The information on the message to send
 * @since 1.0.0
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 */
public class Message {
    
    private String html;
    private String text;
    private String subject;
    private String fromEmail;
    private String fromName;
    private List<To> to;
    private Map<String, String> headers = new HashMap<String, String>();
    private boolean trackOpens = true;
    private boolean trackClicks = true;
    private boolean autoText = true;
    private boolean urlStripQs = true;
    private boolean preserveRecipients = true;
    private String bccAddress;
    private boolean merge = true;
    private List<Var> globalMergeVars = new ArrayList<Var>();
    private MergeVars mergeVars;
    private List<String> tags = new ArrayList<String>();
    private List<String> googleAnalyticDomains = new ArrayList<String>();
    private String googleAnalyticCampaign;
    private List<String> metadata;
    private RecipientMetadata recipientMetadata;
    private List<Attactment> attactments = new ArrayList<Attactment>();

    public Message() {
    }
    
    public Message(Message message) {
        html = message.getHtml();
        text = message.getText();
        subject = message.getSubject();
        fromEmail = message.getFromEmail();
        fromName = message.getFromName();
        to = message.getTo();
        headers = message.getHeaders();
        trackOpens = message.isTrackOpens();
        trackClicks = message.isTrackClicks();
        autoText = message.isAutoText();
        urlStripQs = message.isUrlStripQs();
        preserveRecipients = message.isPreserveRecipients();
        bccAddress = message.getBccAddress();
        merge = message.isMerge();
        globalMergeVars = message.getGlobalMergeVars();
        mergeVars = message.getMergeVars();
        tags = message.getTags();
        googleAnalyticDomains = message.getGoogleAnalyticDomains();
        googleAnalyticCampaign = message.getGoogleAnalyticCampaign();
        metadata = message.getMetadata();
        recipientMetadata = message.getRecipientMetadata();
        attactments = message.getAttactments();
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("from_email")
    public String getFromEmail() {
        return fromEmail;
    }

    @JsonProperty("from_email")
    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    @JsonProperty("from_name")
    public String getFromName() {
        return fromName;
    }

    @JsonProperty("from_name")
    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public List<To> getTo() {
        return to;
    }

    public void setTo(List<To> to) {
        this.to = to;
    }
    
    public void setTo(To... to) {
        this.to = Arrays.asList(to);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    @JsonProperty("track_opens")
    public boolean isTrackOpens() {
        return trackOpens;
    }

    @JsonProperty("track_opens")
    public void setTrackOpens(boolean trackOpens) {
        this.trackOpens = trackOpens;
    }

    @JsonProperty("track_clicks")
    public boolean isTrackClicks() {
        return trackClicks;
    }

    @JsonProperty("track_clicks")
    public void setTrackClicks(boolean trackClicks) {
        this.trackClicks = trackClicks;
    }

    @JsonProperty("auto_text")
    public boolean isAutoText() {
        return autoText;
    }

    @JsonProperty("auto_text")
    public void setAutoText(boolean autoText) {
        this.autoText = autoText;
    }

    @JsonProperty("url_strip_qs")
    public boolean isUrlStripQs() {
        return urlStripQs;
    }

    @JsonProperty("url_strip_qs")
    public void setUrlStripQs(boolean urlStripQs) {
        this.urlStripQs = urlStripQs;
    }

    @JsonProperty("preserve_recipients")
    public boolean isPreserveRecipients() {
        return preserveRecipients;
    }

    @JsonProperty("preserve_recipients")
    public void setPreserveRecipients(boolean preserveRecipients) {
        this.preserveRecipients = preserveRecipients;
    }

    @JsonProperty("bcc_address")
    public String getBccAddress() {
        return bccAddress;
    }

    @JsonProperty("bcc_address")
    public void setBccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
    }

    public boolean isMerge() {
        return merge;
    }

    public void setMerge(boolean merge) {
        this.merge = merge;
    }

    @JsonProperty("global_merge_vars")
    public List<Var> getGlobalMergeVars() {
        return globalMergeVars;
    }

    @JsonProperty("global_merge_vars")
    public void setGlobalMergeVars(List<Var> globalMergeVars) {
        this.globalMergeVars = globalMergeVars;
    }

    @JsonProperty("merge_vars")
    public MergeVars getMergeVars() {
        return mergeVars;
    }

    @JsonProperty("merge_vars")
    public void setMergeVars(MergeVars mergeVars) {
        this.mergeVars = mergeVars;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("google_analytics_domains")
    public List<String> getGoogleAnalyticDomains() {
        return googleAnalyticDomains;
    }

    @JsonProperty("google_analytics_domains")
    public void setGoogleAnalyticDomains(List<String> googleAnalyticDomains) {
        this.googleAnalyticDomains = googleAnalyticDomains;
    }

    @JsonProperty("google_analytics_campaign")
    public String getGoogleAnalyticCampaign() {
        return googleAnalyticCampaign;
    }

    @JsonProperty("google_analytics_campaign")
    public void setGoogleAnalyticCampaign(String googleAnalyticCampaign) {
        this.googleAnalyticCampaign = googleAnalyticCampaign;
    }

    public List<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<String> metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("recipient_metadata")
    public RecipientMetadata getRecipientMetadata() {
        return recipientMetadata;
    }

    @JsonProperty("recipient_metadata")
    public void setRecipientMetadata(RecipientMetadata recipientMetadata) {
        this.recipientMetadata = recipientMetadata;
    }

    public List<Attactment> getAttactments() {
        return attactments;
    }

    public void setAttactments(List<Attactment> attactments) {
        this.attactments = attactments;
    }
}
