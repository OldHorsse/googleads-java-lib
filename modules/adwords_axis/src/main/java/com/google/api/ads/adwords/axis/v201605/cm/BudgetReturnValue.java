// Copyright 2016 Google Inc. All Rights Reserved.
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

/**
 * BudgetReturnValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * A container for return values from the {@link BudgetService#mutate}
 * call.
 */
public class BudgetReturnValue  extends com.google.api.ads.adwords.axis.v201605.cm.ListReturnValue  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201605.cm.Budget[] value;

    private com.google.api.ads.adwords.axis.v201605.cm.ApiError[] partialFailureErrors;

    public BudgetReturnValue() {
    }

    public BudgetReturnValue(
           java.lang.String listReturnValueType,
           com.google.api.ads.adwords.axis.v201605.cm.Budget[] value,
           com.google.api.ads.adwords.axis.v201605.cm.ApiError[] partialFailureErrors) {
        super(
            listReturnValueType);
        this.value = value;
        this.partialFailureErrors = partialFailureErrors;
    }


    /**
     * Gets the value value for this BudgetReturnValue.
     * 
     * @return value
     */
    public com.google.api.ads.adwords.axis.v201605.cm.Budget[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this BudgetReturnValue.
     * 
     * @param value
     */
    public void setValue(com.google.api.ads.adwords.axis.v201605.cm.Budget[] value) {
        this.value = value;
    }

    public com.google.api.ads.adwords.axis.v201605.cm.Budget getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.google.api.ads.adwords.axis.v201605.cm.Budget _value) {
        this.value[i] = _value;
    }


    /**
     * Gets the partialFailureErrors value for this BudgetReturnValue.
     * 
     * @return partialFailureErrors
     */
    public com.google.api.ads.adwords.axis.v201605.cm.ApiError[] getPartialFailureErrors() {
        return partialFailureErrors;
    }


    /**
     * Sets the partialFailureErrors value for this BudgetReturnValue.
     * 
     * @param partialFailureErrors
     */
    public void setPartialFailureErrors(com.google.api.ads.adwords.axis.v201605.cm.ApiError[] partialFailureErrors) {
        this.partialFailureErrors = partialFailureErrors;
    }

    public com.google.api.ads.adwords.axis.v201605.cm.ApiError getPartialFailureErrors(int i) {
        return this.partialFailureErrors[i];
    }

    public void setPartialFailureErrors(int i, com.google.api.ads.adwords.axis.v201605.cm.ApiError _value) {
        this.partialFailureErrors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetReturnValue)) return false;
        BudgetReturnValue other = (BudgetReturnValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue()))) &&
            ((this.partialFailureErrors==null && other.getPartialFailureErrors()==null) || 
             (this.partialFailureErrors!=null &&
              java.util.Arrays.equals(this.partialFailureErrors, other.getPartialFailureErrors())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartialFailureErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartialFailureErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartialFailureErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetReturnValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "BudgetReturnValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "Budget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialFailureErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "partialFailureErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "ApiError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}