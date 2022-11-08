
create TABLE labels(
    id  SERIAL PRIMARY KEY ,
    name VARCHAR(50)
       );

 create TABLE writers(
    id  SERIAL PRIMARY KEY ,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
       );


create TABLE posts(
    id  SERIAL PRIMARY KEY ,
    content VARCHAR(50),
    created BIGINT,
    updated BIGINT,
    status VARCHAR(50),
    writer_id INT,
    FOREIGN KEY (writer_id)  REFERENCES writers (id)
    );

create TABLE posts_labels(
post_id INT,
label_id INT,
   FOREIGN KEY (post_id)  REFERENCES posts (id),
   FOREIGN KEY (label_id)  REFERENCES labels (id));
