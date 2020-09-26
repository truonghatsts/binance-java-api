package com.binance.api.client;

import com.binance.api.client.domain.RemoveType;
import com.binance.api.client.domain.account.Liquidity;
import com.binance.api.client.domain.account.Pool;
import com.binance.api.client.domain.account.LiquidityOperationRecord;

import java.util.List;

public interface BinanceApiSwapRestClient {

    List<Pool> listAllSwapPools();

    Liquidity getPoolLiquidityInfo(String poolId);

    LiquidityOperationRecord addLiquidity(String poolId,
                                          String asset,
                                          String quantity);

    LiquidityOperationRecord removeLiquidity(String poolId, RemoveType type, List<String> asset, String shareAmount);
}
