package com.crud;

import com.crud.model.Label;
import com.crud.model.Post;
import com.crud.model.PostStatus;
import com.crud.model.Writer;
import com.crud.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {


        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Label label1 = new Label("privet");
        Label label2 = new Label("poka");
        List<Label> labelList = new ArrayList<>();
        labelList.add(label1);
        labelList.add(label2);
        Writer writer = new Writer();
        Post post1 = new Post("Сказки", 1223444, 1344442, PostStatus.ACTIVE, labelList, writer);
        Post post2 = new Post("Стихи", 1223444, 1344442, PostStatus.UNDER_REVIEW, labelList, writer);
        List<Post> postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);
        writer.setFirstName("Sasha");
        writer.setLastName("Pupkin");
        writer.setPosts(postList);
        Transaction tx1 = session.beginTransaction();

        session.save(post1);
        session.save(post2);
        session.save(label1);
        session.save(label2);
        session.save(writer);


        tx1.commit();
        session.close();
    }

}
