package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * MarginTransaction information.
 */
@JsonIgnoreProperties
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
    return "MarginTransaction{" +
            "clientTag='" + clientTag + '\'' +
            ", tranId='" + tranId + '\'' +
            '}';
  }
}
