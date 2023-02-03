package com.ali.reggie.service.impl;

import com.ali.reggie.entity.Employee;
import com.ali.reggie.mapper.EmployeeMapper;
import com.ali.reggie.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployServiceImpl extends ServiceImpl <EmployeeMapper, Employee> implements EmployeeService {
}
