package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/*
  *@ClassName MyMapper
  *@Description 自己的mapper.注意该接口不能被扫描到，否则会出错
  *@Author 徐涛
  *@Date 2019/1/30
  *@Version 1.0
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
