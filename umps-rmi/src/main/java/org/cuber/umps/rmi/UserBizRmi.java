package org.cuber.umps.rmi;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import org.cuber.umps.bo.SeekUserReq;
import org.cuber.umps.bo.SeekUserResp;

@ProxyGen
public interface UserBizRmi {

    @Fluent
    UserBizRmi seekUser(SeekUserReq req, Handler<AsyncResult<SeekUserResp>> seekHandler);
}
