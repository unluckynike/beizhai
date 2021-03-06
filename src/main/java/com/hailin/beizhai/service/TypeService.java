package com.hailin.beizhai.service;

import com.hailin.beizhai.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

     Type saveType(Type type);

     Type getType(Long id);

     Type getTypeByName(String name);

     Page<Type> listType(Pageable pageable);//分页

     List<Type> listType();

     List<Type> listTypeTop(Integer size);//根据传值大小获取

     Type updateType(Long id,Type type);

     void deleteType(Long id);
}
