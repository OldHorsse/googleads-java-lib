// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201806.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Common policy summary information attached to a generic entity.
 *           
 * 
 * <p>Java class for PolicySummaryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicySummaryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyTopicEntries" type="{https://adwords.google.com/api/adwords/cm/v201806}PolicyTopicEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reviewState" type="{https://adwords.google.com/api/adwords/cm/v201806}PolicySummaryReviewState" minOccurs="0"/>
 *         &lt;element name="denormalizedStatus" type="{https://adwords.google.com/api/adwords/cm/v201806}PolicySummaryDenormalizedStatus" minOccurs="0"/>
 *         &lt;element name="combinedApprovalStatus" type="{https://adwords.google.com/api/adwords/cm/v201806}PolicyApprovalStatus" minOccurs="0"/>
 *         &lt;element name="PolicySummaryInfo.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicySummaryInfo", propOrder = {
    "policyTopicEntries",
    "reviewState",
    "denormalizedStatus",
    "combinedApprovalStatus",
    "policySummaryInfoType"
})
@XmlSeeAlso({
    FeedItemPolicySummary.class,
    AssetPolicySummaryInfo.class
})
public abstract class PolicySummaryInfo {

    protected List<PolicyTopicEntry> policyTopicEntries;
    @XmlSchemaType(name = "string")
    protected PolicySummaryReviewState reviewState;
    @XmlSchemaType(name = "string")
    protected PolicySummaryDenormalizedStatus denormalizedStatus;
    @XmlSchemaType(name = "string")
    protected PolicyApprovalStatus combinedApprovalStatus;
    @XmlElement(name = "PolicySummaryInfo.Type")
    protected String policySummaryInfoType;

    /**
     * Gets the value of the policyTopicEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyTopicEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyTopicEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyTopicEntry }
     * 
     * 
     */
    public List<PolicyTopicEntry> getPolicyTopicEntries() {
        if (policyTopicEntries == null) {
            policyTopicEntries = new ArrayList<PolicyTopicEntry>();
        }
        return this.policyTopicEntries;
    }

    /**
     * Gets the value of the reviewState property.
     * 
     * @return
     *     possible object is
     *     {@link PolicySummaryReviewState }
     *     
     */
    public PolicySummaryReviewState getReviewState() {
        return reviewState;
    }

    /**
     * Sets the value of the reviewState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySummaryReviewState }
     *     
     */
    public void setReviewState(PolicySummaryReviewState value) {
        this.reviewState = value;
    }

    /**
     * Gets the value of the denormalizedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PolicySummaryDenormalizedStatus }
     *     
     */
    public PolicySummaryDenormalizedStatus getDenormalizedStatus() {
        return denormalizedStatus;
    }

    /**
     * Sets the value of the denormalizedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySummaryDenormalizedStatus }
     *     
     */
    public void setDenormalizedStatus(PolicySummaryDenormalizedStatus value) {
        this.denormalizedStatus = value;
    }

    /**
     * Gets the value of the combinedApprovalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyApprovalStatus }
     *     
     */
    public PolicyApprovalStatus getCombinedApprovalStatus() {
        return combinedApprovalStatus;
    }

    /**
     * Sets the value of the combinedApprovalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyApprovalStatus }
     *     
     */
    public void setCombinedApprovalStatus(PolicyApprovalStatus value) {
        this.combinedApprovalStatus = value;
    }

    /**
     * Gets the value of the policySummaryInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySummaryInfoType() {
        return policySummaryInfoType;
    }

    /**
     * Sets the value of the policySummaryInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySummaryInfoType(String value) {
        this.policySummaryInfoType = value;
    }

}
