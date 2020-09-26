package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiSwapRestClient;
import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.account.Liquidity;
import com.binance.api.client.domain.account.Pool;

import java.util.List;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

/**
 * Implementation of Binance's SWAP REST API using Retrofit method calls.
 */
public class BinanceApiSwapRestClientImpl implements BinanceApiSwapRestClient {

    private final BinanceApiService binanceApiService;

    public BinanceApiSwapRestClientImpl(String apiKey, String secret) {
        binanceApiService = createService(BinanceApiService.class, apiKey, secret);
    }

    @Override
    public List<Pool> listAllSwapPools() {
        return executeSync(binanceApiService.listAllSwapPools());
    }

    @Override
    public Liquidity getPoolLiquidityInfo(String poolId) {
        long timestamp = System.currentTimeMillis();
        List<Liquidity> liquidities = executeSync(binanceApiService.getPoolLiquidityInfo(poolId,
                BinanceApiConstants.DEFAULT_RECEIVING_WINDOW,
                timestamp));
        if (liquidities != null && !liquidities.isEmpty()) {
            return liquidities.get(0);
        }
        return null;
    }
}