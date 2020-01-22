package top.nhmt.community.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.nhmt.community.entity.DiscussPost;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId,int offset, int limit);

    //@Param注解用于给参数起别名
    //如果只有一个参数，并且在<if>里使用，则必须起别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
