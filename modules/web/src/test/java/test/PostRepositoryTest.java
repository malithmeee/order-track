package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sms.models.Post;
import org.sms.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/application-context.xml")
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void test() {
        Post post = new Post();
        post.setPostDate(new Date());
        post.setTitle("malith");

        postRepository.save(post);
        Post post1 = postRepository.findOne(post.getPostId());
        Assert.assertNotNull(post1);
        System.out.println("-------------> " + post1.getTitle());
    }
}