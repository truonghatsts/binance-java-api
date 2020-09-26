package com.binance.api.client.domain.account;

/**
 * @author Fenix truonghatsts@gmail.com
 */
public class LiquidityOperationRecord {

    private String operationId;

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Override
    public String toString() {
        return "LiquidityOperationRecord{" +
                "operationId='" + operationId + '\'' +
                '}';
    }
}
