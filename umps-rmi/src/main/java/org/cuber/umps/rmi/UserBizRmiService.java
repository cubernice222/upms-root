package org.cuber.umps.rmi;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import org.cuber.umps.bo.SeekUserReq;
import org.cuber.umps.bo.SeekUserResp;
import org.cuber.umps.bo.UserPagingReq;
import org.cuber.umps.bo.UserPagingResp;

@VertxGen
@ProxyGen
public interface UserBizRmiService {
    /**
     *
     * @param req
     * @param handler
     * @return
     */
    @Fluent
    UserBizRmiService seekUser(SeekUserReq req, Handler<AsyncResult<SeekUserResp>> handler);

    @Fluent
    UserBizRmiService pagingUser(UserPagingReq req, Handler<AsyncResult<UserPagingResp>> handler);


}
