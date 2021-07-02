package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MarginTransaction information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginTransaction {

  private String clientTag;
  private String tranId;

  public String getTranId() {
    return tranId;
  }

  public void setTranId(String tranId) {
    this.tranId = tranId;
  }

  public String getClientTag() {
    return clientTag;
  }

  public void setClientTag(String clientTag) {
    this.clientTag = clientTag;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("transactionId", tranId)
            .append("clientTag", clientTag)
            .toString();
  }
}
