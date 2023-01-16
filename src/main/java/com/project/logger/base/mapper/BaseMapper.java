package com.project.logger.base.mapper;

import java.util.List;

public interface BaseMapper<T,DTO>{

    DTO map(T t);

    T unMap(DTO dto);

    List<DTO> map (List<T> t);
}
