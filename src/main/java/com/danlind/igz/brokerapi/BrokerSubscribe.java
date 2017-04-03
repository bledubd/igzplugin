package com.danlind.igz.brokerapi;

public class BrokerSubscribe {

//    private final IClient client;
//    private final AccountInfo accountInfo;
//    private final Set<Instrument> instrumentsToSubscribe = new HashSet<Instrument>();
//
//    private final static Logger logger = LoggerFactory.getLogger(BrokerSubscribe.class);
//
//    public BrokerSubscribe(final IClient client,
//                           final AccountInfo accountInfo) {
//        this.client = client;
//        this.accountInfo = accountInfo;
//    }
//
//    public Set<Instrument> subscribedInstruments() {
//        return client.getSubscribedInstruments();
//    }
//
//    public int subscribe(final String instrumentName) {
//        final Optional<Instrument> maybeInstrument = InstrumentFactory.maybeFromName(instrumentName);
//        return maybeInstrument.isPresent()
//                ? subscribeValidinstrumentName(maybeInstrument.get())
//                : ZorroReturnValues.ASSET_UNAVAILABLE.getValue();
//    }
//
//    private int subscribeValidinstrumentName(final Instrument instrumentToSubscribe) {
//        if (client.getSubscribedInstruments().contains(instrumentToSubscribe)) {
//            logger.warn("Instrument " + instrumentToSubscribe + " already subscribed.");
//            return ZorroReturnValues.ASSET_AVAILABLE.getValue();
//        }
//
//        logger.debug("Trying to subscribe instrument " + instrumentToSubscribe);
//        instrumentsToSubscribe.add(instrumentToSubscribe);
//
//        final Set<ICurrency> crossCurrencies = CurrencyFactory.fromInstrument(instrumentToSubscribe);
//        final Set<Instrument> crossInstruments = InstrumentFactory.combineWithAnchorCurrency(accountInfo.currency(),
//                                                                                             crossCurrencies);
//        instrumentsToSubscribe.addAll(crossInstruments);
//
//        client.setSubscribedInstruments(instrumentsToSubscribe);
//        logger.debug("Subscribed instruments of com.iggroup.api.client are:" + client.getSubscribedInstruments());
//        return ZorroReturnValues.ASSET_AVAILABLE.getValue();
//    }
}
