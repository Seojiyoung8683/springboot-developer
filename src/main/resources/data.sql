INSERT INTO article (title, content, author, created_at, updated_at)
VALUES ('제목 1', '내용 1', 'user1', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

INSERT INTO article (title, content, author, created_at, updated_at)
VALUES ('제목 2', '내용 2', 'user2', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

INSERT INTO article (title, content, author, created_at, updated_at)
VALUES ('제목 3', '내용 3', 'user3', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

INSERT INTO comments (article_id, author, content, created_at)
VALUES (1, 'user4', '댓글 1', CURRENT_TIMESTAMP());
