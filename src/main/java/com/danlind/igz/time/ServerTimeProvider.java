package com.danlind.igz.time;

public class ServerTimeProvider {

//    private final NTPProvider ntpProvider;
//    private final TickTimeProvider tickTimeProvider;
//    private final Clock clock;
//    private long latestNTP;
//    private long synchTime;
//
//    private final static Logger logger = LoggerFactory.getLogger(ServerTimeProvider.class);
//
//    public ServerTimeProvider(final NTPProvider ntpProvider,
//                              final TickTimeProvider tickTimeProvider,
//                              final Clock clock) {
//        this.ntpProvider = ntpProvider;
//        this.tickTimeProvider = tickTimeProvider;
//        this.clock = clock;
//    }
//
//    public long get() {
////        final long ntpFromProvider = ntpProvider.get();
//        return ntpFromProvider == ZorroReturnValues.INVALID_SERVER_TIME.getValue()
//                ? serverTimeFromTick()
//                : serverTimeFromNTPProvider(ntpFromProvider);
//    }
//
//    private long serverTimeFromTick() {
//        logger.warn("Currently no NTP available, estimating with latest tick time.");
//        return tickTimeProvider.get();
//    }
//
//    private long serverTimeFromNTPProvider(final long ntpFromProvider) {
//        return ntpFromProvider > latestNTP
//                ? fromNewNTP(ntpFromProvider)
//                : fromOldNTP();
//    }
//
//    private long fromNewNTP(final long newNTP) {
//        latestNTP = newNTP;
//        synchTime = clock.millis();
//        return newNTP;
//    }
//
//    private long fromOldNTP() {
//        final long timeDiffToSynchTime = clock.millis() - synchTime;
//        return latestNTP + timeDiffToSynchTime;
//    }
}
