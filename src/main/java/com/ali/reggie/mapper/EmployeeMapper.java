package com.ali.reggie.mapper;

import com.ali.reggie.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
// mapper用于映射SQL语句
public interface EmployeeMapper extends BaseMapper<Employee>{
}
