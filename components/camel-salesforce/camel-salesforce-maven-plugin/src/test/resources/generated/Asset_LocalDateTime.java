/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin.
 */
package $packageName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.Attributes;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject Asset
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class Asset extends AbstractDescribedSObjectBase {

    public Asset() {
        getAttributes().setType("Asset");
    }

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    private java.time.LocalDateTime InstallDate;

    @JsonProperty("InstallDate")
    public java.time.LocalDateTime getInstallDate() {
        return this.InstallDate;
    }

    @JsonProperty("InstallDate")
    public void setInstallDate(java.time.LocalDateTime InstallDate) {
        this.InstallDate = InstallDate;
    }

    private java.time.ZonedDateTime date_time;

    @JsonProperty("date_time")
    public java.time.ZonedDateTime getdate_time() {
        return this.date_time;
    }

    @JsonProperty("date_time")
    public void setdate_time(java.time.ZonedDateTime date_time) {
        this.date_time = date_time;
    }

    private java.time.OffsetTime time;

    @JsonProperty("time")
    public java.time.OffsetTime gettime() {
        return this.time;
    }

    @JsonProperty("time")
    public void settime(java.time.OffsetTime time) {
        this.time = time;
    }

 
    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();


        description.setActivateable(false);
        description.setCompactLayoutable(true);
        description.setCreateable(true);
        description.setCustom(false);
        description.setCustomSetting(false);
        description.setDeletable(true);
        description.setDeprecatedAndHidden(false);
        description.setFeedEnabled(false);

        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Asset ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("InstallDate", "Install Date", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("date_time", "date_time", "datetime", "xsd:dateTime", 0, false, true, false, false, true, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("time", "time", "time", "xsd:time", 0, false, true, false, false, true, false, false);
        fields1.add(sObjectField4);

        description.setKeyPrefix("02i");
        description.setLabel("Asset");
        description.setLabelPlural("Assets");
        description.setLayoutable(true);
        description.setMergeable(false);
        description.setMruEnabled(true);
        description.setName("Asset");
        description.setQueryable(true);
        description.setReplicateable(true);
        description.setRetrieveable(true);
        description.setSearchLayoutable("true");
        description.setSearchable(true);
        description.setTriggerable(true);
        description.setUndeletable(true);
        description.setUpdateable(true);

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setApprovalLayouts("/services/data/v42.0/sobjects/Asset/describe/approvalLayouts");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v42.0/sobjects/Asset/describe/compactLayouts");
        sObjectDescriptionUrls1.setDefaultValues("/services/data/v42.0/sobjects/Asset/defaultValues?recordTypeId&fields");
        sObjectDescriptionUrls1.setDescribe("/services/data/v42.0/sobjects/Asset/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v42.0/sobjects/Asset/describe/layouts");
        sObjectDescriptionUrls1.setListviews("/services/data/v42.0/sobjects/Asset/listviews");
        sObjectDescriptionUrls1.setQuickActions("/services/data/v42.0/sobjects/Asset/quickActions");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v42.0/sobjects/Asset/{ID}");
        sObjectDescriptionUrls1.setSobject("/services/data/v42.0/sobjects/Asset");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://eu11.salesforce.com/{ID}");
        sObjectDescriptionUrls1.setUiEditTemplate("https://eu11.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setUiNewRecord("https://eu11.salesforce.com/02i/e");
        description.setUrls(sObjectDescriptionUrls1);

        return description;
    }
}
