package org.cuber.umps.rmi;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import org.cuber.umps.bo.*;

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
    UserBizRmiService pagingUser(PagingUserReq req, Handler<AsyncResult<PagingUserResp>> handler);

    @Fluent
    UserBizRmiService updateUser(UserReq req, Handler<AsyncResult<UpdateUserResp>> handler);

    @Fluent
    UserBizRmiService saveUser(UserReq req, Handler<AsyncResult<SaveUserResp>> handler);

    
}
