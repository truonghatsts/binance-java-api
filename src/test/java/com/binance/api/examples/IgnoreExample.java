package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiSwapRestClient;
import com.binance.api.client.domain.account.Liquidity;
import com.binance.api.client.domain.account.Pool;

import java.util.List;

public class IgnoreExample {

    public static String API_KEY = "api-key";
    public static String SECRET_KEY = "secret-key";

    public static void main(String[] args) {

        BinanceApiClientFactory binanceApiClientFactory = BinanceApiClientFactory.newInstance(API_KEY, SECRET_KEY);
        BinanceApiSwapRestClient swapClient = binanceApiClientFactory.newSwapRestClient();
        List<Pool> pools = swapClient.listAllSwapPools();
        /*
        for(Pool pool:pools) {
            System.out.println(pool);
            // Liquidity poolLiquidityInfo = swapClient.getPoolLiquidityInfo(pool.getPoolId());
            // System.out.println(poolLiquidityInfo);
        }
         */
        Liquidity liquidity = swapClient.getPoolLiquidityInfo("5");
        System.out.println(liquidity);
    }


}
