package com.binance.api.client;

import com.binance.api.client.domain.account.Liquidity;
import com.binance.api.client.domain.account.Pool;
import retrofit2.http.Query;

import java.util.List;

public interface BinanceApiSwapRestClient {

    List<Pool> listAllSwapPools();

    Liquidity getPoolLiquidityInfo(@Query("poolId") String poolId);

}
