package org.cuber.upms.repo.script;

public class UserScript {

    public final static String COL_NAMES = "user_id,avatar,user_name,password,salt,full_name,birthday,user_scope,sex,email,phone,ding_user_id,wechat_user_id,corp_number,status,operator,update_time,create_time";

    public final static String INSERT =
            "INSERT INTO T_RC_USER(" + COL_NAMES +
                    ") values(?,?,null, null, null,?,?,?,?,?,?,?,?,?,?,'0',now(),now())";

    public final static String QUERY_BY_ID =
            "SELECT " + COL_NAMES + " FROM " +
                    "T_RC_USER WHERE user_id = ?";


}
