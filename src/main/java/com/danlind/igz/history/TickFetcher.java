package com.danlind.igz.history;

public class TickFetcher {

//    private final HistoryProvider historyProvider;
//    private List<ITick> fetchedTicks;
//
//    private final static Logger logger = LoggerFactory.getLogger(TickFetcher.class);
//
//    public TickFetcher(final HistoryProvider historyProvider) {
//        this.historyProvider = historyProvider;
//    }
//
//    public int fetch(final Instrument instrument,
//                     final double startDate,
//                     final double endDate,
//                     final int tickMinutes,
//                     final int nTicks,
//                     final double tickParams[]) {
//        logger.debug("Trying to fetch ticks for instrument " + instrument + ": \n "
//                + "startDate: " + TimeConvert.formatOLETime(startDate) + ": \n "
//                + "endDate: " + TimeConvert.formatOLETime(endDate) + ": \n "
//                + "tickMinutes: " + tickMinutes + ": \n "
//                + "nTicks: " + nTicks);
//
//        fetchedTicks = null;
//        historyProvider
//            .fetchTicks(instrument,
//                        TimeConvert.millisFromOLEDate(startDate),
//                        TimeConvert.millisFromOLEDate(endDate))
//            .subscribeOn(Schedulers.io())
//            .subscribe(ticks -> fetchedTicks = ticks);
//
//        while (fetchedTicks == null) {
//            Zorro.callProgress(1);
//            Observable
//                .interval(0L,
//                          250L,
//                          TimeUnit.MILLISECONDS,
//                          Schedulers.io())
//                .blockingFirst();
//        }
//
//        logger.debug("Fetched " + fetchedTicks.size() + " ticks for " + instrument + " with nTicks " + nTicks);
//
//        return fetchedTicks.isEmpty()
//                ? ZorroReturnValues.HISTORY_UNAVAILABLE.getValue()
//                : fillTicks(instrument,
//                            fetchedTicks,
//                            tickParams);
//    }
//
//    private int fillTicks(final Instrument instrument,
//                          final List<ITick> ticks,
//                          final double tickParams[]) {
//        int tickParamsIndex = 0;
//        Collections.reverse(ticks);
//
//        for (int i = 0; i < ticks.size(); ++i) {
//            final ITick tick = ticks.get(i);
//            final double ask = tick.getAsk();
//            final double spread = MathUtil.roundPrice(ask - tick.getBid(), instrument);
//
//            tickParams[tickParamsIndex] = ask;
//            tickParams[tickParamsIndex + 1] = ask;
//            tickParams[tickParamsIndex + 2] = ask;
//            tickParams[tickParamsIndex + 3] = ask;
//            tickParams[tickParamsIndex + 4] = TimeConvert.getUTCTimeFromTick(tick);
//            tickParams[tickParamsIndex + 5] = spread;
//            tickParams[tickParamsIndex + 6] = tick.getAskVolume();
//
//            tickParamsIndex += 7;
//        }
//        return ticks.size();
//    }
}
