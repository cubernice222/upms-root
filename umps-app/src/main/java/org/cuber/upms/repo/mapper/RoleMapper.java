package org.cuber.upms.repo.mapper;

import io.ebean.EbeanServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleMapper {

    @Autowired
    private EbeanServer ebeanServer;

}
