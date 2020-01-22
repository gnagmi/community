package top.nhmt.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.nhmt.community.dao.DiscussPostMapper;
import top.nhmt.community.entity.DiscussPost;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> selectDiscussPosts(int userId,int offset, int limit){
      return   discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }


    public int selectDiscussPostRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }

}
