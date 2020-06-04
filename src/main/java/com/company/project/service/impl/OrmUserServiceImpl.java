package com.company.project.service.impl;

import com.company.project.dao.OrmUserMapper;
import com.company.project.model.OrmUser;
import com.company.project.service.OrmUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/06/04.
 */
@Service
@Transactional
public class OrmUserServiceImpl extends AbstractService<OrmUser> implements OrmUserService {
    @Resource
    private OrmUserMapper ormUserMapper;

}
