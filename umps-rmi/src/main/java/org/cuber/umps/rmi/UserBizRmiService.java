package org.cuber.umps.rmi;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import org.cuber.umps.bo.SeekUserReq;
import org.cuber.umps.bo.SeekUserResp;

@VertxGen
@ProxyGen
public interface UserBizRmiService {
    /**
     *
     * @param req
     * @param seekHandler
     * @return
     */
    @Fluent
    UserBizRmiService seekUser(SeekUserReq req, Handler<AsyncResult<SeekUserResp>> seekHandler);


}
