package com.danlind.igz.order;

public class OrderSetSL {

//    private final TradeUtil tradeUtil;
//
//    private final static Logger logger = LogManager.getLogger(OrderSetSL.class);
//
//    public OrderSetSL(final TradeUtil tradeUtil) {
//        this.tradeUtil = tradeUtil;
//    }
//
//    public OrderSetSLResult run(final IOrder order,
//                                final double newSLPrice) {
//        final SetSLParams setSLParams = SetSLParams
//            .setSLAtPrice(order, newSLPrice)
//            .doOnStart(() -> logger.info("Trying to set new stop loss " + newSLPrice
//                    + " on order " + order.getLabel()))
//            .doOnError(err -> logger.error("Failed to set new stop loss " + newSLPrice
//                    + " on order " + order.getLabel() + "!" + err.getMessage()))
//            .doOnComplete(() -> logger.info("Setting new Stop loss " + newSLPrice
//                    + " on order " + order.getLabel() + " done."))
//            .retryOnReject(tradeUtil.retryParams())
//            .build();
//
//        return runOnOrderUtil(setSLParams);
//    }
//
//    private OrderSetSLResult runOnOrderUtil(final SetSLParams setSLParams) {
//        final Throwable resultError = tradeUtil
//            .orderUtil()
//            .paramsToObservable(setSLParams)
//            .ignoreElements()
//            .blockingGet();
//
//        return resultError == null
//                ? OrderSetSLResult.OK
//                : OrderSetSLResult.FAIL;
//    }
}
