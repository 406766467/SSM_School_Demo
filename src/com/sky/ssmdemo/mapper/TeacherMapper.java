package com.sky.ssmdemo.mapper;


import com.sky.ssmdemo.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectAll();
}
