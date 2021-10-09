package com.dhk.pojos;

import com.dhk.pojos.Category;
import com.dhk.pojos.Comment;
import com.dhk.pojos.Like1;
import com.dhk.pojos.PostDetail;
import com.dhk.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-09T22:20:59")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, String> image;
    public static volatile SingularAttribute<Post, Category> postcategoryId;
    public static volatile SingularAttribute<Post, Date> created;
    public static volatile CollectionAttribute<Post, Comment> commentCollection;
    public static volatile CollectionAttribute<Post, Like1> like1Collection;
    public static volatile SingularAttribute<Post, Integer> id;
    public static volatile CollectionAttribute<Post, PostDetail> postDetailCollection;
    public static volatile SingularAttribute<Post, User> userId;
    public static volatile SingularAttribute<Post, String> content;
    public static volatile SingularAttribute<Post, String> categoryId;

}