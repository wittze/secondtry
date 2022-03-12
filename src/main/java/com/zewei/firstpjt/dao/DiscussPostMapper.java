package com.zewei.firstpjt.dao;

import com.zewei.firstpjt.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在xml文件锝<if>里使用,则必须加别名.
    //查询帖子行数
    int selectDiscussPostRows(@Param("userId") int userId);

}