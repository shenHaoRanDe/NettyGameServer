﻿/*
 * Server基本信息
 */
config.version = "0.2.0.1";
config.serverId = "8001";
config.bindIp = "0.0.0.0";
config.ports = "7090";
config.serverName = "OnLine";
config.language = "zh_CN";
config.i18nDir = "i18n";
config.gameId = "shoot";
config.developModel = 1;
config.tcpMessageQueueDirectDispatch = true;
/**gameexcutor配置***/
config.gameExcutorCorePoolSize = 2;
config.gameExcutorKeepAliveTime = 60;
config.gameExcutorCycleTime = 1000;
config.gameExcutorMinCycleTime = 1000;
config.updateServiceExcutorFlag = 2;
config.updateEventCacheServicePoolOpenFlag = true;
/**rpc配置*/
config.rpcOpen = true;
//这个是提供外网使用的，请使用外网地址
config.rpcBindIp = "127.0.0.1";
config.rpcPorts = "10100";
config.rpcThreadPoolSize = 60;
config.rpcThreadPoolQueueSize = 65536;
config.rpcConnectThreadSize = 16;
config.rpcSendProxyThreadSize = 16;
config.rpcServicePackage = "com.snowcattle.game.service.rpc.service.server";
//config.rpcTimeOut=60*1000;
config.rpcTimeOut = 0;
config.rpcFutureDeleteTimeOut = 60 * 1000;
/**message**/
config.netMessageHandlerNameSpace = "com.snowcattle.game.message.handler.impl";
config.netMsgNameSpace = "com.snowcattle.game.message.logic";
/**异步线程池配置**/
config.asyncThreadPoolCoreSize = 1;
config.asyncThreadPoolMaxSize = 100;
/*事件服务*/
config.asyncEventListenerNameSpace = "com.snowcattle.game.service.event.listener";
config.asyncEventQueueSize = 65536;
config.asyncEventWorkSize = 2;
config.asyncEventHandlerThreadSize = 60;
config.asyncEventHandleQueueSize = 65536;
/*tcp服务器异常时候关闭session标志*/
config.exceptionCloseSessionFlag = true;
/*最大tcpsession链接数量*/
config.maxTcpSessionNumber = 20000;
/*websock模式启用ssl*/
config.webSockectSSLFlag = true;

