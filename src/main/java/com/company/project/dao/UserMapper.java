package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends Mapper<User> {
}