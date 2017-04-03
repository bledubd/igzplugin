package com.danlind.igz.brokerapi;

public class BrokerLogin {

//    private final LoginExecutor loginHandler;
//    private final IClient client;
//    private Observable<Long> retryDelayTimer;
//    private boolean isLoginAvailable = true;
//
//    private final static Logger logger = LoggerFactory.getLogger(BrokerLogin.class);
//
//    public BrokerLogin(final LoginExecutor loginHandler,
//                       final IClient client,
//                       final PluginConfig pluginConfigMock) {
//        this.loginHandler = loginHandler;
//        this.client = client;
//
//        initRetryDelayTimer(pluginConfigMock.loginRetryDelay());
//    }
//
//    private void initRetryDelayTimer(final long retryDelay) {
//        retryDelayTimer = Observable
//            .timer(retryDelay, TimeUnit.MILLISECONDS)
//            .doOnSubscribe(d -> {
//                isLoginAvailable = false;
//                logger.debug("Starting login retry delay timer. Login is not available until timer elapsed.");
//            })
//            .doOnComplete(() -> {
//                isLoginAvailable = true;
//                logger.debug("Login retry delay timer completed. Login is available again.");
//            });
//    }
//
//    public int login(final String username,
//                     final String password,
//                     final String loginType) {
//        if (client.isConnected())
//            return ZorroReturnValues.LOGIN_OK.getValue();
//        if (!isLoginAvailable)
//            return ZorroReturnValues.LOGIN_FAIL.getValue();
//
//        return handleLoginResult(loginHandler.login(username,
//                                                    password,
//                                                    loginType));
//    }
//
//    private int handleLoginResult(final int loginResult) {
//        if (loginResult == ZorroReturnValues.LOGIN_FAIL.getValue())
//            startRetryDelayTimer();
//        return loginResult;
//    }
//
//    private void startRetryDelayTimer() {
//        retryDelayTimer.subscribe();
//    }
//
//    public int logout() {
//        return loginHandler.logout();
//    }
}
