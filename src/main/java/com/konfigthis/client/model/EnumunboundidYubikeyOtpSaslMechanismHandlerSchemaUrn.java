/*
 * PingData Config - OpenAPI 3.0
 * This is the PingData Configuration API
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Enumunboundid-yubikey-otp-sasl-mechanism-handlerSchemaUrn
 */
@JsonAdapter(EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn.Adapter.class)public enum EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn {
  
  URN_PINGIDENTITY_SCHEMAS_CONFIGURATION_2_0_SASL_MECHANISM_HANDLER_UNBOUNDID_YUBIKEY_OTP("urn:pingidentity:schemas:configuration:2.0:sasl-mechanism-handler:unboundid-yubikey-otp");

  private String value;

  EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn fromValue(String value) {
    for (EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn b : EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumunboundidYubikeyOtpSaslMechanismHandlerSchemaUrn.fromValue(value);
    }
  }
}

