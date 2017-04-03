package com.danlind.igz.misc;

public class AccountInfo {

//    private final IAccount account;
//    private final CalculationUtil calculationUtil;
//    private final PluginConfig pluginConfig;
//
//    private final static Logger logger = LoggerFactory.getLogger(AccountInfo.class);
//
//    public AccountInfo(final IAccount account,
//                       final CalculationUtil calculationUtil,
//                       final PluginConfig pluginConfig) {
//        this.account = account;
//        this.calculationUtil = calculationUtil;
//        this.pluginConfig = pluginConfig;
//    }
//
//    public AccountState state() {
//        return account.getAccountState();
//    }
//
//    public String id() {
//        return account.getAccountId();
//    }
//
//    public double balance() {
//        return account.getBalance();
//    }
//
//    public double equity() {
//        return account.getEquity();
//    }
//
//    public double baseEquity() {
//        return account.getBaseEquity();
//    }
//
//    public ICurrency currency() {
//        return account.getAccountCurrency();
//    }
//
//    public double lotSize() {
//        return pluginConfig.lotSize();
//    }
//
//    public double lotMargin() {
//        return lotSize() / leverage();
//    }
//
//    public double tradeValue() {
//        return equity() - baseEquity();
//    }
//
//    public double freeMargin() {
//        return account.getCreditLine() / leverage();
//    }
//
//    public double usedMargin() {
//        return equity() - freeMargin();
//    }
//
//    public double leverage() {
//        return account.getLeverage();
//    }
//
//    public boolean isConnected() {
//        return account.isConnected();
//    }
//
//    public boolean isNFACompliant() {
//        return account.isGlobal();
//    }
//
//    public boolean isTradingAllowed() {
//        return state() == IAccount.AccountState.OK
//                || state() == IAccount.AccountState.OK_NO_MARGIN_CALL;
//    }
//
//    public double pipCost(final Instrument instrument) {
//        final double pipCost = calculationUtil.pipValueInCurrency(lotSize(),
//                                                                  instrument,
//                                                                  currency(),
//                                                                  OfferSide.ASK);
//        logger.trace("Pipcost for lotSize " + lotSize()
//                + " and instrument " + instrument + " currency " + currency()
//                + " is " + pipCost);
//        return pipCost;
//    }
//
//    public double marginPerLot(final Instrument instrument) {
//        final ICurrency accountCurrency = currency();
//        if (accountCurrency == instrument.getPrimaryJFCurrency())
//            return lotMargin();
//
//        final double conversionLot = calculationUtil.convertAmount(lotSize(),
//                                                                   instrument.getPrimaryJFCurrency(),
//                                                                   accountCurrency,
//                                                                   OfferSide.ASK);
//        final double marginPerLot = conversionLot / leverage();
//        logger.trace("marginPerLot for conversion instrument " + instrument.getPrimaryJFCurrency()
//                + " and  conversionLot " + conversionLot
//                + " and leverage " + leverage()
//                + " is " + marginPerLot);
//        return marginPerLot;
//    }
}
