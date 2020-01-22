package top.nhmt.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import top.nhmt.community.dao.DiscussPostMapper;
import top.nhmt.community.dao.UserMapper;
import top.nhmt.community.entity.DiscussPost;
import top.nhmt.community.entity.User;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;



    @Test
    public void testSelectById(){
        User user = userMapper.selectById(150);
        System.out.println(user);
    }

    @Test
    public void testSelectByName(){
        User user = userMapper.selectByName("nowcoder11");
        System.out.println(user);
    }

    @Test
    public void testSelectByEmail(){
        System.out.println(userMapper.selectByEmail("nowcoder13@sina.com"));
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setType(1);
        user.setUsername("GN-AG");
        user.setPassword("25ac0a2e8bd0f28928de3c56149283d6");
        user.setCreateTime(new Date());
        user.setEmail("1713055@qq.com");
        user.setStatus(1);
        user.setSalt("49f10");
        user.setHeaderUrl("www.nhmt.top");
        int i = userMapper.insertUser(user);
        System.out.println(i);
    }

    @Test
    public void testUpdateStatus(){
        int i = userMapper.updateStatus(150, 0);
        System.out.println(i);
    }

    @Test
    public void testUpdateHeader(){
        userMapper.updateHeader(150,"www.baidu.com");
    }

    @Test
    public void testUpdatePassword(){
        int i = userMapper.updatePassword(150, "123");
        System.out.println(i);

    }

    @Test
    public void testSelectDiscussPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost discussPost : discussPosts) {
            System.out.println(discussPost);
        }

    }

    @Test
    public void testSelectDiscussPostRows(){
        int i = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(i);
    }
}
