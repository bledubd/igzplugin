package com.danlind.igz.order;

public class OrderSubmit {

//    private final TradeUtil tradeUtil;
//
//    private final static Logger logger = LogManager.getLogger(OrderSubmit.class);
//
//    public OrderSubmit(final TradeUtil tradeUtil) {
//        this.tradeUtil = tradeUtil;
//    }
//
//    public OrderSubmitResult run(final Instrument instrument,
//                                 final OrderCommand command,
//                                 final double amount,
//                                 final String label,
//                                 final double slPrice) {
//        final OrderParams orderParams = OrderParams
//            .forInstrument(instrument)
//            .withOrderCommand(command)
//            .withAmount(amount)
//            .withLabel(label)
//            .stopLossPrice(slPrice)
//            .build();
//
//        final SubmitParams submitParams = SubmitParams
//            .withOrderParams(orderParams)
//            .doOnStart(() -> logger.info("Trying to open trade for " + instrument + "\n"
//                    + "command:  " + command + "\n"
//                    + "amount:  " + amount + "\n"
//                    + "label:  " + label + "\n"
//                    + "slPrice: " + slPrice))
//            .doOnError(err -> logger.error("Opening trade for " + instrument
//                    + " with label  " + label + " failed!" + err.getMessage()))
//            .doOnComplete(() -> logger.info("Opening trade for " + instrument
//                    + " with label  " + label + " done."))
//            .retryOnReject(tradeUtil.retryParams())
//            .build();
//
//        return runOnOrderUtil(submitParams);
//    }
//
//    private OrderSubmitResult runOnOrderUtil(final SubmitParams submitParams) {
//        final Throwable resultError = tradeUtil
//            .orderUtil()
//            .paramsToObservable(submitParams)
//            .ignoreElements()
//            .blockingGet();
//
//        return resultError == null
//                ? OrderSubmitResult.OK
//                : OrderSubmitResult.FAIL;
//    }
}
