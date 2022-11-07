package com.crud.view;



import com.crud.controller.LabelController;
import com.crud.controller.PostController;
import com.crud.controller.WriterController;
import com.crud.model.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostView {
    private final Scanner scan = new Scanner(System.in);
    private final PostController controller = new PostController();
    private final LabelController labelController = new LabelController();
    private final WriterController writerController = new WriterController();


    public List<Post> getAll() {
        return null;
    }


    public Post getById() {
        return null;
    }


    public Post createPostView() {
        return null;
    }


    public Post updatePostView() {
        return null;
    }


    public void deletePostView() {

    }

}


